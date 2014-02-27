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

import de.hybris.platform.promotions.dto.ProductPerfectPartnerPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductPerfectPartnerPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productperfectpartnerpromotions")
public class ProductPerfectPartnerPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductPerfectPartnerPromotionDTO*/
	private List<ProductPerfectPartnerPromotionDTO>  productperfectpartnerpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPerfectPartnerPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPerfectPartnerPromotionsDTO(final List<ProductPerfectPartnerPromotionDTO> productperfectpartnerpromotionsList)
	{
		super();
		this.productperfectpartnerpromotionsList=productperfectpartnerpromotionsList;
	}
	
	
	/**
	 * @return the productperfectpartnerpromotions
	 */
	@XmlElement(name = "productperfectpartnerpromotion")
	public List<ProductPerfectPartnerPromotionDTO> getProductPerfectPartnerPromotions()
	{
		return	productperfectpartnerpromotionsList;
	}
	
	/**
	 * @param productperfectpartnerpromotionsList 
	 *  the productperfectpartnerpromotionsList to set   
	 */
	public void setProductPerfectPartnerPromotions(final List<ProductPerfectPartnerPromotionDTO> productperfectpartnerpromotionsList)
	{
		this.productperfectpartnerpromotionsList=productperfectpartnerpromotionsList;
	}
	
}
