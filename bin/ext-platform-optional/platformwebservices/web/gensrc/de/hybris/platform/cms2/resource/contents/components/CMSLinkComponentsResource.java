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
package de.hybris.platform.cms2.resource.contents.components;

import de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentsDTO;
import de.hybris.platform.cms2.model.contents.components.CMSLinkComponentModel;
import de.hybris.platform.cms2.resource.contents.components.CMSLinkComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSLinkComponent defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmslinkcomponents")
public class CMSLinkComponentsResource extends AbstractCollectionResource <Collection<CMSLinkComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSLinkComponentsResource()
	{
		super("CMSLinkComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSLinkComponents()
	{
		return createGetResponse().build(CMSLinkComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSLinkComponentResource} for current root resource 
	 */
	@Path("{cmslinkcomponent}")
	public AbstractYResource getCMSLinkComponentResource(@PathParam("cmslinkcomponent")  final String resourceKey)
	{
		final CMSLinkComponentResource  resource  = resourceCtx.getResource(CMSLinkComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSLinkComponentModel> getCMSLinkComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSLinkComponentsCollection(final Collection<CMSLinkComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
