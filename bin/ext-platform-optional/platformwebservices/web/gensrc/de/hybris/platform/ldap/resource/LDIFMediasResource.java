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

import de.hybris.platform.ldap.dto.LDIFMediasDTO;
import de.hybris.platform.ldap.model.LDIFMediaModel;
import de.hybris.platform.ldap.resource.LDIFMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type LDIFMedia defined at extension ldap Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/ldifmedias")
public class LDIFMediasResource extends AbstractCollectionResource <Collection<LDIFMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFMediasResource()
	{
		super("LDIFMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLDIFMedias()
	{
		return createGetResponse().build(LDIFMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LDIFMediaResource} for current root resource 
	 */
	@Path("{ldifmedia}")
	public AbstractYResource getLDIFMediaResource(@PathParam("ldifmedia")  final String resourceKey)
	{
		final LDIFMediaResource  resource  = resourceCtx.getResource(LDIFMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LDIFMediaModel> getLDIFMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLDIFMediasCollection(final Collection<LDIFMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
