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

import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSNavigationNode first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsnavigationnodes")
public class CMSNavigationNodesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSNavigationNodeDTO*/
	private List<CMSNavigationNodeDTO>  cmsnavigationnodesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSNavigationNodesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSNavigationNodesDTO(final List<CMSNavigationNodeDTO> cmsnavigationnodesList)
	{
		super();
		this.cmsnavigationnodesList=cmsnavigationnodesList;
	}
	
	
	/**
	 * @return the cmsnavigationnodes
	 */
	@XmlElement(name = "cmsnavigationnode")
	public List<CMSNavigationNodeDTO> getCMSNavigationNodes()
	{
		return	cmsnavigationnodesList;
	}
	
	/**
	 * @param cmsnavigationnodesList 
	 *  the cmsnavigationnodesList to set   
	 */
	public void setCMSNavigationNodes(final List<CMSNavigationNodeDTO> cmsnavigationnodesList)
	{
		this.cmsnavigationnodesList=cmsnavigationnodesList;
	}
	
}
