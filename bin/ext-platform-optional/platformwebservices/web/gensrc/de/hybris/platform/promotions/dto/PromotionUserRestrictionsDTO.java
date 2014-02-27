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

import de.hybris.platform.promotions.dto.PromotionUserRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionUserRestriction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotionuserrestrictions")
public class PromotionUserRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionUserRestrictionDTO*/
	private List<PromotionUserRestrictionDTO>  promotionuserrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionUserRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionUserRestrictionsDTO(final List<PromotionUserRestrictionDTO> promotionuserrestrictionsList)
	{
		super();
		this.promotionuserrestrictionsList=promotionuserrestrictionsList;
	}
	
	
	/**
	 * @return the promotionuserrestrictions
	 */
	@XmlElement(name = "promotionuserrestriction")
	public List<PromotionUserRestrictionDTO> getPromotionUserRestrictions()
	{
		return	promotionuserrestrictionsList;
	}
	
	/**
	 * @param promotionuserrestrictionsList 
	 *  the promotionuserrestrictionsList to set   
	 */
	public void setPromotionUserRestrictions(final List<PromotionUserRestrictionDTO> promotionuserrestrictionsList)
	{
		this.promotionuserrestrictionsList=promotionuserrestrictionsList;
	}
	
}
