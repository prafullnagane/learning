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
package de.hybris.platform.validation.dto.constraints.jsr303;

import de.hybris.platform.validation.dto.constraints.jsr303.MaxConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MaxConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "maxconstraints")
public class MaxConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MaxConstraintDTO*/
	private List<MaxConstraintDTO>  maxconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MaxConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MaxConstraintsDTO(final List<MaxConstraintDTO> maxconstraintsList)
	{
		super();
		this.maxconstraintsList=maxconstraintsList;
	}
	
	
	/**
	 * @return the maxconstraints
	 */
	@XmlElement(name = "maxconstraint")
	public List<MaxConstraintDTO> getMaxConstraints()
	{
		return	maxconstraintsList;
	}
	
	/**
	 * @param maxconstraintsList 
	 *  the maxconstraintsList to set   
	 */
	public void setMaxConstraints(final List<MaxConstraintDTO> maxconstraintsList)
	{
		this.maxconstraintsList=maxconstraintsList;
	}
	
}
