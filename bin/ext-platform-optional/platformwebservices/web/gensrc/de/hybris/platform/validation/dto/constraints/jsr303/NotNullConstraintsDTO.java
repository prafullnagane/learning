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

import de.hybris.platform.validation.dto.constraints.jsr303.NotNullConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type NotNullConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "notnullconstraints")
public class NotNullConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>NotNullConstraintDTO*/
	private List<NotNullConstraintDTO>  notnullconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NotNullConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NotNullConstraintsDTO(final List<NotNullConstraintDTO> notnullconstraintsList)
	{
		super();
		this.notnullconstraintsList=notnullconstraintsList;
	}
	
	
	/**
	 * @return the notnullconstraints
	 */
	@XmlElement(name = "notnullconstraint")
	public List<NotNullConstraintDTO> getNotNullConstraints()
	{
		return	notnullconstraintsList;
	}
	
	/**
	 * @param notnullconstraintsList 
	 *  the notnullconstraintsList to set   
	 */
	public void setNotNullConstraints(final List<NotNullConstraintDTO> notnullconstraintsList)
	{
		this.notnullconstraintsList=notnullconstraintsList;
	}
	
}
