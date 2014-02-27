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
package de.hybris.platform.ticket.dto;

import de.hybris.platform.ticket.dto.CsTicketEventEmailConfigurationDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsTicketEventEmailConfiguration first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csticketeventemailconfigurations")
public class CsTicketEventEmailConfigurationsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsTicketEventEmailConfigurationDTO*/
	private List<CsTicketEventEmailConfigurationDTO>  csticketeventemailconfigurationsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEventEmailConfigurationsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketEventEmailConfigurationsDTO(final List<CsTicketEventEmailConfigurationDTO> csticketeventemailconfigurationsList)
	{
		super();
		this.csticketeventemailconfigurationsList=csticketeventemailconfigurationsList;
	}
	
	
	/**
	 * @return the csticketeventemailconfigurations
	 */
	@XmlElement(name = "csticketeventemailconfiguration")
	public List<CsTicketEventEmailConfigurationDTO> getCsTicketEventEmailConfigurations()
	{
		return	csticketeventemailconfigurationsList;
	}
	
	/**
	 * @param csticketeventemailconfigurationsList 
	 *  the csticketeventemailconfigurationsList to set   
	 */
	public void setCsTicketEventEmailConfigurations(final List<CsTicketEventEmailConfigurationDTO> csticketeventemailconfigurationsList)
	{
		this.csticketeventemailconfigurationsList=csticketeventemailconfigurationsList;
	}
	
}
