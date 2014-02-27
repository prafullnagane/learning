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

import de.hybris.platform.promotions.dto.PromotionProductRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionProductRestriction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionproductrestrictions")
public class PromotionProductRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionProductRestrictionDTO*/
	private List<PromotionProductRestrictionDTO>  promotionproductrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionProductRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionProductRestrictionsDTO(final List<PromotionProductRestrictionDTO> promotionproductrestrictionsList)
	{
		super();
		this.promotionproductrestrictionsList=promotionproductrestrictionsList;
	}
	
	
	/**
	 * @return the promotionproductrestrictions
	 */
	@XmlElement(name = "promotionproductrestriction")
	public List<PromotionProductRestrictionDTO> getPromotionProductRestrictions()
	{
		return	promotionproductrestrictionsList;
	}
	
	/**
	 * @param promotionproductrestrictionsList 
	 *  the promotionproductrestrictionsList to set   
	 */
	public void setPromotionProductRestrictions(final List<PromotionProductRestrictionDTO> promotionproductrestrictionsList)
	{
		this.promotionproductrestrictionsList=promotionproductrestrictionsList;
	}
	
}
