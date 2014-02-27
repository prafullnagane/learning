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

import de.hybris.platform.validation.dto.constraints.AbstractConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractconstraints")
public class AbstractConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractConstraintDTO*/
	private List<AbstractConstraintDTO>  abstractconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractConstraintsDTO(final List<AbstractConstraintDTO> abstractconstraintsList)
	{
		super();
		this.abstractconstraintsList=abstractconstraintsList;
	}
	
	
	/**
	 * @return the abstractconstraints
	 */
	@XmlElement(name = "abstractconstraint")
	public List<AbstractConstraintDTO> getAbstractConstraints()
	{
		return	abstractconstraintsList;
	}
	
	/**
	 * @param abstractconstraintsList 
	 *  the abstractconstraintsList to set   
	 */
	public void setAbstractConstraints(final List<AbstractConstraintDTO> abstractconstraintsList)
	{
		this.abstractconstraintsList=abstractconstraintsList;
	}
	
}
