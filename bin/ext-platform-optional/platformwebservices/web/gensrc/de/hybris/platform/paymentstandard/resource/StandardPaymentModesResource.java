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

import de.hybris.platform.paymentstandard.dto.StandardPaymentModesDTO;
import de.hybris.platform.paymentstandard.model.StandardPaymentModeModel;
import de.hybris.platform.paymentstandard.resource.StandardPaymentModeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StandardPaymentMode defined at extension paymentstandard Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/standardpaymentmodes")
public class StandardPaymentModesResource extends AbstractCollectionResource <Collection<StandardPaymentModeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StandardPaymentModesResource()
	{
		super("StandardPaymentMode");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStandardPaymentModes()
	{
		return createGetResponse().build(StandardPaymentModesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StandardPaymentModeResource} for current root resource 
	 */
	@Path("{standardpaymentmode}")
	public AbstractYResource getStandardPaymentModeResource(@PathParam("standardpaymentmode")  final String resourceKey)
	{
		final StandardPaymentModeResource  resource  = resourceCtx.getResource(StandardPaymentModeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StandardPaymentModeModel> getStandardPaymentModesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStandardPaymentModesCollection(final Collection<StandardPaymentModeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
