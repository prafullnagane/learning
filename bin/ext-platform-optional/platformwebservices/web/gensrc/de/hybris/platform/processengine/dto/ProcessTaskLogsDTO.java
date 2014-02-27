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
package de.hybris.platform.processengine.dto;

import de.hybris.platform.processengine.dto.ProcessTaskLogDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProcessTaskLog first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "processtasklogs")
public class ProcessTaskLogsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProcessTaskLogDTO*/
	private List<ProcessTaskLogDTO>  processtasklogsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProcessTaskLogsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProcessTaskLogsDTO(final List<ProcessTaskLogDTO> processtasklogsList)
	{
		super();
		this.processtasklogsList=processtasklogsList;
	}
	
	
	/**
	 * @return the processtasklogs
	 */
	@XmlElement(name = "processtasklog")
	public List<ProcessTaskLogDTO> getProcessTaskLogs()
	{
		return	processtasklogsList;
	}
	
	/**
	 * @param processtasklogsList 
	 *  the processtasklogsList to set   
	 */
	public void setProcessTaskLogs(final List<ProcessTaskLogDTO> processtasklogsList)
	{
		this.processtasklogsList=processtasklogsList;
	}
	
}
