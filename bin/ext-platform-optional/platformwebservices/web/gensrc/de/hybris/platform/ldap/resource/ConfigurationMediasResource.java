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
package de.hybris.platform.ldap.resource;

import de.hybris.platform.ldap.dto.ConfigurationMediasDTO;
import de.hybris.platform.ldap.model.ConfigurationMediaModel;
import de.hybris.platform.ldap.resource.ConfigurationMediaResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ConfigurationMedia defined at extension ldap Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/configurationmedias")
public class ConfigurationMediasResource extends AbstractCollectionResource <Collection<ConfigurationMediaModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ConfigurationMediasResource()
	{
		super("ConfigurationMedia");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllConfigurationMedias()
	{
		return createGetResponse().build(ConfigurationMediasDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ConfigurationMediaResource} for current root resource 
	 */
	@Path("{configurationmedia}")
	public AbstractYResource getConfigurationMediaResource(@PathParam("configurationmedia")  final String resourceKey)
	{
		final ConfigurationMediaResource  resource  = resourceCtx.getResource(ConfigurationMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ConfigurationMediaModel> getConfigurationMediasCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setConfigurationMediasCollection(final Collection<ConfigurationMediaModel> value)
	{
		super.setResourceValue(value);
	}
	
}
