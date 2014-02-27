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

import de.hybris.platform.validation.dto.constraints.HybrisDecimalMinConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type HybrisDecimalMinConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "hybrisdecimalminconstraints")
public class HybrisDecimalMinConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>HybrisDecimalMinConstraintDTO*/
	private List<HybrisDecimalMinConstraintDTO>  hybrisdecimalminconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HybrisDecimalMinConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HybrisDecimalMinConstraintsDTO(final List<HybrisDecimalMinConstraintDTO> hybrisdecimalminconstraintsList)
	{
		super();
		this.hybrisdecimalminconstraintsList=hybrisdecimalminconstraintsList;
	}
	
	
	/**
	 * @return the hybrisdecimalminconstraints
	 */
	@XmlElement(name = "hybrisdecimalminconstraint")
	public List<HybrisDecimalMinConstraintDTO> getHybrisDecimalMinConstraints()
	{
		return	hybrisdecimalminconstraintsList;
	}
	
	/**
	 * @param hybrisdecimalminconstraintsList 
	 *  the hybrisdecimalminconstraintsList to set   
	 */
	public void setHybrisDecimalMinConstraints(final List<HybrisDecimalMinConstraintDTO> hybrisdecimalminconstraintsList)
	{
		this.hybrisdecimalminconstraintsList=hybrisdecimalminconstraintsList;
	}
	
}
