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
package de.hybris.platform.commons.dto.renderer;

import de.hybris.platform.commons.dto.renderer.RendererTemplateDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RendererTemplate first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "renderertemplates")
public class RendererTemplatesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RendererTemplateDTO*/
	private List<RendererTemplateDTO>  renderertemplatesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RendererTemplatesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RendererTemplatesDTO(final List<RendererTemplateDTO> renderertemplatesList)
	{
		super();
		this.renderertemplatesList=renderertemplatesList;
	}
	
	
	/**
	 * @return the renderertemplates
	 */
	@XmlElement(name = "renderertemplate")
	public List<RendererTemplateDTO> getRendererTemplates()
	{
		return	renderertemplatesList;
	}
	
	/**
	 * @param renderertemplatesList 
	 *  the renderertemplatesList to set   
	 */
	public void setRendererTemplates(final List<RendererTemplateDTO> renderertemplatesList)
	{
		this.renderertemplatesList=renderertemplatesList;
	}
	
}
