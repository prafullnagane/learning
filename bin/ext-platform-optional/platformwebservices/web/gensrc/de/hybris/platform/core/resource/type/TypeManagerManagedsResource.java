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

import de.hybris.platform.core.dto.type.TypeManagerManagedDTO;
import de.hybris.platform.core.dto.type.TypeManagerManagedsDTO;
import de.hybris.platform.core.model.type.TypeManagerManagedModel;
import de.hybris.platform.core.resource.type.TypeManagerManagedResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type TypeManagerManaged defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/typemanagermanageds")
public class TypeManagerManagedsResource extends AbstractCollectionResource <Collection<TypeManagerManagedModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TypeManagerManagedsResource()
	{
		super("TypeManagerManaged");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTypeManagerManageds()
	{
		return createGetResponse().build(TypeManagerManagedsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TypeManagerManagedResource} for current root resource 
	 */
	@Path("{typemanagermanaged}")
	public AbstractYResource getTypeManagerManagedResource(@PathParam("typemanagermanaged")  final String resourceKey)
	{
		final TypeManagerManagedResource  resource  = resourceCtx.getResource(TypeManagerManagedResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TypeManagerManagedModel> getTypeManagerManagedsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postTypeManagerManaged(final TypeManagerManagedDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTypeManagerManagedsCollection(final Collection<TypeManagerManagedModel> value)
	{
		super.setResourceValue(value);
	}
	
}
