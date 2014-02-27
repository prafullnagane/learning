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

import de.hybris.platform.cronjob.dto.CompositeJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CompositeJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "compositejobs")
public class CompositeJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CompositeJobDTO*/
	private List<CompositeJobDTO>  compositejobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeJobsDTO(final List<CompositeJobDTO> compositejobsList)
	{
		super();
		this.compositejobsList=compositejobsList;
	}
	
	
	/**
	 * @return the compositejobs
	 */
	@XmlElement(name = "compositejob")
	public List<CompositeJobDTO> getCompositeJobs()
	{
		return	compositejobsList;
	}
	
	/**
	 * @param compositejobsList 
	 *  the compositejobsList to set   
	 */
	public void setCompositeJobs(final List<CompositeJobDTO> compositejobsList)
	{
		this.compositejobsList=compositejobsList;
	}
	
}
