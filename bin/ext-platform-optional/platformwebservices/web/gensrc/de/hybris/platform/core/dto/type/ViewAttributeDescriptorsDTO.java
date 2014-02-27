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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.ViewAttributeDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ViewAttributeDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "viewattributedescriptors")
public class ViewAttributeDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ViewAttributeDescriptorDTO*/
	private List<ViewAttributeDescriptorDTO>  viewattributedescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ViewAttributeDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ViewAttributeDescriptorsDTO(final List<ViewAttributeDescriptorDTO> viewattributedescriptorsList)
	{
		super();
		this.viewattributedescriptorsList=viewattributedescriptorsList;
	}
	
	
	/**
	 * @return the viewattributedescriptors
	 */
	@XmlElement(name = "viewattributedescriptor")
	public List<ViewAttributeDescriptorDTO> getViewAttributeDescriptors()
	{
		return	viewattributedescriptorsList;
	}
	
	/**
	 * @param viewattributedescriptorsList 
	 *  the viewattributedescriptorsList to set   
	 */
	public void setViewAttributeDescriptors(final List<ViewAttributeDescriptorDTO> viewattributedescriptorsList)
	{
		this.viewattributedescriptorsList=viewattributedescriptorsList;
	}
	
}
