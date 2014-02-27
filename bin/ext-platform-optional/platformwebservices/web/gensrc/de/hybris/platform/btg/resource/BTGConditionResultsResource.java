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
package de.hybris.platform.btg.resource;

import de.hybris.platform.btg.dto.BTGConditionResultDTO;
import de.hybris.platform.btg.dto.BTGConditionResultsDTO;
import de.hybris.platform.btg.model.BTGConditionResultModel;
import de.hybris.platform.btg.resource.BTGConditionResultResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGConditionResult defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgconditionresults")
public class BTGConditionResultsResource extends AbstractCollectionResource <Collection<BTGConditionResultModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConditionResultsResource()
	{
		super("BTGConditionResult");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGConditionResults()
	{
		return createGetResponse().build(BTGConditionResultsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGConditionResultResource} for current root resource 
	 */
	@Path("{btgconditionresult}")
	public AbstractYResource getBTGConditionResultResource(@PathParam("btgconditionresult")  final String resourceKey)
	{
		final BTGConditionResultResource  resource  = resourceCtx.getResource(BTGConditionResultResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGConditionResultModel> getBTGConditionResultsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postBTGConditionResult(final BTGConditionResultDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGConditionResultsCollection(final Collection<BTGConditionResultModel> value)
	{
		super.setResourceValue(value);
	}
	
}