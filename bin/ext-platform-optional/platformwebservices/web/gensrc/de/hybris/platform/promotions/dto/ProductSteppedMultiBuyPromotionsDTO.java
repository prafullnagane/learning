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

import de.hybris.platform.promotions.dto.ProductSteppedMultiBuyPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductSteppedMultiBuyPromotion first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productsteppedmultibuypromotions")
public class ProductSteppedMultiBuyPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductSteppedMultiBuyPromotionDTO*/
	private List<ProductSteppedMultiBuyPromotionDTO>  productsteppedmultibuypromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductSteppedMultiBuyPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductSteppedMultiBuyPromotionsDTO(final List<ProductSteppedMultiBuyPromotionDTO> productsteppedmultibuypromotionsList)
	{
		super();
		this.productsteppedmultibuypromotionsList=productsteppedmultibuypromotionsList;
	}
	
	
	/**
	 * @return the productsteppedmultibuypromotions
	 */
	@XmlElement(name = "productsteppedmultibuypromotion")
	public List<ProductSteppedMultiBuyPromotionDTO> getProductSteppedMultiBuyPromotions()
	{
		return	productsteppedmultibuypromotionsList;
	}
	
	/**
	 * @param productsteppedmultibuypromotionsList 
	 *  the productsteppedmultibuypromotionsList to set   
	 */
	public void setProductSteppedMultiBuyPromotions(final List<ProductSteppedMultiBuyPromotionDTO> productsteppedmultibuypromotionsList)
	{
		this.productsteppedmultibuypromotionsList=productsteppedmultibuypromotionsList;
	}
	
}
