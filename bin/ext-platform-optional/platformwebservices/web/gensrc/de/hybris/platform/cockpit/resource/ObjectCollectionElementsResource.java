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

import de.hybris.platform.cockpit.dto.ObjectCollectionElementDTO;
import de.hybris.platform.cockpit.dto.ObjectCollectionElementsDTO;
import de.hybris.platform.cockpit.model.ObjectCollectionElementModel;
import de.hybris.platform.cockpit.resource.ObjectCollectionElementResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ObjectCollectionElement defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/objectcollectionelements")
public class ObjectCollectionElementsResource extends AbstractCollectionResource <Collection<ObjectCollectionElementModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ObjectCollectionElementsResource()
	{
		super("ObjectCollectionElement");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllObjectCollectionElements()
	{
		return createGetResponse().build(ObjectCollectionElementsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ObjectCollectionElementResource} for current root resource 
	 */
	@Path("{objectcollectionelement}")
	public AbstractYResource getObjectCollectionElementResource(@PathParam("objectcollectionelement")  final String resourceKey)
	{
		final ObjectCollectionElementResource  resource  = resourceCtx.getResource(ObjectCollectionElementResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ObjectCollectionElementModel> getObjectCollectionElementsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postObjectCollectionElement(final ObjectCollectionElementDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setObjectCollectionElementsCollection(final Collection<ObjectCollectionElementModel> value)
	{
		super.setResourceValue(value);
	}
	
}
