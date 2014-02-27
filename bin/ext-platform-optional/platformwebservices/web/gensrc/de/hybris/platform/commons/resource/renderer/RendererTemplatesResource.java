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
package de.hybris.platform.commons.resource.renderer;

import de.hybris.platform.commons.dto.renderer.RendererTemplatesDTO;
import de.hybris.platform.commons.model.renderer.RendererTemplateModel;
import de.hybris.platform.commons.resource.renderer.RendererTemplateResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RendererTemplate defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/renderertemplates")
public class RendererTemplatesResource extends AbstractCollectionResource <Collection<RendererTemplateModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RendererTemplatesResource()
	{
		super("RendererTemplate");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRendererTemplates()
	{
		return createGetResponse().build(RendererTemplatesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RendererTemplateResource} for current root resource 
	 */
	@Path("{renderertemplate}")
	public AbstractYResource getRendererTemplateResource(@PathParam("renderertemplate")  final String resourceKey)
	{
		final RendererTemplateResource  resource  = resourceCtx.getResource(RendererTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RendererTemplateModel> getRendererTemplatesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRendererTemplatesCollection(final Collection<RendererTemplateModel> value)
	{
		super.setResourceValue(value);
	}
	
}
