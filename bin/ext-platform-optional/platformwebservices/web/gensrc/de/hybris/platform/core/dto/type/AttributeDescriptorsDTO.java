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

import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AttributeDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "attributedescriptors")
public class AttributeDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AttributeDescriptorDTO*/
	private List<AttributeDescriptorDTO>  attributedescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeDescriptorsDTO(final List<AttributeDescriptorDTO> attributedescriptorsList)
	{
		super();
		this.attributedescriptorsList=attributedescriptorsList;
	}
	
	
	/**
	 * @return the attributedescriptors
	 */
	@XmlElement(name = "attributedescriptor")
	public List<AttributeDescriptorDTO> getAttributeDescriptors()
	{
		return	attributedescriptorsList;
	}
	
	/**
	 * @param attributedescriptorsList 
	 *  the attributedescriptorsList to set   
	 */
	public void setAttributeDescriptors(final List<AttributeDescriptorDTO> attributedescriptorsList)
	{
		this.attributedescriptorsList=attributedescriptorsList;
	}
	
}
