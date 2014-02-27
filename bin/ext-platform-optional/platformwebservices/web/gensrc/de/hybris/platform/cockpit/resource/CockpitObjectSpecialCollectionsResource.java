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

import de.hybris.platform.cockpit.dto.CockpitObjectSpecialCollectionDTO;
import de.hybris.platform.cockpit.dto.CockpitObjectSpecialCollectionsDTO;
import de.hybris.platform.cockpit.model.CockpitObjectSpecialCollectionModel;
import de.hybris.platform.cockpit.resource.CockpitObjectSpecialCollectionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitObjectSpecialCollection defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpitobjectspecialcollections")
public class CockpitObjectSpecialCollectionsResource extends AbstractCollectionResource <Collection<CockpitObjectSpecialCollectionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitObjectSpecialCollectionsResource()
	{
		super("CockpitObjectSpecialCollection");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitObjectSpecialCollections()
	{
		return createGetResponse().build(CockpitObjectSpecialCollectionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitObjectSpecialCollectionResource} for current root resource 
	 */
	@Path("{cockpitobjectspecialcollection}")
	public AbstractYResource getCockpitObjectSpecialCollectionResource(@PathParam("cockpitobjectspecialcollection")  final String resourceKey)
	{
		final CockpitObjectSpecialCollectionResource  resource  = resourceCtx.getResource(CockpitObjectSpecialCollectionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitObjectSpecialCollectionModel> getCockpitObjectSpecialCollectionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCockpitObjectSpecialCollection(final CockpitObjectSpecialCollectionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitObjectSpecialCollectionsCollection(final Collection<CockpitObjectSpecialCollectionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
