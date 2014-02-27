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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.voucher.dto.RestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Restriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "restrictions")
public class RestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RestrictionDTO*/
	private List<RestrictionDTO>  restrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RestrictionsDTO(final List<RestrictionDTO> restrictionsList)
	{
		super();
		this.restrictionsList=restrictionsList;
	}
	
	
	/**
	 * @return the restrictions
	 */
	@XmlElement(name = "restriction")
	public List<RestrictionDTO> getRestrictions()
	{
		return	restrictionsList;
	}
	
	/**
	 * @param restrictionsList 
	 *  the restrictionsList to set   
	 */
	public void setRestrictions(final List<RestrictionDTO> restrictionsList)
	{
		this.restrictionsList=restrictionsList;
	}
	
}
