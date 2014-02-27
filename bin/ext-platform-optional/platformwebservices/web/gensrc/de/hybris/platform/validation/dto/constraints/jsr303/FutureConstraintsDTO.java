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

import de.hybris.platform.validation.dto.constraints.jsr303.FutureConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type FutureConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "futureconstraints")
public class FutureConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FutureConstraintDTO*/
	private List<FutureConstraintDTO>  futureconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FutureConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FutureConstraintsDTO(final List<FutureConstraintDTO> futureconstraintsList)
	{
		super();
		this.futureconstraintsList=futureconstraintsList;
	}
	
	
	/**
	 * @return the futureconstraints
	 */
	@XmlElement(name = "futureconstraint")
	public List<FutureConstraintDTO> getFutureConstraints()
	{
		return	futureconstraintsList;
	}
	
	/**
	 * @param futureconstraintsList 
	 *  the futureconstraintsList to set   
	 */
	public void setFutureConstraints(final List<FutureConstraintDTO> futureconstraintsList)
	{
		this.futureconstraintsList=futureconstraintsList;
	}
	
}
