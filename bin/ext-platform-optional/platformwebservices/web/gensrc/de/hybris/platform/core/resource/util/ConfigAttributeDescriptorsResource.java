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
package de.hybris.platform.core.resource.util;

import de.hybris.platform.core.dto.util.ConfigAttributeDescriptorsDTO;
import de.hybris.platform.core.model.util.ConfigAttributeDescriptorModel;
import de.hybris.platform.core.resource.util.ConfigAttributeDescriptorResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ConfigAttributeDescriptor defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/configattributedescriptors")
public class ConfigAttributeDescriptorsResource extends AbstractCollectionResource <Collection<ConfigAttributeDescriptorModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigAttributeDescriptorsResource()
	{
		super("ConfigAttributeDescriptor");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllConfigAttributeDescriptors()
	{
		return createGetResponse().build(ConfigAttributeDescriptorsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ConfigAttributeDescriptorResource} for current root resource 
	 */
	@Path("{configattributedescriptor}")
	public AbstractYResource getConfigAttributeDescriptorResource(@PathParam("configattributedescriptor")  final String resourceKey)
	{
		final ConfigAttributeDescriptorResource  resource  = resourceCtx.getResource(ConfigAttributeDescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ConfigAttributeDescriptorModel> getConfigAttributeDescriptorsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setConfigAttributeDescriptorsCollection(final Collection<ConfigAttributeDescriptorModel> value)
	{
		super.setResourceValue(value);
	}
	
}
