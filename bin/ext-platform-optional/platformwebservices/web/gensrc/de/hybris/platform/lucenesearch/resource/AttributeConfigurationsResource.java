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
package de.hybris.platform.lucenesearch.resource;

import de.hybris.platform.lucenesearch.dto.AttributeConfigurationDTO;
import de.hybris.platform.lucenesearch.dto.AttributeConfigurationsDTO;
import de.hybris.platform.lucenesearch.model.AttributeConfigurationModel;
import de.hybris.platform.lucenesearch.resource.AttributeConfigurationResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AttributeConfiguration defined at extension lucenesearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/attributeconfigurations")
public class AttributeConfigurationsResource extends AbstractCollectionResource <Collection<AttributeConfigurationModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeConfigurationsResource()
	{
		super("AttributeConfiguration");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAttributeConfigurations()
	{
		return createGetResponse().build(AttributeConfigurationsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AttributeConfigurationResource} for current root resource 
	 */
	@Path("{attributeconfiguration}")
	public AbstractYResource getAttributeConfigurationResource(@PathParam("attributeconfiguration")  final String resourceKey)
	{
		final AttributeConfigurationResource  resource  = resourceCtx.getResource(AttributeConfigurationResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AttributeConfigurationModel> getAttributeConfigurationsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postAttributeConfiguration(final AttributeConfigurationDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAttributeConfigurationsCollection(final Collection<AttributeConfigurationModel> value)
	{
		super.setResourceValue(value);
	}
	
}
