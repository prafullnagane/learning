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
package de.hybris.platform.commercefacades.product.converters.populator;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeUnitModel;
import de.hybris.platform.classification.features.Feature;
import de.hybris.platform.classification.features.FeatureValue;
import de.hybris.platform.commercefacades.product.data.FeatureData;
import de.hybris.platform.commerceservices.util.ConverterFactory;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;



@UnitTest
public class FeaturePopulatorTest
{
	private static final String FEATURE_CODE = "featCode";
	private static final String CLASS_ATTR_DESCRIPTION = "classAttrDesc";
	private static final String CLASS_UNIT_NAME = "unitName";

	private AbstractPopulatingConverter<Feature, FeatureData> featureConverter =
				new ConverterFactory<Feature, FeatureData, FeaturePopulator>().create(FeatureData.class, new FeaturePopulator());

	@Before
	public void setUp()
	{
		//Do Nothing
	}

	@Test
	public void testConvert()
	{
		final Feature source = mock(Feature.class);
		final ClassAttributeAssignmentModel classAttributeAssignmentModel = mock(ClassAttributeAssignmentModel.class);
		final ClassificationAttributeUnitModel classificationAttributeUnitModel = mock(ClassificationAttributeUnitModel.class);
		final FeatureValue featureValue = mock(FeatureValue.class);

		given(source.getCode()).willReturn(FEATURE_CODE);
		given(source.getClassAttributeAssignment()).willReturn(classAttributeAssignmentModel);
		given(classAttributeAssignmentModel.getComparable()).willReturn(Boolean.TRUE);
		given(classAttributeAssignmentModel.getDescription()).willReturn(CLASS_ATTR_DESCRIPTION);
		given(classAttributeAssignmentModel.getUnit()).willReturn(classificationAttributeUnitModel);
		given(classificationAttributeUnitModel.getName()).willReturn(CLASS_UNIT_NAME);
		given(source.getValues()).willReturn(Collections.singletonList(featureValue));

		final FeatureData result = featureConverter.convert(source);

		Assert.assertEquals(FEATURE_CODE, result.getCode());
		Assert.assertEquals(CLASS_ATTR_DESCRIPTION, result.getDescription());
		Assert.assertEquals(CLASS_UNIT_NAME, result.getFeatureUnit().getName());
		Assert.assertEquals(1, result.getFeatureValues().size());
	}
}
