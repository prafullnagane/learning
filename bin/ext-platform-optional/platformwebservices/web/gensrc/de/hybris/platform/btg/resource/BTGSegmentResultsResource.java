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
package de.hybris.platform.btg.resource;

import de.hybris.platform.btg.dto.BTGSegmentResultDTO;
import de.hybris.platform.btg.dto.BTGSegmentResultsDTO;
import de.hybris.platform.btg.model.BTGSegmentResultModel;
import de.hybris.platform.btg.resource.BTGSegmentResultResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGSegmentResult defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgsegmentresults")
public class BTGSegmentResultsResource extends AbstractCollectionResource <Collection<BTGSegmentResultModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGSegmentResultsResource()
	{
		super("BTGSegmentResult");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGSegmentResults()
	{
		return createGetResponse().build(BTGSegmentResultsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGSegmentResultResource} for current root resource 
	 */
	@Path("{btgsegmentresult}")
	public AbstractYResource getBTGSegmentResultResource(@PathParam("btgsegmentresult")  final String resourceKey)
	{
		final BTGSegmentResultResource  resource  = resourceCtx.getResource(BTGSegmentResultResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGSegmentResultModel> getBTGSegmentResultsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postBTGSegmentResult(final BTGSegmentResultDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGSegmentResultsCollection(final Collection<BTGSegmentResultModel> value)
	{
		super.setResourceValue(value);
	}
	
}
