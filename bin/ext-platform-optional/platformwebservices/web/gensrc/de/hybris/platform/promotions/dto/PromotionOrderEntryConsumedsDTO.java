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

import de.hybris.platform.promotions.dto.PromotionOrderEntryConsumedDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionOrderEntryConsumed first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionorderentryconsumeds")
public class PromotionOrderEntryConsumedsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionOrderEntryConsumedDTO*/
	private List<PromotionOrderEntryConsumedDTO>  promotionorderentryconsumedsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderEntryConsumedsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionOrderEntryConsumedsDTO(final List<PromotionOrderEntryConsumedDTO> promotionorderentryconsumedsList)
	{
		super();
		this.promotionorderentryconsumedsList=promotionorderentryconsumedsList;
	}
	
	
	/**
	 * @return the promotionorderentryconsumeds
	 */
	@XmlElement(name = "promotionorderentryconsumed")
	public List<PromotionOrderEntryConsumedDTO> getPromotionOrderEntryConsumeds()
	{
		return	promotionorderentryconsumedsList;
	}
	
	/**
	 * @param promotionorderentryconsumedsList 
	 *  the promotionorderentryconsumedsList to set   
	 */
	public void setPromotionOrderEntryConsumeds(final List<PromotionOrderEntryConsumedDTO> promotionorderentryconsumedsList)
	{
		this.promotionorderentryconsumedsList=promotionorderentryconsumedsList;
	}
	
}
