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

import de.hybris.platform.core.dto.type.DescriptorsDTO;
import de.hybris.platform.core.model.type.DescriptorModel;
import de.hybris.platform.core.resource.type.DescriptorResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Descriptor defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/descriptors")
public class DescriptorsResource extends AbstractCollectionResource <Collection<DescriptorModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DescriptorsResource()
	{
		super("Descriptor");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDescriptors()
	{
		return createGetResponse().build(DescriptorsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DescriptorResource} for current root resource 
	 */
	@Path("{descriptor}")
	public AbstractYResource getDescriptorResource(@PathParam("descriptor")  final String resourceKey)
	{
		final DescriptorResource  resource  = resourceCtx.getResource(DescriptorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DescriptorModel> getDescriptorsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDescriptorsCollection(final Collection<DescriptorModel> value)
	{
		super.setResourceValue(value);
	}
	
}
