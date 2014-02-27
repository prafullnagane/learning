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

import de.hybris.platform.commerceservices.dto.process.StoreFrontProcessDTO;
import de.hybris.platform.commerceservices.model.process.StoreFrontCustomerProcessModel;
import de.hybris.platform.core.dto.user.CustomerDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StoreFrontCustomerProcess first defined at extension commerceservices
 */
@SuppressWarnings("all")
@GraphNode(target = StoreFrontCustomerProcessModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "storefrontcustomerprocess")
public class StoreFrontCustomerProcessDTO extends StoreFrontProcessDTO
{
	/** <i>Generated variable</i> - Variable of <code>StoreFrontCustomerProcess.customer</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.CustomerDTO _customer;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StoreFrontCustomerProcessDTO()
	{
		super();
	}
	
	
	public CustomerDTO getCustomer()
	{
		return this._customer;
	}
	
	public void setCustomer(final CustomerDTO value)
	{
		this.modifiedPropsSet.add("customer");
		this._customer = value;
	}
	
}
