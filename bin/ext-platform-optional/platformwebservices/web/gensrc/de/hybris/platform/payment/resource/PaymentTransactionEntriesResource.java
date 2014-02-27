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
package de.hybris.platform.payment.resource;

import de.hybris.platform.payment.dto.PaymentTransactionEntriesDTO;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.resource.PaymentTransactionEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PaymentTransactionEntry defined at extension payment Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/paymenttransactionentries")
public class PaymentTransactionEntriesResource extends AbstractCollectionResource <Collection<PaymentTransactionEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentTransactionEntriesResource()
	{
		super("PaymentTransactionEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPaymentTransactionEntries()
	{
		return createGetResponse().build(PaymentTransactionEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PaymentTransactionEntryModel> getPaymentTransactionEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PaymentTransactionEntryResource} for current root resource 
	 */
	@Path("{paymenttransactionentry}")
	public AbstractYResource getPaymentTransactionEntryResource(@PathParam("paymenttransactionentry")  final String resourceKey)
	{
		final PaymentTransactionEntryResource  resource  = resourceCtx.getResource(PaymentTransactionEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPaymentTransactionEntriesCollection(final Collection<PaymentTransactionEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
