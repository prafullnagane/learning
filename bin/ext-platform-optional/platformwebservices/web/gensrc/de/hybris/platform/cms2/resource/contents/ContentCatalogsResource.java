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
package de.hybris.platform.cms2.resource.contents;

import de.hybris.platform.cms2.dto.contents.ContentCatalogsDTO;
import de.hybris.platform.cms2.model.contents.ContentCatalogModel;
import de.hybris.platform.cms2.resource.contents.ContentCatalogResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ContentCatalog defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/contentcatalogs")
public class ContentCatalogsResource extends AbstractCollectionResource <Collection<ContentCatalogModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentCatalogsResource()
	{
		super("ContentCatalog");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllContentCatalogs()
	{
		return createGetResponse().build(ContentCatalogsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ContentCatalogResource} for current root resource 
	 */
	@Path("{contentcatalog}")
	public AbstractYResource getContentCatalogResource(@PathParam("contentcatalog")  final String resourceKey)
	{
		final ContentCatalogResource  resource  = resourceCtx.getResource(ContentCatalogResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ContentCatalogModel> getContentCatalogsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setContentCatalogsCollection(final Collection<ContentCatalogModel> value)
	{
		super.setResourceValue(value);
	}
	
}
