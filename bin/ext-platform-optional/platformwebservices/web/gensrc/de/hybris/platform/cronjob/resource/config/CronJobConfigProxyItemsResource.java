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
package de.hybris.platform.cronjob.resource.config;

import de.hybris.platform.cronjob.dto.config.CronJobConfigProxyItemDTO;
import de.hybris.platform.cronjob.dto.config.CronJobConfigProxyItemsDTO;
import de.hybris.platform.cronjob.model.config.CronJobConfigProxyItemModel;
import de.hybris.platform.cronjob.resource.config.CronJobConfigProxyItemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CronJobConfigProxyItem defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cronjobconfigproxyitems")
public class CronJobConfigProxyItemsResource extends AbstractCollectionResource <Collection<CronJobConfigProxyItemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CronJobConfigProxyItemsResource()
	{
		super("CronJobConfigProxyItem");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCronJobConfigProxyItems()
	{
		return createGetResponse().build(CronJobConfigProxyItemsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CronJobConfigProxyItemResource} for current root resource 
	 */
	@Path("{cronjobconfigproxyitem}")
	public AbstractYResource getCronJobConfigProxyItemResource(@PathParam("cronjobconfigproxyitem")  final String resourceKey)
	{
		final CronJobConfigProxyItemResource  resource  = resourceCtx.getResource(CronJobConfigProxyItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CronJobConfigProxyItemModel> getCronJobConfigProxyItemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postCronJobConfigProxyItem(final CronJobConfigProxyItemDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCronJobConfigProxyItemsCollection(final Collection<CronJobConfigProxyItemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
