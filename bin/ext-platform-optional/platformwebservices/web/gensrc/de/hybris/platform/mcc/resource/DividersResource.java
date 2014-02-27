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
package de.hybris.platform.mcc.resource;

import de.hybris.platform.mcc.dto.DividersDTO;
import de.hybris.platform.mcc.model.DividerModel;
import de.hybris.platform.mcc.resource.DividerResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Divider defined at extension mcc Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/dividers")
public class DividersResource extends AbstractCollectionResource <Collection<DividerModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DividersResource()
	{
		super("Divider");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDividers()
	{
		return createGetResponse().build(DividersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DividerResource} for current root resource 
	 */
	@Path("{divider}")
	public AbstractYResource getDividerResource(@PathParam("divider")  final String resourceKey)
	{
		final DividerResource  resource  = resourceCtx.getResource(DividerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DividerModel> getDividersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDividersCollection(final Collection<DividerModel> value)
	{
		super.setResourceValue(value);
	}
	
}
