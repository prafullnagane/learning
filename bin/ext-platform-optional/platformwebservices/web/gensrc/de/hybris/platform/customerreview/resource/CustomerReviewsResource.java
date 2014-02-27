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
package de.hybris.platform.customerreview.resource;

import de.hybris.platform.customerreview.dto.CustomerReviewDTO;
import de.hybris.platform.customerreview.dto.CustomerReviewsDTO;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.customerreview.resource.CustomerReviewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CustomerReview defined at extension customerreview Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/customerreviews")
public class CustomerReviewsResource extends AbstractCollectionResource <Collection<CustomerReviewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerReviewsResource()
	{
		super("CustomerReview");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCustomerReviews()
	{
		return createGetResponse().build(CustomerReviewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CustomerReviewResource} for current root resource 
	 */
	@Path("{customerreview}")
	public AbstractYResource getCustomerReviewResource(@PathParam("customerreview")  final String resourceKey)
	{
		final CustomerReviewResource  resource  = resourceCtx.getResource(CustomerReviewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CustomerReviewModel> getCustomerReviewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCustomerReview(final CustomerReviewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCustomerReviewsCollection(final Collection<CustomerReviewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
