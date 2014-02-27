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

import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BusinessProcess first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "businessprocesses")
public class BusinessProcessesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BusinessProcessDTO*/
	private List<BusinessProcessDTO>  businessprocessesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BusinessProcessesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BusinessProcessesDTO(final List<BusinessProcessDTO> businessprocessesList)
	{
		super();
		this.businessprocessesList=businessprocessesList;
	}
	
	
	/**
	 * @return the businessprocesses
	 */
	@XmlElement(name = "businessprocess")
	public List<BusinessProcessDTO> getBusinessProcesses()
	{
		return	businessprocessesList;
	}
	
	/**
	 * @param businessprocessesList 
	 *  the businessprocessesList to set   
	 */
	public void setBusinessProcesses(final List<BusinessProcessDTO> businessprocessesList)
	{
		this.businessprocessesList=businessprocessesList;
	}
	
}
