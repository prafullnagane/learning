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
package de.hybris.platform.core.resource.security;

import de.hybris.platform.core.dto.security.PrincipalsDTO;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.core.resource.security.PrincipalResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Principal defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/principals")
public class PrincipalsResource extends AbstractCollectionResource <Collection<PrincipalModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PrincipalsResource()
	{
		super("Principal");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllPrincipals()
	{
		return createGetResponse().build(PrincipalsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PrincipalResource} for current root resource 
	 */
	@Path("{principal}")
	public AbstractYResource getPrincipalResource(@PathParam("principal")  final String resourceKey)
	{
		final PrincipalResource  resource  = resourceCtx.getResource(PrincipalResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<PrincipalModel> getPrincipalsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setPrincipalsCollection(final Collection<PrincipalModel> value)
	{
		super.setResourceValue(value);
	}
	
}
