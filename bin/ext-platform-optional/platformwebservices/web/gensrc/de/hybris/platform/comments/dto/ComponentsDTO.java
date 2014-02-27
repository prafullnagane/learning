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
package de.hybris.platform.comments.dto;

import de.hybris.platform.comments.dto.ComponentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Component first defined at extension comments
 */
@SuppressWarnings("all")
@XmlRootElement(name = "components")
public class ComponentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ComponentDTO*/
	private List<ComponentDTO>  componentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComponentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComponentsDTO(final List<ComponentDTO> componentsList)
	{
		super();
		this.componentsList=componentsList;
	}
	
	
	/**
	 * @return the components
	 */
	@XmlElement(name = "component")
	public List<ComponentDTO> getComponents()
	{
		return	componentsList;
	}
	
	/**
	 * @param componentsList 
	 *  the componentsList to set   
	 */
	public void setComponents(final List<ComponentDTO> componentsList)
	{
		this.componentsList=componentsList;
	}
	
}
