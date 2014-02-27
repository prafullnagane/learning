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
package de.hybris.platform.ordersplitting.dto;

import de.hybris.platform.ordersplitting.dto.ConsignmentProcessDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ConsignmentProcess first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "consignmentprocesses")
public class ConsignmentProcessesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ConsignmentProcessDTO*/
	private List<ConsignmentProcessDTO>  consignmentprocessesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentProcessesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConsignmentProcessesDTO(final List<ConsignmentProcessDTO> consignmentprocessesList)
	{
		super();
		this.consignmentprocessesList=consignmentprocessesList;
	}
	
	
	/**
	 * @return the consignmentprocesses
	 */
	@XmlElement(name = "consignmentprocess")
	public List<ConsignmentProcessDTO> getConsignmentProcesses()
	{
		return	consignmentprocessesList;
	}
	
	/**
	 * @param consignmentprocessesList 
	 *  the consignmentprocessesList to set   
	 */
	public void setConsignmentProcesses(final List<ConsignmentProcessDTO> consignmentprocessesList)
	{
		this.consignmentprocessesList=consignmentprocessesList;
	}
	
}
