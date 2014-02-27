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
package de.hybris.platform.ycommercewebservices.dto;

import de.hybris.platform.commercefacades.product.data.ReviewData;

import java.util.List;


/**
 * Review data list wrapper.
 */
public class ReviewDataList
{
	private List<ReviewData> reviews = null;

	public ReviewDataList()
	{
		super();
	}

	public ReviewDataList(final List<ReviewData> reviews)
	{
		super();
		this.reviews = reviews;
	}

	public List<ReviewData> getReviews()
	{
		return reviews;
	}

	public void setReviews(final List<ReviewData> reviews)
	{
		this.reviews = reviews;
	}

}
