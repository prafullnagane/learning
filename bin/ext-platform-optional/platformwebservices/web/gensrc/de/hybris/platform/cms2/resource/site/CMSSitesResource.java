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
package de.hybris.platform.cms2.resource.site;

import de.hybris.platform.cms2.dto.site.CMSSitesDTO;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.cms2.resource.site.CMSSiteResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSSite defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmssites")
public class CMSSitesResource extends AbstractCollectionResource <Collection<CMSSiteModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSSitesResource()
	{
		super("CMSSite");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSSites()
	{
		return createGetResponse().build(CMSSitesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSSiteResource} for current root resource 
	 */
	@Path("{cmssite}")
	public AbstractYResource getCMSSiteResource(@PathParam("cmssite")  final String resourceKey)
	{
		final CMSSiteResource  resource  = resourceCtx.getResource(CMSSiteResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSSiteModel> getCMSSitesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSSitesCollection(final Collection<CMSSiteModel> value)
	{
		super.setResourceValue(value);
	}
	
}
