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
package de.hybris.platform.cms2.resource.contents;

import de.hybris.platform.cms2.dto.contents.CMSItemsDTO;
import de.hybris.platform.cms2.model.contents.CMSItemModel;
import de.hybris.platform.cms2.resource.contents.CMSItemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSItem defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsitems")
public class CMSItemsResource extends AbstractCollectionResource <Collection<CMSItemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSItemsResource()
	{
		super("CMSItem");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSItems()
	{
		return createGetResponse().build(CMSItemsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSItemResource} for current root resource 
	 */
	@Path("{cmsitem}")
	public AbstractYResource getCMSItemResource(@PathParam("cmsitem")  final String resourceKey)
	{
		final CMSItemResource  resource  = resourceCtx.getResource(CMSItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSItemModel> getCMSItemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSItemsCollection(final Collection<CMSItemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
