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
package de.hybris.platform.commons.resource.translator;

import de.hybris.platform.commons.dto.translator.JaloVelocityRenderersDTO;
import de.hybris.platform.commons.model.translator.JaloVelocityRendererModel;
import de.hybris.platform.commons.resource.translator.JaloVelocityRendererResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type JaloVelocityRenderer defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/jalovelocityrenderers")
public class JaloVelocityRenderersResource extends AbstractCollectionResource <Collection<JaloVelocityRendererModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JaloVelocityRenderersResource()
	{
		super("JaloVelocityRenderer");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllJaloVelocityRenderers()
	{
		return createGetResponse().build(JaloVelocityRenderersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link JaloVelocityRendererResource} for current root resource 
	 */
	@Path("{jalovelocityrenderer}")
	public AbstractYResource getJaloVelocityRendererResource(@PathParam("jalovelocityrenderer")  final String resourceKey)
	{
		final JaloVelocityRendererResource  resource  = resourceCtx.getResource(JaloVelocityRendererResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<JaloVelocityRendererModel> getJaloVelocityRenderersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setJaloVelocityRenderersCollection(final Collection<JaloVelocityRendererModel> value)
	{
		super.setResourceValue(value);
	}
	
}
