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
package de.hybris.platform.deliveryzone.resource;

import de.hybris.platform.deliveryzone.dto.ZoneDeliveryModesDTO;
import de.hybris.platform.deliveryzone.model.ZoneDeliveryModeModel;
import de.hybris.platform.deliveryzone.resource.ZoneDeliveryModeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ZoneDeliveryMode defined at extension deliveryzone Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/zonedeliverymodes")
public class ZoneDeliveryModesResource extends AbstractCollectionResource <Collection<ZoneDeliveryModeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ZoneDeliveryModesResource()
	{
		super("ZoneDeliveryMode");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllZoneDeliveryModes()
	{
		return createGetResponse().build(ZoneDeliveryModesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ZoneDeliveryModeResource} for current root resource 
	 */
	@Path("{zonedeliverymode}")
	public AbstractYResource getZoneDeliveryModeResource(@PathParam("zonedeliverymode")  final String resourceKey)
	{
		final ZoneDeliveryModeResource  resource  = resourceCtx.getResource(ZoneDeliveryModeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ZoneDeliveryModeModel> getZoneDeliveryModesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setZoneDeliveryModesCollection(final Collection<ZoneDeliveryModeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
