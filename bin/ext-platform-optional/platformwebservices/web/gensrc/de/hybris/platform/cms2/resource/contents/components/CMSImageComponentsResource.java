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

import de.hybris.platform.cms2.dto.contents.components.CMSImageComponentsDTO;
import de.hybris.platform.cms2.model.contents.components.CMSImageComponentModel;
import de.hybris.platform.cms2.resource.contents.components.CMSImageComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSImageComponent defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsimagecomponents")
public class CMSImageComponentsResource extends AbstractCollectionResource <Collection<CMSImageComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSImageComponentsResource()
	{
		super("CMSImageComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSImageComponents()
	{
		return createGetResponse().build(CMSImageComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSImageComponentResource} for current root resource 
	 */
	@Path("{cmsimagecomponent}")
	public AbstractYResource getCMSImageComponentResource(@PathParam("cmsimagecomponent")  final String resourceKey)
	{
		final CMSImageComponentResource  resource  = resourceCtx.getResource(CMSImageComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSImageComponentModel> getCMSImageComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSImageComponentsCollection(final Collection<CMSImageComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
