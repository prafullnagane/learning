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

import de.hybris.platform.core.dto.order.payment.PaymentModesDTO;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.core.resource.order.payment.PaymentModeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PaymentMode defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/paymentmodes")
public class PaymentModesResource extends AbstractCollectionResource <Collection<PaymentModeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PaymentModesResource()
	{
		super("PaymentMode");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPaymentModes()
	{
		return createGetResponse().build(PaymentModesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PaymentModeResource} for current root resource 
	 */
	@Path("{paymentmode}")
	public AbstractYResource getPaymentModeResource(@PathParam("paymentmode")  final String resourceKey)
	{
		final PaymentModeResource  resource  = resourceCtx.getResource(PaymentModeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PaymentModeModel> getPaymentModesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPaymentModesCollection(final Collection<PaymentModeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
