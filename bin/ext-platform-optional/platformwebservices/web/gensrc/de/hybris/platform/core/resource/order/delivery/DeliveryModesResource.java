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
package de.hybris.platform.core.resource.order.delivery;

import de.hybris.platform.core.dto.order.delivery.DeliveryModesDTO;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.resource.order.delivery.DeliveryModeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DeliveryMode defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/deliverymodes")
public class DeliveryModesResource extends AbstractCollectionResource <Collection<DeliveryModeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeliveryModesResource()
	{
		super("DeliveryMode");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDeliveryModes()
	{
		return createGetResponse().build(DeliveryModesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DeliveryModeResource} for current root resource 
	 */
	@Path("{deliverymode}")
	public AbstractYResource getDeliveryModeResource(@PathParam("deliverymode")  final String resourceKey)
	{
		final DeliveryModeResource  resource  = resourceCtx.getResource(DeliveryModeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DeliveryModeModel> getDeliveryModesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDeliveryModesCollection(final Collection<DeliveryModeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
