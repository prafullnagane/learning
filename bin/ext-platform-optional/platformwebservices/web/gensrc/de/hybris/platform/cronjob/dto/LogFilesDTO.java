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

import de.hybris.platform.cronjob.dto.LogFileDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LogFile first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "logfiles")
public class LogFilesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LogFileDTO*/
	private List<LogFileDTO>  logfilesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LogFilesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LogFilesDTO(final List<LogFileDTO> logfilesList)
	{
		super();
		this.logfilesList=logfilesList;
	}
	
	
	/**
	 * @return the logfiles
	 */
	@XmlElement(name = "logfile")
	public List<LogFileDTO> getLogFiles()
	{
		return	logfilesList;
	}
	
	/**
	 * @param logfilesList 
	 *  the logfilesList to set   
	 */
	public void setLogFiles(final List<LogFileDTO> logfilesList)
	{
		this.logfilesList=logfilesList;
	}
	
}
