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
package de.hybris.platform.basecommerce.resource.site;

import de.hybris.platform.basecommerce.dto.site.BaseSitesDTO;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.basecommerce.resource.site.BaseSiteResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BaseSite defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/basesites")
public class BaseSitesResource extends AbstractCollectionResource <Collection<BaseSiteModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseSitesResource()
	{
		super("BaseSite");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBaseSites()
	{
		return createGetResponse().build(BaseSitesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BaseSiteResource} for current root resource 
	 */
	@Path("{basesite}")
	public AbstractYResource getBaseSiteResource(@PathParam("basesite")  final String resourceKey)
	{
		final BaseSiteResource  resource  = resourceCtx.getResource(BaseSiteResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BaseSiteModel> getBaseSitesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBaseSitesCollection(final Collection<BaseSiteModel> value)
	{
		super.setResourceValue(value);
	}
	
}
