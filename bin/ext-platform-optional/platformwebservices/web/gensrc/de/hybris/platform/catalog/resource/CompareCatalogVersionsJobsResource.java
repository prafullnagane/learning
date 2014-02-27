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

import de.hybris.platform.catalog.dto.CompareCatalogVersionsJobsDTO;
import de.hybris.platform.catalog.model.CompareCatalogVersionsJobModel;
import de.hybris.platform.catalog.resource.CompareCatalogVersionsJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CompareCatalogVersionsJob defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/comparecatalogversionsjobs")
public class CompareCatalogVersionsJobsResource extends AbstractCollectionResource <Collection<CompareCatalogVersionsJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompareCatalogVersionsJobsResource()
	{
		super("CompareCatalogVersionsJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCompareCatalogVersionsJobs()
	{
		return createGetResponse().build(CompareCatalogVersionsJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CompareCatalogVersionsJobResource} for current root resource 
	 */
	@Path("{comparecatalogversionsjob}")
	public AbstractYResource getCompareCatalogVersionsJobResource(@PathParam("comparecatalogversionsjob")  final String resourceKey)
	{
		final CompareCatalogVersionsJobResource  resource  = resourceCtx.getResource(CompareCatalogVersionsJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CompareCatalogVersionsJobModel> getCompareCatalogVersionsJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCompareCatalogVersionsJobsCollection(final Collection<CompareCatalogVersionsJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
