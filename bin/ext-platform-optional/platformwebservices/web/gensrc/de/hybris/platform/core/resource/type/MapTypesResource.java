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
package de.hybris.platform.core.resource.type;

import de.hybris.platform.core.dto.type.MapTypesDTO;
import de.hybris.platform.core.model.type.MapTypeModel;
import de.hybris.platform.core.resource.type.MapTypeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MapType defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/maptypes")
public class MapTypesResource extends AbstractCollectionResource <Collection<MapTypeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MapTypesResource()
	{
		super("MapType");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMapTypes()
	{
		return createGetResponse().build(MapTypesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MapTypeResource} for current root resource 
	 */
	@Path("{maptype}")
	public AbstractYResource getMapTypeResource(@PathParam("maptype")  final String resourceKey)
	{
		final MapTypeResource  resource  = resourceCtx.getResource(MapTypeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MapTypeModel> getMapTypesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMapTypesCollection(final Collection<MapTypeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
