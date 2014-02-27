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

import de.hybris.platform.commercefacades.order.data.CardTypeData;

import java.util.List;


/**
 * CardType data list wrapper.
 */
public class CardTypeDataList
{
	private List<CardTypeData> cardTypes = null;

	public CardTypeDataList()
	{
		super();
	}

	public CardTypeDataList(final List<CardTypeData> cardTypes)
	{
		super();
		this.cardTypes = cardTypes;
	}

	public List<CardTypeData> getCardTypes()
	{
		return cardTypes;
	}

	public void setCardTypes(final List<CardTypeData> cardTypes)
	{
		this.cardTypes = cardTypes;
	}

}
