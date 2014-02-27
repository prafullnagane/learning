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

import de.hybris.platform.servicelayer.dto.action.AbstractActionsDTO;
import de.hybris.platform.servicelayer.model.action.AbstractActionModel;
import de.hybris.platform.servicelayer.resource.action.AbstractActionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractAction defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractactions")
public class AbstractActionsResource extends AbstractCollectionResource <Collection<AbstractActionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractActionsResource()
	{
		super("AbstractAction");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractActionResource} for current root resource 
	 */
	@Path("{abstractaction}")
	public AbstractYResource getAbstractActionResource(@PathParam("abstractaction")  final String resourceKey)
	{
		final AbstractActionResource  resource  = resourceCtx.getResource(AbstractActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractActionModel> getAbstractActionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractActions()
	{
		return createGetResponse().build(AbstractActionsDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractActionsCollection(final Collection<AbstractActionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
