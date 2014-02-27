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

import de.hybris.platform.promotions.dto.PromotionNullActionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionNullAction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionnullactions")
public class PromotionNullActionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionNullActionDTO*/
	private List<PromotionNullActionDTO>  promotionnullactionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionNullActionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionNullActionsDTO(final List<PromotionNullActionDTO> promotionnullactionsList)
	{
		super();
		this.promotionnullactionsList=promotionnullactionsList;
	}
	
	
	/**
	 * @return the promotionnullactions
	 */
	@XmlElement(name = "promotionnullaction")
	public List<PromotionNullActionDTO> getPromotionNullActions()
	{
		return	promotionnullactionsList;
	}
	
	/**
	 * @param promotionnullactionsList 
	 *  the promotionnullactionsList to set   
	 */
	public void setPromotionNullActions(final List<PromotionNullActionDTO> promotionnullactionsList)
	{
		this.promotionnullactionsList=promotionnullactionsList;
	}
	
}
