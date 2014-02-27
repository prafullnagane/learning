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
package de.hybris.platform.paymentstandard.resource;

import de.hybris.platform.paymentstandard.dto.StandardPaymentModeValueDTO;
import de.hybris.platform.paymentstandard.dto.StandardPaymentModeValuesDTO;
import de.hybris.platform.paymentstandard.model.StandardPaymentModeValueModel;
import de.hybris.platform.paymentstandard.resource.StandardPaymentModeValueResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StandardPaymentModeValue defined at extension paymentstandard Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/standardpaymentmodevalues")
public class StandardPaymentModeValuesResource extends AbstractCollectionResource <Collection<StandardPaymentModeValueModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StandardPaymentModeValuesResource()
	{
		super("StandardPaymentModeValue");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStandardPaymentModeValues()
	{
		return createGetResponse().build(StandardPaymentModeValuesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StandardPaymentModeValueResource} for current root resource 
	 */
	@Path("{standardpaymentmodevalue}")
	public AbstractYResource getStandardPaymentModeValueResource(@PathParam("standardpaymentmodevalue")  final String resourceKey)
	{
		final StandardPaymentModeValueResource  resource  = resourceCtx.getResource(StandardPaymentModeValueResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StandardPaymentModeValueModel> getStandardPaymentModeValuesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postStandardPaymentModeValue(final StandardPaymentModeValueDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStandardPaymentModeValuesCollection(final Collection<StandardPaymentModeValueModel> value)
	{
		super.setResourceValue(value);
	}
	
}
