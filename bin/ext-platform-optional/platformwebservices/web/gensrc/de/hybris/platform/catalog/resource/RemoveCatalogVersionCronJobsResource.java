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

import de.hybris.platform.catalog.dto.RemoveCatalogVersionCronJobsDTO;
import de.hybris.platform.catalog.model.RemoveCatalogVersionCronJobModel;
import de.hybris.platform.catalog.resource.RemoveCatalogVersionCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RemoveCatalogVersionCronJob defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/removecatalogversioncronjobs")
public class RemoveCatalogVersionCronJobsResource extends AbstractCollectionResource <Collection<RemoveCatalogVersionCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveCatalogVersionCronJobsResource()
	{
		super("RemoveCatalogVersionCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRemoveCatalogVersionCronJobs()
	{
		return createGetResponse().build(RemoveCatalogVersionCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RemoveCatalogVersionCronJobResource} for current root resource 
	 */
	@Path("{removecatalogversioncronjob}")
	public AbstractYResource getRemoveCatalogVersionCronJobResource(@PathParam("removecatalogversioncronjob")  final String resourceKey)
	{
		final RemoveCatalogVersionCronJobResource  resource  = resourceCtx.getResource(RemoveCatalogVersionCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RemoveCatalogVersionCronJobModel> getRemoveCatalogVersionCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRemoveCatalogVersionCronJobsCollection(final Collection<RemoveCatalogVersionCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
