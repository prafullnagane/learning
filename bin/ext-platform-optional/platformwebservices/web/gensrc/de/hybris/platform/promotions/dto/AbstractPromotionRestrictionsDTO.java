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

import de.hybris.platform.promotions.dto.AbstractPromotionRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractPromotionRestriction first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractpromotionrestrictions")
public class AbstractPromotionRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractPromotionRestrictionDTO*/
	private List<AbstractPromotionRestrictionDTO>  abstractpromotionrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractPromotionRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractPromotionRestrictionsDTO(final List<AbstractPromotionRestrictionDTO> abstractpromotionrestrictionsList)
	{
		super();
		this.abstractpromotionrestrictionsList=abstractpromotionrestrictionsList;
	}
	
	
	/**
	 * @return the abstractpromotionrestrictions
	 */
	@XmlElement(name = "abstractpromotionrestriction")
	public List<AbstractPromotionRestrictionDTO> getAbstractPromotionRestrictions()
	{
		return	abstractpromotionrestrictionsList;
	}
	
	/**
	 * @param abstractpromotionrestrictionsList 
	 *  the abstractpromotionrestrictionsList to set   
	 */
	public void setAbstractPromotionRestrictions(final List<AbstractPromotionRestrictionDTO> abstractpromotionrestrictionsList)
	{
		this.abstractpromotionrestrictionsList=abstractpromotionrestrictionsList;
	}
	
}
