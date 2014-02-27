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
package de.hybris.platform.product.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;


/**
 * {@link PrepareInterceptor} for the {@link PriceRowModel}. Sets the fallback {@link UnitModel} if no unit is provided
 * for the pricerow. The fallback is the unit from {@link ProductModel#UNIT}. If the {@link PriceRowModel} AND
 * {@link ProductModel#UNIT} contains no unit a {@link InterceptorException} is thrown.
 */
public class PriceRowPrepareInterceptor implements PrepareInterceptor
{
	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (model instanceof PriceRowModel)
		{
			final PriceRowModel prModel = (PriceRowModel) model;

			if (prModel.getUnit() == null)
			{
				final UnitModel fallbackUnit = (prModel.getProduct() == null) ? null : prModel.getProduct().getUnit();
				if (fallbackUnit == null)
				{
					throw new InterceptorException("missing unit for price row ");
				}
				else
				{
					prModel.setUnit(fallbackUnit);
				}
			}
		}
	}
}
