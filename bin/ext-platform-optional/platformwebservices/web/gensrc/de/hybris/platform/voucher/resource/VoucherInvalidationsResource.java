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

import de.hybris.platform.voucher.dto.VoucherInvalidationDTO;
import de.hybris.platform.voucher.dto.VoucherInvalidationsDTO;
import de.hybris.platform.voucher.model.VoucherInvalidationModel;
import de.hybris.platform.voucher.resource.VoucherInvalidationResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type VoucherInvalidation defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/voucherinvalidations")
public class VoucherInvalidationsResource extends AbstractCollectionResource <Collection<VoucherInvalidationModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VoucherInvalidationsResource()
	{
		super("VoucherInvalidation");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllVoucherInvalidations()
	{
		return createGetResponse().build(VoucherInvalidationsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VoucherInvalidationResource} for current root resource 
	 */
	@Path("{voucherinvalidation}")
	public AbstractYResource getVoucherInvalidationResource(@PathParam("voucherinvalidation")  final String resourceKey)
	{
		final VoucherInvalidationResource  resource  = resourceCtx.getResource(VoucherInvalidationResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<VoucherInvalidationModel> getVoucherInvalidationsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postVoucherInvalidation(final VoucherInvalidationDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setVoucherInvalidationsCollection(final Collection<VoucherInvalidationModel> value)
	{
		super.setResourceValue(value);
	}
	
}
