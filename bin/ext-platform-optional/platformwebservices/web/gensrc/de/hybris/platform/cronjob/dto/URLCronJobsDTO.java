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

import de.hybris.platform.cronjob.dto.URLCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type URLCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "urlcronjobs")
public class URLCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>URLCronJobDTO*/
	private List<URLCronJobDTO>  urlcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public URLCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public URLCronJobsDTO(final List<URLCronJobDTO> urlcronjobsList)
	{
		super();
		this.urlcronjobsList=urlcronjobsList;
	}
	
	
	/**
	 * @return the urlcronjobs
	 */
	@XmlElement(name = "urlcronjob")
	public List<URLCronJobDTO> getURLCronJobs()
	{
		return	urlcronjobsList;
	}
	
	/**
	 * @param urlcronjobsList 
	 *  the urlcronjobsList to set   
	 */
	public void setURLCronJobs(final List<URLCronJobDTO> urlcronjobsList)
	{
		this.urlcronjobsList=urlcronjobsList;
	}
	
}
