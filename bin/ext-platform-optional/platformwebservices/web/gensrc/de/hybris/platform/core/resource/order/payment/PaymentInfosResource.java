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

import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.core.dto.order.payment.PaymentInfosDTO;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.resource.order.payment.PaymentInfoResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PaymentInfo defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/paymentinfos")
public class PaymentInfosResource extends AbstractCollectionResource <Collection<PaymentInfoModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentInfosResource()
	{
		super("PaymentInfo");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPaymentInfos()
	{
		return createGetResponse().build(PaymentInfosDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PaymentInfoResource} for current root resource 
	 */
	@Path("{paymentinfo}")
	public AbstractYResource getPaymentInfoResource(@PathParam("paymentinfo")  final String resourceKey)
	{
		final PaymentInfoResource  resource  = resourceCtx.getResource(PaymentInfoResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PaymentInfoModel> getPaymentInfosCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPaymentInfo(final PaymentInfoDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPaymentInfosCollection(final Collection<PaymentInfoModel> value)
	{
		super.setResourceValue(value);
	}
	
}
