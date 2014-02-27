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
package de.hybris.platform.commons.resource;

import de.hybris.platform.commons.dto.FOPFormattersDTO;
import de.hybris.platform.commons.model.FOPFormatterModel;
import de.hybris.platform.commons.resource.FOPFormatterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type FOPFormatter defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/fopformatters")
public class FOPFormattersResource extends AbstractCollectionResource <Collection<FOPFormatterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FOPFormattersResource()
	{
		super("FOPFormatter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllFOPFormatters()
	{
		return createGetResponse().build(FOPFormattersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FOPFormatterResource} for current root resource 
	 */
	@Path("{fopformatter}")
	public AbstractYResource getFOPFormatterResource(@PathParam("fopformatter")  final String resourceKey)
	{
		final FOPFormatterResource  resource  = resourceCtx.getResource(FOPFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<FOPFormatterModel> getFOPFormattersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setFOPFormattersCollection(final Collection<FOPFormatterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
