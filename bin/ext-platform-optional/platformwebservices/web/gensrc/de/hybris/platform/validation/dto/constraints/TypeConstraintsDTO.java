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

import de.hybris.platform.validation.dto.constraints.TypeConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TypeConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "typeconstraints")
public class TypeConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TypeConstraintDTO*/
	private List<TypeConstraintDTO>  typeconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeConstraintsDTO(final List<TypeConstraintDTO> typeconstraintsList)
	{
		super();
		this.typeconstraintsList=typeconstraintsList;
	}
	
	
	/**
	 * @return the typeconstraints
	 */
	@XmlElement(name = "typeconstraint")
	public List<TypeConstraintDTO> getTypeConstraints()
	{
		return	typeconstraintsList;
	}
	
	/**
	 * @param typeconstraintsList 
	 *  the typeconstraintsList to set   
	 */
	public void setTypeConstraints(final List<TypeConstraintDTO> typeconstraintsList)
	{
		this.typeconstraintsList=typeconstraintsList;
	}
	
}
