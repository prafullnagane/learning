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

import de.hybris.platform.cms2.dto.contents.components.CMSParagraphComponentsDTO;
import de.hybris.platform.cms2.model.contents.components.CMSParagraphComponentModel;
import de.hybris.platform.cms2.resource.contents.components.CMSParagraphComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSParagraphComponent defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsparagraphcomponents")
public class CMSParagraphComponentsResource extends AbstractCollectionResource <Collection<CMSParagraphComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSParagraphComponentsResource()
	{
		super("CMSParagraphComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSParagraphComponents()
	{
		return createGetResponse().build(CMSParagraphComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSParagraphComponentResource} for current root resource 
	 */
	@Path("{cmsparagraphcomponent}")
	public AbstractYResource getCMSParagraphComponentResource(@PathParam("cmsparagraphcomponent")  final String resourceKey)
	{
		final CMSParagraphComponentResource  resource  = resourceCtx.getResource(CMSParagraphComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSParagraphComponentModel> getCMSParagraphComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSParagraphComponentsCollection(final Collection<CMSParagraphComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
