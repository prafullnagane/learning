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
package de.hybris.platform.cms2.resource.contents.components;

import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentsDTO;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.cms2.resource.contents.components.SimpleCMSComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SimpleCMSComponent defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/simplecmscomponents")
public class SimpleCMSComponentsResource extends AbstractCollectionResource <Collection<SimpleCMSComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleCMSComponentsResource()
	{
		super("SimpleCMSComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSimpleCMSComponents()
	{
		return createGetResponse().build(SimpleCMSComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SimpleCMSComponentResource} for current root resource 
	 */
	@Path("{simplecmscomponent}")
	public AbstractYResource getSimpleCMSComponentResource(@PathParam("simplecmscomponent")  final String resourceKey)
	{
		final SimpleCMSComponentResource  resource  = resourceCtx.getResource(SimpleCMSComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SimpleCMSComponentModel> getSimpleCMSComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSimpleCMSComponentsCollection(final Collection<SimpleCMSComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
