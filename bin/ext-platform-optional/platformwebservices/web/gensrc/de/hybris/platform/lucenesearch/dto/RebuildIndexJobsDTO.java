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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.lucenesearch.dto.RebuildIndexJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RebuildIndexJob first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "rebuildindexjobs")
public class RebuildIndexJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RebuildIndexJobDTO*/
	private List<RebuildIndexJobDTO>  rebuildindexjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RebuildIndexJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RebuildIndexJobsDTO(final List<RebuildIndexJobDTO> rebuildindexjobsList)
	{
		super();
		this.rebuildindexjobsList=rebuildindexjobsList;
	}
	
	
	/**
	 * @return the rebuildindexjobs
	 */
	@XmlElement(name = "rebuildindexjob")
	public List<RebuildIndexJobDTO> getRebuildIndexJobs()
	{
		return	rebuildindexjobsList;
	}
	
	/**
	 * @param rebuildindexjobsList 
	 *  the rebuildindexjobsList to set   
	 */
	public void setRebuildIndexJobs(final List<RebuildIndexJobDTO> rebuildindexjobsList)
	{
		this.rebuildindexjobsList=rebuildindexjobsList;
	}
	
}
