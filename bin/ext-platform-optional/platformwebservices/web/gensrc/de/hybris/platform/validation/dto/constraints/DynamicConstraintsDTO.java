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

import de.hybris.platform.validation.dto.constraints.DynamicConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DynamicConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "dynamicconstraints")
public class DynamicConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DynamicConstraintDTO*/
	private List<DynamicConstraintDTO>  dynamicconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicConstraintsDTO(final List<DynamicConstraintDTO> dynamicconstraintsList)
	{
		super();
		this.dynamicconstraintsList=dynamicconstraintsList;
	}
	
	
	/**
	 * @return the dynamicconstraints
	 */
	@XmlElement(name = "dynamicconstraint")
	public List<DynamicConstraintDTO> getDynamicConstraints()
	{
		return	dynamicconstraintsList;
	}
	
	/**
	 * @param dynamicconstraintsList 
	 *  the dynamicconstraintsList to set   
	 */
	public void setDynamicConstraints(final List<DynamicConstraintDTO> dynamicconstraintsList)
	{
		this.dynamicconstraintsList=dynamicconstraintsList;
	}
	
}
