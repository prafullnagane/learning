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
package de.hybris.platform.cockpit.resource;

import de.hybris.platform.cockpit.dto.CockpitObjectCollectionDTO;
import de.hybris.platform.cockpit.dto.CockpitObjectCollectionsDTO;
import de.hybris.platform.cockpit.model.CockpitObjectCollectionModel;
import de.hybris.platform.cockpit.resource.CockpitObjectCollectionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitObjectCollection defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpitobjectcollections")
public class CockpitObjectCollectionsResource extends AbstractCollectionResource <Collection<CockpitObjectCollectionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectCollectionsResource()
	{
		super("CockpitObjectCollection");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitObjectCollections()
	{
		return createGetResponse().build(CockpitObjectCollectionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitObjectCollectionResource} for current root resource 
	 */
	@Path("{cockpitobjectcollection}")
	public AbstractYResource getCockpitObjectCollectionResource(@PathParam("cockpitobjectcollection")  final String resourceKey)
	{
		final CockpitObjectCollectionResource  resource  = resourceCtx.getResource(CockpitObjectCollectionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitObjectCollectionModel> getCockpitObjectCollectionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCockpitObjectCollection(final CockpitObjectCollectionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitObjectCollectionsCollection(final Collection<CockpitObjectCollectionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
