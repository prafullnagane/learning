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
package de.hybris.platform.commons.dto.translator;

import de.hybris.platform.commons.dto.translator.RenderersPropertyDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RenderersProperty first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "renderersproperties")
public class RenderersPropertiesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RenderersPropertyDTO*/
	private List<RenderersPropertyDTO>  rendererspropertiesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RenderersPropertiesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RenderersPropertiesDTO(final List<RenderersPropertyDTO> rendererspropertiesList)
	{
		super();
		this.rendererspropertiesList=rendererspropertiesList;
	}
	
	
	/**
	 * @return the renderersproperties
	 */
	@XmlElement(name = "renderersproperty")
	public List<RenderersPropertyDTO> getRenderersProperties()
	{
		return	rendererspropertiesList;
	}
	
	/**
	 * @param rendererspropertiesList 
	 *  the rendererspropertiesList to set   
	 */
	public void setRenderersProperties(final List<RenderersPropertyDTO> rendererspropertiesList)
	{
		this.rendererspropertiesList=rendererspropertiesList;
	}
	
}
