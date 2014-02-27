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

import de.hybris.platform.promotions.dto.ProductMultiBuyPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductMultiBuyPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productmultibuypromotions")
public class ProductMultiBuyPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductMultiBuyPromotionDTO*/
	private List<ProductMultiBuyPromotionDTO>  productmultibuypromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductMultiBuyPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductMultiBuyPromotionsDTO(final List<ProductMultiBuyPromotionDTO> productmultibuypromotionsList)
	{
		super();
		this.productmultibuypromotionsList=productmultibuypromotionsList;
	}
	
	
	/**
	 * @return the productmultibuypromotions
	 */
	@XmlElement(name = "productmultibuypromotion")
	public List<ProductMultiBuyPromotionDTO> getProductMultiBuyPromotions()
	{
		return	productmultibuypromotionsList;
	}
	
	/**
	 * @param productmultibuypromotionsList 
	 *  the productmultibuypromotionsList to set   
	 */
	public void setProductMultiBuyPromotions(final List<ProductMultiBuyPromotionDTO> productmultibuypromotionsList)
	{
		this.productmultibuypromotionsList=productmultibuypromotionsList;
	}
	
}
