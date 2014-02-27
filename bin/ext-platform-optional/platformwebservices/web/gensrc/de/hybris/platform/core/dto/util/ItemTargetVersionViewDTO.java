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

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.util.ItemTargetVersionViewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ItemTargetVersionView first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ItemTargetVersionViewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "itemtargetversionview")
public class ItemTargetVersionViewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ItemTargetVersionView.targetItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _targetItem;
	/** <i>Generated variable</i> - Variable of <code>ItemTargetVersionView.targetVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _targetVersion;
	/** <i>Generated variable</i> - Variable of <code>ItemTargetVersionView.sourceItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _sourceItem;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemTargetVersionViewDTO()
	{
		super();
	}
	
	
	public ItemDTO getSourceItem()
	{
		return this._sourceItem;
	}
	
	public ItemDTO getTargetItem()
	{
		return this._targetItem;
	}
	
	public CatalogVersionDTO getTargetVersion()
	{
		return this._targetVersion;
	}
	
	public void setSourceItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("sourceItem");
		this._sourceItem = value;
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