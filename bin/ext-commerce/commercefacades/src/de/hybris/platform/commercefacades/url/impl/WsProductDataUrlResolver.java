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
package de.hybris.platform.commercefacades.url.impl;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.url.impl.AbstractUrlResolver;
import de.hybris.platform.site.BaseSiteService;


/**
 * Url resolver for products in format: /{site}/products/{productCode}
 * 
 */
public class WsProductDataUrlResolver extends AbstractUrlResolver<ProductData>
{
	private BaseSiteService baseSiteService;

	@Override
	protected String resolveInternal(final ProductData source)
	{
		final String uid = baseSiteService.getCurrentBaseSite() != null ? baseSiteService.getCurrentBaseSite().getUid() : "{site}";
		return "/" + uid + "/products/" + source.getCode();
	}

	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}
}
