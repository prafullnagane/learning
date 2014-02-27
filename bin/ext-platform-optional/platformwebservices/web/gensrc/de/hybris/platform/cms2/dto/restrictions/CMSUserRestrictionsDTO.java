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

import de.hybris.platform.cms2.dto.restrictions.CMSUserRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSUserRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsuserrestrictions")
public class CMSUserRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSUserRestrictionDTO*/
	private List<CMSUserRestrictionDTO>  cmsuserrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserRestrictionsDTO(final List<CMSUserRestrictionDTO> cmsuserrestrictionsList)
	{
		super();
		this.cmsuserrestrictionsList=cmsuserrestrictionsList;
	}
	
	
	/**
	 * @return the cmsuserrestrictions
	 */
	@XmlElement(name = "cmsuserrestriction")
	public List<CMSUserRestrictionDTO> getCMSUserRestrictions()
	{
		return	cmsuserrestrictionsList;
	}
	
	/**
	 * @param cmsuserrestrictionsList 
	 *  the cmsuserrestrictionsList to set   
	 */
	public void setCMSUserRestrictions(final List<CMSUserRestrictionDTO> cmsuserrestrictionsList)
	{
		this.cmsuserrestrictionsList=cmsuserrestrictionsList;
	}
	
}
