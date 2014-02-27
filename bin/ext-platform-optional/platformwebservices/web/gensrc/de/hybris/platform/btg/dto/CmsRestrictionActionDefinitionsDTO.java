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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.CmsRestrictionActionDefinitionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CmsRestrictionActionDefinition first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmsrestrictionactiondefinitions")
public class CmsRestrictionActionDefinitionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CmsRestrictionActionDefinitionDTO*/
	private List<CmsRestrictionActionDefinitionDTO>  cmsrestrictionactiondefinitionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CmsRestrictionActionDefinitionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CmsRestrictionActionDefinitionsDTO(final List<CmsRestrictionActionDefinitionDTO> cmsrestrictionactiondefinitionsList)
	{
		super();
		this.cmsrestrictionactiondefinitionsList=cmsrestrictionactiondefinitionsList;
	}
	
	
	/**
	 * @return the cmsrestrictionactiondefinitions
	 */
	@XmlElement(name = "cmsrestrictionactiondefinition")
	public List<CmsRestrictionActionDefinitionDTO> getCmsRestrictionActionDefinitions()
	{
		return	cmsrestrictionactiondefinitionsList;
	}
	
	/**
	 * @param cmsrestrictionactiondefinitionsList 
	 *  the cmsrestrictionactiondefinitionsList to set   
	 */
	public void setCmsRestrictionActionDefinitions(final List<CmsRestrictionActionDefinitionDTO> cmsrestrictionactiondefinitionsList)
	{
		this.cmsrestrictionactiondefinitionsList=cmsrestrictionactiondefinitionsList;
	}
	
}
