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
package de.hybris.platform.impex.dto.exp;

import de.hybris.platform.impex.dto.exp.ReportDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Report first defined at extension impex
 */
@SuppressWarnings("all")
@XmlRootElement(name = "reports")
public class ReportsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ReportDTO*/
	private List<ReportDTO>  reportsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReportsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReportsDTO(final List<ReportDTO> reportsList)
	{
		super();
		this.reportsList=reportsList;
	}
	
	
	/**
	 * @return the reports
	 */
	@XmlElement(name = "report")
	public List<ReportDTO> getReports()
	{
		return	reportsList;
	}
	
	/**
	 * @param reportsList 
	 *  the reportsList to set   
	 */
	public void setReports(final List<ReportDTO> reportsList)
	{
		this.reportsList=reportsList;
	}
	
}
