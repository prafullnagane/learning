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
package de.hybris.platform.servicelayer.internal.dto;

import de.hybris.platform.servicelayer.internal.dto.ServicelayerJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ServicelayerJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "servicelayerjobs")
public class ServicelayerJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ServicelayerJobDTO*/
	private List<ServicelayerJobDTO>  servicelayerjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ServicelayerJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ServicelayerJobsDTO(final List<ServicelayerJobDTO> servicelayerjobsList)
	{
		super();
		this.servicelayerjobsList=servicelayerjobsList;
	}
	
	
	/**
	 * @return the servicelayerjobs
	 */
	@XmlElement(name = "servicelayerjob")
	public List<ServicelayerJobDTO> getServicelayerJobs()
	{
		return	servicelayerjobsList;
	}
	
	/**
	 * @param servicelayerjobsList 
	 *  the servicelayerjobsList to set   
	 */
	public void setServicelayerJobs(final List<ServicelayerJobDTO> servicelayerjobsList)
	{
		this.servicelayerjobsList=servicelayerjobsList;
	}
	
}
