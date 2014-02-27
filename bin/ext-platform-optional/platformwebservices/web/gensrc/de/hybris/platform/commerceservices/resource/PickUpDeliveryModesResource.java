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
package de.hybris.platform.commerceservices.resource;

import de.hybris.platform.commerceservices.dto.PickUpDeliveryModesDTO;
import de.hybris.platform.commerceservices.model.PickUpDeliveryModeModel;
import de.hybris.platform.commerceservices.resource.PickUpDeliveryModeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type PickUpDeliveryMode defined at extension commerceservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/pickupdeliverymodes")
public class PickUpDeliveryModesResource extends AbstractCollectionResource <Collection<PickUpDeliveryModeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PickUpDeliveryModesResource()
	{
		super("PickUpDeliveryMode");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPickUpDeliveryModes()
	{
		return createGetResponse().build(PickUpDeliveryModesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PickUpDeliveryModeResource} for current root resource 
	 */
	@Path("{pickupdeliverymode}")
	public AbstractYResource getPickUpDeliveryModeResource(@PathParam("pickupdeliverymode")  final String resourceKey)
	{
		final PickUpDeliveryModeResource  resource  = resourceCtx.getResource(PickUpDeliveryModeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PickUpDeliveryModeModel> getPickUpDeliveryModesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPickUpDeliveryModesCollection(final Collection<PickUpDeliveryModeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
