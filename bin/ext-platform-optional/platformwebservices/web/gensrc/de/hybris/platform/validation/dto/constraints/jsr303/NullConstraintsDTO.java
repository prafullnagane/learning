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

import de.hybris.platform.validation.dto.constraints.jsr303.NullConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type NullConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "nullconstraints")
public class NullConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>NullConstraintDTO*/
	private List<NullConstraintDTO>  nullconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NullConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NullConstraintsDTO(final List<NullConstraintDTO> nullconstraintsList)
	{
		super();
		this.nullconstraintsList=nullconstraintsList;
	}
	
	
	/**
	 * @return the nullconstraints
	 */
	@XmlElement(name = "nullconstraint")
	public List<NullConstraintDTO> getNullConstraints()
	{
		return	nullconstraintsList;
	}
	
	/**
	 * @param nullconstraintsList 
	 *  the nullconstraintsList to set   
	 */
	public void setNullConstraints(final List<NullConstraintDTO> nullconstraintsList)
	{
		this.nullconstraintsList=nullconstraintsList;
	}
	
}
