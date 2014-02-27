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
package de.hybris.platform.impex.resource.exp;

import de.hybris.platform.impex.dto.exp.HeaderLibrariesDTO;
import de.hybris.platform.impex.model.exp.HeaderLibraryModel;
import de.hybris.platform.impex.resource.exp.HeaderLibraryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type HeaderLibrary defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/headerlibraries")
public class HeaderLibrariesResource extends AbstractCollectionResource <Collection<HeaderLibraryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HeaderLibrariesResource()
	{
		super("HeaderLibrary");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllHeaderLibraries()
	{
		return createGetResponse().build(HeaderLibrariesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<HeaderLibraryModel> getHeaderLibrariesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HeaderLibraryResource} for current root resource 
	 */
	@Path("{headerlibrary}")
	public AbstractYResource getHeaderLibraryResource(@PathParam("headerlibrary")  final String resourceKey)
	{
		final HeaderLibraryResource  resource  = resourceCtx.getResource(HeaderLibraryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setHeaderLibrariesCollection(final Collection<HeaderLibraryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
