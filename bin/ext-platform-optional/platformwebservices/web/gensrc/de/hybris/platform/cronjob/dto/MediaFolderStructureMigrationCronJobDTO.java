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

import de.hybris.platform.core.dto.media.MediaFolderDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.model.MediaFolderStructureMigrationCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MediaFolderStructureMigrationCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = MediaFolderStructureMigrationCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "mediafolderstructuremigrationcronjob")
public class MediaFolderStructureMigrationCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>MediaFolderStructureMigrationCronJob.mediaFolder</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaFolderDTO _mediaFolder;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFolderStructureMigrationCronJobDTO()
	{
		super();
	}
	
	
	public MediaFolderDTO getMediaFolder()
	{
		return this._mediaFolder;
	}
	
	public void setMediaFolder(final MediaFolderDTO value)
	{
		this.modifiedPropsSet.add("mediaFolder");
		this._mediaFolder = value;
	}
	
}
