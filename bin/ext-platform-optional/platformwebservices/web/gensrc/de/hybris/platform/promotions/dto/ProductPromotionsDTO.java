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

import de.hybris.platform.promotions.dto.ProductPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productpromotions")
public class ProductPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductPromotionDTO*/
	private List<ProductPromotionDTO>  productpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPromotionsDTO(final List<ProductPromotionDTO> productpromotionsList)
	{
		super();
		this.productpromotionsList=productpromotionsList;
	}
	
	
	/**
	 * @return the productpromotions
	 */
	@XmlElement(name = "productpromotion")
	public List<ProductPromotionDTO> getProductPromotions()
	{
		return	productpromotionsList;
	}
	
	/**
	 * @param productpromotionsList 
	 *  the productpromotionsList to set   
	 */
	public void setProductPromotions(final List<ProductPromotionDTO> productpromotionsList)
	{
		this.productpromotionsList=productpromotionsList;
	}
	
}
