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
package de.hybris.platform.hmc.resource;

import de.hybris.platform.hmc.dto.SavedValuesDTO;
import de.hybris.platform.hmc.dto.SavedValuesesDTO;
import de.hybris.platform.hmc.model.SavedValuesModel;
import de.hybris.platform.hmc.resource.SavedValuesResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SavedValues defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/savedvalueses")
public class SavedValuesesResource extends AbstractCollectionResource <Collection<SavedValuesModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedValuesesResource()
	{
		super("SavedValues");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSavedValueses()
	{
		return createGetResponse().build(SavedValuesesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SavedValuesModel> getSavedValuesesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SavedValuesResource} for current root resource 
	 */
	@Path("{savedvalues}")
	public AbstractYResource getSavedValuesResource(@PathParam("savedvalues")  final String resourceKey)
	{
		final SavedValuesResource  resource  = resourceCtx.getResource(SavedValuesResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postSavedValues(final SavedValuesDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSavedValuesesCollection(final Collection<SavedValuesModel> value)
	{
		super.setResourceValue(value);
	}
	
}
