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
package de.hybris.platform.acceleratorcms.resource.components;

import de.hybris.platform.acceleratorcms.dto.components.NavigationBarComponentsDTO;
import de.hybris.platform.acceleratorcms.model.components.NavigationBarComponentModel;
import de.hybris.platform.acceleratorcms.resource.components.NavigationBarComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type NavigationBarComponent defined at extension acceleratorcms Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/navigationbarcomponents")
public class NavigationBarComponentsResource extends AbstractCollectionResource <Collection<NavigationBarComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public NavigationBarComponentsResource()
	{
		super("NavigationBarComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllNavigationBarComponents()
	{
		return createGetResponse().build(NavigationBarComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link NavigationBarComponentResource} for current root resource 
	 */
	@Path("{navigationbarcomponent}")
	public AbstractYResource getNavigationBarComponentResource(@PathParam("navigationbarcomponent")  final String resourceKey)
	{
		final NavigationBarComponentResource  resource  = resourceCtx.getResource(NavigationBarComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<NavigationBarComponentModel> getNavigationBarComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setNavigationBarComponentsCollection(final Collection<NavigationBarComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
