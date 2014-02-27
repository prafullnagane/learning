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

import de.hybris.platform.validation.dto.constraints.jsr303.PatternConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PatternConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "patternconstraints")
public class PatternConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PatternConstraintDTO*/
	private List<PatternConstraintDTO>  patternconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PatternConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PatternConstraintsDTO(final List<PatternConstraintDTO> patternconstraintsList)
	{
		super();
		this.patternconstraintsList=patternconstraintsList;
	}
	
	
	/**
	 * @return the patternconstraints
	 */
	@XmlElement(name = "patternconstraint")
	public List<PatternConstraintDTO> getPatternConstraints()
	{
		return	patternconstraintsList;
	}
	
	/**
	 * @param patternconstraintsList 
	 *  the patternconstraintsList to set   
	 */
	public void setPatternConstraints(final List<PatternConstraintDTO> patternconstraintsList)
	{
		this.patternconstraintsList=patternconstraintsList;
	}
	
}
