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
package de.hybris.platform.validation.model.constraints;

/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.validation.model.constraints.jsr303.AbstractConstraintTest;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;


/**
 * Testing the HybrisDecimalMax Constraint.
 */
@IntegrationTest
public class HybrisDecimalMaxConstraintTest extends AbstractConstraintTest
{
	/**
	 * Testsample: CurrencyModel.conversition must be equal or below 1.0000001
	 */
	private void createDecimalMaxConstraint()
	{
		final AttributeDescriptorModel attrDesc = typeService.getAttributeDescriptor(
				typeService.getComposedType(CurrencyModel.class), CurrencyModel.CONVERSION);
		final HybrisDecimalMaxConstraintModel decimalMax = new HybrisDecimalMaxConstraintModel();
		modelService.initDefaults(decimalMax);
		decimalMax.setId("decimalMax");
		decimalMax.setValue(BigDecimal.valueOf(1.0000001));
		decimalMax.setDescriptor(attrDesc);
		modelService.save(decimalMax);
		Assert.assertEquals(getDefaultMessage(Constraint.HYBRIS_DECIMAL_MAX.msgKey), decimalMax.getDefaultMessage());
		validationService.reloadValidationEngine();
	}

	private CurrencyModel createCurrencyForValidation(final double value)
	{
		final CurrencyModel curr = modelService.create(CurrencyModel.class);
		curr.setIsocode("curr");
		curr.setActive(Boolean.TRUE);
		curr.setConversion(Double.valueOf(value));
		curr.setSymbol("CUR");
		curr.setDigits(Integer.valueOf(0));
		return curr;
	}

	/**
	 * must fail because value is 0.000000001 larger as rule
	 */
	@Test
	public void testMaxConstraintGreaterExplicit()
	{
		final CurrencyModel curr = createCurrencyForValidation(1.000000101);
		modelService.save(curr);
		assertEquals(BigDecimal.valueOf(curr.getConversion().doubleValue()), BigDecimal.valueOf(1.000000101));
		createDecimalMaxConstraint();
		assertFalse(validationService.validate(curr).isEmpty());
	}

	@Test
	public void testMaxConstraintEqual()
	{
		final CurrencyModel curr = createCurrencyForValidation(1.0000001);
		modelService.save(curr);

		assertEquals(BigDecimal.valueOf(curr.getConversion().doubleValue()), BigDecimal.valueOf(1.0000001));
		createDecimalMaxConstraint();
		assertFalse(validationService.validate(curr).isEmpty());
	}

	/**
	 * must fail because value is 0.000000001 larger as rule
	 */
	@Test
	public void testMaxConstraintGreaterImplicit()
	{
		createDecimalMaxConstraint();

		final CurrencyModel curr = createCurrencyForValidation(1.000000101);
		try
		{
			modelService.save(curr);
			fail("test should fail!");
		}
		catch (final Exception e)
		{
			assertModelSavingExceptionWithMessageKey(e, Constraint.HYBRIS_DECIMAL_MAX.msgKey, "conversion");
		}
	}

	/**
	 * is ok, difference is 0.00000000001 below border
	 */
	@Test
	public void testMaxConstraintLowerExplicit()
	{
		final CurrencyModel curr = createCurrencyForValidation(1.00000009999);
		modelService.save(curr);

		createDecimalMaxConstraint();
		assertTrue(validationService.validate(curr).isEmpty());
	}

	/**
	 * is ok, difference is 0.00000000001 below border
	 */
	@Test
	public void testMaxConstraintLowerImplicit()
	{
		createDecimalMaxConstraint();
		final CurrencyModel curr = createCurrencyForValidation(1.00000009999);
		modelService.save(curr);
	}
}
