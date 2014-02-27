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

import de.hybris.platform.cms2.dto.restrictions.CMSCategoryRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSCategoryRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmscategoryrestrictions")
public class CMSCategoryRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSCategoryRestrictionDTO*/
	private List<CMSCategoryRestrictionDTO>  cmscategoryrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSCategoryRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSCategoryRestrictionsDTO(final List<CMSCategoryRestrictionDTO> cmscategoryrestrictionsList)
	{
		super();
		this.cmscategoryrestrictionsList=cmscategoryrestrictionsList;
	}
	
	
	/**
	 * @return the cmscategoryrestrictions
	 */
	@XmlElement(name = "cmscategoryrestriction")
	public List<CMSCategoryRestrictionDTO> getCMSCategoryRestrictions()
	{
		return	cmscategoryrestrictionsList;
	}
	
	/**
	 * @param cmscategoryrestrictionsList 
	 *  the cmscategoryrestrictionsList to set   
	 */
	public void setCMSCategoryRestrictions(final List<CMSCategoryRestrictionDTO> cmscategoryrestrictionsList)
	{
		this.cmscategoryrestrictionsList=cmscategoryrestrictionsList;
	}
	
}
