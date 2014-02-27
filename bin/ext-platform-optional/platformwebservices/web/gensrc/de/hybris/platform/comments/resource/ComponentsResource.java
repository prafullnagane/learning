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
package de.hybris.platform.comments.resource;

import de.hybris.platform.comments.dto.ComponentsDTO;
import de.hybris.platform.comments.model.ComponentModel;
import de.hybris.platform.comments.resource.ComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Component defined at extension comments Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/components")
public class ComponentsResource extends AbstractCollectionResource <Collection<ComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComponentsResource()
	{
		super("Component");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllComponents()
	{
		return createGetResponse().build(ComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ComponentResource} for current root resource 
	 */
	@Path("{component}")
	public AbstractYResource getComponentResource(@PathParam("component")  final String resourceKey)
	{
		final ComponentResource  resource  = resourceCtx.getResource(ComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ComponentModel> getComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setComponentsCollection(final Collection<ComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
