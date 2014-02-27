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
package de.hybris.platform.commercefacades.i18n;

import de.hybris.platform.core.model.c2l.LanguageModel;


/**
 * Abstraction for the resolving mechanism of Language for a given iso code.
 */
public interface LanguageResolver
{
	LanguageModel getLanguage(String isoCode);
}
