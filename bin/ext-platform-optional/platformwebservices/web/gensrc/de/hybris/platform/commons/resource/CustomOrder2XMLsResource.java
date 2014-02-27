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
package de.hybris.platform.commons.resource;

import de.hybris.platform.commons.dto.CustomOrder2XMLsDTO;
import de.hybris.platform.commons.model.CustomOrder2XMLModel;
import de.hybris.platform.commons.resource.CustomOrder2XMLResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CustomOrder2XML defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/customorder2xmls")
public class CustomOrder2XMLsResource extends AbstractCollectionResource <Collection<CustomOrder2XMLModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomOrder2XMLsResource()
	{
		super("CustomOrder2XML");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCustomOrder2XMLs()
	{
		return createGetResponse().build(CustomOrder2XMLsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CustomOrder2XMLResource} for current root resource 
	 */
	@Path("{customorder2xml}")
	public AbstractYResource getCustomOrder2XMLResource(@PathParam("customorder2xml")  final String resourceKey)
	{
		final CustomOrder2XMLResource  resource  = resourceCtx.getResource(CustomOrder2XMLResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CustomOrder2XMLModel> getCustomOrder2XMLsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCustomOrder2XMLsCollection(final Collection<CustomOrder2XMLModel> value)
	{
		super.setResourceValue(value);
	}
	
}
