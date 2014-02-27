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
package de.hybris.platform.ldap.resource;

import de.hybris.platform.ldap.dto.LDAPConfigProxyItemDTO;
import de.hybris.platform.ldap.dto.LDAPConfigProxyItemsDTO;
import de.hybris.platform.ldap.model.LDAPConfigProxyItemModel;
import de.hybris.platform.ldap.resource.LDAPConfigProxyItemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type LDAPConfigProxyItem defined at extension ldap Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ldapconfigproxyitems")
public class LDAPConfigProxyItemsResource extends AbstractCollectionResource <Collection<LDAPConfigProxyItemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDAPConfigProxyItemsResource()
	{
		super("LDAPConfigProxyItem");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLDAPConfigProxyItems()
	{
		return createGetResponse().build(LDAPConfigProxyItemsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LDAPConfigProxyItemResource} for current root resource 
	 */
	@Path("{ldapconfigproxyitem}")
	public AbstractYResource getLDAPConfigProxyItemResource(@PathParam("ldapconfigproxyitem")  final String resourceKey)
	{
		final LDAPConfigProxyItemResource  resource  = resourceCtx.getResource(LDAPConfigProxyItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LDAPConfigProxyItemModel> getLDAPConfigProxyItemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postLDAPConfigProxyItem(final LDAPConfigProxyItemDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLDAPConfigProxyItemsCollection(final Collection<LDAPConfigProxyItemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
