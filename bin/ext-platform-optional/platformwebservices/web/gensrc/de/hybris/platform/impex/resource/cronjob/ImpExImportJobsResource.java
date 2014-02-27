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

import de.hybris.platform.impex.dto.cronjob.ImpExImportJobsDTO;
import de.hybris.platform.impex.model.cronjob.ImpExImportJobModel;
import de.hybris.platform.impex.resource.cronjob.ImpExImportJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ImpExImportJob defined at extension impex Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/impeximportjobs")
public class ImpExImportJobsResource extends AbstractCollectionResource <Collection<ImpExImportJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportJobsResource()
	{
		super("ImpExImportJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllImpExImportJobs()
	{
		return createGetResponse().build(ImpExImportJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImpExImportJobResource} for current root resource 
	 */
	@Path("{impeximportjob}")
	public AbstractYResource getImpExImportJobResource(@PathParam("impeximportjob")  final String resourceKey)
	{
		final ImpExImportJobResource  resource  = resourceCtx.getResource(ImpExImportJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ImpExImportJobModel> getImpExImportJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setImpExImportJobsCollection(final Collection<ImpExImportJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
