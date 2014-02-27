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
package de.hybris.platform.mcc.resource;

import de.hybris.platform.mcc.dto.AbstractLinkEntriesDTO;
import de.hybris.platform.mcc.model.AbstractLinkEntryModel;
import de.hybris.platform.mcc.resource.AbstractLinkEntryResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractLinkEntry defined at extension mcc Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractlinkentries")
public class AbstractLinkEntriesResource extends AbstractCollectionResource <Collection<AbstractLinkEntryModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractLinkEntriesResource()
	{
		super("AbstractLinkEntry");
	}
	
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractLinkEntryModel> getAbstractLinkEntriesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractLinkEntryResource} for current root resource 
	 */
	@Path("{abstractlinkentry}")
	public AbstractYResource getAbstractLinkEntryResource(@PathParam("abstractlinkentry")  final String resourceKey)
	{
		final AbstractLinkEntryResource  resource  = resourceCtx.getResource(AbstractLinkEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractLinkEntries()
	{
		return createGetResponse().build(AbstractLinkEntriesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractLinkEntriesCollection(final Collection<AbstractLinkEntryModel> value)
	{
		super.setResourceValue(value);
	}
	
}
