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
package de.hybris.platform.cockpit.resource.template;

import de.hybris.platform.cockpit.dto.template.CockpitItemTemplateDTO;
import de.hybris.platform.cockpit.dto.template.CockpitItemTemplatesDTO;
import de.hybris.platform.cockpit.model.template.CockpitItemTemplateModel;
import de.hybris.platform.cockpit.resource.template.CockpitItemTemplateResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CockpitItemTemplate defined at extension cockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cockpititemtemplates")
public class CockpitItemTemplatesResource extends AbstractCollectionResource <Collection<CockpitItemTemplateModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitItemTemplatesResource()
	{
		super("CockpitItemTemplate");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCockpitItemTemplates()
	{
		return createGetResponse().build(CockpitItemTemplatesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitItemTemplateResource} for current root resource 
	 */
	@Path("{cockpititemtemplate}")
	public AbstractYResource getCockpitItemTemplateResource(@PathParam("cockpititemtemplate")  final String resourceKey)
	{
		final CockpitItemTemplateResource  resource  = resourceCtx.getResource(CockpitItemTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CockpitItemTemplateModel> getCockpitItemTemplatesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCockpitItemTemplate(final CockpitItemTemplateDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCockpitItemTemplatesCollection(final Collection<CockpitItemTemplateModel> value)
	{
		super.setResourceValue(value);
	}
	
}
