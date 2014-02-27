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

import de.hybris.platform.validation.dto.constraints.jsr303.DigitsConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DigitsConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "digitsconstraints")
public class DigitsConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DigitsConstraintDTO*/
	private List<DigitsConstraintDTO>  digitsconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DigitsConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DigitsConstraintsDTO(final List<DigitsConstraintDTO> digitsconstraintsList)
	{
		super();
		this.digitsconstraintsList=digitsconstraintsList;
	}
	
	
	/**
	 * @return the digitsconstraints
	 */
	@XmlElement(name = "digitsconstraint")
	public List<DigitsConstraintDTO> getDigitsConstraints()
	{
		return	digitsconstraintsList;
	}
	
	/**
	 * @param digitsconstraintsList 
	 *  the digitsconstraintsList to set   
	 */
	public void setDigitsConstraints(final List<DigitsConstraintDTO> digitsconstraintsList)
	{
		this.digitsconstraintsList=digitsconstraintsList;
	}
	
}
