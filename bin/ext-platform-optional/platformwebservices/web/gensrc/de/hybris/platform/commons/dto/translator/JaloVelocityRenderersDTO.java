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

import de.hybris.platform.commons.dto.translator.JaloVelocityRendererDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type JaloVelocityRenderer first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "jalovelocityrenderers")
public class JaloVelocityRenderersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>JaloVelocityRendererDTO*/
	private List<JaloVelocityRendererDTO>  jalovelocityrenderersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JaloVelocityRenderersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JaloVelocityRenderersDTO(final List<JaloVelocityRendererDTO> jalovelocityrenderersList)
	{
		super();
		this.jalovelocityrenderersList=jalovelocityrenderersList;
	}
	
	
	/**
	 * @return the jalovelocityrenderers
	 */
	@XmlElement(name = "jalovelocityrenderer")
	public List<JaloVelocityRendererDTO> getJaloVelocityRenderers()
	{
		return	jalovelocityrenderersList;
	}
	
	/**
	 * @param jalovelocityrenderersList 
	 *  the jalovelocityrenderersList to set   
	 */
	public void setJaloVelocityRenderers(final List<JaloVelocityRendererDTO> jalovelocityrenderersList)
	{
		this.jalovelocityrenderersList=jalovelocityrenderersList;
	}
	
}
