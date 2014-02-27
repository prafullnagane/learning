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

import de.hybris.platform.promotions.dto.PromotionOrderAddFreeGiftActionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionOrderAddFreeGiftAction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionorderaddfreegiftactions")
public class PromotionOrderAddFreeGiftActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionOrderAddFreeGiftActionDTO*/
	private List<PromotionOrderAddFreeGiftActionDTO>  promotionorderaddfreegiftactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderAddFreeGiftActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderAddFreeGiftActionsDTO(final List<PromotionOrderAddFreeGiftActionDTO> promotionorderaddfreegiftactionsList)
	{
		super();
		this.promotionorderaddfreegiftactionsList=promotionorderaddfreegiftactionsList;
	}
	
	
	/**
	 * @return the promotionorderaddfreegiftactions
	 */
	@XmlElement(name = "promotionorderaddfreegiftaction")
	public List<PromotionOrderAddFreeGiftActionDTO> getPromotionOrderAddFreeGiftActions()
	{
		return	promotionorderaddfreegiftactionsList;
	}
	
	/**
	 * @param promotionorderaddfreegiftactionsList 
	 *  the promotionorderaddfreegiftactionsList to set   
	 */
	public void setPromotionOrderAddFreeGiftActions(final List<PromotionOrderAddFreeGiftActionDTO> promotionorderaddfreegiftactionsList)
	{
		this.promotionorderaddfreegiftactionsList=promotionorderaddfreegiftactionsList;
	}
	
}
