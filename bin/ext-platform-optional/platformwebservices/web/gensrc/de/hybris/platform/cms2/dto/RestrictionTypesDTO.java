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
package de.hybris.platform.cms2.dto;

import de.hybris.platform.cms2.dto.RestrictionTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RestrictionType first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "restrictiontypes")
public class RestrictionTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RestrictionTypeDTO*/
	private List<RestrictionTypeDTO>  restrictiontypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RestrictionTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RestrictionTypesDTO(final List<RestrictionTypeDTO> restrictiontypesList)
	{
		super();
		this.restrictiontypesList=restrictiontypesList;
	}
	
	
	/**
	 * @return the restrictiontypes
	 */
	@XmlElement(name = "restrictiontype")
	public List<RestrictionTypeDTO> getRestrictionTypes()
	{
		return	restrictiontypesList;
	}
	
	/**
	 * @param restrictiontypesList 
	 *  the restrictiontypesList to set   
	 */
	public void setRestrictionTypes(final List<RestrictionTypeDTO> restrictiontypesList)
	{
		this.restrictiontypesList=restrictiontypesList;
	}
	
}
