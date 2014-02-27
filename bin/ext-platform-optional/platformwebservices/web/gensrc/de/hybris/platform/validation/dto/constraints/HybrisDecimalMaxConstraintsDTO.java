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

import de.hybris.platform.validation.dto.constraints.HybrisDecimalMaxConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type HybrisDecimalMaxConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "hybrisdecimalmaxconstraints")
public class HybrisDecimalMaxConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>HybrisDecimalMaxConstraintDTO*/
	private List<HybrisDecimalMaxConstraintDTO>  hybrisdecimalmaxconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HybrisDecimalMaxConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HybrisDecimalMaxConstraintsDTO(final List<HybrisDecimalMaxConstraintDTO> hybrisdecimalmaxconstraintsList)
	{
		super();
		this.hybrisdecimalmaxconstraintsList=hybrisdecimalmaxconstraintsList;
	}
	
	
	/**
	 * @return the hybrisdecimalmaxconstraints
	 */
	@XmlElement(name = "hybrisdecimalmaxconstraint")
	public List<HybrisDecimalMaxConstraintDTO> getHybrisDecimalMaxConstraints()
	{
		return	hybrisdecimalmaxconstraintsList;
	}
	
	/**
	 * @param hybrisdecimalmaxconstraintsList 
	 *  the hybrisdecimalmaxconstraintsList to set   
	 */
	public void setHybrisDecimalMaxConstraints(final List<HybrisDecimalMaxConstraintDTO> hybrisdecimalmaxconstraintsList)
	{
		this.hybrisdecimalmaxconstraintsList=hybrisdecimalmaxconstraintsList;
	}
	
}
