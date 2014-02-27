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
package de.hybris.platform.voucher.resource;

import de.hybris.platform.voucher.dto.RegularCustomerOrderTotalRestrictionDTO;
import de.hybris.platform.voucher.dto.RegularCustomerOrderTotalRestrictionsDTO;
import de.hybris.platform.voucher.model.RegularCustomerOrderTotalRestrictionModel;
import de.hybris.platform.voucher.resource.RegularCustomerOrderTotalRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RegularCustomerOrderTotalRestriction defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/regularcustomerordertotalrestrictions")
public class RegularCustomerOrderTotalRestrictionsResource extends AbstractCollectionResource <Collection<RegularCustomerOrderTotalRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegularCustomerOrderTotalRestrictionsResource()
	{
		super("RegularCustomerOrderTotalRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRegularCustomerOrderTotalRestrictions()
	{
		return createGetResponse().build(RegularCustomerOrderTotalRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RegularCustomerOrderTotalRestrictionResource} for current root resource 
	 */
	@Path("{regularcustomerordertotalrestriction}")
	public AbstractYResource getRegularCustomerOrderTotalRestrictionResource(@PathParam("regularcustomerordertotalrestriction")  final String resourceKey)
	{
		final RegularCustomerOrderTotalRestrictionResource  resource  = resourceCtx.getResource(RegularCustomerOrderTotalRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RegularCustomerOrderTotalRestrictionModel> getRegularCustomerOrderTotalRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postRegularCustomerOrderTotalRestriction(final RegularCustomerOrderTotalRestrictionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRegularCustomerOrderTotalRestrictionsCollection(final Collection<RegularCustomerOrderTotalRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
