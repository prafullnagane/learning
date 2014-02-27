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

import de.hybris.platform.impex.dto.cronjob.ImpExExportJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ImpExExportJob first defined at extension impex
 */
@SuppressWarnings("all")
@XmlRootElement(name = "impexexportjobs")
public class ImpExExportJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ImpExExportJobDTO*/
	private List<ImpExExportJobDTO>  impexexportjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportJobsDTO(final List<ImpExExportJobDTO> impexexportjobsList)
	{
		super();
		this.impexexportjobsList=impexexportjobsList;
	}
	
	
	/**
	 * @return the impexexportjobs
	 */
	@XmlElement(name = "impexexportjob")
	public List<ImpExExportJobDTO> getImpExExportJobs()
	{
		return	impexexportjobsList;
	}
	
	/**
	 * @param impexexportjobsList 
	 *  the impexexportjobsList to set   
	 */
	public void setImpExExportJobs(final List<ImpExExportJobDTO> impexexportjobsList)
	{
		this.impexexportjobsList=impexexportjobsList;
	}
	
}
