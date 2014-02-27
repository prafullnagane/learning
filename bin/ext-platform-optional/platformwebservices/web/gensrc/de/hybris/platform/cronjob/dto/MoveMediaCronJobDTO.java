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

import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.media.MediaFolderDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.model.MoveMediaCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MoveMediaCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = MoveMediaCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "movemediacronjob")
public class MoveMediaCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>MoveMediaCronJob.movedMediasCount</code> attribute defined at extension <code> */
	private java.lang.Integer _movedMediasCount;
	/** <i>Generated variable</i> - Variable of <code>MoveMediaCronJob.medias</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _medias;
	/** <i>Generated variable</i> - Variable of <code>MoveMediaCronJob.targetFolder</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaFolderDTO _targetFolder;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MoveMediaCronJobDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "medias")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getMedias()
	{
		return this._medias;
	}
	
	public Integer getMovedMediasCount()
	{
		return this._movedMediasCount;
	}
	
	public MediaFolderDTO getTargetFolder()
	{
		return this._targetFolder;
	}
	
	public void setMedias(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("medias");
		this._medias = value;
	}
	
	public void setMovedMediasCount(final Integer value)
	{
		this.modifiedPropsSet.add("movedMediasCount");
		this._movedMediasCount = value;
	}
	
	public void setTargetFolder(final MediaFolderDTO value)
	{
		this.modifiedPropsSet.add("targetFolder");
		this._targetFolder = value;
	}
	
}
