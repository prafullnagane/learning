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
package de.hybris.platform.core.resource.order.price;

import de.hybris.platform.core.dto.order.price.TaxsDTO;
import de.hybris.platform.core.model.order.price.TaxModel;
import de.hybris.platform.core.resource.order.price.TaxResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Tax defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/taxs")
public class TaxsResource extends AbstractCollectionResource <Collection<TaxModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxsResource()
	{
		super("Tax");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTaxs()
	{
		return createGetResponse().build(TaxsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TaxResource} for current root resource 
	 */
	@Path("{tax}")
	public AbstractYResource getTaxResource(@PathParam("tax")  final String resourceKey)
	{
		final TaxResource  resource  = resourceCtx.getResource(TaxResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TaxModel> getTaxsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTaxsCollection(final Collection<TaxModel> value)
	{
		super.setResourceValue(value);
	}
	
}
