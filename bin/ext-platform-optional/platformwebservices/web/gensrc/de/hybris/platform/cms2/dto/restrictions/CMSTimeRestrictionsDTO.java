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
package de.hybris.platform.cms2.dto.restrictions;

import de.hybris.platform.cms2.dto.restrictions.CMSTimeRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSTimeRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmstimerestrictions")
public class CMSTimeRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSTimeRestrictionDTO*/
	private List<CMSTimeRestrictionDTO>  cmstimerestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTimeRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTimeRestrictionsDTO(final List<CMSTimeRestrictionDTO> cmstimerestrictionsList)
	{
		super();
		this.cmstimerestrictionsList=cmstimerestrictionsList;
	}
	
	
	/**
	 * @return the cmstimerestrictions
	 */
	@XmlElement(name = "cmstimerestriction")
	public List<CMSTimeRestrictionDTO> getCMSTimeRestrictions()
	{
		return	cmstimerestrictionsList;
	}
	
	/**
	 * @param cmstimerestrictionsList 
	 *  the cmstimerestrictionsList to set   
	 */
	public void setCMSTimeRestrictions(final List<CMSTimeRestrictionDTO> cmstimerestrictionsList)
	{
		this.cmstimerestrictionsList=cmstimerestrictionsList;
	}
	
}
