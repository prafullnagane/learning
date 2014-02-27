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
package de.hybris.platform.basecommerce.resource;

import de.hybris.platform.basecommerce.dto.MultiAddressInMemoryCartsDTO;
import de.hybris.platform.basecommerce.model.MultiAddressInMemoryCartModel;
import de.hybris.platform.basecommerce.resource.MultiAddressInMemoryCartResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type MultiAddressInMemoryCart defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/multiaddressinmemorycarts")
public class MultiAddressInMemoryCartsResource extends AbstractCollectionResource <Collection<MultiAddressInMemoryCartModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MultiAddressInMemoryCartsResource()
	{
		super("MultiAddressInMemoryCart");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllMultiAddressInMemoryCarts()
	{
		return createGetResponse().build(MultiAddressInMemoryCartsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MultiAddressInMemoryCartResource} for current root resource 
	 */
	@Path("{multiaddressinmemorycart}")
	public AbstractYResource getMultiAddressInMemoryCartResource(@PathParam("multiaddressinmemorycart")  final String resourceKey)
	{
		final MultiAddressInMemoryCartResource  resource  = resourceCtx.getResource(MultiAddressInMemoryCartResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<MultiAddressInMemoryCartModel> getMultiAddressInMemoryCartsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setMultiAddressInMemoryCartsCollection(final Collection<MultiAddressInMemoryCartModel> value)
	{
		super.setResourceValue(value);
	}
	
}
