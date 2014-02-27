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
package de.hybris.platform.admincockpit.resource.cronjob;

import de.hybris.platform.admincockpit.dto.cronjob.RemoveOrphanedFilesCronJobsDTO;
import de.hybris.platform.admincockpit.model.cronjob.RemoveOrphanedFilesCronJobModel;
import de.hybris.platform.admincockpit.resource.cronjob.RemoveOrphanedFilesCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type RemoveOrphanedFilesCronJob defined at extension admincockpit Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/removeorphanedfilescronjobs")
public class RemoveOrphanedFilesCronJobsResource extends AbstractCollectionResource <Collection<RemoveOrphanedFilesCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveOrphanedFilesCronJobsResource()
	{
		super("RemoveOrphanedFilesCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllRemoveOrphanedFilesCronJobs()
	{
		return createGetResponse().build(RemoveOrphanedFilesCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RemoveOrphanedFilesCronJobResource} for current root resource 
	 */
	@Path("{removeorphanedfilescronjob}")
	public AbstractYResource getRemoveOrphanedFilesCronJobResource(@PathParam("removeorphanedfilescronjob")  final String resourceKey)
	{
		final RemoveOrphanedFilesCronJobResource  resource  = resourceCtx.getResource(RemoveOrphanedFilesCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<RemoveOrphanedFilesCronJobModel> getRemoveOrphanedFilesCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setRemoveOrphanedFilesCronJobsCollection(final Collection<RemoveOrphanedFilesCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
