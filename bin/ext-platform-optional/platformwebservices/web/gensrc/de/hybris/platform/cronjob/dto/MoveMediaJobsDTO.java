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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.MoveMediaJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MoveMediaJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "movemediajobs")
public class MoveMediaJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MoveMediaJobDTO*/
	private List<MoveMediaJobDTO>  movemediajobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MoveMediaJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MoveMediaJobsDTO(final List<MoveMediaJobDTO> movemediajobsList)
	{
		super();
		this.movemediajobsList=movemediajobsList;
	}
	
	
	/**
	 * @return the movemediajobs
	 */
	@XmlElement(name = "movemediajob")
	public List<MoveMediaJobDTO> getMoveMediaJobs()
	{
		return	movemediajobsList;
	}
	
	/**
	 * @param movemediajobsList 
	 *  the movemediajobsList to set   
	 */
	public void setMoveMediaJobs(final List<MoveMediaJobDTO> movemediajobsList)
	{
		this.movemediajobsList=movemediajobsList;
	}
	
}
