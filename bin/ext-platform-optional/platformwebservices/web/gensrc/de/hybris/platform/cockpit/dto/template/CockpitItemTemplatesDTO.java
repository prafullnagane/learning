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
package de.hybris.platform.cockpit.dto.template;

import de.hybris.platform.cockpit.dto.template.CockpitItemTemplateDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitItemTemplate first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpititemtemplates")
public class CockpitItemTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitItemTemplateDTO*/
	private List<CockpitItemTemplateDTO>  cockpititemtemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitItemTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitItemTemplatesDTO(final List<CockpitItemTemplateDTO> cockpititemtemplatesList)
	{
		super();
		this.cockpititemtemplatesList=cockpititemtemplatesList;
	}
	
	
	/**
	 * @return the cockpititemtemplates
	 */
	@XmlElement(name = "cockpititemtemplate")
	public List<CockpitItemTemplateDTO> getCockpitItemTemplates()
	{
		return	cockpititemtemplatesList;
	}
	
	/**
	 * @param cockpititemtemplatesList 
	 *  the cockpititemtemplatesList to set   
	 */
	public void setCockpitItemTemplates(final List<CockpitItemTemplateDTO> cockpititemtemplatesList)
	{
		this.cockpititemtemplatesList=cockpititemtemplatesList;
	}
	
}
