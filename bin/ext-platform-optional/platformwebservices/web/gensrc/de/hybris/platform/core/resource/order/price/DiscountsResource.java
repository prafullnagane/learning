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

import de.hybris.platform.core.dto.order.price.DiscountsDTO;
import de.hybris.platform.core.model.order.price.DiscountModel;
import de.hybris.platform.core.resource.order.price.DiscountResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Discount defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/discounts")
public class DiscountsResource extends AbstractCollectionResource <Collection<DiscountModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountsResource()
	{
		super("Discount");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDiscounts()
	{
		return createGetResponse().build(DiscountsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DiscountResource} for current root resource 
	 */
	@Path("{discount}")
	public AbstractYResource getDiscountResource(@PathParam("discount")  final String resourceKey)
	{
		final DiscountResource  resource  = resourceCtx.getResource(DiscountResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DiscountModel> getDiscountsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDiscountsCollection(final Collection<DiscountModel> value)
	{
		super.setResourceValue(value);
	}
	
}
