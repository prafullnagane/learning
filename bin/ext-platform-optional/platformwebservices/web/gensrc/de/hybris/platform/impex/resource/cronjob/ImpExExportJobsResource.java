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
package de.hybris.platform.impex.resource.cronjob;

import de.hybris.platform.impex.dto.cronjob.ImpExExportJobsDTO;
import de.hybris.platform.impex.model.cronjob.ImpExExportJobModel;
import de.hybris.platform.impex.resource.cronjob.ImpExExportJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ImpExExportJob defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/impexexportjobs")
public class ImpExExportJobsResource extends AbstractCollectionResource <Collection<ImpExExportJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportJobsResource()
	{
		super("ImpExExportJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllImpExExportJobs()
	{
		return createGetResponse().build(ImpExExportJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImpExExportJobResource} for current root resource 
	 */
	@Path("{impexexportjob}")
	public AbstractYResource getImpExExportJobResource(@PathParam("impexexportjob")  final String resourceKey)
	{
		final ImpExExportJobResource  resource  = resourceCtx.getResource(ImpExExportJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ImpExExportJobModel> getImpExExportJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setImpExExportJobsCollection(final Collection<ImpExExportJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
