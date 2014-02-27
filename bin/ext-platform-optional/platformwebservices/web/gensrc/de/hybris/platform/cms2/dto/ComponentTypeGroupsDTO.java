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
package de.hybris.platform.cms2.dto;

import de.hybris.platform.cms2.dto.ComponentTypeGroupDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ComponentTypeGroup first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "componenttypegroups")
public class ComponentTypeGroupsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ComponentTypeGroupDTO*/
	private List<ComponentTypeGroupDTO>  componenttypegroupsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComponentTypeGroupsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComponentTypeGroupsDTO(final List<ComponentTypeGroupDTO> componenttypegroupsList)
	{
		super();
		this.componenttypegroupsList=componenttypegroupsList;
	}
	
	
	/**
	 * @return the componenttypegroups
	 */
	@XmlElement(name = "componenttypegroup")
	public List<ComponentTypeGroupDTO> getComponentTypeGroups()
	{
		return	componenttypegroupsList;
	}
	
	/**
	 * @param componenttypegroupsList 
	 *  the componenttypegroupsList to set   
	 */
	public void setComponentTypeGroups(final List<ComponentTypeGroupDTO> componenttypegroupsList)
	{
		this.componenttypegroupsList=componenttypegroupsList;
	}
	
}
