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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.ObjectCollectionElementDTO;
import de.hybris.platform.cockpit.model.ObjectCollectionItemReferenceModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ObjectCollectionItemReference first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = ObjectCollectionItemReferenceModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "objectcollectionitemreference")
public class ObjectCollectionItemReferenceDTO extends ObjectCollectionElementDTO
{
	/** <i>Generated variable</i> - Variable of <code>ObjectCollectionItemReference.item</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _item;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ObjectCollectionItemReferenceDTO()
	{
		super();
	}
	
	
	public ItemDTO getItem()
	{
		return this._item;
	}
	
	public void setItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("item");
		this._item = value;
	}
	
}
