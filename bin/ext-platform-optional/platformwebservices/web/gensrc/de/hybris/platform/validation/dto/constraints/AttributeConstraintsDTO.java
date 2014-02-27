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
package de.hybris.platform.validation.dto.constraints;

import de.hybris.platform.validation.dto.constraints.AttributeConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AttributeConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "attributeconstraints")
public class AttributeConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AttributeConstraintDTO*/
	private List<AttributeConstraintDTO>  attributeconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeConstraintsDTO(final List<AttributeConstraintDTO> attributeconstraintsList)
	{
		super();
		this.attributeconstraintsList=attributeconstraintsList;
	}
	
	
	/**
	 * @return the attributeconstraints
	 */
	@XmlElement(name = "attributeconstraint")
	public List<AttributeConstraintDTO> getAttributeConstraints()
	{
		return	attributeconstraintsList;
	}
	
	/**
	 * @param attributeconstraintsList 
	 *  the attributeconstraintsList to set   
	 */
	public void setAttributeConstraints(final List<AttributeConstraintDTO> attributeconstraintsList)
	{
		this.attributeconstraintsList=attributeconstraintsList;
	}
	
}
