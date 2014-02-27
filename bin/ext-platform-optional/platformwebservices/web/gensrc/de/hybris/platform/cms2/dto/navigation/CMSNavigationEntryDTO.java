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
package de.hybris.platform.cms2.dto.navigation;

import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.cms2.model.navigation.CMSNavigationEntryModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSNavigationEntry first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSNavigationEntryModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsnavigationentry")
public class CMSNavigationEntryDTO extends CMSItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationEntry.navigationNode</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO _navigationNode;
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationEntry.item</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _item;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSNavigationEntryDTO()
	{
		super();
	}
	
	
	public ItemDTO getItem()
	{
		return this._item;
	}
	
	public CMSNavigationNodeDTO getNavigationNode()
	{
		return this._navigationNode;
	}
	
	public void setItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("item");
		this._item = value;
	}
	
	public void setNavigationNode(final CMSNavigationNodeDTO value)
	{
		this.modifiedPropsSet.add("navigationNode");
		this._navigationNode = value;
	}
	
}
