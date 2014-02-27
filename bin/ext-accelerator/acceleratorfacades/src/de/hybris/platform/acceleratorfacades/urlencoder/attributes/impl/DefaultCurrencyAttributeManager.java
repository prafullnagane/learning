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
package de.hybris.platform.acceleratorfacades.urlencoder.attributes.impl;


import de.hybris.platform.acceleratorfacades.constants.AcceleratorFacadesConstants;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;


/**
 * Default implementation for currency attribute handler. This changes the store currency if currency is included as one
 * of the encoding attribute.
 */
public class DefaultCurrencyAttributeManager extends AbstractUrlEncodingAttributeManager
{
	@Override
	public Collection<String> getAllAvailableValues()
	{
		getSessionService().setAttribute(AcceleratorFacadesConstants.CURRENCY_ENCODING,Boolean.TRUE);
		return CollectionUtils.collect(getStoreSessionFacade().getAllCurrencies(), new Transformer()
		{
			@Override
			public Object transform(final Object object)
			{
				return ((CurrencyData) object).getIsocode();
			}
		});
	}

	@Override
	public void updateAndSyncForAttrChange(final String value)
	{
		if (isValid(value))
		{
			getStoreSessionFacade().setCurrentCurrency(value);
		}
	}

	@Override
	public String getDefaultValue()
	{
		return getStoreSessionFacade().getDefaultCurrency().getIsocode();
	}

	@Override
	public String getCurrentValue()
	{
		return getStoreSessionFacade().getCurrentCurrency().getIsocode();
	}
}
