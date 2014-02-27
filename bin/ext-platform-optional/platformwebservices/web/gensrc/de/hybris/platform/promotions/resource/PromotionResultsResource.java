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
package de.hybris.platform.promotions.resource;

import de.hybris.platform.promotions.dto.PromotionResultDTO;
import de.hybris.platform.promotions.dto.PromotionResultsDTO;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.promotions.resource.PromotionResultResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionResult defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionresults")
public class PromotionResultsResource extends AbstractCollectionResource <Collection<PromotionResultModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionResultsResource()
	{
		super("PromotionResult");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionResults()
	{
		return createGetResponse().build(PromotionResultsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionResultResource} for current root resource 
	 */
	@Path("{promotionresult}")
	public AbstractYResource getPromotionResultResource(@PathParam("promotionresult")  final String resourceKey)
	{
		final PromotionResultResource  resource  = resourceCtx.getResource(PromotionResultResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionResultModel> getPromotionResultsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postPromotionResult(final PromotionResultDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionResultsCollection(final Collection<PromotionResultModel> value)
	{
		super.setResourceValue(value);
	}
	
}
