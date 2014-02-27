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

import de.hybris.platform.cronjob.dto.FlexibleSearchCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type FlexibleSearchCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "flexiblesearchcronjobs")
public class FlexibleSearchCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FlexibleSearchCronJobDTO*/
	private List<FlexibleSearchCronJobDTO>  flexiblesearchcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FlexibleSearchCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FlexibleSearchCronJobsDTO(final List<FlexibleSearchCronJobDTO> flexiblesearchcronjobsList)
	{
		super();
		this.flexiblesearchcronjobsList=flexiblesearchcronjobsList;
	}
	
	
	/**
	 * @return the flexiblesearchcronjobs
	 */
	@XmlElement(name = "flexiblesearchcronjob")
	public List<FlexibleSearchCronJobDTO> getFlexibleSearchCronJobs()
	{
		return	flexiblesearchcronjobsList;
	}
	
	/**
	 * @param flexiblesearchcronjobsList 
	 *  the flexiblesearchcronjobsList to set   
	 */
	public void setFlexibleSearchCronJobs(final List<FlexibleSearchCronJobDTO> flexiblesearchcronjobsList)
	{
		this.flexiblesearchcronjobsList=flexiblesearchcronjobsList;
	}
	
}
