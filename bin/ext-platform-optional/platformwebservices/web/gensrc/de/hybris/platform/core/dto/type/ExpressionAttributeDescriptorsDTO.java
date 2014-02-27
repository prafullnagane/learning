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

import de.hybris.platform.core.dto.type.ExpressionAttributeDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ExpressionAttributeDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "expressionattributedescriptors")
public class ExpressionAttributeDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ExpressionAttributeDescriptorDTO*/
	private List<ExpressionAttributeDescriptorDTO>  expressionattributedescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExpressionAttributeDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExpressionAttributeDescriptorsDTO(final List<ExpressionAttributeDescriptorDTO> expressionattributedescriptorsList)
	{
		super();
		this.expressionattributedescriptorsList=expressionattributedescriptorsList;
	}
	
	
	/**
	 * @return the expressionattributedescriptors
	 */
	@XmlElement(name = "expressionattributedescriptor")
	public List<ExpressionAttributeDescriptorDTO> getExpressionAttributeDescriptors()
	{
		return	expressionattributedescriptorsList;
	}
	
	/**
	 * @param expressionattributedescriptorsList 
	 *  the expressionattributedescriptorsList to set   
	 */
	public void setExpressionAttributeDescriptors(final List<ExpressionAttributeDescriptorDTO> expressionattributedescriptorsList)
	{
		this.expressionattributedescriptorsList=expressionattributedescriptorsList;
	}
	
}
