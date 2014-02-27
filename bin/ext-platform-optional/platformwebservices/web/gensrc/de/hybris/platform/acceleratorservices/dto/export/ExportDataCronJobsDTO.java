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
package de.hybris.platform.acceleratorservices.dto.export;

import de.hybris.platform.acceleratorservices.dto.export.ExportDataCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ExportDataCronJob first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "exportdatacronjobs")
public class ExportDataCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ExportDataCronJobDTO*/
	private List<ExportDataCronJobDTO>  exportdatacronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataCronJobsDTO(final List<ExportDataCronJobDTO> exportdatacronjobsList)
	{
		super();
		this.exportdatacronjobsList=exportdatacronjobsList;
	}
	
	
	/**
	 * @return the exportdatacronjobs
	 */
	@XmlElement(name = "exportdatacronjob")
	public List<ExportDataCronJobDTO> getExportDataCronJobs()
	{
		return	exportdatacronjobsList;
	}
	
	/**
	 * @param exportdatacronjobsList 
	 *  the exportdatacronjobsList to set   
	 */
	public void setExportDataCronJobs(final List<ExportDataCronJobDTO> exportdatacronjobsList)
	{
		this.exportdatacronjobsList=exportdatacronjobsList;
	}
	
}
