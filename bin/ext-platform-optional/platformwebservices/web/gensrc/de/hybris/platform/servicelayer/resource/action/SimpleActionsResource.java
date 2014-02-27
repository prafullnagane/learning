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
package de.hybris.platform.servicelayer.resource.action;

import de.hybris.platform.servicelayer.dto.action.SimpleActionsDTO;
import de.hybris.platform.servicelayer.model.action.SimpleActionModel;
import de.hybris.platform.servicelayer.resource.action.SimpleActionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SimpleAction defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/simpleactions")
public class SimpleActionsResource extends AbstractCollectionResource <Collection<SimpleActionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleActionsResource()
	{
		super("SimpleAction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSimpleActions()
	{
		return createGetResponse().build(SimpleActionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SimpleActionResource} for current root resource 
	 */
	@Path("{simpleaction}")
	public AbstractYResource getSimpleActionResource(@PathParam("simpleaction")  final String resourceKey)
	{
		final SimpleActionResource  resource  = resourceCtx.getResource(SimpleActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SimpleActionModel> getSimpleActionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSimpleActionsCollection(final Collection<SimpleActionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
