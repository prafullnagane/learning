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
package de.hybris.platform.impex.jalo;

import static de.hybris.platform.testframework.Assert.assertCollection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.MasterTenant;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.SlaveTenant;
import de.hybris.platform.core.Tenant;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.cronjob.jalo.CronJobManager;
import de.hybris.platform.impex.constants.ImpExConstants;
import de.hybris.platform.impex.jalo.exp.ImpExCSVExportWriter;
import de.hybris.platform.impex.jalo.header.AbstractColumnDescriptor;
import de.hybris.platform.impex.jalo.header.HeaderDescriptor;
import de.hybris.platform.impex.jalo.header.HeaderValidationException;
import de.hybris.platform.impex.jalo.header.StandardColumnDescriptor;
import de.hybris.platform.impex.jalo.imp.AmbiguousItemException;
import de.hybris.platform.impex.jalo.imp.DefaultImportProcessor;
import de.hybris.platform.impex.jalo.imp.ImpExImportReader;
import de.hybris.platform.impex.jalo.imp.InsufficientDataException;
import de.hybris.platform.impex.jalo.imp.ItemConflictException;
import de.hybris.platform.impex.jalo.translators.UserPasswordTranslator;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloItemNotFoundException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.ProductManager;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.security.JaloSecurityException;
import de.hybris.platform.jalo.security.PasswordEncoderNotFoundException;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.Title;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.persistence.SystemEJB;
import de.hybris.platform.persistence.security.PasswordEncoder;
import de.hybris.platform.persistence.security.SaltedMD5PasswordEncoder;
import de.hybris.platform.util.CSVReader;
import de.hybris.platform.util.CSVWriter;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * This test class is used for testing the different modifiers possible in header descriptors.
 */
@IntegrationTest
public class ImpExModifierTest extends AbstractImpExTest
{
	private static final Logger LOG = Logger.getLogger(ImpExModifierTest.class.getName());

	private String originalSalt = null;

	@Before
	public void setUp()
	{
		// TODO after the relase 3.0 was published, we have to move this code to JaloTest !!!

		final Tenant t = Registry.getCurrentTenant();
		if (t instanceof MasterTenant)
		{
			originalSalt = ((MasterTenant) t).getConfig().getParameter("password.md5.salt");
			((MasterTenant) t).getConfig().setParameter("password.md5.salt", "JUnit");
		}
		else
		{
			((SlaveTenant) t).getOwnConfig().setParameter("password.md5.salt", "JUnit");
		}
		//////////////////////////////////
	}

	@After
	public void tearDown()
	{
		//	 TODO after the relase 3.0 was published, we have to move this code to JaloTest !!!

		if (originalSalt != null)
		{
			final Tenant t = Registry.getCurrentTenant();
			if (t instanceof MasterTenant)
			{
				((MasterTenant) t).getConfig().setParameter("password.md5.salt", originalSalt);
			}
		}
		////////////////////////////////////////////
	}

	/**
	 * Tests the validation with and without modifier <code>allowNull</code>.
	 */
	@Test
	public void testModifierAllowNull()
	{
		final ImpExImportReader ir = new ImpExImportReader("UPDATE Region; isocode[unique=true]; active; country[unique=true] \n" // 1st test
				+ "; THEREGION;true;;\n"
				+ "INSERT Region; isocode[unique=true]; active; country[unique=true, allownull=true] \n" // 2nd test
				+ "; THEREGION;true;;\n"
				+ "INSERT Region; isocode[unique=true]; active[allownull=true]; country(isocode)[unique=true] \n" // 3rd test
				+ "; THEREGION;;testCountry;");
		ir.enableCodeExecution(true);

		//	 1st test, missing modifier: allownull
		try
		{
			assertNotNull(ir.readLine());
			fail("Exception 'missing value for mandatory attribute country' expected");
		}
		catch (final InsufficientDataException e)
		{
			//well done
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}

		// 2nd test, usage of modifier: allownull wit no success
		try
		{
			assertNotNull(ir.readLine());
			fail("region could be created!!?");
		}
		catch (final ImpExException e)
		{
			final Throwable nestedE = e.getCause();
			if (nestedE instanceof JaloInvalidParameterException)
			{
				if (!e.getMessage().contains("missing [country] got"))
				{
					fail(e.getMessage());
				}
			}
			else
			{
				fail("this exception should not occur:" + e);
			}
		}

		//	3. test, usage of modifier: allownull eith success
		try
		{
			final Country c = C2LManager.getInstance().createCountry("testCountry");
			assertNotNull(c);
		}
		catch (final ConsistencyCheckException e)
		{
			fail(e.getMessage());
		}
		try
		{
			assertNotNull(ir.readLine());
		}
		catch (final ImpExException e)
		{
			fail("this exception should not occur:" + e);
		}
		catch (final JaloInvalidParameterException e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the default modifier in simple cases.
	 */
	@Test
	public void testModifierDefault()
	{
		final SessionContext deCtx = jaloSession.createSessionContext();
		deCtx.setLanguage(german);

		// simple test
		Country c = null;
		try
		{
			c = C2LManager.getInstance().createCountry("defValTest");
			c.setName(deCtx, "xxx");
			assertFalse(c.isActive().booleanValue());
			assertEquals("xxx", c.getName(deCtx));
			c.addNewRegion("devValReg");
		}
		catch (final ConsistencyCheckException e)
		{
			fail(e.getMessage());
		}

		StringWriter dump = new StringWriter();
		ImpExImportReader ir = new ImpExImportReader(new CSVReader("INSERT_UPDATE Region;" + Region.CODE + "[unique=true];"
				+ Region.ACTIVE + "[default=false];" + Region.COUNTRY + "(" + Country.ISOCODE + "[default='" + c.getIsoCode() + "'],"
				+ Country.ACTIVE + "[default='false']," + Country.NAME + "[lang='" + german.getIsoCode() + "',default='"
				+ c.getName(deCtx) + "']" + ")\n" + ";test1;; \n" // no value
				+ ";test2;; " + c.getIsoCode() + ":false:xxx \n" // fully qualified
				+ ";test3;; " + c.getIsoCode() + " \n" // 'active' and name missing
				+ ";test4;; " + c.getIsoCode() + ":: \n" // 'active' and name missing but separators present
				+ ";test5;; " + c.getIsoCode() + "::xxx \n"// 'active' missing but separators present
		), new CSVWriter(dump));

		try
		{
			Region test1, test2, test3, test4, test5;
			test1 = (Region) ir.readLine();
			assertEquals(0, ir.getDumpedLineCount());
			assertEquals(c, test1.getCountry());

			test2 = (Region) ir.readLine();
			assertEquals(0, ir.getDumpedLineCount());
			assertEquals(c, test2.getCountry());

			test3 = (Region) ir.readLine();
			assertEquals(0, ir.getDumpedLineCount());
			assertEquals(c, test3.getCountry());

			test4 = (Region) ir.readLine();
			assertEquals(0, ir.getDumpedLineCount());
			assertEquals(c, test4.getCountry());

			test5 = (Region) ir.readLine();
			assertEquals(0, ir.getDumpedLineCount());
			assertEquals(c, test5.getCountry());

			assertNull(ir.readLine());
			ir.close();
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
		catch (final IOException e)
		{
			fail(e.getMessage());
		}

		// test dumping of unresolvable default values
		dump = new StringWriter();
		final CSVWriter wr = new CSVWriter(dump);
		ir = new ImpExImportReader(new CSVReader("INSERT_UPDATE Region;" + Region.CODE + "[unique=true];" + Region.ACTIVE
				+ "[default=false];" + Region.COUNTRY + "(" + Country.ISOCODE + "[default='DoesntExist']," + Country.ACTIVE
				+ "[default='true']," + Country.NAME + "[lang='" + german.getIsoCode() + "',default='blah']" + ")\n" + ";test10;; \n" // no value to test default value dumping
		), wr);

		assertEquals(wr, ir.getCSVWriter());
		try
		{
			assertNull(ir.readLine());
			ir.close();
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
		catch (final IOException e)
		{
			fail(e.getMessage());
		}
		assertEquals(1, ir.getDumpedLineCount());
		Map[] dumpedLines = CSVReader.parse(dump.getBuffer().toString());
		assertEquals(2, dumpedLines.length);
		assertEquals("test10", dumpedLines[1].get(Integer.valueOf(1)));
		assertTrue(dumpedLines[1].get(Integer.valueOf(2)) == null || "".equals(dumpedLines[1].get(Integer.valueOf(2))));

		// test dumping of unresolvable default values again
		dump = new StringWriter();
		ir = new ImpExImportReader(new CSVReader("INSERT_UPDATE Region;" + Region.CODE + "[unique=true];" + Region.ACTIVE
				+ "[default=false];" + Region.COUNTRY + "(" + Country.ISOCODE + "," + Country.ACTIVE + "," + Country.NAME + "[lang='"
				+ german.getIsoCode() + "']" + ")[default='DoesntExist:true:blah']\n" + ";test11;; \n" // no value to test default value dumping
		), new CSVWriter(dump));

		try
		{
			assertNull(ir.readLine());
			ir.close();
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
		catch (final IOException e)
		{
			fail(e.getMessage());
		}
		assertEquals(1, ir.getDumpedLineCount());
		dumpedLines = CSVReader.parse(dump.getBuffer().toString());
		assertEquals(2, dumpedLines.length);
		assertEquals("test11", dumpedLines[1].get(Integer.valueOf(1)));
		assertTrue(dumpedLines[1].get(Integer.valueOf(2)) == null || "".equals(dumpedLines[1].get(Integer.valueOf(2))));
	}

	/**
	 * Tests the default modifier behind another modifier. See CORE-3932.
	 */
	@Test
	public void testModifierDefaultBehind()
	{
		if (!ExtensionManager.getInstance().getExtensionNames().contains("catalog"))
		{
			fail("catalog extension required for test");
		}

		Item cv1 = null, cv2 = null;
		final ImpExImportReader ir = new ImpExImportReader(
				"INSERT Catalog; id[unique=true] \n"
						+ "; c1 \n"
						+ "INSERT CatalogVersion; version[unique=true] ; catalog(id)[unique=true] \n"
						+ "; cv1 ; c1 \n"
						+ "; cv2 ; c1 \n"
						+ "INSERT Product; code[unique=true]; catalogVersion(version,catalog(id))[unique=true, default='cv1:c1'] \n"
						+ "; p1 ; cv2:c1 \n"
						+ "; p2 ;  \n"
						+ "INSERT Product; code[unique=true]; catalogVersion(version,catalog(id[default='c1']))[unique=true, default='cv1:c1'] \n"
						+ "; p3 ; cv2 \n" + "; p4 ;  \n");
		try
		{
			final Item c = (Item) ir.readLine();
			// c1
			assertNotNull(c);
			assertEquals("c1", c.getAttribute("id"));
			// cv1
			cv1 = (Item) ir.readLine();
			assertNotNull(cv1);
			assertEquals("cv1", cv1.getAttribute("version"));
			assertEquals(c, cv1.getAttribute("catalog"));
			// cv2
			cv2 = (Item) ir.readLine();
			assertNotNull(cv2);
			assertEquals("cv2", cv2.getAttribute("version"));
			assertEquals(c, cv2.getAttribute("catalog"));
			// p1
			final Item p1 = (Item) ir.readLine();
			assertNotNull(p1);
			assertEquals("p1", p1.getAttribute("code"));
			assertEquals(cv2, p1.getAttribute("catalogVersion"));
			// p2
			final Item p2 = (Item) ir.readLine();
			assertNotNull(p2);
			assertEquals("p2", p2.getAttribute("code"));
			assertEquals(cv1, p2.getAttribute("catalogVersion"));
			// p3
			final Item p3 = (Item) ir.readLine();
			assertNotNull(p3);
			assertEquals("p3", p3.getAttribute("code"));
			assertEquals(cv2, p3.getAttribute("catalogVersion"));
			// p4
			final Item p4 = (Item) ir.readLine();
			assertNotNull(p4);
			assertEquals("p4", p4.getAttribute("code"));
			assertEquals(cv1, p4.getAttribute("catalogVersion"));

			assertNull(ir.readLine());
		}
		catch (final ImpExException e)
		{
			fail("unexpected exception " + e.getMessage());
		}
		catch (final JaloSecurityException e)
		{
			fail("unexpected exception " + e.getMessage());
		}
	}

	/**
	 * Tests the default modifier in case of translators. See CORE-3932.
	 */
	@Test
	public void testModifierDefaultTranslator()
	{
		if (!ExtensionManager.getInstance().getExtensionNames().contains("europe1"))
		{
			fail("europe1 extension required for test");
		}
		Currency eur = null;
		try
		{
			eur = C2LManager.getInstance().getCurrencyByIsoCode("eur");
		}
		catch (final JaloItemNotFoundException e)
		{
			try
			{
				eur = C2LManager.getInstance().createCurrency("eur");
			}
			catch (final ConsistencyCheckException e1)
			{
				fail(e1.getMessage());
			}
		}
		Unit pieces = ProductManager.getInstance().getUnit("pieces");
		if (pieces == null)
		{
			pieces = ProductManager.getInstance().createUnit("pieces", "pieces");
		}

		final ImpExImportReader ir = new ImpExImportReader("INSERT Product; " + "code[unique=true]; "
				+ "unit(code)[default='pieces']; " + "catalogVersion(version,catalog(id))[unique=true, allowNull=true];"
				+ "europe1prices[translator=de.hybris.platform.europe1.jalo.impex.Europe1PricesTranslator, default='10,00 EUR'] \n"
				+ "; p5 ; pieces; ; 23 EUR \n" + "; p6 \n");

		try
		{
			// p5
			final Item p5 = (Item) ir.readLine();
			assertNotNull(p5);
			assertEquals("p5", p5.getAttribute("code"));
			//assertEquals( cv2, p5.getAttribute( "catalogVersion" ) );
			assertEquals(pieces, p5.getAttribute("unit"));
			Collection<Item> priceRows = (Collection<Item>) p5.getAttribute("europe1prices");
			assertNotNull(priceRows);
			assertEquals(1, priceRows.size());
			Item priceRow = priceRows.iterator().next();
			assertEquals(p5, priceRow.getAttribute("product"));
			assertEquals(eur, priceRow.getAttribute("currency"));
			assertEquals(Double.valueOf(23.0), priceRow.getAttribute("price"));
			// p6
			final Item p6 = (Item) ir.readLine();
			assertNotNull(p6);
			assertEquals("p6", p6.getAttribute("code"));
			//assertEquals( cv1, p6.getAttribute( "catalogVersion" ) );
			assertEquals(pieces, p6.getAttribute("unit"));
			priceRows = (Collection<Item>) p6.getAttribute("europe1prices");
			assertNotNull(priceRows);
			assertEquals(1, priceRows.size());
			priceRow = priceRows.iterator().next();
			assertEquals(p6, priceRow.getAttribute("product"));
			assertEquals(eur, priceRow.getAttribute("currency"));
			assertEquals(Double.valueOf(10.0), priceRow.getAttribute("price"));

			assertNull(ir.readLine());
		}
		catch (final ImpExException e)
		{
			fail("unexpected exception " + e.getMessage());
		}
		catch (final JaloSecurityException e)
		{
			fail("unexpected exception " + e.getMessage());
		}
	}

	/**
	 * Tests the default modifier in case of special translators. See CORE-3932.
	 */
	@Test
	public void testModifierDefaultSpecialTranslator()
	{
		PasswordEncoder enc = null;
		try
		{
			enc = Registry.getCurrentTenant().getJaloConnection().getPasswordEncoder("md5");
		}
		catch (final PasswordEncoderNotFoundException e)
		{
			fail("cannot get MD5 password encoder (though it is mapped) : " + e);
		}

		ImpExImportReader ir = null;

		if (enc instanceof SaltedMD5PasswordEncoder)
		{
			ir = new ImpExImportReader("INSERT_UPDATE Employee;" + Employee.UID + "[unique=true];"
					+ ImpExConstants.Syntax.SPECIAL_COLUMN_PREFIX + "password[" + ImpExConstants.Syntax.Modifier.TRANSLATOR + "="
					+ UserPasswordTranslator.class.getName() + "," + ImpExConstants.Syntax.Modifier.DEFAULT
					+ "='md5:570bfc8e78236027d68be7b5bbd9c9fb'" + "] \n" + "; axel ; \n" // <- use default value
					+ "; axel2 ; *:axel2 \n" // <- set directly
			);
		}
		else
		{
			ir = new ImpExImportReader("INSERT_UPDATE Employee;" + Employee.UID + "[unique=true];"
					+ ImpExConstants.Syntax.SPECIAL_COLUMN_PREFIX + "password[" + ImpExConstants.Syntax.Modifier.TRANSLATOR + "="
					+ UserPasswordTranslator.class.getName() + "," + ImpExConstants.Syntax.Modifier.DEFAULT
					+ "='md5:a7c15c415c37626de8fa648127ba1ae5'" + "] \n" + "; axel ; \n" // <- use default value
					+ "; axel2 ; *:axel2 \n" // <- set directly
			);
		}

		try
		{
			final Employee axel = (Employee) ir.readLine();
			assertNotNull(axel);


			if (enc instanceof SaltedMD5PasswordEncoder)
			{
				assertEquals("570bfc8e78236027d68be7b5bbd9c9fb", axel.getEncodedPassword());
			}
			else
			{
				assertEquals("a7c15c415c37626de8fa648127ba1ae5", axel.getEncodedPassword());
			}

			assertEquals("md5", axel.getPasswordEncoding());
			assertTrue(axel.checkPassword("axel"));

			final Employee axel2 = (Employee) ir.readLine();
			assertNotNull(axel2);
			assertEquals("axel2", axel2.getEncodedPassword());
			assertEquals(SystemEJB.DEFAULT_ENCODING, axel2.getPasswordEncoding());
			assertTrue(axel2.checkPassword("axel2"));

			assertNull(ir.readLine());
		}
		catch (final ImpExException e)
		{
			fail("unexpected error " + e.getMessage());
		}
	}

	/**
	 * Tests the modifier batch mode.
	 */
	@Test
	public void testModifierBatchMode()
	{
		final ImpExImportReader ir = new ImpExImportReader("INSERT Title; " + Title.CODE + " \n" + "; t1 \n" + "; t2 \n"
				+ "; t3 \n" + "; t4 \n" + "INSERT Link; " + Link.QUALIFIER + ";" + Link.SOURCE + "(Title." + Title.CODE + ");"
				+ Link.TARGET + "(Title." + Title.CODE + ")\n" + ";test;t1;t2 \n" + ";test;t1;t3 \n" + ";test;t1;t4 \n"
				+ ";test;t2;t3 \n" + ";test;t3;t4 \n" + "UPDATE Link[batchmode=true]; " + Link.SOURCE + "(Title." + Title.CODE
				+ ")[unique=true];" + Link.QUALIFIER + " \n" + ";t1; testtest \n" + ";t3; testtesttest \n" + "UPDATE Link; "
				+ Link.SOURCE + "(Title." + Title.CODE + ")[unique=true];" + Link.QUALIFIER + " \n" + ";t1; xxx \n");

		Object o = null;
		Title t1, t2, t3, t4 = null;
		Link link1to2, link1to3, link1to4, link2to3, link3to4;

		try
		{
			o = ir.readLine();
			assertNotNull(o);
			t1 = (Title) o;
			assertEquals("t1", t1.getCode());

			o = ir.readLine();
			assertNotNull(o);
			t2 = (Title) o;
			assertEquals("t2", t2.getCode());

			o = ir.readLine();
			assertNotNull(o);
			t3 = (Title) o;
			assertEquals("t3", t3.getCode());

			o = ir.readLine();
			assertNotNull(o);
			t4 = (Title) o;
			assertEquals("t4", t4.getCode());

			o = ir.readLine();
			assertNotNull(o);
			link1to2 = (Link) o;
			assertEquals(t1, link1to2.getSource());
			assertEquals(t2, link1to2.getTarget());
			assertEquals("test", link1to2.getQualifier());

			o = ir.readLine();
			assertNotNull(o);
			link1to3 = (Link) o;
			assertEquals(t1, link1to3.getSource());
			assertEquals(t3, link1to3.getTarget());
			assertEquals("test", link1to3.getQualifier());

			o = ir.readLine();
			assertNotNull(o);
			link1to4 = (Link) o;
			assertEquals(t1, link1to4.getSource());
			assertEquals(t4, link1to4.getTarget());
			assertEquals("test", link1to4.getQualifier());

			o = ir.readLine();
			assertNotNull(o);
			link2to3 = (Link) o;
			assertEquals(t2, link2to3.getSource());
			assertEquals(t3, link2to3.getTarget());
			assertEquals("test", link2to3.getQualifier());

			o = ir.readLine();
			assertNotNull(o);
			link3to4 = (Link) o;
			assertEquals(t3, link3to4.getSource());
			assertEquals(t4, link3to4.getTarget());
			assertEquals("test", link3to4.getQualifier());

			// now try mass update
			o = ir.readLine();
			assertNotNull(o);
			assertTrue(o.equals(link1to2) || o.equals(link1to3) || o.equals(link1to4)); // dont know which one is first
			assertEquals("testtest", link1to2.getQualifier());
			assertEquals("testtest", link1to3.getQualifier());
			assertEquals("testtest", link1to4.getQualifier());

			o = ir.readLine();
			assertNotNull(o);
			assertEquals(link3to4, o); // just one so we're sure ;)
			assertEquals("testtesttest", link3to4.getQualifier());

			// other links still unchanged ?
			assertEquals("test", link2to3.getQualifier());

			// now test exception: batch update should not work for t1 now

			try
			{
				ir.readLine();
				fail("missing AmbiguousItemException");
			}
			catch (final AmbiguousItemException e)
			{
				//fine here
			}
		}
		catch (final ImpExException e)
		{
			fail("error: " + e.getMessage());
		}
	}

	/**
	 * Tests the modifier for caching unique keys and related
	 * {@link de.hybris.platform.impex.jalo.imp.CachingExistingItemResolver}.
	 */
	@Test
	public void testModifierCacheUniqueKeys()
	{
		final ImpExImportReader ir = new ImpExImportReader("INSERT Title; " + Title.CODE + "[unique=true] \n" + "; t1 \n"
				+ "; t2 \n" + "INSERT Title[" + ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS + "=true]; " + Title.CODE
				+ "[unique=true] \n" + "; t3 \n" + "; t4 \n" + "INSERT_UPDATE Title["
				+ ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS + "=true]; " + Title.CODE + "[unique=true] \n" + "; t3 \n"
				+ "; t4 \n" + "INSERT Title["
				+ ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS
				+ "=true]; "
				+ Title.CODE
				+ "[unique=true] \n"
				+ "; t5 \n"
				+ "; t1 \n" // should fail since 't1' already exists
				+ "; t5 \n" // should fail since 't5' already exists
				+ "INSERT UserGroup[" + ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS + "=true]; " + UserGroup.UID
				+ "[unique=true] ;" + UserGroup.DESCRIPTION + " \n" + "; g1; group 1 \n"
				+ "; g2; group 2 \n"
				// now test cached search via jalo-only attribute 'groups'
				+ "INSERT Employee[" + ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS + "=true]; " + Employee.UID + ";"
				+ Employee.NAME + "[unique=true];" + Employee.GROUPS + "(" + UserGroup.UID + ")[unique=true] \n"
				+ ";pcpl_1; max ; g1 \n" + ";pcpl_2; max ; g2 \n" + ";pcpl_3; moritz ; g1,g2 \n" + ";pcpl_4; max ; g1 \n" // should fail since there is alreay one 'max' inside 'g1'
				+ ";pcpl_5; moritz ; g1,g2 \n" // should fail since there is alreay one 'moritz' inside 'g1' and 'g2' - note the changed group order !
				+ "INSERT Title[" + ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS + "=true]; " + Title.CODE + "\n" + "; t6 \n");

		Title t1, t2, t3, t4, t5;
		try
		{
			t1 = (Title) ir.readLine();
			assertNotNull(t1);
			assertEquals("t1", t1.getCode());
			assertNull(ir.getCurrentHeader().getDescriptorData().getModifier(ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS));

			t2 = (Title) ir.readLine();
			assertNotNull(t2);
			assertEquals("t2", t2.getCode());

			t3 = (Title) ir.readLine();
			assertNotNull(t3);
			assertEquals("t3", t3.getCode());

			assertEquals("true",
					ir.getCurrentHeader().getDescriptorData().getModifier(ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS));

			t4 = (Title) ir.readLine();
			assertNotNull(t4);
			assertEquals("t4", t4.getCode());

			assertEquals(t3, ir.readLine());
			assertEquals("true",
					ir.getCurrentHeader().getDescriptorData().getModifier(ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS));
			assertEquals(t4, ir.readLine());

			t5 = (Title) ir.readLine();
			assertNotNull(t5);
			assertEquals("t5", t5.getCode());

			assertEquals("true",
					ir.getCurrentHeader().getDescriptorData().getModifier(ImpExConstants.Syntax.Modifier.CACHE_UNIQUE_KEYS));

			try
			{
				ir.readLine();
				fail("expected ItemConflictException");
			}
			catch (final ItemConflictException e)
			{
				// fine here
			}

			try
			{
				ir.readLine();
				fail("expected ItemConflictException");
			}
			catch (final ItemConflictException e)
			{
				// fine here
			}

			UserGroup g1, g2;
			Employee principal1, principal2, principal3;

			g1 = (UserGroup) ir.readLine();
			assertNotNull(g1);
			assertEquals("g1", g1.getUID());

			g2 = (UserGroup) ir.readLine();
			assertNotNull(g2);
			assertEquals("g2", g2.getUID());

			principal1 = (Employee) ir.readLine();
			assertNotNull(principal1);
			assertEquals("pcpl_1", principal1.getUID());
			assertEquals("max", principal1.getName());
			assertEquals(Collections.singleton(g1), principal1.getGroups());

			principal2 = (Employee) ir.readLine();
			assertNotNull(principal2);
			assertEquals("pcpl_2", principal2.getUID());
			assertEquals("max", principal2.getName());
			assertEquals(Collections.singleton(g2), principal2.getGroups());

			principal3 = (Employee) ir.readLine();
			assertNotNull(principal3);
			assertEquals("pcpl_3", principal3.getUID());
			assertEquals("moritz", principal3.getName());
			assertEquals(new HashSet(Arrays.asList(new UserGroup[]
			{ g1, g2 })), principal3.getGroups());

			try
			{
				assertNotNull(ir.readLine());
				fail("expected ItemConflictException");
			}
			catch (final ItemConflictException e)
			{
				// fine here
			}

			try
			{
				assertNotNull(ir.readLine());
				fail("expected ItemConflictException");
			}
			catch (final ItemConflictException e)
			{
				// fine here
			}

			try
			{
				assertNotNull(ir.readLine());
				fail("expected HeaderValidationException");
			}
			catch (final HeaderValidationException e)
			{
				// fine here
			}
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests import of collections using different collection delimiters with modifier collection-delimiter.
	 */
	@Test
	public void testModifierCollectionDelimiter() throws ImpExException
	{
		final String data =
		// create Languages
		"INSERT Language ; isoCode[unique=true]; active \n"//
				+ "; l1 ; false\n"//
				+ "; l2 ; false\n"//
				+ "; l3 ; false\n"
				// create fallbacks
				+ "INSERT Language; isocode[unique=true]; active; \n"//
				+ "; f1; true \n"//
				+ "; f2; true \n"//
				+ "; f3; true \n"
				// test standard , delimiter
				+ "UPDATE Language ; isoCode[unique=true]; fallbackLanguages(isoCode) \n"//
				+ "; l1 ; f1,f2,f3 \n"
				// test custom | delimiter
				+ "UPDATE Language ; isoCode[unique=true]; fallbackLanguages(isocode)[collection-delimiter='|'] \n"//
				+ "; l2 ; f1|f2|f3 \n"
				// test custom ; delimiter
				+ "UPDATE Language ; isoCode[unique=true]; \"fallbackLanguages(isocode)[collection-delimiter=';']\" \n"//
				+ "; l3 ; \"f1;f2;f3 \"\n";

		final ImpExImportReader ir = new ImpExImportReader(new CSVReader(new StringReader(data)), null);

		Language l1, l2, l3;
		Language f1, f2, f3;

		// create Languages
		l1 = (Language) ir.readLine();
		assertNotNull(l1);
		l2 = (Language) ir.readLine();
		assertNotNull(l2);
		l3 = (Language) ir.readLine();
		assertNotNull(l3);

		// create fallbacks
		f1 = (Language) ir.readLine();
		assertNotNull(f1);
		f2 = (Language) ir.readLine();
		assertNotNull(f2);
		f3 = (Language) ir.readLine();
		assertNotNull(f3);

		// assign fallbacks via collection attribute
		final List coll = Arrays.asList(new Object[]
		{ f1, f2, f3 });

		assertEquals(l1, ir.readLine()); // updates l1
		assertCollection(coll, l1.getFallbackLanguages());

		assertEquals(l2, ir.readLine()); // updates l2
		assertCollection(coll, l2.getFallbackLanguages());

		assertEquals(l3, ir.readLine()); // updates l3
		assertCollection(coll, l3.getFallbackLanguages());

		assertNull(ir.readLine());
	}

	/**
	 * Tests if the default value for an collection attribute can be composed from default values from item path. See
	 * PLA-5.
	 */
	@Test
	public void testModifierDefaultCollection()
	{
		if (ExtensionManager.getInstance().getExtension("catalog") == null)
		{
			LOG.warn("Extension  catalog not available - skipping test ");
			return;
		}
		final String lines = "INSERT_UPDATE Catalog;id[unique=true]\n" //create test catalog
				+ ";testCatalog\n"
				//create test version
				+ "INSERT_UPDATE CatalogVersion;catalog(id)[unique=true];version[unique=true];languages(isocode)\n"
				+ ";testCatalog;testVersion;de\n"
				//create test category
				+ "INSERT_UPDATE category;code[unique=true];catalogVersion(version,catalog(id));supercategories;\n"
				+ ";testCategory;testVersion:testCatalog;\n"

				//1.full separate defaults
				+ "INSERT_UPDATE Product;code[unique=true];catalogVersion(version[default=testVersion],catalog(id[default=testCatalog]));supercategories(code[default=testCategory],catalogVersion(version[default=testVersion],catalog(id[default=testCatalog])))[virtual=true]\n"
				+ ";dirk1\n"
				//2.incomplete separate defaults
				+ "INSERT_UPDATE Product;code[unique=true];catalogVersion(version[default=testVersion],catalog(id[default=testCatalog]));supercategories(code,catalogVersion(version[default=testVersion],catalog(id[default=testCatalog])))[virtual=true]\n"
				+ ";dirk2\n"
				//3.full global default
				+ "INSERT_UPDATE Product;code[unique=true];catalogVersion(version[default=testVersion],catalog(id[default=testCatalog]));supercategories(code,catalogVersion(version,catalog(id)))[virtual=true,default=testCategory:testVersion:testCatalog]\n"
				+ ";dirk3\n"
				//4.full separate defaults + add mode
				+ "INSERT_UPDATE Product;code[unique=true];catalogVersion(version[default=testVersion],catalog(id[default=testCatalog]));supercategories(code[default=testCategory],catalogVersion(version[default=testVersion],catalog(id[default=testCatalog])))[append=true,virtual=true]\n"
				+ ";dirk4\n"
				//5.no defaults
				+ "INSERT_UPDATE Product;code[unique=true];catalogVersion(version[default=testVersion],catalog(id[default=testCatalog]));supercategories(code,catalogVersion(version,catalog(id)))[virtual=true]\n"
				+ ";dirk5\n";

		final ImpExImportReader reader = new ImpExImportReader(lines);
		try
		{
			final Item testCatalog = (Item) reader.readLine();
			assertNotNull(testCatalog);

			final Item testVersion = (Item) reader.readLine();
			assertNotNull(testVersion);

			final Item testCategory = (Item) reader.readLine();
			assertNotNull(testCategory);

			final Product dirk1 = (Product) reader.readLine();
			assertTrue(((Collection) testCategory.getAttribute("PRODUCTS")).size() == 1);
			assertEquals("dirk1", ((Product) ((Collection) testCategory.getAttribute("PRODUCTS")).iterator().next()).getCode());
			dirk1.remove();

			final Product dirk2 = (Product) reader.readLine();
			assertTrue(((Collection) testCategory.getAttribute("PRODUCTS")).size() == 0);
			dirk2.remove();

			final Product dirk3 = (Product) reader.readLine();
			assertTrue(((Collection) testCategory.getAttribute("PRODUCTS")).size() == 1);
			assertEquals("dirk3", ((Product) ((Collection) testCategory.getAttribute("PRODUCTS")).iterator().next()).getCode());
			dirk3.remove();

			final Product dirk4 = (Product) reader.readLine();
			assertTrue(((Collection) testCategory.getAttribute("PRODUCTS")).size() == 1);
			assertEquals("dirk4", ((Product) ((Collection) testCategory.getAttribute("PRODUCTS")).iterator().next()).getCode());
			dirk4.remove();

			final Product dirk5 = (Product) reader.readLine();
			assertTrue(((Collection) testCategory.getAttribute("PRODUCTS")).size() == 0);
			dirk5.remove();
		}
		catch (final Exception e)
		{
			fail("unexpected exception " + e.getClass() + " : " + e);
		}
		try
		{
			reader.close();
		}
		catch (final IOException e)
		{
			fail("unexpected exception " + e.getClass() + " : " + e);
		}
	}

	/**
	 * Tests the forceWrite modifier.
	 * <p>
	 * Tests only insertion of non modifiable because there are no real case where there is used a non-initial
	 * not-writable attribute :
	 * <p>
	 * Or you have full mutable attribute- which is not a case here;
	 * <p>
	 * Or you have non writable but modified only for initial purposes attribute;
	 */
	@Test
	public void testModifierForceWrite()
	{
		CronJobManager.getInstance().createBatchJob("someBatchJob");

		final Date dateHourAgo = new Date(System.currentTimeMillis() - 1000 * 3600);
		final Date dateHourAgoWithoutSeconds = new Date(dateHourAgo.getTime() / 1000 * 1000);
		final DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

		final StringBuilder script = new StringBuilder("INSERT CronJob;code[unique=true];active;job(code);startTime;\n");
		script.append(";testTitleCode1;false;someBatchJob;" + format.format(dateHourAgoWithoutSeconds) + ";\n");

		script.append("INSERT CronJob;code[unique=true];active;job(code);startTime[forceWrite=true];\n");
		script.append(";testTitleCode2;false;someBatchJob;" + format.format(dateHourAgoWithoutSeconds) + ";\n");

		final Date dateTwoHoursAgo = new Date(System.currentTimeMillis() - 1000 * 3600 * 2);
		final Date dateTwoHoursAgoWithoutSeconds = new Date(dateTwoHoursAgo.getTime() / 1000 * 1000);

		script.append("UPDATE CronJob;code[unique=true];active;job(code);startTime[forceWrite=true];\n");
		script.append(";testTitleCode2;false;someBatchJob;" + format.format(dateTwoHoursAgoWithoutSeconds) + ";\n");

		final ImpExImportReader ir = new ImpExImportReader(script.toString());

		try
		{
			final CronJob link1 = (CronJob) ir.readLine();
			assertNotNull(link1);
			assertEquals("testTitleCode1", link1.getCode());
			assertFalse("non writable attribute should not be adjusted if no forceWrite provided ",
					dateHourAgoWithoutSeconds.equals(link1.getStartTime()));
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}

		try
		{
			final CronJob link1 = (CronJob) ir.readLine();
			assertNotNull(link1);
			assertEquals("testTitleCode2", link1.getCode());
			assertEquals(dateHourAgoWithoutSeconds, link1.getStartTime());
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}

		try
		{
			final CronJob link1 = (CronJob) ir.readLine();
			assertNotNull(link1);
			assertEquals("testTitleCode2", link1.getCode());
			assertEquals(dateTwoHoursAgoWithoutSeconds, link1.getStartTime());
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}

	}

	/**
	 * Tests modifier path-delimiter.
	 */
	@Test
	public void testModifierPathDelimiter()
	{
		Country c = null;
		Region r = null;
		try
		{
			c = C2LManager.getInstance().createCountry("patternTest");
			assertFalse(c.isActive().booleanValue());
			r = c.addNewRegion("impexReg");
		}
		catch (final ConsistencyCheckException e)
		{
			fail(e.getMessage());
		}

		String header = "INSERT_UPDATE Region;" + Region.CODE + "[unique=true];" + Region.COUNTRY + "(" + Country.ISOCODE + ","
				+ Country.ACTIVE + ")";

		try
		{
			final StringWriter sw = new StringWriter();
			final ImpExCSVExportWriter wr = new ImpExCSVExportWriter(new CSVWriter(sw));
			wr.setCurrentHeader(header, ImpExManager.getImportRelaxedMode());
			wr.setColumnOffset(0);
			wr.writeCurrentHeader(false);
			wr.writeLine(r);
			wr.close();

			final Map[] lines = CSVReader.parse(sw.getBuffer().toString());
			assertEquals(2, lines.length);
			assertEquals(r.getCode(), lines[1].get(Integer.valueOf(1)));
			assertEquals(c.getIsoCode() + ":false", lines[1].get(Integer.valueOf(2)));
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}

		// test if escaping works
		try
		{
			c.setIsoCode("pattern:Test");
			final StringWriter sw = new StringWriter();
			final ImpExCSVExportWriter wr = new ImpExCSVExportWriter(new CSVWriter(sw));
			wr.setColumnOffset(0);
			wr.setCurrentHeader(header, ImpExManager.getImportRelaxedMode());
			wr.writeCurrentHeader(false);
			wr.writeLine(r);
			wr.close();

			final Map[] lines = CSVReader.parse(sw.getBuffer().toString());
			assertEquals(2, lines.length);
			assertEquals(r.getCode(), lines[1].get(Integer.valueOf(1)));
			assertEquals("pattern\\:Test:false", lines[1].get(Integer.valueOf(2)));

			// test re-import
			final ImpExImportReader read = new ImpExImportReader(header + "\n" + sw.getBuffer().toString() + "\n");
			read.setValidationMode(ImpExManager.getImportRelaxedMode());

			final Object o = read.readLine();
			assertEquals(0, read.getDumpedLineCount());
			assertEquals(r, o);
			read.close();
		}
		catch (final ConsistencyCheckException e)
		{
			fail(e.getMessage());
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
		catch (final IOException e)
		{
			fail(e.getMessage());
		}

		// test custom delimiter (including escaping)
		try
		{
			c.setIsoCode("pattern_Test");
			header = "INSERT_UPDATE Region;" + Region.CODE + "[unique=true];" + Region.COUNTRY + "(" + Country.ISOCODE + ","
					+ Country.ACTIVE + ")[" + ImpExConstants.Syntax.Modifier.ATTRIBUTE_PATH_DELIMITER + "='_']";

			final StringWriter sw = new StringWriter();
			final ImpExCSVExportWriter wr = new ImpExCSVExportWriter(new CSVWriter(sw));
			wr.setColumnOffset(0);
			wr.setCurrentHeader(header, ImpExManager.getImportRelaxedMode());
			wr.writeCurrentHeader(false);
			wr.writeLine(r);
			wr.close();

			final Map[] lines = CSVReader.parse(sw.getBuffer().toString());
			assertEquals(2, lines.length);
			assertEquals(r.getCode(), lines[1].get(Integer.valueOf(1)));
			assertEquals("pattern\\_Test_false", lines[1].get(Integer.valueOf(2)));
			// test re-import
			final ImpExImportReader read = new ImpExImportReader(header + "\n" + sw.getBuffer().toString() + "\n");
			read.setValidationMode(ImpExManager.getImportRelaxedMode());

			final Object o = read.readLine();
			assertEquals(0, read.getDumpedLineCount());
			assertEquals(r, o);
			read.close();
		}
		catch (final ConsistencyCheckException e)
		{
			fail(e.getMessage());
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
		catch (final IOException e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the modifier <code>pos</code>.
	 */
	@Test
	public void testModifierPosition()
	{
		//try to use header where first column misses position modifier
		ImpExImportReader ir = null;
		ir = new ImpExImportReader("INSERT Unit; " + Unit.UNITTYPE + " ; " + Unit.CODE + "["
				+ ImpExConstants.Syntax.Modifier.UNIQUE + "=true, " + ImpExConstants.Syntax.Modifier.POSITION + "=4]; "
				+ Unit.CONVERSION + "[" + ImpExConstants.Syntax.Modifier.POSITION + "=6] ; " + Unit.NAME + "["
				+ ImpExConstants.Syntax.Modifier.LANGUAGE + "=" + german.getIsoCode() + "," + ImpExConstants.Syntax.Modifier.POSITION
				+ "=7] \n" + "; fill ; unit1 ; fill ; kg ; fill; 1 ; Kilogramm \n"
				+ "; fill ; unit2 ; fill; g ; fill; 0,001 ; Gramm \n");
		try
		{
			ir.readLine();
			fail();
		}
		catch (final ImpExException e1)
		{
			// OK
		}
		//try to use header where last column misses position modifier
		ir = new ImpExImportReader("INSERT Unit; " + Unit.UNITTYPE + "[" + ImpExConstants.Syntax.Modifier.POSITION + "=2] ; "
				+ Unit.CODE + "[" + ImpExConstants.Syntax.Modifier.UNIQUE + "=true, " + ImpExConstants.Syntax.Modifier.POSITION
				+ "=4]; " + Unit.CONVERSION + "[" + ImpExConstants.Syntax.Modifier.POSITION + "=2] ; " + Unit.NAME + "["
				+ ImpExConstants.Syntax.Modifier.LANGUAGE + "=" + german.getIsoCode() + "] \n"
				+ "; fill ; unit1 ; fill ; kg ; fill; 1 ; Kilogramm \n" + "; fill ; unit2 ; fill; g ; fill; 0,001 ; Gramm \n");
		try
		{
			ir.readLine();
			fail();
		}
		catch (final ImpExException e1)
		{
			// OK
		}
		//try to use header where a position is used twice
		ir = new ImpExImportReader("INSERT Unit; " + Unit.UNITTYPE + "[" + ImpExConstants.Syntax.Modifier.POSITION + "=2] ; "
				+ Unit.CODE + "[" + ImpExConstants.Syntax.Modifier.UNIQUE + "=true, " + ImpExConstants.Syntax.Modifier.POSITION
				+ "=4]; " + Unit.CONVERSION + "[" + ImpExConstants.Syntax.Modifier.POSITION + "=2] ; " + Unit.NAME + "["
				+ ImpExConstants.Syntax.Modifier.LANGUAGE + "=" + german.getIsoCode() + "," + ImpExConstants.Syntax.Modifier.POSITION
				+ "=7] \n" + "; fill ; unit1 ; fill ; kg ; fill; 1 ; Kilogramm \n"
				+ "; fill ; unit2 ; fill; g ; fill; 0,001 ; Gramm \n");
		try
		{
			ir.readLine();
			fail();
		}
		catch (final ImpExException e1)
		{
			// OK
		}
		//create test header
		ir = new ImpExImportReader("INSERT Unit; " + Unit.UNITTYPE + "[" + ImpExConstants.Syntax.Modifier.POSITION + "=2] ; "
				+ Unit.CONVERSION + "[" + ImpExConstants.Syntax.Modifier.POSITION + "=6] ; " + Unit.CODE + "["
				+ ImpExConstants.Syntax.Modifier.UNIQUE + "=true, " + ImpExConstants.Syntax.Modifier.POSITION + "=4]; " + Unit.NAME
				+ "[" + ImpExConstants.Syntax.Modifier.LANGUAGE + "=" + german.getIsoCode() + ","
				+ ImpExConstants.Syntax.Modifier.POSITION + "=7] \n" + "; fill ; unit1 ; fill ; kg ; fill; 1 ; Kilogramm \n"
				+ "; fill ; unit2 ; fill; g ; fill; 0,001 ; Gramm \n");
		Unit unit1, unit2;
		final SessionContext ctx = jaloSession.createSessionContext();
		ctx.setLanguage(german);
		try
		{
			//chech first unit
			unit1 = (Unit) ir.readLine();
			assertNotNull(unit1);
			assertEquals("unit1", unit1.getUnitType());
			assertEquals(1d, unit1.getConversionFactor(), 0);
			assertEquals("kg", unit1.getCode());
			assertEquals("Kilogramm", unit1.getName(ctx));

			//check column positions in header
			final HeaderDescriptor h = ir.getCurrentHeader();
			assertEquals(4, h.getColumns().size());
			Collection<AbstractColumnDescriptor> col = h.getColumnsByQualifier(Unit.UNITTYPE);
			assertEquals(col.size(), 1);
			assertEquals(col.iterator().next().getValuePosition(), 2);
			col = h.getColumnsByQualifier(Unit.CONVERSION);
			assertEquals(col.size(), 1);
			assertEquals(col.iterator().next().getValuePosition(), 6);
			col = h.getColumnsByQualifier(Unit.CODE);
			assertEquals(col.size(), 1);
			assertEquals(col.iterator().next().getValuePosition(), 4);
			col = h.getColumnsByQualifier(Unit.NAME);
			assertEquals(col.size(), 1);
			assertEquals(col.iterator().next().getValuePosition(), 7);
			//check second unit
			unit2 = (Unit) ir.readLine();
			assertNotNull(unit2);
			assertEquals("unit2", unit2.getUnitType());
			assertEquals(0.001d, unit2.getConversionFactor(), 0);
			assertEquals("g", unit2.getCode());
			assertEquals("Gramm", unit2.getName(ctx));
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Empty extension of <code>DefaultImportProcessor</code> for testing the modifier <code>processor</code> at tests
	 * case {@link ImpExModifierTest#testModifierProcessor()} (there is no other implementation of an
	 * <code>ImportProcessor</code>).
	 * 
	 * 
	 */
	public static class TestImportProcessor extends DefaultImportProcessor
	{
		//OK
	}

	/**
	 * Tests the <code>processor</code> modifier.
	 */
	@Test
	public void testModifierProcessor()
	{
		final ImpExImportReader ir = new ImpExImportReader("INSERT_UPDATE Country" + ImpExConstants.Syntax.MODIFIER_START
				+ ImpExConstants.Syntax.Modifier.PROCESSOR + ImpExConstants.Syntax.MODIFIER_EQUAL
				+ TestImportProcessor.class.getName() + ImpExConstants.Syntax.MODIFIER_END + ";" + Country.ISOCODE + "[unique=true];"
				+ Country.ACTIVE + "\n" + ";test1;false \n" + "INSERT_UPDATE Country;" + Country.ISOCODE + "[unique=true];"
				+ Country.ACTIVE + "\n" + ";test1;false \n" + "INSERT_UPDATE Country;" + Country.ISOCODE + "[unique=true,"
				+ ImpExConstants.Syntax.Modifier.PROCESSOR + ImpExConstants.Syntax.MODIFIER_EQUAL
				+ TestImportProcessor.class.getName() + ImpExConstants.Syntax.MODIFIER_END + ";" + Country.ACTIVE + "\n"
				+ ";test1;false \n" + "INSERT_UPDATE Country" + ImpExConstants.Syntax.MODIFIER_START
				+ ImpExConstants.Syntax.Modifier.PROCESSOR + "r" + ImpExConstants.Syntax.MODIFIER_EQUAL
				+ TestImportProcessor.class.getName() + ImpExConstants.Syntax.MODIFIER_END + ";" + Country.ISOCODE + "[unique=true];"
				+ Country.ACTIVE + "\n" + ";test1;false \n");
		Country test = null;
		try
		{
			test = (Country) ir.readLine();
			assertEquals(TestImportProcessor.class, ir.getImportProcessor().getClass());
			assertNotNull(test);
			test = (Country) ir.readLine();
			assertEquals(DefaultImportProcessor.class, ir.getImportProcessor().getClass());
			assertNotNull(test);
			test = (Country) ir.readLine();
			assertEquals(DefaultImportProcessor.class, ir.getImportProcessor().getClass());
			assertNotNull(test);
			test = (Country) ir.readLine();
			assertEquals(DefaultImportProcessor.class, ir.getImportProcessor().getClass());
			assertNotNull(test);
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}

		try
		{
			ir.close();
		}
		catch (final IOException e)
		{
			fail();
		}
	}

	/**
	 * Tests the modifier virtual.
	 */
	@Test
	public void testModifierVirtual()
	{
		final ImpExImportReader ir = new ImpExImportReader("$unitType=" + Unit.UNITTYPE + "["
				+ ImpExConstants.Syntax.Modifier.DEFAULT + "='xxx'" + "] \n" + "$conv=" + Unit.CONVERSION + "["
				+ ImpExConstants.Syntax.Modifier.DEFAULT + "='2'" + "] \n" + "INSERT Unit; $unitType["
				+ ImpExConstants.Syntax.Modifier.VIRTUAL + "=true] ; " + Unit.CODE + "[unique=true]; $conv["
				+ ImpExConstants.Syntax.Modifier.VIRTUAL + "=true] ; name[lang=" + german.getIsoCode() + "] \n"
				+ "; unit1 ; name unit 1 \n" + "; unit2 ; name unit 2 \n" + "; unit3 ; name unit 3 \n");

		Unit u1, u2, u3;
		final SessionContext ctx = jaloSession.createSessionContext();
		ctx.setLanguage(german);
		try
		{
			u1 = (Unit) ir.readLine();
			assertNotNull(u1);
			assertEquals("xxx", u1.getUnitType());
			assertEquals(2d, u1.getConversionFactor(), 0);

			assertEquals("unit1", u1.getCode());
			assertEquals("name unit 1", u1.getName(ctx));

			final HeaderDescriptor h = ir.getCurrentHeader();
			assertEquals(4, h.getColumns().size());
			final Iterator iter = h.getColumns().iterator();

			final StandardColumnDescriptor cdUnit = (StandardColumnDescriptor) iter.next();
			assertTrue(cdUnit.isVirtual());
			assertEquals(-1, cdUnit.getValuePosition());
			assertEquals("xxx", cdUnit.getDefaultValue());
			assertTrue(iter.hasNext());

			final StandardColumnDescriptor cdCode = (StandardColumnDescriptor) iter.next();
			assertFalse(cdCode.isVirtual());
			assertEquals(1, cdCode.getValuePosition());
			assertNull(cdCode.getDefaultValue());
			assertTrue(iter.hasNext());

			final StandardColumnDescriptor cdConv = (StandardColumnDescriptor) iter.next();
			assertTrue(cdConv.isVirtual());
			assertEquals(-3, cdConv.getValuePosition());
			assertEquals(new Double(2d), cdConv.getDefaultValue());
			assertTrue(iter.hasNext());

			final StandardColumnDescriptor cdName = (StandardColumnDescriptor) iter.next();
			assertFalse(cdName.isVirtual());
			assertEquals(2, cdName.getValuePosition());
			assertNull(cdName.getDefaultValue());
			assertEquals(german.getIsoCode(), cdName.getLanguageIso());
			assertFalse(iter.hasNext());

			u2 = (Unit) ir.readLine();
			assertNotNull(u2);
			assertEquals("xxx", u2.getUnitType());
			assertEquals(2d, u2.getConversionFactor(), 0);
			assertEquals("unit2", u2.getCode());
			assertEquals("name unit 2", u2.getName(ctx));

			u3 = (Unit) ir.readLine();
			assertNotNull(u3);
			assertEquals("xxx", u3.getUnitType());
			assertEquals(2d, u3.getConversionFactor(), 0);
			assertEquals("unit3", u3.getCode());
			assertEquals("name unit 3", u3.getName(ctx));
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the modifier <code>lang</code>.
	 */
	@Test
	public void testModifierLanguage()
	{
		final SessionContext deCtx = JaloSession.getCurrentSession().createSessionContext();
		deCtx.setLanguage(german);
		final SessionContext enCtx = JaloSession.getCurrentSession().createSessionContext();
		enCtx.setLanguage(english);

		final ImpExImportReader ir = new ImpExImportReader("INSERT_UPDATE Unit;unitType[unique=true];code[unique=true];name[lang="
				+ german.getIsoCode() + "];name[lang=" + english.getIsoCode() + "]\n" + ";test1;test1;test_de;test_en\n"
				+ "INSERT_UPDATE Unit;unitType[unique=true];code[unique=true];name[lang=" + german.getPK() + "];name[lang="
				+ english.getPK() + "]\n" + ";test2;test2;test_de;test_en");
		try
		{
			Unit unit = (Unit) ir.readLine();
			assertEquals("test1", unit.getUnitType());
			assertEquals("test1", unit.getCode());
			assertEquals("test_de", unit.getName(deCtx));
			assertEquals("test_en", unit.getName(enCtx));

			unit = (Unit) ir.readLine();
			assertEquals("test2", unit.getUnitType());
			assertEquals("test2", unit.getCode());
			assertEquals("test_de", unit.getName(deCtx));
			assertEquals("test_en", unit.getName(enCtx));
		}
		catch (final ImpExException e)
		{
			fail(e.getMessage());
		}
	}
}
