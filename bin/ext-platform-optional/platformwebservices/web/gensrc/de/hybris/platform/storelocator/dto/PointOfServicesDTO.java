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
package de.hybris.platform.storelocator.dto;

import de.hybris.platform.storelocator.dto.PointOfServiceDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PointOfService first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "pointofservices")
public class PointOfServicesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PointOfServiceDTO*/
	private List<PointOfServiceDTO>  pointofservicesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PointOfServicesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PointOfServicesDTO(final List<PointOfServiceDTO> pointofservicesList)
	{
		super();
		this.pointofservicesList=pointofservicesList;
	}
	
	
	/**
	 * @return the pointofservices
	 */
	@XmlElement(name = "pointofservice")
	public List<PointOfServiceDTO> getPointOfServices()
	{
		return	pointofservicesList;
	}
	
	/**
	 * @param pointofservicesList 
	 *  the pointofservicesList to set   
	 */
	public void setPointOfServices(final List<PointOfServiceDTO> pointofservicesList)
	{
		this.pointofservicesList=pointofservicesList;
	}
	
}
