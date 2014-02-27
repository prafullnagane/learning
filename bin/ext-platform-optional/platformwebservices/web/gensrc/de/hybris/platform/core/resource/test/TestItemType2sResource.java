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

import de.hybris.platform.core.dto.test.TestItemType2DTO;
import de.hybris.platform.core.dto.test.TestItemType2sDTO;
import de.hybris.platform.core.model.test.TestItemType2Model;
import de.hybris.platform.core.resource.test.TestItemType2Resource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type TestItemType2 defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/testitemtype2s")
public class TestItemType2sResource extends AbstractCollectionResource <Collection<TestItemType2Model>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TestItemType2sResource()
	{
		super("TestItemType2");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllTestItemType2s()
	{
		return createGetResponse().build(TestItemType2sDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link TestItemType2Resource} for current root resource 
	 */
	@Path("{testitemtype2}")
	public AbstractYResource getTestItemType2Resource(@PathParam("testitemtype2")  final String resourceKey)
	{
		final TestItemType2Resource  resource  = resourceCtx.getResource(TestItemType2Resource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<TestItemType2Model> getTestItemType2sCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postTestItemType2(final TestItemType2DTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setTestItemType2sCollection(final Collection<TestItemType2Model> value)
	{
		super.setResourceValue(value);
	}
	
}
