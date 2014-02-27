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
package de.hybris.platform.cronjob.resource;

import de.hybris.platform.cronjob.dto.LogFilesDTO;
import de.hybris.platform.cronjob.model.LogFileModel;
import de.hybris.platform.cronjob.resource.LogFileResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type LogFile defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/logfiles")
public class LogFilesResource extends AbstractCollectionResource <Collection<LogFileModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LogFilesResource()
	{
		super("LogFile");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLogFiles()
	{
		return createGetResponse().build(LogFilesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LogFileResource} for current root resource 
	 */
	@Path("{logfile}")
	public AbstractYResource getLogFileResource(@PathParam("logfile")  final String resourceKey)
	{
		final LogFileResource  resource  = resourceCtx.getResource(LogFileResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LogFileModel> getLogFilesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLogFilesCollection(final Collection<LogFileModel> value)
	{
		super.setResourceValue(value);
	}
	
}
