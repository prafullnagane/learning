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

import de.hybris.platform.ticket.dto.CsAgentGroupsDTO;
import de.hybris.platform.ticket.model.CsAgentGroupModel;
import de.hybris.platform.ticket.resource.CsAgentGroupResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CsAgentGroup defined at extension ticketsystem Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/csagentgroups")
public class CsAgentGroupsResource extends AbstractCollectionResource <Collection<CsAgentGroupModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsAgentGroupsResource()
	{
		super("CsAgentGroup");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCsAgentGroups()
	{
		return createGetResponse().build(CsAgentGroupsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CsAgentGroupResource} for current root resource 
	 */
	@Path("{csagentgroup}")
	public AbstractYResource getCsAgentGroupResource(@PathParam("csagentgroup")  final String resourceKey)
	{
		final CsAgentGroupResource  resource  = resourceCtx.getResource(CsAgentGroupResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CsAgentGroupModel> getCsAgentGroupsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCsAgentGroupsCollection(final Collection<CsAgentGroupModel> value)
	{
		super.setResourceValue(value);
	}
	
}
