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
package de.hybris.platform.acceleratorservices.resource.promotions;

import de.hybris.platform.acceleratorservices.dto.promotions.AcceleratorProductBOGOFPromotionDTO;
import de.hybris.platform.acceleratorservices.dto.promotions.AcceleratorProductBOGOFPromotionsDTO;
import de.hybris.platform.acceleratorservices.model.promotions.AcceleratorProductBOGOFPromotionModel;
import de.hybris.platform.acceleratorservices.resource.promotions.AcceleratorProductBOGOFPromotionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AcceleratorProductBOGOFPromotion defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/acceleratorproductbogofpromotions")
public class AcceleratorProductBOGOFPromotionsResource extends AbstractCollectionResource <Collection<AcceleratorProductBOGOFPromotionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AcceleratorProductBOGOFPromotionsResource()
	{
		super("AcceleratorProductBOGOFPromotion");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AcceleratorProductBOGOFPromotionResource} for current root resource 
	 */
	@Path("{acceleratorproductbogofpromotion}")
	public AbstractYResource getAcceleratorProductBOGOFPromotionResource(@PathParam("acceleratorproductbogofpromotion")  final String resourceKey)
	{
		final AcceleratorProductBOGOFPromotionResource  resource  = resourceCtx.getResource(AcceleratorProductBOGOFPromotionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AcceleratorProductBOGOFPromotionModel> getAcceleratorProductBOGOFPromotionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAcceleratorProductBOGOFPromotions()
	{
		return createGetResponse().build(AcceleratorProductBOGOFPromotionsDTO.class);
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAcceleratorProductBOGOFPromotion(final AcceleratorProductBOGOFPromotionDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAcceleratorProductBOGOFPromotionsCollection(final Collection<AcceleratorProductBOGOFPromotionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
