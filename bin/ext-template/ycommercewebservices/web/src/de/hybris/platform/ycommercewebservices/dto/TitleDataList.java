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

import de.hybris.platform.commercefacades.user.data.TitleData;

import java.util.List;


/**
 * Title data list wrapper.
 */
public class TitleDataList
{
	private List<TitleData> titles = null;


	public TitleDataList()
	{
		super();
	}

	public TitleDataList(final List<TitleData> titles)
	{
		super();
		this.titles = titles;
	}

	public List<TitleData> getTitles()
	{
		return titles;
	}

	public void setReviews(final List<TitleData> titles)
	{
		this.titles = titles;
	}

}
