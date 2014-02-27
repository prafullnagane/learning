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
package de.hybris.platform.stock.resource;

import de.hybris.platform.stock.dto.StockLevelHistoryEntriesDTO;
import de.hybris.platform.stock.dto.StockLevelHistoryEntryDTO;
import de.hybris.platform.stock.model.StockLevelHistoryEntryModel;
import de.hybris.platform.stock.resource.StockLevelHistoryEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StockLevelHistoryEntry defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/stocklevelhistoryentries")
public class StockLevelHistoryEntriesResource extends AbstractCollectionResource <Collection<StockLevelHistoryEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StockLevelHistoryEntriesResource()
	{
		super("StockLevelHistoryEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStockLevelHistoryEntries()
	{
		return createGetResponse().build(StockLevelHistoryEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StockLevelHistoryEntryModel> getStockLevelHistoryEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StockLevelHistoryEntryResource} for current root resource 
	 */
	@Path("{stocklevelhistoryentry}")
	public AbstractYResource getStockLevelHistoryEntryResource(@PathParam("stocklevelhistoryentry")  final String resourceKey)
	{
		final StockLevelHistoryEntryResource  resource  = resourceCtx.getResource(StockLevelHistoryEntryResource.class);
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
	public Response postStockLevelHistoryEntry(final StockLevelHistoryEntryDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStockLevelHistoryEntriesCollection(final Collection<StockLevelHistoryEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
