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
package de.hybris.platform.solrfacetsearch.resource.config;

import de.hybris.platform.commerceservices.resource.solrsearch.config.SolrSortResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type SolrIndexedType first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
public class SolrIndexedTypeResource extends AbstractYResource<SolrIndexedTypeModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedTypeResource()
	{
		super("SolrIndexedType");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteSolrIndexedType()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getSolrIndexedType()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public SolrIndexedTypeModel getSolrIndexedTypeModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SolrSortResource} for current root resource 
	 */
	@Path("/solrsorts/{solrsort}")
	public AbstractYResource getSolrSortResource(@PathParam("solrsort")  final String resourceKey)
	{
		final SolrSortResource  resource  = resourceCtx.getResource(SolrSortResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putSolrIndexedType(final SolrIndexedTypeDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link SolrIndexedTypeModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected SolrIndexedTypeModel readResource(final String resourceId) throws Exception
	{
		SolrIndexedTypeModel model = new SolrIndexedTypeModel();
		model.setIdentifier(resourceId);
		return (SolrIndexedTypeModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(SolrIndexedTypeModel)}
	 */
	public void setSolrIndexedTypeModel(final SolrIndexedTypeModel value)
	{
		super.setResourceValue(value);
	}
	
}
