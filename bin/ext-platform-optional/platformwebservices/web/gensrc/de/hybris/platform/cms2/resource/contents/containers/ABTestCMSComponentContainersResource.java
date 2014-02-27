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

import de.hybris.platform.cms2.dto.contents.containers.ABTestCMSComponentContainersDTO;
import de.hybris.platform.cms2.model.contents.containers.ABTestCMSComponentContainerModel;
import de.hybris.platform.cms2.resource.contents.containers.ABTestCMSComponentContainerResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ABTestCMSComponentContainer defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abtestcmscomponentcontainers")
public class ABTestCMSComponentContainersResource extends AbstractCollectionResource <Collection<ABTestCMSComponentContainerModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ABTestCMSComponentContainersResource()
	{
		super("ABTestCMSComponentContainer");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link ABTestCMSComponentContainerResource} for current root resource 
	 */
	@Path("{abtestcmscomponentcontainer}")
	public AbstractYResource getABTestCMSComponentContainerResource(@PathParam("abtestcmscomponentcontainer")  final String resourceKey)
	{
		final ABTestCMSComponentContainerResource  resource  = resourceCtx.getResource(ABTestCMSComponentContainerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ABTestCMSComponentContainerModel> getABTestCMSComponentContainersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllABTestCMSComponentContainers()
	{
		return createGetResponse().build(ABTestCMSComponentContainersDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setABTestCMSComponentContainersCollection(final Collection<ABTestCMSComponentContainerModel> value)
	{
		super.setResourceValue(value);
	}
	
}
