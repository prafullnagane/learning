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

import de.hybris.platform.cms2.dto.restrictions.CMSUserGroupRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSUserGroupRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsusergrouprestrictions")
public class CMSUserGroupRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSUserGroupRestrictionDTO*/
	private List<CMSUserGroupRestrictionDTO>  cmsusergrouprestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserGroupRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserGroupRestrictionsDTO(final List<CMSUserGroupRestrictionDTO> cmsusergrouprestrictionsList)
	{
		super();
		this.cmsusergrouprestrictionsList=cmsusergrouprestrictionsList;
	}
	
	
	/**
	 * @return the cmsusergrouprestrictions
	 */
	@XmlElement(name = "cmsusergrouprestriction")
	public List<CMSUserGroupRestrictionDTO> getCMSUserGroupRestrictions()
	{
		return	cmsusergrouprestrictionsList;
	}
	
	/**
	 * @param cmsusergrouprestrictionsList 
	 *  the cmsusergrouprestrictionsList to set   
	 */
	public void setCMSUserGroupRestrictions(final List<CMSUserGroupRestrictionDTO> cmsusergrouprestrictionsList)
	{
		this.cmsusergrouprestrictionsList=cmsusergrouprestrictionsList;
	}
	
}
