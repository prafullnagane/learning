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

import de.hybris.platform.promotions.dto.AbstractPromotionDTO;
import de.hybris.platform.promotions.dto.AbstractPromotionsDTO;
import de.hybris.platform.promotions.model.AbstractPromotionModel;
import de.hybris.platform.promotions.resource.AbstractPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractPromotion defined at extension promotions Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractpromotions")
public class AbstractPromotionsResource extends AbstractCollectionResource <Collection<AbstractPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractPromotionsResource()
	{
		super("AbstractPromotion");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractPromotionResource} for current root resource 
	 */
	@Path("{abstractpromotion}")
	public AbstractYResource getAbstractPromotionResource(@PathParam("abstractpromotion")  final String resourceKey)
	{
		final AbstractPromotionResource  resource  = resourceCtx.getResource(AbstractPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractPromotionModel> getAbstractPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractPromotions()
	{
		return createGetResponse().build(AbstractPromotionsDTO.class);
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAbstractPromotion(final AbstractPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractPromotionsCollection(final Collection<AbstractPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
