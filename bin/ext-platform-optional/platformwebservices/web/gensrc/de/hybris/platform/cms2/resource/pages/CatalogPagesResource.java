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
package de.hybris.platform.cms2.resource.pages;

import de.hybris.platform.cms2.dto.pages.CatalogPagesDTO;
import de.hybris.platform.cms2.model.pages.CatalogPageModel;
import de.hybris.platform.cms2.resource.pages.CatalogPageResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CatalogPage defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/catalogpages")
public class CatalogPagesResource extends AbstractCollectionResource <Collection<CatalogPageModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogPagesResource()
	{
		super("CatalogPage");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCatalogPages()
	{
		return createGetResponse().build(CatalogPagesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogPageResource} for current root resource 
	 */
	@Path("{catalogpage}")
	public AbstractYResource getCatalogPageResource(@PathParam("catalogpage")  final String resourceKey)
	{
		final CatalogPageResource  resource  = resourceCtx.getResource(CatalogPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CatalogPageModel> getCatalogPagesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCatalogPagesCollection(final Collection<CatalogPageModel> value)
	{
		super.setResourceValue(value);
	}
	
}
