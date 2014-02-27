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
package de.hybris.platform.core.resource.c2l;

import de.hybris.platform.core.dto.c2l.RegionsDTO;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.resource.c2l.RegionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Region defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/regions")
public class RegionsResource extends AbstractCollectionResource <Collection<RegionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegionsResource()
	{
		super("Region");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRegions()
	{
		return createGetResponse().build(RegionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RegionResource} for current root resource 
	 */
	@Path("{region}")
	public AbstractYResource getRegionResource(@PathParam("region")  final String resourceKey)
	{
		final RegionResource  resource  = resourceCtx.getResource(RegionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RegionModel> getRegionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRegionsCollection(final Collection<RegionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
