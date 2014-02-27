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
package de.hybris.platform.acceleratorservices.resource.export;

import de.hybris.platform.acceleratorservices.dto.export.ExportDataCronJobsDTO;
import de.hybris.platform.acceleratorservices.model.export.ExportDataCronJobModel;
import de.hybris.platform.acceleratorservices.resource.export.ExportDataCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ExportDataCronJob defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/exportdatacronjobs")
public class ExportDataCronJobsResource extends AbstractCollectionResource <Collection<ExportDataCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataCronJobsResource()
	{
		super("ExportDataCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllExportDataCronJobs()
	{
		return createGetResponse().build(ExportDataCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ExportDataCronJobResource} for current root resource 
	 */
	@Path("{exportdatacronjob}")
	public AbstractYResource getExportDataCronJobResource(@PathParam("exportdatacronjob")  final String resourceKey)
	{
		final ExportDataCronJobResource  resource  = resourceCtx.getResource(ExportDataCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ExportDataCronJobModel> getExportDataCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setExportDataCronJobsCollection(final Collection<ExportDataCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
