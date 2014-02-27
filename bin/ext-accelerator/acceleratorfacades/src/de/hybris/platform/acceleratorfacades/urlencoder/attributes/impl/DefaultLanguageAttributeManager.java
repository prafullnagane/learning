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
import de.hybris.platform.commercefacades.storesession.data.LanguageData;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;


/**
 * Default implementation for language attribute handler. This changes the store language if language is included as one
 * of the encoding attribute.
 */
public class DefaultLanguageAttributeManager extends AbstractUrlEncodingAttributeManager
{
	@Override
	public Collection<String> getAllAvailableValues()
	{
		getSessionService().setAttribute(AcceleratorFacadesConstants.LANGUAGE_ENCODING,Boolean.TRUE);
		return CollectionUtils.collect(getStoreSessionFacade().getAllLanguages(), new Transformer()
		{
			@Override
			public Object transform(final Object object)
			{
				return ((LanguageData) object).getIsocode();
			}
		});
	}

	@Override
	public void updateAndSyncForAttrChange(final String value)
	{
		if (isValid(value))
		{
			getStoreSessionFacade().setCurrentLanguage(value);
		}
	}

	@Override
	public String getDefaultValue()
	{
		return getStoreSessionFacade().getDefaultLanguage().getIsocode();
	}

	@Override
	public String getCurrentValue()
	{
		return getStoreSessionFacade().getCurrentLanguage().getIsocode();
	}

}
