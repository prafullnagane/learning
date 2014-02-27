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

import de.hybris.platform.core.dto.type.AtomicTypesDTO;
import de.hybris.platform.core.model.type.AtomicTypeModel;
import de.hybris.platform.core.resource.type.AtomicTypeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AtomicType defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/atomictypes")
public class AtomicTypesResource extends AbstractCollectionResource <Collection<AtomicTypeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AtomicTypesResource()
	{
		super("AtomicType");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAtomicTypes()
	{
		return createGetResponse().build(AtomicTypesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AtomicTypeResource} for current root resource 
	 */
	@Path("{atomictype}")
	public AbstractYResource getAtomicTypeResource(@PathParam("atomictype")  final String resourceKey)
	{
		final AtomicTypeResource  resource  = resourceCtx.getResource(AtomicTypeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AtomicTypeModel> getAtomicTypesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAtomicTypesCollection(final Collection<AtomicTypeModel> value)
	{
		super.setResourceValue(value);
	}
	
}