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
package de.hybris.platform.core.dto.order.price;

import de.hybris.platform.core.dto.order.price.DiscountDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Discount first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "discounts")
public class DiscountsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DiscountDTO*/
	private List<DiscountDTO>  discountsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountsDTO(final List<DiscountDTO> discountsList)
	{
		super();
		this.discountsList=discountsList;
	}
	
	
	/**
	 * @return the discounts
	 */
	@XmlElement(name = "discount")
	public List<DiscountDTO> getDiscounts()
	{
		return	discountsList;
	}
	
	/**
	 * @param discountsList 
	 *  the discountsList to set   
	 */
	public void setDiscounts(final List<DiscountDTO> discountsList)
	{
		this.discountsList=discountsList;
	}
	
}