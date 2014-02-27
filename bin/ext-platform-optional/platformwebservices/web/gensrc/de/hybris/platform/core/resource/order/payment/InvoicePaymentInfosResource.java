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
package de.hybris.platform.core.resource.order.payment;

import de.hybris.platform.core.dto.order.payment.InvoicePaymentInfoDTO;
import de.hybris.platform.core.dto.order.payment.InvoicePaymentInfosDTO;
import de.hybris.platform.core.model.order.payment.InvoicePaymentInfoModel;
import de.hybris.platform.core.resource.order.payment.InvoicePaymentInfoResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type InvoicePaymentInfo defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/invoicepaymentinfos")
public class InvoicePaymentInfosResource extends AbstractCollectionResource <Collection<InvoicePaymentInfoModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InvoicePaymentInfosResource()
	{
		super("InvoicePaymentInfo");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllInvoicePaymentInfos()
	{
		return createGetResponse().build(InvoicePaymentInfosDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link InvoicePaymentInfoResource} for current root resource 
	 */
	@Path("{invoicepaymentinfo}")
	public AbstractYResource getInvoicePaymentInfoResource(@PathParam("invoicepaymentinfo")  final String resourceKey)
	{
		final InvoicePaymentInfoResource  resource  = resourceCtx.getResource(InvoicePaymentInfoResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<InvoicePaymentInfoModel> getInvoicePaymentInfosCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postInvoicePaymentInfo(final InvoicePaymentInfoDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setInvoicePaymentInfosCollection(final Collection<InvoicePaymentInfoModel> value)
	{
		super.setResourceValue(value);
	}
	
}
