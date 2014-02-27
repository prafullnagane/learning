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

import de.hybris.platform.voucher.dto.PromotionVouchersDTO;
import de.hybris.platform.voucher.model.PromotionVoucherModel;
import de.hybris.platform.voucher.resource.PromotionVoucherResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PromotionVoucher defined at extension voucher Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/promotionvouchers")
public class PromotionVouchersResource extends AbstractCollectionResource <Collection<PromotionVoucherModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionVouchersResource()
	{
		super("PromotionVoucher");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPromotionVouchers()
	{
		return createGetResponse().build(PromotionVouchersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionVoucherResource} for current root resource 
	 */
	@Path("{promotionvoucher}")
	public AbstractYResource getPromotionVoucherResource(@PathParam("promotionvoucher")  final String resourceKey)
	{
		final PromotionVoucherResource  resource  = resourceCtx.getResource(PromotionVoucherResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PromotionVoucherModel> getPromotionVouchersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPromotionVouchersCollection(final Collection<PromotionVoucherModel> value)
	{
		super.setResourceValue(value);
	}
	
}
