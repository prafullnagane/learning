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
package de.hybris.platform.ticket.resource;

import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.core.resource.type.SearchRestrictionResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.ticket.dto.CsAgentGroupDTO;
import de.hybris.platform.ticket.model.CsAgentGroupModel;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type CsAgentGroup first defined at extension ticketsystem
 */
@SuppressWarnings("all")
public class CsAgentGroupResource extends AbstractYResource<CsAgentGroupModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsAgentGroupResource()
	{
		super("CsAgentGroup");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteCsAgentGroup()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getCsAgentGroup()
	{
		return createGetResponse().build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public CsAgentGroupModel getCsAgentGroupModel()
	{
		return super.getResourceValue();
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
	 *  Generated getter for sub resource of type {@link SearchRestrictionResource} for current root resource 
	 */
	@Path("/searchrestrictions/{searchrestriction}")
	public AbstractYResource getSearchRestrictionResource(@PathParam("searchrestriction")  final String resourceKey)
	{
		final SearchRestrictionResource  resource  = resourceCtx.getResource(SearchRestrictionResource.class);
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
	public Response putCsAgentGroup(final CsAgentGroupDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link CsAgentGroupModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected CsAgentGroupModel readResource(final String resourceId) throws Exception
	{
		CsAgentGroupModel model = new CsAgentGroupModel();
		model.setUid(resourceId);
		return (CsAgentGroupModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(CsAgentGroupModel)}
	 */
	public void setCsAgentGroupModel(final CsAgentGroupModel value)
	{
		super.setResourceValue(value);
	}
	
}
