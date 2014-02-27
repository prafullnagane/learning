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

import de.hybris.platform.promotions.dto.ProductPerfectPartnerBundlePromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductPerfectPartnerBundlePromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productperfectpartnerbundlepromotions")
public class ProductPerfectPartnerBundlePromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductPerfectPartnerBundlePromotionDTO*/
	private List<ProductPerfectPartnerBundlePromotionDTO>  productperfectpartnerbundlepromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPerfectPartnerBundlePromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductPerfectPartnerBundlePromotionsDTO(final List<ProductPerfectPartnerBundlePromotionDTO> productperfectpartnerbundlepromotionsList)
	{
		super();
		this.productperfectpartnerbundlepromotionsList=productperfectpartnerbundlepromotionsList;
	}
	
	
	/**
	 * @return the productperfectpartnerbundlepromotions
	 */
	@XmlElement(name = "productperfectpartnerbundlepromotion")
	public List<ProductPerfectPartnerBundlePromotionDTO> getProductPerfectPartnerBundlePromotions()
	{
		return	productperfectpartnerbundlepromotionsList;
	}
	
	/**
	 * @param productperfectpartnerbundlepromotionsList 
	 *  the productperfectpartnerbundlepromotionsList to set   
	 */
	public void setProductPerfectPartnerBundlePromotions(final List<ProductPerfectPartnerBundlePromotionDTO> productperfectpartnerbundlepromotionsList)
	{
		this.productperfectpartnerbundlepromotionsList=productperfectpartnerbundlepromotionsList;
	}
	
}
