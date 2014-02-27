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
package de.hybris.platform.promotions.resource;

import de.hybris.platform.core.PK;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.promotions.dto.PromotionResultDTO;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.promotions.resource.AbstractPromotionActionResource;
import de.hybris.platform.promotions.resource.PromotionNullActionResource;
import de.hybris.platform.promotions.resource.PromotionOrderAddFreeGiftActionResource;
import de.hybris.platform.promotions.resource.PromotionOrderAdjustTotalActionResource;
import de.hybris.platform.promotions.resource.PromotionOrderChangeDeliveryModeActionResource;
import de.hybris.platform.promotions.resource.PromotionOrderEntryAdjustActionResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type PromotionResult first defined at extension promotions
 */
@SuppressWarnings("all")
public class PromotionResultResource extends AbstractYResource<PromotionResultModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionResultResource()
	{
		super("PromotionResult");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deletePromotionResult()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractPromotionActionResource} for current root resource 
	 */
	@Path("/abstractpromotionactions/{abstractpromotionaction}")
	public AbstractYResource getAbstractPromotionActionResource(@PathParam("abstractpromotionaction")  final String resourceKey)
	{
		final AbstractPromotionActionResource  resource  = resourceCtx.getResource(AbstractPromotionActionResource.class);
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
	 *  Generated getter for sub resource of type {@link PromotionNullActionResource} for current root resource 
	 */
	@Path("/promotionnullactions/{promotionnullaction}")
	public AbstractYResource getPromotionNullActionResource(@PathParam("promotionnullaction")  final String resourceKey)
	{
		final PromotionNullActionResource  resource  = resourceCtx.getResource(PromotionNullActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderAddFreeGiftActionResource} for current root resource 
	 */
	@Path("/promotionorderaddfreegiftactions/{promotionorderaddfreegiftaction}")
	public AbstractYResource getPromotionOrderAddFreeGiftActionResource(@PathParam("promotionorderaddfreegiftaction")  final String resourceKey)
	{
		final PromotionOrderAddFreeGiftActionResource  resource  = resourceCtx.getResource(PromotionOrderAddFreeGiftActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderAdjustTotalActionResource} for current root resource 
	 */
	@Path("/promotionorderadjusttotalactions/{promotionorderadjusttotalaction}")
	public AbstractYResource getPromotionOrderAdjustTotalActionResource(@PathParam("promotionorderadjusttotalaction")  final String resourceKey)
	{
		final PromotionOrderAdjustTotalActionResource  resource  = resourceCtx.getResource(PromotionOrderAdjustTotalActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderChangeDeliveryModeActionResource} for current root resource 
	 */
	@Path("/promotionorderchangedeliverymodeactions/{promotionorderchangedeliverymodeaction}")
	public AbstractYResource getPromotionOrderChangeDeliveryModeActionResource(@PathParam("promotionorderchangedeliverymodeaction")  final String resourceKey)
	{
		final PromotionOrderChangeDeliveryModeActionResource  resource  = resourceCtx.getResource(PromotionOrderChangeDeliveryModeActionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PromotionOrderEntryAdjustActionResource} for current root resource 
	 */
	@Path("/promotionorderentryadjustactions/{promotionorderentryadjustaction}")
	public AbstractYResource getPromotionOrderEntryAdjustActionResource(@PathParam("promotionorderentryadjustaction")  final String resourceKey)
	{
		final PromotionOrderEntryAdjustActionResource  resource  = resourceCtx.getResource(PromotionOrderEntryAdjustActionResource.class);
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
	public Response getPromotionResult()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public PromotionResultModel getPromotionResultModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putPromotionResult(final PromotionResultDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link PromotionResultModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected PromotionResultModel readResource(final String resourceId) throws Exception
	{
		return serviceLocator.getModelService().get(PK.parse(resourceId));
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(PromotionResultModel)}
	 */
	public void setPromotionResultModel(final PromotionResultModel value)
	{
		super.setResourceValue(value);
	}
	
}
