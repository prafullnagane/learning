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
package de.hybris.platform.ldap.resource;

import de.hybris.platform.ldap.dto.LDIFImportJobsDTO;
import de.hybris.platform.ldap.model.LDIFImportJobModel;
import de.hybris.platform.ldap.resource.LDIFImportJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type LDIFImportJob defined at extension ldap Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ldifimportjobs")
public class LDIFImportJobsResource extends AbstractCollectionResource <Collection<LDIFImportJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFImportJobsResource()
	{
		super("LDIFImportJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLDIFImportJobs()
	{
		return createGetResponse().build(LDIFImportJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LDIFImportJobResource} for current root resource 
	 */
	@Path("{ldifimportjob}")
	public AbstractYResource getLDIFImportJobResource(@PathParam("ldifimportjob")  final String resourceKey)
	{
		final LDIFImportJobResource  resource  = resourceCtx.getResource(LDIFImportJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LDIFImportJobModel> getLDIFImportJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLDIFImportJobsCollection(final Collection<LDIFImportJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
