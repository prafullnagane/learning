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

import de.hybris.platform.ldap.dto.LDIFGroupImportCronJobsDTO;
import de.hybris.platform.ldap.model.LDIFGroupImportCronJobModel;
import de.hybris.platform.ldap.resource.LDIFGroupImportCronJobResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type LDIFGroupImportCronJob defined at extension ldap Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ldifgroupimportcronjobs")
public class LDIFGroupImportCronJobsResource extends AbstractCollectionResource <Collection<LDIFGroupImportCronJobModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFGroupImportCronJobsResource()
	{
		super("LDIFGroupImportCronJob");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLDIFGroupImportCronJobs()
	{
		return createGetResponse().build(LDIFGroupImportCronJobsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LDIFGroupImportCronJobResource} for current root resource 
	 */
	@Path("{ldifgroupimportcronjob}")
	public AbstractYResource getLDIFGroupImportCronJobResource(@PathParam("ldifgroupimportcronjob")  final String resourceKey)
	{
		final LDIFGroupImportCronJobResource  resource  = resourceCtx.getResource(LDIFGroupImportCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LDIFGroupImportCronJobModel> getLDIFGroupImportCronJobsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLDIFGroupImportCronJobsCollection(final Collection<LDIFGroupImportCronJobModel> value)
	{
		super.setResourceValue(value);
	}
	
}
