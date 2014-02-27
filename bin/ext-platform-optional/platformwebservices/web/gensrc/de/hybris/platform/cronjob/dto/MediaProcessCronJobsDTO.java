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

import de.hybris.platform.cronjob.dto.MediaProcessCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MediaProcessCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "mediaprocesscronjobs")
public class MediaProcessCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MediaProcessCronJobDTO*/
	private List<MediaProcessCronJobDTO>  mediaprocesscronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaProcessCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaProcessCronJobsDTO(final List<MediaProcessCronJobDTO> mediaprocesscronjobsList)
	{
		super();
		this.mediaprocesscronjobsList=mediaprocesscronjobsList;
	}
	
	
	/**
	 * @return the mediaprocesscronjobs
	 */
	@XmlElement(name = "mediaprocesscronjob")
	public List<MediaProcessCronJobDTO> getMediaProcessCronJobs()
	{
		return	mediaprocesscronjobsList;
	}
	
	/**
	 * @param mediaprocesscronjobsList 
	 *  the mediaprocesscronjobsList to set   
	 */
	public void setMediaProcessCronJobs(final List<MediaProcessCronJobDTO> mediaprocesscronjobsList)
	{
		this.mediaprocesscronjobsList=mediaprocesscronjobsList;
	}
	
}
