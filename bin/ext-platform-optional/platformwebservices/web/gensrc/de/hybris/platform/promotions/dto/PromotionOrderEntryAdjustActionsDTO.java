/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.promotions.dto;

import de.hybris.platform.promotions.dto.PromotionOrderEntryAdjustActionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionOrderEntryAdjustAction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionorderentryadjustactions")
public class PromotionOrderEntryAdjustActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionOrderEntryAdjustActionDTO*/
	private List<PromotionOrderEntryAdjustActionDTO>  promotionorderentryadjustactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderEntryAdjustActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderEntryAdjustActionsDTO(final List<PromotionOrderEntryAdjustActionDTO> promotionorderentryadjustactionsList)
	{
		super();
		this.promotionorderentryadjustactionsList=promotionorderentryadjustactionsList;
	}
	
	
	/**
	 * @return the promotionorderentryadjustactions
	 */
	@XmlElement(name = "promotionorderentryadjustaction")
	public List<PromotionOrderEntryAdjustActionDTO> getPromotionOrderEntryAdjustActions()
	{
		return	promotionorderentryadjustactionsList;
	}
	
	/**
	 * @param promotionorderentryadjustactionsList 
	 *  the promotionorderentryadjustactionsList to set   
	 */
	public void setPromotionOrderEntryAdjustActions(final List<PromotionOrderEntryAdjustActionDTO> promotionorderentryadjustactionsList)
	{
		this.promotionorderentryadjustactionsList=promotionorderentryadjustactionsList;
	}
	
}
