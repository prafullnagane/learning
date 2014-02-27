/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Dec 13, 2013 6:34:50 PM
 * ----------------------------------------------------------------
 *
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
package de.hybris.merchandise.facades.product.data;

import de.hybris.merchandise.facades.product.data.GenderData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import java.util.List;

public class ApparelProductData extends ProductData 
{

	/** <i>Generated property</i> for <code>ApparelProductData.genders</code> property defined at extension <code>merchandisefacades</code>. */
	private List<GenderData> genders;
		
	public ApparelProductData()
	{
		// default constructor
	}
	
		
	public void setGenders(final List<GenderData> genders)
	{
		this.genders = genders;
	}
	
		
	public List<GenderData> getGenders() 
	{
		return genders;
	}
		
	
}