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

import de.hybris.platform.cronjob.dto.MediaProcessorStepDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MediaProcessorStep first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "mediaprocessorsteps")
public class MediaProcessorStepsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MediaProcessorStepDTO*/
	private List<MediaProcessorStepDTO>  mediaprocessorstepsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaProcessorStepsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaProcessorStepsDTO(final List<MediaProcessorStepDTO> mediaprocessorstepsList)
	{
		super();
		this.mediaprocessorstepsList=mediaprocessorstepsList;
	}
	
	
	/**
	 * @return the mediaprocessorsteps
	 */
	@XmlElement(name = "mediaprocessorstep")
	public List<MediaProcessorStepDTO> getMediaProcessorSteps()
	{
		return	mediaprocessorstepsList;
	}
	
	/**
	 * @param mediaprocessorstepsList 
	 *  the mediaprocessorstepsList to set   
	 */
	public void setMediaProcessorSteps(final List<MediaProcessorStepDTO> mediaprocessorstepsList)
	{
		this.mediaprocessorstepsList=mediaprocessorstepsList;
	}
	
}
