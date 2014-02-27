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
package de.hybris.platform.commerceservices.dto.process;

import de.hybris.platform.basecommerce.dto.site.BaseSiteDTO;
import de.hybris.platform.commerceservices.model.process.StoreFrontProcessModel;
import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StoreFrontProcess first defined at extension commerceservices
 */
@SuppressWarnings("all")
@GraphNode(target = StoreFrontProcessModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "storefrontprocess")
public class StoreFrontProcessDTO extends BusinessProcessDTO
{
	/** <i>Generated variable</i> - Variable of <code>StoreFrontProcess.site</code> attribute defined at extension <code> */
	private de.hybris.platform.basecommerce.dto.site.BaseSiteDTO _site;
	/** <i>Generated variable</i> - Variable of <code>StoreFrontProcess.store</code> attribute defined at extension <code> */
	private de.hybris.platform.store.BaseStoreDTO _store;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontProcessDTO()
	{
		super();
	}
	
	
	public BaseSiteDTO getSite()
	{
		return this._site;
	}
	
	public BaseStoreDTO getStore()
	{
		return this._store;
	}
	
	public void setSite(final BaseSiteDTO value)
	{
		this.modifiedPropsSet.add("site");
		this._site = value;
	}
	
	public void setStore(final BaseStoreDTO value)
	{
		this.modifiedPropsSet.add("store");
		this._store = value;
	}
	
}
