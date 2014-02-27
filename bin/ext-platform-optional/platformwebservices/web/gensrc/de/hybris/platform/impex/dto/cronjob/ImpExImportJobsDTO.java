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
package de.hybris.platform.impex.dto.cronjob;

import de.hybris.platform.impex.dto.cronjob.ImpExImportJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ImpExImportJob first defined at extension impex
 */
@SuppressWarnings("all")
@XmlRootElement(name = "impeximportjobs")
public class ImpExImportJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ImpExImportJobDTO*/
	private List<ImpExImportJobDTO>  impeximportjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportJobsDTO(final List<ImpExImportJobDTO> impeximportjobsList)
	{
		super();
		this.impeximportjobsList=impeximportjobsList;
	}
	
	
	/**
	 * @return the impeximportjobs
	 */
	@XmlElement(name = "impeximportjob")
	public List<ImpExImportJobDTO> getImpExImportJobs()
	{
		return	impeximportjobsList;
	}
	
	/**
	 * @param impeximportjobsList 
	 *  the impeximportjobsList to set   
	 */
	public void setImpExImportJobs(final List<ImpExImportJobDTO> impeximportjobsList)
	{
		this.impeximportjobsList=impeximportjobsList;
	}
	
}
