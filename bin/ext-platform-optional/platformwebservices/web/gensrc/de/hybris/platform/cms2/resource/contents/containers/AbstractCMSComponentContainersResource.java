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
package de.hybris.platform.cms2.resource.contents.containers;

import de.hybris.platform.cms2.dto.contents.containers.AbstractCMSComponentContainersDTO;
import de.hybris.platform.cms2.model.contents.containers.AbstractCMSComponentContainerModel;
import de.hybris.platform.cms2.resource.contents.containers.AbstractCMSComponentContainerResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractCMSComponentContainer defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractcmscomponentcontainers")
public class AbstractCMSComponentContainersResource extends AbstractCollectionResource <Collection<AbstractCMSComponentContainerModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCMSComponentContainersResource()
	{
		super("AbstractCMSComponentContainer");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractCMSComponentContainerResource} for current root resource 
	 */
	@Path("{abstractcmscomponentcontainer}")
	public AbstractYResource getAbstractCMSComponentContainerResource(@PathParam("abstractcmscomponentcontainer")  final String resourceKey)
	{
		final AbstractCMSComponentContainerResource  resource  = resourceCtx.getResource(AbstractCMSComponentContainerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractCMSComponentContainerModel> getAbstractCMSComponentContainersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractCMSComponentContainers()
	{
		return createGetResponse().build(AbstractCMSComponentContainersDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractCMSComponentContainersCollection(final Collection<AbstractCMSComponentContainerModel> value)
	{
		super.setResourceValue(value);
	}
	
}
