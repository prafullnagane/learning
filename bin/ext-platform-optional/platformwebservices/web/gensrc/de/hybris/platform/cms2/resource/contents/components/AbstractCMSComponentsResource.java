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

import de.hybris.platform.cms2.dto.contents.components.AbstractCMSComponentsDTO;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.resource.contents.components.AbstractCMSComponentResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractCMSComponent defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractcmscomponents")
public class AbstractCMSComponentsResource extends AbstractCollectionResource <Collection<AbstractCMSComponentModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCMSComponentsResource()
	{
		super("AbstractCMSComponent");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractCMSComponentResource} for current root resource 
	 */
	@Path("{abstractcmscomponent}")
	public AbstractYResource getAbstractCMSComponentResource(@PathParam("abstractcmscomponent")  final String resourceKey)
	{
		final AbstractCMSComponentResource  resource  = resourceCtx.getResource(AbstractCMSComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractCMSComponentModel> getAbstractCMSComponentsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractCMSComponents()
	{
		return createGetResponse().build(AbstractCMSComponentsDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractCMSComponentsCollection(final Collection<AbstractCMSComponentModel> value)
	{
		super.setResourceValue(value);
	}
	
}
