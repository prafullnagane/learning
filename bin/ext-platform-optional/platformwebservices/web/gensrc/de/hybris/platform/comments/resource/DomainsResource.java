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
package de.hybris.platform.comments.resource;

import de.hybris.platform.comments.dto.DomainsDTO;
import de.hybris.platform.comments.model.DomainModel;
import de.hybris.platform.comments.resource.DomainResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Domain defined at extension comments Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/domains")
public class DomainsResource extends AbstractCollectionResource <Collection<DomainModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DomainsResource()
	{
		super("Domain");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDomains()
	{
		return createGetResponse().build(DomainsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DomainResource} for current root resource 
	 */
	@Path("{domain}")
	public AbstractYResource getDomainResource(@PathParam("domain")  final String resourceKey)
	{
		final DomainResource  resource  = resourceCtx.getResource(DomainResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DomainModel> getDomainsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDomainsCollection(final Collection<DomainModel> value)
	{
		super.setResourceValue(value);
	}
	
}
