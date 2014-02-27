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
package de.hybris.platform.core.resource.test;

import de.hybris.platform.core.dto.test.TestItemType3DTO;
import de.hybris.platform.core.dto.test.TestItemType3sDTO;
import de.hybris.platform.core.model.test.TestItemType3Model;
import de.hybris.platform.core.resource.test.TestItemType3Resource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type TestItemType3 defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/testitemtype3s")
public class TestItemType3sResource extends AbstractCollectionResource <Collection<TestItemType3Model>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType3sResource()
	{
		super("TestItemType3");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTestItemType3s()
	{
		return createGetResponse().build(TestItemType3sDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TestItemType3Resource} for current root resource 
	 */
	@Path("{testitemtype3}")
	public AbstractYResource getTestItemType3Resource(@PathParam("testitemtype3")  final String resourceKey)
	{
		final TestItemType3Resource  resource  = resourceCtx.getResource(TestItemType3Resource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TestItemType3Model> getTestItemType3sCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postTestItemType3(final TestItemType3DTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTestItemType3sCollection(final Collection<TestItemType3Model> value)
	{
		super.setResourceValue(value);
	}
	
}
