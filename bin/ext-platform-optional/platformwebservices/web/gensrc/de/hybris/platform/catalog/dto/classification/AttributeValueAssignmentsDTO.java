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
package de.hybris.platform.catalog.dto.classification;

import de.hybris.platform.catalog.dto.classification.AttributeValueAssignmentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AttributeValueAssignment first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "attributevalueassignments")
public class AttributeValueAssignmentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AttributeValueAssignmentDTO*/
	private List<AttributeValueAssignmentDTO>  attributevalueassignmentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeValueAssignmentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeValueAssignmentsDTO(final List<AttributeValueAssignmentDTO> attributevalueassignmentsList)
	{
		super();
		this.attributevalueassignmentsList=attributevalueassignmentsList;
	}
	
	
	/**
	 * @return the attributevalueassignments
	 */
	@XmlElement(name = "attributevalueassignment")
	public List<AttributeValueAssignmentDTO> getAttributeValueAssignments()
	{
		return	attributevalueassignmentsList;
	}
	
	/**
	 * @param attributevalueassignmentsList 
	 *  the attributevalueassignmentsList to set   
	 */
	public void setAttributeValueAssignments(final List<AttributeValueAssignmentDTO> attributevalueassignmentsList)
	{
		this.attributevalueassignmentsList=attributevalueassignmentsList;
	}
	
}
