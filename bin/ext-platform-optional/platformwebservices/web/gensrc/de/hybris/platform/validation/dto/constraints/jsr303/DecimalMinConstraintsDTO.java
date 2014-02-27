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

import de.hybris.platform.validation.dto.constraints.jsr303.DecimalMinConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DecimalMinConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "decimalminconstraints")
public class DecimalMinConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DecimalMinConstraintDTO*/
	private List<DecimalMinConstraintDTO>  decimalminconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DecimalMinConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DecimalMinConstraintsDTO(final List<DecimalMinConstraintDTO> decimalminconstraintsList)
	{
		super();
		this.decimalminconstraintsList=decimalminconstraintsList;
	}
	
	
	/**
	 * @return the decimalminconstraints
	 */
	@XmlElement(name = "decimalminconstraint")
	public List<DecimalMinConstraintDTO> getDecimalMinConstraints()
	{
		return	decimalminconstraintsList;
	}
	
	/**
	 * @param decimalminconstraintsList 
	 *  the decimalminconstraintsList to set   
	 */
	public void setDecimalMinConstraints(final List<DecimalMinConstraintDTO> decimalminconstraintsList)
	{
		this.decimalminconstraintsList=decimalminconstraintsList;
	}
	
}
