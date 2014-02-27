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

import de.hybris.platform.cronjob.dto.TypeSystemExportJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TypeSystemExportJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "typesystemexportjobs")
public class TypeSystemExportJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TypeSystemExportJobDTO*/
	private List<TypeSystemExportJobDTO>  typesystemexportjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeSystemExportJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeSystemExportJobsDTO(final List<TypeSystemExportJobDTO> typesystemexportjobsList)
	{
		super();
		this.typesystemexportjobsList=typesystemexportjobsList;
	}
	
	
	/**
	 * @return the typesystemexportjobs
	 */
	@XmlElement(name = "typesystemexportjob")
	public List<TypeSystemExportJobDTO> getTypeSystemExportJobs()
	{
		return	typesystemexportjobsList;
	}
	
	/**
	 * @param typesystemexportjobsList 
	 *  the typesystemexportjobsList to set   
	 */
	public void setTypeSystemExportJobs(final List<TypeSystemExportJobDTO> typesystemexportjobsList)
	{
		this.typesystemexportjobsList=typesystemexportjobsList;
	}
	
}
