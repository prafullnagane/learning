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

import de.hybris.platform.validation.dto.constraints.jsr303.PastConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PastConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "pastconstraints")
public class PastConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PastConstraintDTO*/
	private List<PastConstraintDTO>  pastconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PastConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PastConstraintsDTO(final List<PastConstraintDTO> pastconstraintsList)
	{
		super();
		this.pastconstraintsList=pastconstraintsList;
	}
	
	
	/**
	 * @return the pastconstraints
	 */
	@XmlElement(name = "pastconstraint")
	public List<PastConstraintDTO> getPastConstraints()
	{
		return	pastconstraintsList;
	}
	
	/**
	 * @param pastconstraintsList 
	 *  the pastconstraintsList to set   
	 */
	public void setPastConstraints(final List<PastConstraintDTO> pastconstraintsList)
	{
		this.pastconstraintsList=pastconstraintsList;
	}
	
}
