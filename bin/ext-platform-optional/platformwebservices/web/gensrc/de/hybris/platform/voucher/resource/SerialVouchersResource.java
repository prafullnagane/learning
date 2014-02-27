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

import de.hybris.platform.voucher.dto.SerialVouchersDTO;
import de.hybris.platform.voucher.model.SerialVoucherModel;
import de.hybris.platform.voucher.resource.SerialVoucherResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SerialVoucher defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/serialvouchers")
public class SerialVouchersResource extends AbstractCollectionResource <Collection<SerialVoucherModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SerialVouchersResource()
	{
		super("SerialVoucher");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSerialVouchers()
	{
		return createGetResponse().build(SerialVouchersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SerialVoucherResource} for current root resource 
	 */
	@Path("{serialvoucher}")
	public AbstractYResource getSerialVoucherResource(@PathParam("serialvoucher")  final String resourceKey)
	{
		final SerialVoucherResource  resource  = resourceCtx.getResource(SerialVoucherResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SerialVoucherModel> getSerialVouchersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSerialVouchersCollection(final Collection<SerialVoucherModel> value)
	{
		super.setResourceValue(value);
	}
	
}
