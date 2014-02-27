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

import de.hybris.platform.impex.dto.cronjob.ImpExExportCronJobsDTO;
import de.hybris.platform.impex.model.cronjob.ImpExExportCronJobModel;
import de.hybris.platform.impex.resource.cronjob.ImpExExportCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ImpExExportCronJob defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/impexexportcronjobs")
public class ImpExExportCronJobsResource extends AbstractCollectionResource <Collection<ImpExExportCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportCronJobsResource()
	{
		super("ImpExExportCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllImpExExportCronJobs()
	{
		return createGetResponse().build(ImpExExportCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImpExExportCronJobResource} for current root resource 
	 */
	@Path("{impexexportcronjob}")
	public AbstractYResource getImpExExportCronJobResource(@PathParam("impexexportcronjob")  final String resourceKey)
	{
		final ImpExExportCronJobResource  resource  = resourceCtx.getResource(ImpExExportCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ImpExExportCronJobModel> getImpExExportCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setImpExExportCronJobsCollection(final Collection<ImpExExportCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
