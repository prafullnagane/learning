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

import de.hybris.platform.validation.dto.constraints.jsr303.AssertFalseConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AssertFalseConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "assertfalseconstraints")
public class AssertFalseConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AssertFalseConstraintDTO*/
	private List<AssertFalseConstraintDTO>  assertfalseconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AssertFalseConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AssertFalseConstraintsDTO(final List<AssertFalseConstraintDTO> assertfalseconstraintsList)
	{
		super();
		this.assertfalseconstraintsList=assertfalseconstraintsList;
	}
	
	
	/**
	 * @return the assertfalseconstraints
	 */
	@XmlElement(name = "assertfalseconstraint")
	public List<AssertFalseConstraintDTO> getAssertFalseConstraints()
	{
		return	assertfalseconstraintsList;
	}
	
	/**
	 * @param assertfalseconstraintsList 
	 *  the assertfalseconstraintsList to set   
	 */
	public void setAssertFalseConstraints(final List<AssertFalseConstraintDTO> assertfalseconstraintsList)
	{
		this.assertfalseconstraintsList=assertfalseconstraintsList;
	}
	
}
