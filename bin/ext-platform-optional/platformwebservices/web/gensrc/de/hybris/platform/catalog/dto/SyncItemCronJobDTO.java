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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.catalog.model.SyncItemCronJobModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SyncItemCronJob first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = SyncItemCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "syncitemcronjob")
public class SyncItemCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>SyncItemCronJob.pendingItems</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.ItemDTO> _pendingItems;
	/** <i>Generated variable</i> - Variable of <code>SyncItemCronJob.finishedItems</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.ItemDTO> _finishedItems;
	/** <i>Generated variable</i> - Variable of <code>SyncItemCronJob.forceUpdate</code> attribute defined at extension <code> */
	private java.lang.Boolean _forceUpdate;
	/** <i>Generated variable</i> - Variable of <code>SyncItemCronJob.createSavedValues</code> attribute defined at extension <code> */
	private java.lang.Boolean _createSavedValues;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncItemCronJobDTO()
	{
		super();
	}
	
	
	public Boolean getCreateSavedValues()
	{
		return this._createSavedValues;
	}
	
	@XmlElementWrapper(name = "finishedItems")
	@XmlElement(name = "item")
	public Collection<ItemDTO> getFinishedItems()
	{
		return this._finishedItems;
	}
	
	public Boolean getForceUpdate()
	{
		return this._forceUpdate;
	}
	
	@Override
	public SyncItemJobDTO getJob()
	{
		return (de.hybris.platform.catalog.dto.SyncItemJobDTO) super.getJob();
	}
	
	@XmlElementWrapper(name = "pendingItems")
	@XmlElement(name = "item")
	public Collection<ItemDTO> getPendingItems()
	{
		return this._pendingItems;
	}
	
	public void setCreateSavedValues(final Boolean value)
	{
		this.modifiedPropsSet.add("createSavedValues");
		this._createSavedValues = value;
	}
	
	public void setFinishedItems(final Collection<ItemDTO> value)
	{
		this.modifiedPropsSet.add("finishedItems");
		this._finishedItems = value;
	}
	
	public void setForceUpdate(final Boolean value)
	{
		this.modifiedPropsSet.add("forceUpdate");
		this._forceUpdate = value;
	}
	
	public void setPendingItems(final Collection<ItemDTO> value)
	{
		this.modifiedPropsSet.add("pendingItems");
		this._pendingItems = value;
	}
	
}
