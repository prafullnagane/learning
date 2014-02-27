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
package de.hybris.platform.cronjob.resource;

import de.hybris.platform.cronjob.dto.ChangeDescriptorDTO;
import de.hybris.platform.cronjob.dto.ChangeDescriptorsDTO;
import de.hybris.platform.cronjob.model.ChangeDescriptorModel;
import de.hybris.platform.cronjob.resource.ChangeDescriptorResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ChangeDescriptor defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/changedescriptors")
public class ChangeDescriptorsResource extends AbstractCollectionResource <Collection<ChangeDescriptorModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ChangeDescriptorsResource()
	{
		super("ChangeDescriptor");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllChangeDescriptors()
	{
		return createGetResponse().build(ChangeDescriptorsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ChangeDescriptorResource} for current root resource 
	 */
	@Path("{changedescriptor}")
	public AbstractYResource getChangeDescriptorResource(@PathParam("changedescriptor")  final String resourceKey)
	{
		final ChangeDescriptorResource  resource  = resourceCtx.getResource(ChangeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ChangeDescriptorModel> getChangeDescriptorsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postChangeDescriptor(final ChangeDescriptorDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setChangeDescriptorsCollection(final Collection<ChangeDescriptorModel> value)
	{
		super.setResourceValue(value);
	}
	
}
