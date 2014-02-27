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
package de.hybris.platform.acceleratorservices.resource.export;

import de.hybris.platform.acceleratorservices.dto.export.ExportDataHistoryEntriesDTO;
import de.hybris.platform.acceleratorservices.model.export.ExportDataHistoryEntryModel;
import de.hybris.platform.acceleratorservices.resource.export.ExportDataHistoryEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ExportDataHistoryEntry defined at extension acceleratorservices Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/exportdatahistoryentries")
public class ExportDataHistoryEntriesResource extends AbstractCollectionResource <Collection<ExportDataHistoryEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataHistoryEntriesResource()
	{
		super("ExportDataHistoryEntry");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllExportDataHistoryEntries()
	{
		return createGetResponse().build(ExportDataHistoryEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ExportDataHistoryEntryModel> getExportDataHistoryEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ExportDataHistoryEntryResource} for current root resource 
	 */
	@Path("{exportdatahistoryentry}")
	public AbstractYResource getExportDataHistoryEntryResource(@PathParam("exportdatahistoryentry")  final String resourceKey)
	{
		final ExportDataHistoryEntryResource  resource  = resourceCtx.getResource(ExportDataHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setExportDataHistoryEntriesCollection(final Collection<ExportDataHistoryEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
