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

import de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ClassAttributeAssignment first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "classattributeassignments")
public class ClassAttributeAssignmentsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ClassAttributeAssignmentDTO*/
	private List<ClassAttributeAssignmentDTO>  classattributeassignmentsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassAttributeAssignmentsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassAttributeAssignmentsDTO(final List<ClassAttributeAssignmentDTO> classattributeassignmentsList)
	{
		super();
		this.classattributeassignmentsList=classattributeassignmentsList;
	}
	
	
	/**
	 * @return the classattributeassignments
	 */
	@XmlElement(name = "classattributeassignment")
	public List<ClassAttributeAssignmentDTO> getClassAttributeAssignments()
	{
		return	classattributeassignmentsList;
	}
	
	/**
	 * @param classattributeassignmentsList 
	 *  the classattributeassignmentsList to set   
	 */
	public void setClassAttributeAssignments(final List<ClassAttributeAssignmentDTO> classattributeassignmentsList)
	{
		this.classattributeassignmentsList=classattributeassignmentsList;
	}
	
}
