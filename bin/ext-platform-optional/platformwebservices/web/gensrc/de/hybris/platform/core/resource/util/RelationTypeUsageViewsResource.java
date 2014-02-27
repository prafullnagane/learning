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
package de.hybris.platform.core.resource.util;

import de.hybris.platform.core.dto.util.RelationTypeUsageViewDTO;
import de.hybris.platform.core.dto.util.RelationTypeUsageViewsDTO;
import de.hybris.platform.core.model.util.RelationTypeUsageViewModel;
import de.hybris.platform.core.resource.util.RelationTypeUsageViewResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RelationTypeUsageView defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/relationtypeusageviews")
public class RelationTypeUsageViewsResource extends AbstractCollectionResource <Collection<RelationTypeUsageViewModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationTypeUsageViewsResource()
	{
		super("RelationTypeUsageView");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRelationTypeUsageViews()
	{
		return createGetResponse().build(RelationTypeUsageViewsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RelationTypeUsageViewResource} for current root resource 
	 */
	@Path("{relationtypeusageview}")
	public AbstractYResource getRelationTypeUsageViewResource(@PathParam("relationtypeusageview")  final String resourceKey)
	{
		final RelationTypeUsageViewResource  resource  = resourceCtx.getResource(RelationTypeUsageViewResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RelationTypeUsageViewModel> getRelationTypeUsageViewsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postRelationTypeUsageView(final RelationTypeUsageViewDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRelationTypeUsageViewsCollection(final Collection<RelationTypeUsageViewModel> value)
	{
		super.setResourceValue(value);
	}
	
}
