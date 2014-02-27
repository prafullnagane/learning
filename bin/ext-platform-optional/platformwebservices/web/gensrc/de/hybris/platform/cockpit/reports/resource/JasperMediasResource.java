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
package de.hybris.platform.cockpit.reports.resource;

import de.hybris.platform.cockpit.reports.dto.JasperMediasDTO;
import de.hybris.platform.cockpit.reports.model.JasperMediaModel;
import de.hybris.platform.cockpit.reports.resource.JasperMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type JasperMedia defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/jaspermedias")
public class JasperMediasResource extends AbstractCollectionResource <Collection<JasperMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperMediasResource()
	{
		super("JasperMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllJasperMedias()
	{
		return createGetResponse().build(JasperMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link JasperMediaResource} for current root resource 
	 */
	@Path("{jaspermedia}")
	public AbstractYResource getJasperMediaResource(@PathParam("jaspermedia")  final String resourceKey)
	{
		final JasperMediaResource  resource  = resourceCtx.getResource(JasperMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<JasperMediaModel> getJasperMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setJasperMediasCollection(final Collection<JasperMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
