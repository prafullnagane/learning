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

import de.hybris.platform.promotions.dto.ProductFixedPricePromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductFixedPricePromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productfixedpricepromotions")
public class ProductFixedPricePromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductFixedPricePromotionDTO*/
	private List<ProductFixedPricePromotionDTO>  productfixedpricepromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductFixedPricePromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductFixedPricePromotionsDTO(final List<ProductFixedPricePromotionDTO> productfixedpricepromotionsList)
	{
		super();
		this.productfixedpricepromotionsList=productfixedpricepromotionsList;
	}
	
	
	/**
	 * @return the productfixedpricepromotions
	 */
	@XmlElement(name = "productfixedpricepromotion")
	public List<ProductFixedPricePromotionDTO> getProductFixedPricePromotions()
	{
		return	productfixedpricepromotionsList;
	}
	
	/**
	 * @param productfixedpricepromotionsList 
	 *  the productfixedpricepromotionsList to set   
	 */
	public void setProductFixedPricePromotions(final List<ProductFixedPricePromotionDTO> productfixedpricepromotionsList)
	{
		this.productfixedpricepromotionsList=productfixedpricepromotionsList;
	}
	
}
