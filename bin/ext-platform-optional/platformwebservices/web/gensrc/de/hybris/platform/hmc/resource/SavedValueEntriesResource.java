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

import de.hybris.platform.hmc.dto.SavedValueEntriesDTO;
import de.hybris.platform.hmc.dto.SavedValueEntryDTO;
import de.hybris.platform.hmc.model.SavedValueEntryModel;
import de.hybris.platform.hmc.resource.SavedValueEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type SavedValueEntry defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/savedvalueentries")
public class SavedValueEntriesResource extends AbstractCollectionResource <Collection<SavedValueEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SavedValueEntriesResource()
	{
		super("SavedValueEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllSavedValueEntries()
	{
		return createGetResponse().build(SavedValueEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<SavedValueEntryModel> getSavedValueEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SavedValueEntryResource} for current root resource 
	 */
	@Path("{savedvalueentry}")
	public AbstractYResource getSavedValueEntryResource(@PathParam("savedvalueentry")  final String resourceKey)
	{
		final SavedValueEntryResource  resource  = resourceCtx.getResource(SavedValueEntryResource.class);
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
	public Response postSavedValueEntry(final SavedValueEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setSavedValueEntriesCollection(final Collection<SavedValueEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
