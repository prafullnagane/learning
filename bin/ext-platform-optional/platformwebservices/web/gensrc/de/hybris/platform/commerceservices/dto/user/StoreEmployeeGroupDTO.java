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
package de.hybris.platform.commerceservices.dto.user;

import de.hybris.platform.commerceservices.model.user.StoreEmployeeGroupModel;
import de.hybris.platform.core.dto.user.UserGroupDTO;
import de.hybris.platform.storelocator.dto.PointOfServiceDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StoreEmployeeGroup first defined at extension commerceservices
 */
@SuppressWarnings("all")
@GraphNode(target = StoreEmployeeGroupModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "storeemployeegroup")
public class StoreEmployeeGroupDTO extends UserGroupDTO
{
	/** <i>Generated variable</i> - Variable of <code>StoreEmployeeGroup.store</code> attribute defined at extension <code> */
	private de.hybris.platform.storelocator.dto.PointOfServiceDTO _store;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreEmployeeGroupDTO()
	{
		super();
	}
	
	
	public PointOfServiceDTO getStore()
	{
		return this._store;
	}
	
	public void setStore(final PointOfServiceDTO value)
	{
		this.modifiedPropsSet.add("store");
		this._store = value;
	}
	
}
