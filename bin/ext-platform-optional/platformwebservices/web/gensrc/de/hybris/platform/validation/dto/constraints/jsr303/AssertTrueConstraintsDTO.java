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

import de.hybris.platform.validation.dto.constraints.jsr303.AssertTrueConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AssertTrueConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "asserttrueconstraints")
public class AssertTrueConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AssertTrueConstraintDTO*/
	private List<AssertTrueConstraintDTO>  asserttrueconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AssertTrueConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AssertTrueConstraintsDTO(final List<AssertTrueConstraintDTO> asserttrueconstraintsList)
	{
		super();
		this.asserttrueconstraintsList=asserttrueconstraintsList;
	}
	
	
	/**
	 * @return the asserttrueconstraints
	 */
	@XmlElement(name = "asserttrueconstraint")
	public List<AssertTrueConstraintDTO> getAssertTrueConstraints()
	{
		return	asserttrueconstraintsList;
	}
	
	/**
	 * @param asserttrueconstraintsList 
	 *  the asserttrueconstraintsList to set   
	 */
	public void setAssertTrueConstraints(final List<AssertTrueConstraintDTO> asserttrueconstraintsList)
	{
		this.asserttrueconstraintsList=asserttrueconstraintsList;
	}
	
}
