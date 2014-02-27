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

import de.hybris.platform.validation.dto.constraints.NotBlankConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type NotBlankConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "notblankconstraints")
public class NotBlankConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>NotBlankConstraintDTO*/
	private List<NotBlankConstraintDTO>  notblankconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NotBlankConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NotBlankConstraintsDTO(final List<NotBlankConstraintDTO> notblankconstraintsList)
	{
		super();
		this.notblankconstraintsList=notblankconstraintsList;
	}
	
	
	/**
	 * @return the notblankconstraints
	 */
	@XmlElement(name = "notblankconstraint")
	public List<NotBlankConstraintDTO> getNotBlankConstraints()
	{
		return	notblankconstraintsList;
	}
	
	/**
	 * @param notblankconstraintsList 
	 *  the notblankconstraintsList to set   
	 */
	public void setNotBlankConstraints(final List<NotBlankConstraintDTO> notblankconstraintsList)
	{
		this.notblankconstraintsList=notblankconstraintsList;
	}
	
}
