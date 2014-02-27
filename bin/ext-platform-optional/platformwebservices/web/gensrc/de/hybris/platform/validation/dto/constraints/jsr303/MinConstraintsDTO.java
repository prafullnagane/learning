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

import de.hybris.platform.validation.dto.constraints.jsr303.MinConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MinConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "minconstraints")
public class MinConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MinConstraintDTO*/
	private List<MinConstraintDTO>  minconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MinConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MinConstraintsDTO(final List<MinConstraintDTO> minconstraintsList)
	{
		super();
		this.minconstraintsList=minconstraintsList;
	}
	
	
	/**
	 * @return the minconstraints
	 */
	@XmlElement(name = "minconstraint")
	public List<MinConstraintDTO> getMinConstraints()
	{
		return	minconstraintsList;
	}
	
	/**
	 * @param minconstraintsList 
	 *  the minconstraintsList to set   
	 */
	public void setMinConstraints(final List<MinConstraintDTO> minconstraintsList)
	{
		this.minconstraintsList=minconstraintsList;
	}
	
}
