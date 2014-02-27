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

import de.hybris.platform.storelocator.dto.GeocodeAddressesCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type GeocodeAddressesCronJob first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "geocodeaddressescronjobs")
public class GeocodeAddressesCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>GeocodeAddressesCronJobDTO*/
	private List<GeocodeAddressesCronJobDTO>  geocodeaddressescronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GeocodeAddressesCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GeocodeAddressesCronJobsDTO(final List<GeocodeAddressesCronJobDTO> geocodeaddressescronjobsList)
	{
		super();
		this.geocodeaddressescronjobsList=geocodeaddressescronjobsList;
	}
	
	
	/**
	 * @return the geocodeaddressescronjobs
	 */
	@XmlElement(name = "geocodeaddressescronjob")
	public List<GeocodeAddressesCronJobDTO> getGeocodeAddressesCronJobs()
	{
		return	geocodeaddressescronjobsList;
	}
	
	/**
	 * @param geocodeaddressescronjobsList 
	 *  the geocodeaddressescronjobsList to set   
	 */
	public void setGeocodeAddressesCronJobs(final List<GeocodeAddressesCronJobDTO> geocodeaddressescronjobsList)
	{
		this.geocodeaddressescronjobsList=geocodeaddressescronjobsList;
	}
	
}
