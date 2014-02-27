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
package de.hybris.platform.catalog.resource;

import de.hybris.platform.catalog.dto.CatalogUnawareMediasDTO;
import de.hybris.platform.catalog.model.CatalogUnawareMediaModel;
import de.hybris.platform.catalog.resource.CatalogUnawareMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CatalogUnawareMedia defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/catalogunawaremedias")
public class CatalogUnawareMediasResource extends AbstractCollectionResource <Collection<CatalogUnawareMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogUnawareMediasResource()
	{
		super("CatalogUnawareMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCatalogUnawareMedias()
	{
		return createGetResponse().build(CatalogUnawareMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogUnawareMediaResource} for current root resource 
	 */
	@Path("{catalogunawaremedia}")
	public AbstractYResource getCatalogUnawareMediaResource(@PathParam("catalogunawaremedia")  final String resourceKey)
	{
		final CatalogUnawareMediaResource  resource  = resourceCtx.getResource(CatalogUnawareMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CatalogUnawareMediaModel> getCatalogUnawareMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCatalogUnawareMediasCollection(final Collection<CatalogUnawareMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
