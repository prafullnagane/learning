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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.CoverageConstraintGroupDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CoverageConstraintGroup first defined at extension validation
 */
@SuppressWarnings("all")
@XmlRootElement(name = "coverageconstraintgroups")
public class CoverageConstraintGroupsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CoverageConstraintGroupDTO*/
	private List<CoverageConstraintGroupDTO>  coverageconstraintgroupsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CoverageConstraintGroupsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CoverageConstraintGroupsDTO(final List<CoverageConstraintGroupDTO> coverageconstraintgroupsList)
	{
		super();
		this.coverageconstraintgroupsList=coverageconstraintgroupsList;
	}
	
	
	/**
	 * @return the coverageconstraintgroups
	 */
	@XmlElement(name = "coverageconstraintgroup")
	public List<CoverageConstraintGroupDTO> getCoverageConstraintGroups()
	{
		return	coverageconstraintgroupsList;
	}
	
	/**
	 * @param coverageconstraintgroupsList 
	 *  the coverageconstraintgroupsList to set   
	 */
	public void setCoverageConstraintGroups(final List<CoverageConstraintGroupDTO> coverageconstraintgroupsList)
	{
		this.coverageconstraintgroupsList=coverageconstraintgroupsList;
	}
	
}
