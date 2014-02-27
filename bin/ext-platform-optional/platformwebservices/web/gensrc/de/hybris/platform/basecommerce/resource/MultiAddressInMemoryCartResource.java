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

import de.hybris.platform.basecommerce.dto.MultiAddressInMemoryCartDTO;
import de.hybris.platform.basecommerce.model.MultiAddressInMemoryCartModel;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.core.resource.order.AbstractOrderEntryResource;
import de.hybris.platform.core.resource.order.CartEntryResource;
import de.hybris.platform.core.resource.order.OrderEntryResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.promotions.resource.PromotionResultResource;
import de.hybris.platform.returns.resource.ReplacementOrderEntryResource;
import de.hybris.platform.returns.resource.ReturnOrderEntryResource;
import de.hybris.platform.servicelayer.internal.resource.order.InMemoryCartEntryResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type MultiAddressInMemoryCart first defined at extension basecommerce
 */
@SuppressWarnings("all")
public class MultiAddressInMemoryCartResource extends AbstractYResource<MultiAddressInMemoryCartModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MultiAddressInMemoryCartResource()
	{
		super("MultiAddressInMemoryCart");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteMultiAddressInMemoryCart()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractOrderEntryResource} for current root resource 
	 */
	@Path("/abstractorderentries/{abstractorderentry}")
	public AbstractYResource getAbstractOrderEntryResource(@PathParam("abstractorderentry")  final String resourceKey)
	{
		final AbstractOrderEntryResource  resource  = resourceCtx.getResource(AbstractOrderEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CartEntryResource} for current root resource 
	 */
	@Path("/cartentries/{cartentry}")
	public AbstractYResource getCartEntryResource(@PathParam("cartentry")  final String resourceKey)
	{
		final CartEntryResource  resource  = resourceCtx.getResource(CartEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link InMemoryCartEntryResource} for current root resource 
	 */
	@Path("/inmemorycartentries/{inmemorycartentry}")
	public AbstractYResource getInMemoryCartEntryResource(@PathParam("inmemorycartentry")  final String resourceKey)
	{
		final InMemoryCartEntryResource  resource  = resourceCtx.getResource(InMemoryCartEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getMultiAddressInMemoryCart()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public MultiAddressInMemoryCartModel getMultiAddressInMemoryCartModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link OrderEntryResource} for current root resource 
	 */
	@Path("/orderentries/{orderentry}")
	public AbstractYResource getOrderEntryResource(@PathParam("orderentry")  final String resourceKey)
	{
		final OrderEntryResource  resource  = resourceCtx.getResource(OrderEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionResultResource} for current root resource 
	 */
	@Path("/promotionresults/{promotionresult}")
	public AbstractYResource getPromotionResultResource(@PathParam("promotionresult")  final String resourceKey)
	{
		final PromotionResultResource  resource  = resourceCtx.getResource(PromotionResultResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ReplacementOrderEntryResource} for current root resource 
	 */
	@Path("/replacementorderentries/{replacementorderentry}")
	public AbstractYResource getReplacementOrderEntryResource(@PathParam("replacementorderentry")  final String resourceKey)
	{
		final ReplacementOrderEntryResource  resource  = resourceCtx.getResource(ReplacementOrderEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ReturnOrderEntryResource} for current root resource 
	 */
	@Path("/returnorderentries/{returnorderentry}")
	public AbstractYResource getReturnOrderEntryResource(@PathParam("returnorderentry")  final String resourceKey)
	{
		final ReturnOrderEntryResource  resource  = resourceCtx.getResource(ReturnOrderEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putMultiAddressInMemoryCart(final MultiAddressInMemoryCartDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link MultiAddressInMemoryCartModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected MultiAddressInMemoryCartModel readResource(final String resourceId) throws Exception
	{
		MultiAddressInMemoryCartModel model = new MultiAddressInMemoryCartModel();
		model.setCode(resourceId);
		return (MultiAddressInMemoryCartModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(MultiAddressInMemoryCartModel)}
	 */
	public void setMultiAddressInMemoryCartModel(final MultiAddressInMemoryCartModel value)
	{
		super.setResourceValue(value);
	}
	
}
