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

import de.hybris.platform.validation.dto.constraints.NotEmptyConstraintDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type NotEmptyConstraint first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "notemptyconstraints")
public class NotEmptyConstraintsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>NotEmptyConstraintDTO*/
	private List<NotEmptyConstraintDTO>  notemptyconstraintsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NotEmptyConstraintsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NotEmptyConstraintsDTO(final List<NotEmptyConstraintDTO> notemptyconstraintsList)
	{
		super();
		this.notemptyconstraintsList=notemptyconstraintsList;
	}
	
	
	/**
	 * @return the notemptyconstraints
	 */
	@XmlElement(name = "notemptyconstraint")
	public List<NotEmptyConstraintDTO> getNotEmptyConstraints()
	{
		return	notemptyconstraintsList;
	}
	
	/**
	 * @param notemptyconstraintsList 
	 *  the notemptyconstraintsList to set   
	 */
	public void setNotEmptyConstraints(final List<NotEmptyConstraintDTO> notemptyconstraintsList)
	{
		this.notemptyconstraintsList=notemptyconstraintsList;
	}
	
}
