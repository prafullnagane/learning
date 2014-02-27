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

import de.hybris.platform.core.dto.type.RelationDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RelationDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "relationdescriptors")
public class RelationDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RelationDescriptorDTO*/
	private List<RelationDescriptorDTO>  relationdescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationDescriptorsDTO(final List<RelationDescriptorDTO> relationdescriptorsList)
	{
		super();
		this.relationdescriptorsList=relationdescriptorsList;
	}
	
	
	/**
	 * @return the relationdescriptors
	 */
	@XmlElement(name = "relationdescriptor")
	public List<RelationDescriptorDTO> getRelationDescriptors()
	{
		return	relationdescriptorsList;
	}
	
	/**
	 * @param relationdescriptorsList 
	 *  the relationdescriptorsList to set   
	 */
	public void setRelationDescriptors(final List<RelationDescriptorDTO> relationdescriptorsList)
	{
		this.relationdescriptorsList=relationdescriptorsList;
	}
	
}
