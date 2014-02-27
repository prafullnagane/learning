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

import de.hybris.platform.mcc.dto.StaticLinksDTO;
import de.hybris.platform.mcc.model.StaticLinkModel;
import de.hybris.platform.mcc.resource.StaticLinkResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type StaticLink defined at extension mcc Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/staticlinks")
public class StaticLinksResource extends AbstractCollectionResource <Collection<StaticLinkModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StaticLinksResource()
	{
		super("StaticLink");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllStaticLinks()
	{
		return createGetResponse().build(StaticLinksDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link StaticLinkResource} for current root resource 
	 */
	@Path("{staticlink}")
	public AbstractYResource getStaticLinkResource(@PathParam("staticlink")  final String resourceKey)
	{
		final StaticLinkResource  resource  = resourceCtx.getResource(StaticLinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<StaticLinkModel> getStaticLinksCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setStaticLinksCollection(final Collection<StaticLinkModel> value)
	{
		super.setResourceValue(value);
	}
	
}
