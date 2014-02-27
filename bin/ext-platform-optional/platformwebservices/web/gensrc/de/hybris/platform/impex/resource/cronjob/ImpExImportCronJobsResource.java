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

import de.hybris.platform.impex.dto.cronjob.ImpExImportCronJobsDTO;
import de.hybris.platform.impex.model.cronjob.ImpExImportCronJobModel;
import de.hybris.platform.impex.resource.cronjob.ImpExImportCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ImpExImportCronJob defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/impeximportcronjobs")
public class ImpExImportCronJobsResource extends AbstractCollectionResource <Collection<ImpExImportCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportCronJobsResource()
	{
		super("ImpExImportCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllImpExImportCronJobs()
	{
		return createGetResponse().build(ImpExImportCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImpExImportCronJobResource} for current root resource 
	 */
	@Path("{impeximportcronjob}")
	public AbstractYResource getImpExImportCronJobResource(@PathParam("impeximportcronjob")  final String resourceKey)
	{
		final ImpExImportCronJobResource  resource  = resourceCtx.getResource(ImpExImportCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ImpExImportCronJobModel> getImpExImportCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setImpExImportCronJobsCollection(final Collection<ImpExImportCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
