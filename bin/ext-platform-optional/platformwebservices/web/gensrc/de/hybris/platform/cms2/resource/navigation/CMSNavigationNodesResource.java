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
package de.hybris.platform.cms2.resource.navigation;

import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodesDTO;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.cms2.resource.navigation.CMSNavigationNodeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSNavigationNode defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsnavigationnodes")
public class CMSNavigationNodesResource extends AbstractCollectionResource <Collection<CMSNavigationNodeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSNavigationNodesResource()
	{
		super("CMSNavigationNode");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSNavigationNodes()
	{
		return createGetResponse().build(CMSNavigationNodesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSNavigationNodeResource} for current root resource 
	 */
	@Path("{cmsnavigationnode}")
	public AbstractYResource getCMSNavigationNodeResource(@PathParam("cmsnavigationnode")  final String resourceKey)
	{
		final CMSNavigationNodeResource  resource  = resourceCtx.getResource(CMSNavigationNodeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSNavigationNodeModel> getCMSNavigationNodesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSNavigationNodesCollection(final Collection<CMSNavigationNodeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
