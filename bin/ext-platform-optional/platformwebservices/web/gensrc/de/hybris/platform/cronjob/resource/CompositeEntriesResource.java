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

import de.hybris.platform.cronjob.dto.CompositeEntriesDTO;
import de.hybris.platform.cronjob.model.CompositeEntryModel;
import de.hybris.platform.cronjob.resource.CompositeEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CompositeEntry defined at extension processing Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/compositeentries")
public class CompositeEntriesResource extends AbstractCollectionResource <Collection<CompositeEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompositeEntriesResource()
	{
		super("CompositeEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCompositeEntries()
	{
		return createGetResponse().build(CompositeEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CompositeEntryModel> getCompositeEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CompositeEntryResource} for current root resource 
	 */
	@Path("{compositeentry}")
	public AbstractYResource getCompositeEntryResource(@PathParam("compositeentry")  final String resourceKey)
	{
		final CompositeEntryResource  resource  = resourceCtx.getResource(CompositeEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCompositeEntriesCollection(final Collection<CompositeEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
