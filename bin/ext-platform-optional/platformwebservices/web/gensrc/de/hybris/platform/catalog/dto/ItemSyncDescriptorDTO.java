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

import de.hybris.platform.catalog.dto.SyncItemCronJobDTO;
import de.hybris.platform.catalog.model.ItemSyncDescriptorModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.cronjob.dto.ChangeDescriptorDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ItemSyncDescriptor first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ItemSyncDescriptorModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "itemsyncdescriptor")
public class ItemSyncDescriptorDTO extends ChangeDescriptorDTO
{
	/** <i>Generated variable</i> - Variable of <code>ItemSyncDescriptor.copiedImplicitely</code> attribute defined at extension <code> */
	private java.lang.Boolean _copiedImplicitely;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncDescriptor.targetItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _targetItem;
	/** <i>Generated variable</i> - Variable of <code>ItemSyncDescriptor.done</code> attribute defined at extension <code> */
	private java.lang.Boolean _done;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemSyncDescriptorDTO()
	{
		super();
	}
	
	
	public Boolean getCopiedImplicitely()
	{
		return this._copiedImplicitely;
	}
	
	@Override
	public SyncItemCronJobDTO getCronJob()
	{
		return (de.hybris.platform.catalog.dto.SyncItemCronJobDTO) super.getCronJob();
	}
	
	public Boolean getDone()
	{
		return this._done;
	}
	
	public ItemDTO getTargetItem()
	{
		return this._targetItem;
	}
	
	public void setCopiedImplicitely(final Boolean value)
	{
		this.modifiedPropsSet.add("copiedImplicitely");
		this._copiedImplicitely = value;
	}
	
	public void setDone(final Boolean value)
	{
		this.modifiedPropsSet.add("done");
		this._done = value;
	}
	
	public void setTargetItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("targetItem");
		this._targetItem = value;
	}
	
}
