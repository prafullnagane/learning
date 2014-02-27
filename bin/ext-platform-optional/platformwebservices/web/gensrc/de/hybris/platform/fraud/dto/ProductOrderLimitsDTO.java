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
package de.hybris.platform.fraud.dto;

import de.hybris.platform.fraud.dto.ProductOrderLimitDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductOrderLimit first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productorderlimits")
public class ProductOrderLimitsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductOrderLimitDTO*/
	private List<ProductOrderLimitDTO>  productorderlimitsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductOrderLimitsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductOrderLimitsDTO(final List<ProductOrderLimitDTO> productorderlimitsList)
	{
		super();
		this.productorderlimitsList=productorderlimitsList;
	}
	
	
	/**
	 * @return the productorderlimits
	 */
	@XmlElement(name = "productorderlimit")
	public List<ProductOrderLimitDTO> getProductOrderLimits()
	{
		return	productorderlimitsList;
	}
	
	/**
	 * @param productorderlimitsList 
	 *  the productorderlimitsList to set   
	 */
	public void setProductOrderLimits(final List<ProductOrderLimitDTO> productorderlimitsList)
	{
		this.productorderlimitsList=productorderlimitsList;
	}
	
}
