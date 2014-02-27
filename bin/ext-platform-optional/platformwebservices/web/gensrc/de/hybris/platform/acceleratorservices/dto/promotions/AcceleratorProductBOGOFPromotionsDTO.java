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

import de.hybris.platform.acceleratorservices.dto.promotions.AcceleratorProductBOGOFPromotionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AcceleratorProductBOGOFPromotion first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "acceleratorproductbogofpromotions")
public class AcceleratorProductBOGOFPromotionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AcceleratorProductBOGOFPromotionDTO*/
	private List<AcceleratorProductBOGOFPromotionDTO>  acceleratorproductbogofpromotionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AcceleratorProductBOGOFPromotionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AcceleratorProductBOGOFPromotionsDTO(final List<AcceleratorProductBOGOFPromotionDTO> acceleratorproductbogofpromotionsList)
	{
		super();
		this.acceleratorproductbogofpromotionsList=acceleratorproductbogofpromotionsList;
	}
	
	
	/**
	 * @return the acceleratorproductbogofpromotions
	 */
	@XmlElement(name = "acceleratorproductbogofpromotion")
	public List<AcceleratorProductBOGOFPromotionDTO> getAcceleratorProductBOGOFPromotions()
	{
		return	acceleratorproductbogofpromotionsList;
	}
	
	/**
	 * @param acceleratorproductbogofpromotionsList 
	 *  the acceleratorproductbogofpromotionsList to set   
	 */
	public void setAcceleratorProductBOGOFPromotions(final List<AcceleratorProductBOGOFPromotionDTO> acceleratorproductbogofpromotionsList)
	{
		this.acceleratorproductbogofpromotionsList=acceleratorproductbogofpromotionsList;
	}
	
}
