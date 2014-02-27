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

import de.hybris.platform.promotions.dto.ProductPercentageDiscountPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductPercentageDiscountPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productpercentagediscountpromotions")
public class ProductPercentageDiscountPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductPercentageDiscountPromotionDTO*/
	private List<ProductPercentageDiscountPromotionDTO>  productpercentagediscountpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPercentageDiscountPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPercentageDiscountPromotionsDTO(final List<ProductPercentageDiscountPromotionDTO> productpercentagediscountpromotionsList)
	{
		super();
		this.productpercentagediscountpromotionsList=productpercentagediscountpromotionsList;
	}
	
	
	/**
	 * @return the productpercentagediscountpromotions
	 */
	@XmlElement(name = "productpercentagediscountpromotion")
	public List<ProductPercentageDiscountPromotionDTO> getProductPercentageDiscountPromotions()
	{
		return	productpercentagediscountpromotionsList;
	}
	
	/**
	 * @param productpercentagediscountpromotionsList 
	 *  the productpercentagediscountpromotionsList to set   
	 */
	public void setProductPercentageDiscountPromotions(final List<ProductPercentageDiscountPromotionDTO> productpercentagediscountpromotionsList)
	{
		this.productpercentagediscountpromotionsList=productpercentagediscountpromotionsList;
	}
	
}
