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
package de.hybris.platform.cms2lib.resource.components;

import de.hybris.platform.cms2lib.dto.components.RotatingImagesComponentsDTO;
import de.hybris.platform.cms2lib.model.components.RotatingImagesComponentModel;
import de.hybris.platform.cms2lib.resource.components.RotatingImagesComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RotatingImagesComponent defined at extension cms2lib Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/rotatingimagescomponents")
public class RotatingImagesComponentsResource extends AbstractCollectionResource <Collection<RotatingImagesComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RotatingImagesComponentsResource()
	{
		super("RotatingImagesComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRotatingImagesComponents()
	{
		return createGetResponse().build(RotatingImagesComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RotatingImagesComponentResource} for current root resource 
	 */
	@Path("{rotatingimagescomponent}")
	public AbstractYResource getRotatingImagesComponentResource(@PathParam("rotatingimagescomponent")  final String resourceKey)
	{
		final RotatingImagesComponentResource  resource  = resourceCtx.getResource(RotatingImagesComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RotatingImagesComponentModel> getRotatingImagesComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRotatingImagesComponentsCollection(final Collection<RotatingImagesComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
