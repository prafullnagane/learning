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
package de.hybris.platform.commerceservices.model.process;

import de.hybris.platform.commerceservices.model.process.StoreFrontProcessModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type StoreFrontCustomerProcess first defined at extension commerceservices.
 * <p>
 * Represents customer related store front business process.
 */
@SuppressWarnings("all")
public class StoreFrontCustomerProcessModel extends StoreFrontProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "StoreFrontCustomerProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>StoreFrontCustomerProcess.customer</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CUSTOMER = "customer";
	
	
	/** <i>Generated variable</i> - Variable of <code>StoreFrontCustomerProcess.customer</code> attribute defined at extension <code>commerceservices</code>. */
	private CustomerModel _customer;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public StoreFrontCustomerProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public StoreFrontCustomerProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public StoreFrontCustomerProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public StoreFrontCustomerProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StoreFrontCustomerProcess.customer</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the customer - Attribute contains customer object that will be used in the process.
	 */
	public CustomerModel getCustomer()
	{
		return _customer = getPersistenceContext().getValue(CUSTOMER, _customer);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>StoreFrontCustomerProcess.customer</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the customer - Attribute contains customer object that will be used in the process.
	 */
	public void setCustomer(final CustomerModel value)
	{
		_customer = getPersistenceContext().setValue(CUSTOMER, value);
	}
	
}
