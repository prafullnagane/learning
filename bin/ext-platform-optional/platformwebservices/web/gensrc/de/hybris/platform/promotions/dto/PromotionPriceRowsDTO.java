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

import de.hybris.platform.promotions.dto.PromotionPriceRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionPriceRow first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionpricerows")
public class PromotionPriceRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionPriceRowDTO*/
	private List<PromotionPriceRowDTO>  promotionpricerowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionPriceRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionPriceRowsDTO(final List<PromotionPriceRowDTO> promotionpricerowsList)
	{
		super();
		this.promotionpricerowsList=promotionpricerowsList;
	}
	
	
	/**
	 * @return the promotionpricerows
	 */
	@XmlElement(name = "promotionpricerow")
	public List<PromotionPriceRowDTO> getPromotionPriceRows()
	{
		return	promotionpricerowsList;
	}
	
	/**
	 * @param promotionpricerowsList 
	 *  the promotionpricerowsList to set   
	 */
	public void setPromotionPriceRows(final List<PromotionPriceRowDTO> promotionpricerowsList)
	{
		this.promotionpricerowsList=promotionpricerowsList;
	}
	
}
