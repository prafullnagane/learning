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
package de.hybris.platform.cockpit.resource;

import de.hybris.platform.cockpit.dto.CockpitUIScriptConfigMediasDTO;
import de.hybris.platform.cockpit.model.CockpitUIScriptConfigMediaModel;
import de.hybris.platform.cockpit.resource.CockpitUIScriptConfigMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitUIScriptConfigMedia defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpituiscriptconfigmedias")
public class CockpitUIScriptConfigMediasResource extends AbstractCollectionResource <Collection<CockpitUIScriptConfigMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIScriptConfigMediasResource()
	{
		super("CockpitUIScriptConfigMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitUIScriptConfigMedias()
	{
		return createGetResponse().build(CockpitUIScriptConfigMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitUIScriptConfigMediaResource} for current root resource 
	 */
	@Path("{cockpituiscriptconfigmedia}")
	public AbstractYResource getCockpitUIScriptConfigMediaResource(@PathParam("cockpituiscriptconfigmedia")  final String resourceKey)
	{
		final CockpitUIScriptConfigMediaResource  resource  = resourceCtx.getResource(CockpitUIScriptConfigMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitUIScriptConfigMediaModel> getCockpitUIScriptConfigMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitUIScriptConfigMediasCollection(final Collection<CockpitUIScriptConfigMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
