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
package de.hybris.platform.cms2.dto.navigation;

import de.hybris.platform.cms2.dto.navigation.CMSNavigationEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSNavigationEntry first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsnavigationentries")
public class CMSNavigationEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSNavigationEntryDTO*/
	private List<CMSNavigationEntryDTO>  cmsnavigationentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSNavigationEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSNavigationEntriesDTO(final List<CMSNavigationEntryDTO> cmsnavigationentriesList)
	{
		super();
		this.cmsnavigationentriesList=cmsnavigationentriesList;
	}
	
	
	/**
	 * @return the cmsnavigationentries
	 */
	@XmlElement(name = "cmsnavigationentry")
	public List<CMSNavigationEntryDTO> getCMSNavigationEntries()
	{
		return	cmsnavigationentriesList;
	}
	
	/**
	 * @param cmsnavigationentriesList 
	 *  the cmsnavigationentriesList to set   
	 */
	public void setCMSNavigationEntries(final List<CMSNavigationEntryDTO> cmsnavigationentriesList)
	{
		this.cmsnavigationentriesList=cmsnavigationentriesList;
	}
	
}
