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

import de.hybris.platform.validation.dto.constraints.jsr303.SizeConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SizeConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "sizeconstraints")
public class SizeConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SizeConstraintDTO*/
	private List<SizeConstraintDTO>  sizeconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SizeConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SizeConstraintsDTO(final List<SizeConstraintDTO> sizeconstraintsList)
	{
		super();
		this.sizeconstraintsList=sizeconstraintsList;
	}
	
	
	/**
	 * @return the sizeconstraints
	 */
	@XmlElement(name = "sizeconstraint")
	public List<SizeConstraintDTO> getSizeConstraints()
	{
		return	sizeconstraintsList;
	}
	
	/**
	 * @param sizeconstraintsList 
	 *  the sizeconstraintsList to set   
	 */
	public void setSizeConstraints(final List<SizeConstraintDTO> sizeconstraintsList)
	{
		this.sizeconstraintsList=sizeconstraintsList;
	}
	
}
