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

import de.hybris.platform.promotions.dto.PromotionOrderChangeDeliveryModeActionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionOrderChangeDeliveryModeAction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionorderchangedeliverymodeactions")
public class PromotionOrderChangeDeliveryModeActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionOrderChangeDeliveryModeActionDTO*/
	private List<PromotionOrderChangeDeliveryModeActionDTO>  promotionorderchangedeliverymodeactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderChangeDeliveryModeActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderChangeDeliveryModeActionsDTO(final List<PromotionOrderChangeDeliveryModeActionDTO> promotionorderchangedeliverymodeactionsList)
	{
		super();
		this.promotionorderchangedeliverymodeactionsList=promotionorderchangedeliverymodeactionsList;
	}
	
	
	/**
	 * @return the promotionorderchangedeliverymodeactions
	 */
	@XmlElement(name = "promotionorderchangedeliverymodeaction")
	public List<PromotionOrderChangeDeliveryModeActionDTO> getPromotionOrderChangeDeliveryModeActions()
	{
		return	promotionorderchangedeliverymodeactionsList;
	}
	
	/**
	 * @param promotionorderchangedeliverymodeactionsList 
	 *  the promotionorderchangedeliverymodeactionsList to set   
	 */
	public void setPromotionOrderChangeDeliveryModeActions(final List<PromotionOrderChangeDeliveryModeActionDTO> promotionorderchangedeliverymodeactionsList)
	{
		this.promotionorderchangedeliverymodeactionsList=promotionorderchangedeliverymodeactionsList;
	}
	
}
