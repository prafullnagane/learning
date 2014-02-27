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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.util.ModifiedCatalogItemsViewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ModifiedCatalogItemsView first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ModifiedCatalogItemsViewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "modifiedcatalogitemsview")
public class ModifiedCatalogItemsViewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ModifiedCatalogItemsView.targetItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _targetItem;
	/** <i>Generated variable</i> - Variable of <code>ModifiedCatalogItemsView.sourceItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _sourceItem;
	/** <i>Generated variable</i> - Variable of <code>ModifiedCatalogItemsView.job</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.SyncItemJobDTO _job;
	/** <i>Generated variable</i> - Variable of <code>ModifiedCatalogItemsView.sourceModifiedTime</code> attribute defined at extension <code> */
	private java.util.Date _sourceModifiedTime;
	/** <i>Generated variable</i> - Variable of <code>ModifiedCatalogItemsView.lastSyncTime</code> attribute defined at extension <code> */
	private java.util.Date _lastSyncTime;
	/** <i>Generated variable</i> - Variable of <code>ModifiedCatalogItemsView.typeCode</code> attribute defined at extension <code> */
	private java.lang.String _typeCode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ModifiedCatalogItemsViewDTO()
	{
		super();
	}
	
	
	public SyncItemJobDTO getJob()
	{
		return this._job;
	}
	
	public Date getLastSyncTime()
	{
		return this._lastSyncTime;
	}
	
	public ItemDTO getSourceItem()
	{
		return this._sourceItem;
	}
	
	public Date getSourceModifiedTime()
	{
		return this._sourceModifiedTime;
	}
	
	public ItemDTO getTargetItem()
	{
		return this._targetItem;
	}
	
	public String getTypeCode()
	{
		return this._typeCode;
	}
	
	public void setJob(final SyncItemJobDTO value)
	{
		this.modifiedPropsSet.add("job");
		this._job = value;
	}
	
	public void setLastSyncTime(final Date value)
	{
		this.modifiedPropsSet.add("lastSyncTime");
		this._lastSyncTime = value;
	}
	
	public void setSourceItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("sourceItem");
		this._sourceItem = value;
	}
	
	public void setSourceModifiedTime(final Date value)
	{
		this.modifiedPropsSet.add("sourceModifiedTime");
		this._sourceModifiedTime = value;
	}
	
	public void setTargetItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("targetItem");
		this._targetItem = value;
	}
	
	public void setTypeCode(final String value)
	{
		this.modifiedPropsSet.add("typeCode");
		this._typeCode = value;
	}
	
}
