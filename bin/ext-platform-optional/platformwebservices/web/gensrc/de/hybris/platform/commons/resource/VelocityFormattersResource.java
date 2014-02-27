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

import de.hybris.platform.commons.dto.VelocityFormattersDTO;
import de.hybris.platform.commons.model.VelocityFormatterModel;
import de.hybris.platform.commons.resource.VelocityFormatterResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type VelocityFormatter defined at extension commons Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/velocityformatters")
public class VelocityFormattersResource extends AbstractCollectionResource <Collection<VelocityFormatterModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VelocityFormattersResource()
	{
		super("VelocityFormatter");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllVelocityFormatters()
	{
		return createGetResponse().build(VelocityFormattersDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VelocityFormatterResource} for current root resource 
	 */
	@Path("{velocityformatter}")
	public AbstractYResource getVelocityFormatterResource(@PathParam("velocityformatter")  final String resourceKey)
	{
		final VelocityFormatterResource  resource  = resourceCtx.getResource(VelocityFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<VelocityFormatterModel> getVelocityFormattersCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setVelocityFormattersCollection(final Collection<VelocityFormatterModel> value)
	{
		super.setResourceValue(value);
	}
	
}
