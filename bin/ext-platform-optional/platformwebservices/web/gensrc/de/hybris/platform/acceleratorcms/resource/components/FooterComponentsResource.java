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

import de.hybris.platform.acceleratorcms.dto.components.FooterComponentsDTO;
import de.hybris.platform.acceleratorcms.model.components.FooterComponentModel;
import de.hybris.platform.acceleratorcms.resource.components.FooterComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type FooterComponent defined at extension acceleratorcms Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/footercomponents")
public class FooterComponentsResource extends AbstractCollectionResource <Collection<FooterComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FooterComponentsResource()
	{
		super("FooterComponent");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllFooterComponents()
	{
		return createGetResponse().build(FooterComponentsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FooterComponentResource} for current root resource 
	 */
	@Path("{footercomponent}")
	public AbstractYResource getFooterComponentResource(@PathParam("footercomponent")  final String resourceKey)
	{
		final FooterComponentResource  resource  = resourceCtx.getResource(FooterComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<FooterComponentModel> getFooterComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setFooterComponentsCollection(final Collection<FooterComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
