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

import de.hybris.platform.lucenesearch.dto.LanguageConfigurationDTO;
import de.hybris.platform.lucenesearch.dto.LanguageConfigurationsDTO;
import de.hybris.platform.lucenesearch.model.LanguageConfigurationModel;
import de.hybris.platform.lucenesearch.resource.LanguageConfigurationResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type LanguageConfiguration defined at extension lucenesearch Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/languageconfigurations")
public class LanguageConfigurationsResource extends AbstractCollectionResource <Collection<LanguageConfigurationModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguageConfigurationsResource()
	{
		super("LanguageConfiguration");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLanguageConfigurations()
	{
		return createGetResponse().build(LanguageConfigurationsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LanguageConfigurationResource} for current root resource 
	 */
	@Path("{languageconfiguration}")
	public AbstractYResource getLanguageConfigurationResource(@PathParam("languageconfiguration")  final String resourceKey)
	{
		final LanguageConfigurationResource  resource  = resourceCtx.getResource(LanguageConfigurationResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LanguageConfigurationModel> getLanguageConfigurationsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postLanguageConfiguration(final LanguageConfigurationDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLanguageConfigurationsCollection(final Collection<LanguageConfigurationModel> value)
	{
		super.setResourceValue(value);
	}
	
}
