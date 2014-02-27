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
package de.hybris.platform.cms2.dto.site;

import de.hybris.platform.cms2.dto.site.CMSSiteDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSSite first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmssites")
public class CMSSitesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSSiteDTO*/
	private List<CMSSiteDTO>  cmssitesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSSitesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSSitesDTO(final List<CMSSiteDTO> cmssitesList)
	{
		super();
		this.cmssitesList=cmssitesList;
	}
	
	
	/**
	 * @return the cmssites
	 */
	@XmlElement(name = "cmssite")
	public List<CMSSiteDTO> getCMSSites()
	{
		return	cmssitesList;
	}
	
	/**
	 * @param cmssitesList 
	 *  the cmssitesList to set   
	 */
	public void setCMSSites(final List<CMSSiteDTO> cmssitesList)
	{
		this.cmssitesList=cmssitesList;
	}
	
}
