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

import de.hybris.platform.core.dto.type.ViewAttributeDescriptorsDTO;
import de.hybris.platform.core.model.type.ViewAttributeDescriptorModel;
import de.hybris.platform.core.resource.type.ViewAttributeDescriptorResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ViewAttributeDescriptor defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/viewattributedescriptors")
public class ViewAttributeDescriptorsResource extends AbstractCollectionResource <Collection<ViewAttributeDescriptorModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ViewAttributeDescriptorsResource()
	{
		super("ViewAttributeDescriptor");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllViewAttributeDescriptors()
	{
		return createGetResponse().build(ViewAttributeDescriptorsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ViewAttributeDescriptorResource} for current root resource 
	 */
	@Path("{viewattributedescriptor}")
	public AbstractYResource getViewAttributeDescriptorResource(@PathParam("viewattributedescriptor")  final String resourceKey)
	{
		final ViewAttributeDescriptorResource  resource  = resourceCtx.getResource(ViewAttributeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ViewAttributeDescriptorModel> getViewAttributeDescriptorsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setViewAttributeDescriptorsCollection(final Collection<ViewAttributeDescriptorModel> value)
	{
		super.setResourceValue(value);
	}
	
}
