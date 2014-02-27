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

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.SyncItemCronJobDTO;
import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.catalog.model.ItemSyncTimestampModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ItemSyncTimestamp first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ItemSyncTimestampModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "itemsynctimestamp")
public class ItemSyncTimestampDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.targetVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _targetVersion;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.targetItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _targetItem;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.lastSyncSourceModifiedTime</code> attribute defined at extension <code> */
	private java.util.Date _lastSyncSourceModifiedTime;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.pendingAttributesScheduledTurn</code> attribute defined at extension <code> */
	private java.lang.Integer _pendingAttributesScheduledTurn;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.pendingAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _pendingAttributes;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.outdated</code> attribute defined at extension <code> */
	private java.lang.Boolean _outdated;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.pendingAttributesOwnerJob</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.SyncItemCronJobDTO _pendingAttributesOwnerJob;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.syncJob</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.SyncItemJobDTO _syncJob;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.sourceItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _sourceItem;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.lastSyncTime</code> attribute defined at extension <code> */
	private java.util.Date _lastSyncTime;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.pendingAttributeQualifiers</code> attribute defined at extension <code> */
	private java.lang.String _pendingAttributeQualifiers;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncTimestamp.sourceVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _sourceVersion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSyncTimestampDTO()
	{
		super();
	}
	
	
	public Date getLastSyncSourceModifiedTime()
	{
		return this._lastSyncSourceModifiedTime;
	}
	
	public Date getLastSyncTime()
	{
		return this._lastSyncTime;
	}
	
	public Boolean getOutdated()
	{
		return this._outdated;
	}
	
	public String getPendingAttributeQualifiers()
	{
		return this._pendingAttributeQualifiers;
	}
	
	@XmlElementWrapper(name = "pendingAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getPendingAttributes()
	{
		return this._pendingAttributes;
	}
	
	public SyncItemCronJobDTO getPendingAttributesOwnerJob()
	{
		return this._pendingAttributesOwnerJob;
	}
	
	public Integer getPendingAttributesScheduledTurn()
	{
		return this._pendingAttributesScheduledTurn;
	}
	
	public ItemDTO getSourceItem()
	{
		return this._sourceItem;
	}
	
	public CatalogVersionDTO getSourceVersion()
	{
		return this._sourceVersion;
	}
	
	public SyncItemJobDTO getSyncJob()
	{
		return this._syncJob;
	}
	
	public ItemDTO getTargetItem()
	{
		return this._targetItem;
	}
	
	public CatalogVersionDTO getTargetVersion()
	{
		return this._targetVersion;
	}
	
	public void setLastSyncSourceModifiedTime(final Date value)
	{
		this.modifiedPropsSet.add("lastSyncSourceModifiedTime");
		this._lastSyncSourceModifiedTime = value;
	}
	
	public void setLastSyncTime(final Date value)
	{
		this.modifiedPropsSet.add("lastSyncTime");
		this._lastSyncTime = value;
	}
	
	public void setOutdated(final Boolean value)
	{
		this.modifiedPropsSet.add("outdated");
		this._outdated = value;
	}
	
	public void setPendingAttributeQualifiers(final String value)
	{
		this.modifiedPropsSet.add("pendingAttributeQualifiers");
		this._pendingAttributeQualifiers = value;
	}
	
	public void setPendingAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("pendingAttributes");
		this._pendingAttributes = value;
	}
	
	public void setPendingAttributesOwnerJob(final SyncItemCronJobDTO value)
	{
		this.modifiedPropsSet.add("pendingAttributesOwnerJob");
		this._pendingAttributesOwnerJob = value;
	}
	
	public void setPendingAttributesScheduledTurn(final Integer value)
	{
		this.modifiedPropsSet.add("pendingAttributesScheduledTurn");
		this._pendingAttributesScheduledTurn = value;
	}
	
	public void setSourceItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("sourceItem");
		this._sourceItem = value;
	}
	
	public void setSourceVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("sourceVersion");
		this._sourceVersion = value;
	}
	
	public void setSyncJob(final SyncItemJobDTO value)
	{
		this.modifiedPropsSet.add("syncJob");
		this._syncJob = value;
	}
	
	public void setTargetItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("targetItem");
		this._targetItem = value;
	}
	
	public void setTargetVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("targetVersion");
		this._targetVersion = value;
	}
	
}
