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
package de.hybris.platform.fraud.dto;

import de.hybris.platform.fraud.dto.FraudReportDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type FraudReport first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "fraudreports")
public class FraudReportsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FraudReportDTO*/
	private List<FraudReportDTO>  fraudreportsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FraudReportsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FraudReportsDTO(final List<FraudReportDTO> fraudreportsList)
	{
		super();
		this.fraudreportsList=fraudreportsList;
	}
	
	
	/**
	 * @return the fraudreports
	 */
	@XmlElement(name = "fraudreport")
	public List<FraudReportDTO> getFraudReports()
	{
		return	fraudreportsList;
	}
	
	/**
	 * @param fraudreportsList 
	 *  the fraudreportsList to set   
	 */
	public void setFraudReports(final List<FraudReportDTO> fraudreportsList)
	{
		this.fraudreportsList=fraudreportsList;
	}
	
}
