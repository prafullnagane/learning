/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.testframework;

import static junit.framework.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.ItemDeployment;
import de.hybris.platform.core.PK;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.JaloItemNotFoundException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.persistence.property.JDBCValueMappings;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.testframework.runlistener.LangReferenceRemoverRunListener;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.Description;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Test presenting a removing orphaned localized properties and attributes by {@link LangReferenceRemoverRunListener} .
 */
@IntegrationTest
public class LangReferenceRemoverRunListenerTest extends HybrisJUnit4Test
{
	private static final String SAMPLE_PRODUCT_CODE = "SampleProduct";
	private static final String SOME_LOCALIZED_TEST_USER = "someLocalizedTestUser";
	private static final String SOME_DUMMY_LANG = "someDummyLang";

	private LangReferenceRemoverRunListener runner;



	@Test
	public void testCheckIfPropertyStaysForExistingLanguage() throws Exception
	{
		final Description descriptionMock = Mockito.mock(org.junit.runner.Description.class);

		runner = new LangReferenceRemoverRunListener();
		runner.testStarted(descriptionMock);

		final Language language = getOrCreateLang(SOME_DUMMY_LANG);

		final User user = jaloSession.getUserManager().createUser(SOME_LOCALIZED_TEST_USER);
		assertNotNull(user);

		SessionContext localCtx = jaloSession.createLocalSessionContext();
		String propsTable = null;
		try
		{
			localCtx.setLanguage(language);
			user.setLocalizedProperty(localCtx, "someQualifier", "someValue");

			//check a deployments
			final int typeCode = jaloSession.getTypeManager().getComposedType(User.class).getItemTypeCode();

			final PersistenceManager pm = jaloSession.getCurrentSession().getTenant().getPersistenceManager();
			final ItemDeployment deployment = pm.getItemDeployment(typeCode);
			Assert.assertTrue(deployment != null);

			propsTable = deployment.getDumpPropertyTableName();
			Assert.assertEquals("There should be created one localized property ", 1,
					checkExistingEntries(propsTable, language.getPK()));
		}
		finally
		{
			JaloSession.getCurrentSession().removeLocalSessionContext();
		}

		//no remove here 

		runner.testFinished(descriptionMock);//run 

		Assert.assertEquals("After runner finished there should left the property for existing language ", 1,
				checkExistingEntries(propsTable, language.getPK()));

		localCtx = jaloSession.createLocalSessionContext();
		try
		{
			localCtx.setLanguage(language);
			Assert.assertTrue(user.getLocalizedPropertyNames().contains("someQualifier"));
		}
		finally
		{
			JaloSession.getCurrentSession().removeLocalSessionContext();
		}
	}

	@Ignore("HOR-1970")
	@Test
	public void testCheckIfPropertyVanishesForNotExistingLanguage() throws Exception
	{
		final Description descriptionMock = Mockito.mock(org.junit.runner.Description.class);

		runner = new LangReferenceRemoverRunListener();
		runner.testStarted(descriptionMock);

		final Language language = getOrCreateLang(SOME_DUMMY_LANG);


		final User user = jaloSession.getUserManager().createUser(SOME_LOCALIZED_TEST_USER);
		assertNotNull(user);

		final SessionContext localCtx = jaloSession.createLocalSessionContext();
		String propsTable = null;
		try
		{
			localCtx.setLanguage(language);
			user.setLocalizedProperty(localCtx, "someQualifier", "someValue");
			user.setProperty("unloc", "mustStay");

			//check a deployments
			final int typeCode = jaloSession.getTypeManager().getComposedType(User.class).getItemTypeCode();

			final PersistenceManager pm = jaloSession.getCurrentSession().getTenant().getPersistenceManager();
			final ItemDeployment deployment = pm.getItemDeployment(typeCode);
			Assert.assertTrue(deployment != null);

			propsTable = deployment.getDumpPropertyTableName();
			Assert.assertEquals("There should be created one localized property ", 1,
					checkExistingEntries(propsTable, language.getPK()));
			Assert.assertEquals("There should be created one unlocalized property ", 1, checkExistingEntries(propsTable, PK.NULL_PK));
		}
		finally
		{
			JaloSession.getCurrentSession().removeLocalSessionContext();
		}

		language.remove();//ouch!!!

		runner.testFinished(descriptionMock);//run 

		Assert.assertEquals("After runner finished there should be no localized property ", 0,
				checkExistingEntries(propsTable, language.getPK()));
		Assert.assertEquals("There should be one unlocalized property left", 1, checkExistingEntries(propsTable, PK.NULL_PK));

		Assert.assertFalse(user.getLocalizedPropertyNames().contains("someQualifier"));
	}


	@Test
	public void testCheckIfAttributeStaysForExistingLanguage() throws Exception
	{
		final Description descriptionMock = Mockito.mock(org.junit.runner.Description.class);

		runner = new LangReferenceRemoverRunListener();
		runner.testStarted(descriptionMock);

		final Language language = getOrCreateLang(SOME_DUMMY_LANG);
		final Product product = jaloSession.getProductManager().createProduct(SAMPLE_PRODUCT_CODE);
		assertNotNull(product);

		SessionContext localCtx = jaloSession.createLocalSessionContext();
		String lpAttributesTable = null;
		try
		{
			localCtx.setLanguage(language);
			product.setName(localCtx, "A specific language");

			//check a deployments
			final int typeCode = jaloSession.getTypeManager().getComposedType(Product.class).getItemTypeCode();

			final PersistenceManager pm = jaloSession.getCurrentSession().getTenant().getPersistenceManager();
			final ItemDeployment deployment = pm.getItemDeployment(typeCode);
			Assert.assertTrue(deployment != null);

			lpAttributesTable = deployment.getDatabaseTableName() + JDBCValueMappings.LOC_TABLE_POSTFIX;
			Assert.assertEquals("There should be created one localized attribute ", 1,
					checkExistingEntries(lpAttributesTable, language.getPK()));
		}
		finally
		{
			JaloSession.getCurrentSession().removeLocalSessionContext();
		}
		//not remove

		runner.testFinished(descriptionMock);//run 

		Assert.assertEquals("After runner finished there should stay a  localized atribute for not removed language ", 1,
				checkExistingEntries(lpAttributesTable, language.getPK()));

		localCtx = jaloSession.createLocalSessionContext();
		try
		{
			localCtx.setLanguage(language);
			Assert.assertEquals(product.getName(), "A specific language");
		}
		finally
		{
			JaloSession.getCurrentSession().removeLocalSessionContext();
		}
	}

	@Test
	public void testCheckIfAttributeVanishesForRemovedLanguage() throws Exception
	{
		final Description descriptionMock = Mockito.mock(org.junit.runner.Description.class);

		runner = new LangReferenceRemoverRunListener();
		runner.testStarted(descriptionMock);

		final Language language = getOrCreateLang(SOME_DUMMY_LANG);
		final Product product = jaloSession.getProductManager().createProduct(SAMPLE_PRODUCT_CODE);
		assertNotNull(product);

		final SessionContext localCtx = jaloSession.createLocalSessionContext();
		String lpAttributesTable = null;
		try
		{
			localCtx.setLanguage(language);

			product.setName(localCtx, "A specific language");


			//check a deployments
			final int typeCode = jaloSession.getTypeManager().getComposedType(Product.class).getItemTypeCode();

			final PersistenceManager pm = jaloSession.getCurrentSession().getTenant().getPersistenceManager();
			final ItemDeployment deployment = pm.getItemDeployment(typeCode);
			Assert.assertTrue(deployment != null);

			lpAttributesTable = deployment.getDatabaseTableName() + JDBCValueMappings.LOC_TABLE_POSTFIX;
			Assert.assertEquals("There should be created one localized attribute ", 1,
					checkExistingEntries(lpAttributesTable, language.getPK()));
		}
		finally
		{
			JaloSession.getCurrentSession().removeLocalSessionContext();
		}
		language.remove();//ouch!!!

		runner.testFinished(descriptionMock);//run 

		Assert.assertEquals("After runner finished there should be no localized atribute ", 0,
				checkExistingEntries(lpAttributesTable, language.getPK()));

		Assert.assertEquals(product.getAllAttributes().get("name"), null);
	}

	private int checkExistingEntries(final String tableName, final PK langPK)
	{
		final JdbcTemplate jdbcTemplate = new JdbcTemplate(jaloSession.getCurrentSession().getTenant().getDataSource());
		return jdbcTemplate.queryForInt("SELECT count(*) FROM " + tableName + " WHERE langpk = ? ", langPK.toString());
	}

	private Language getOrCreateLang(final String isoCode) throws ConsistencyCheckException
	{
		try
		{
			return jaloSession.getC2LManager().getLanguageByIsoCode(isoCode);
		}
		catch (final JaloItemNotFoundException jnfe)
		{
			return jaloSession.getC2LManager().createLanguage(isoCode);
		}
	}
}
