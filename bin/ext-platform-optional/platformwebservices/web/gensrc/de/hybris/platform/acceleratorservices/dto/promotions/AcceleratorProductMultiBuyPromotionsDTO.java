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
package de.hybris.platform.acceleratorservices.dto.promotions;

import de.hybris.platform.acceleratorservices.dto.promotions.AcceleratorProductMultiBuyPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AcceleratorProductMultiBuyPromotion first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "acceleratorproductmultibuypromotions")
public class AcceleratorProductMultiBuyPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AcceleratorProductMultiBuyPromotionDTO*/
	private List<AcceleratorProductMultiBuyPromotionDTO>  acceleratorproductmultibuypromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AcceleratorProductMultiBuyPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AcceleratorProductMultiBuyPromotionsDTO(final List<AcceleratorProductMultiBuyPromotionDTO> acceleratorproductmultibuypromotionsList)
	{
		super();
		this.acceleratorproductmultibuypromotionsList=acceleratorproductmultibuypromotionsList;
	}
	
	
	/**
	 * @return the acceleratorproductmultibuypromotions
	 */
	@XmlElement(name = "acceleratorproductmultibuypromotion")
	public List<AcceleratorProductMultiBuyPromotionDTO> getAcceleratorProductMultiBuyPromotions()
	{
		return	acceleratorproductmultibuypromotionsList;
	}
	
	/**
	 * @param acceleratorproductmultibuypromotionsList 
	 *  the acceleratorproductmultibuypromotionsList to set   
	 */
	public void setAcceleratorProductMultiBuyPromotions(final List<AcceleratorProductMultiBuyPromotionDTO> acceleratorproductmultibuypromotionsList)
	{
		this.acceleratorproductmultibuypromotionsList=acceleratorproductmultibuypromotionsList;
	}
	
}
