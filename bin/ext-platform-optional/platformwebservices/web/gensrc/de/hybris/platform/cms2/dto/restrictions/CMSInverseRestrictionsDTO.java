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

import de.hybris.platform.cms2.dto.restrictions.CMSInverseRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSInverseRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsinverserestrictions")
public class CMSInverseRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSInverseRestrictionDTO*/
	private List<CMSInverseRestrictionDTO>  cmsinverserestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSInverseRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSInverseRestrictionsDTO(final List<CMSInverseRestrictionDTO> cmsinverserestrictionsList)
	{
		super();
		this.cmsinverserestrictionsList=cmsinverserestrictionsList;
	}
	
	
	/**
	 * @return the cmsinverserestrictions
	 */
	@XmlElement(name = "cmsinverserestriction")
	public List<CMSInverseRestrictionDTO> getCMSInverseRestrictions()
	{
		return	cmsinverserestrictionsList;
	}
	
	/**
	 * @param cmsinverserestrictionsList 
	 *  the cmsinverserestrictionsList to set   
	 */
	public void setCMSInverseRestrictions(final List<CMSInverseRestrictionDTO> cmsinverserestrictionsList)
	{
		this.cmsinverserestrictionsList=cmsinverserestrictionsList;
	}
	
}
