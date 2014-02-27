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
package de.hybris.platform.acceleratorcms.resource.components;

import de.hybris.platform.acceleratorcms.dto.components.CMSTabParagraphComponentsDTO;
import de.hybris.platform.acceleratorcms.model.components.CMSTabParagraphComponentModel;
import de.hybris.platform.acceleratorcms.resource.components.CMSTabParagraphComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSTabParagraphComponent defined at extension acceleratorcms Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmstabparagraphcomponents")
public class CMSTabParagraphComponentsResource extends AbstractCollectionResource <Collection<CMSTabParagraphComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTabParagraphComponentsResource()
	{
		super("CMSTabParagraphComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSTabParagraphComponents()
	{
		return createGetResponse().build(CMSTabParagraphComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSTabParagraphComponentResource} for current root resource 
	 */
	@Path("{cmstabparagraphcomponent}")
	public AbstractYResource getCMSTabParagraphComponentResource(@PathParam("cmstabparagraphcomponent")  final String resourceKey)
	{
		final CMSTabParagraphComponentResource  resource  = resourceCtx.getResource(CMSTabParagraphComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSTabParagraphComponentModel> getCMSTabParagraphComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSTabParagraphComponentsCollection(final Collection<CMSTabParagraphComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
