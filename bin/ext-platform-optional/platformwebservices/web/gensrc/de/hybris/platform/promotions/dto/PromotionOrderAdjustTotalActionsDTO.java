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

import de.hybris.platform.promotions.dto.PromotionOrderAdjustTotalActionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionOrderAdjustTotalAction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionorderadjusttotalactions")
public class PromotionOrderAdjustTotalActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionOrderAdjustTotalActionDTO*/
	private List<PromotionOrderAdjustTotalActionDTO>  promotionorderadjusttotalactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderAdjustTotalActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderAdjustTotalActionsDTO(final List<PromotionOrderAdjustTotalActionDTO> promotionorderadjusttotalactionsList)
	{
		super();
		this.promotionorderadjusttotalactionsList=promotionorderadjusttotalactionsList;
	}
	
	
	/**
	 * @return the promotionorderadjusttotalactions
	 */
	@XmlElement(name = "promotionorderadjusttotalaction")
	public List<PromotionOrderAdjustTotalActionDTO> getPromotionOrderAdjustTotalActions()
	{
		return	promotionorderadjusttotalactionsList;
	}
	
	/**
	 * @param promotionorderadjusttotalactionsList 
	 *  the promotionorderadjusttotalactionsList to set   
	 */
	public void setPromotionOrderAdjustTotalActions(final List<PromotionOrderAdjustTotalActionDTO> promotionorderadjusttotalactionsList)
	{
		this.promotionorderadjusttotalactionsList=promotionorderadjusttotalactionsList;
	}
	
}
