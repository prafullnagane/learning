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

import de.hybris.platform.cronjob.dto.CSVExportStepDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CSVExportStep first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csvexportsteps")
public class CSVExportStepsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CSVExportStepDTO*/
	private List<CSVExportStepDTO>  csvexportstepsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CSVExportStepsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CSVExportStepsDTO(final List<CSVExportStepDTO> csvexportstepsList)
	{
		super();
		this.csvexportstepsList=csvexportstepsList;
	}
	
	
	/**
	 * @return the csvexportsteps
	 */
	@XmlElement(name = "csvexportstep")
	public List<CSVExportStepDTO> getCSVExportSteps()
	{
		return	csvexportstepsList;
	}
	
	/**
	 * @param csvexportstepsList 
	 *  the csvexportstepsList to set   
	 */
	public void setCSVExportSteps(final List<CSVExportStepDTO> csvexportstepsList)
	{
		this.csvexportstepsList=csvexportstepsList;
	}
	
}
