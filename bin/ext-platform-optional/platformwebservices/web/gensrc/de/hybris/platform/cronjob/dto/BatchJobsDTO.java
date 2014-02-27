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

import de.hybris.platform.cronjob.dto.BatchJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BatchJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "batchjobs")
public class BatchJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BatchJobDTO*/
	private List<BatchJobDTO>  batchjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BatchJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BatchJobsDTO(final List<BatchJobDTO> batchjobsList)
	{
		super();
		this.batchjobsList=batchjobsList;
	}
	
	
	/**
	 * @return the batchjobs
	 */
	@XmlElement(name = "batchjob")
	public List<BatchJobDTO> getBatchJobs()
	{
		return	batchjobsList;
	}
	
	/**
	 * @param batchjobsList 
	 *  the batchjobsList to set   
	 */
	public void setBatchJobs(final List<BatchJobDTO> batchjobsList)
	{
		this.batchjobsList=batchjobsList;
	}
	
}
