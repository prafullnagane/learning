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
package de.hybris.platform.core.resource.enumeration;

import de.hybris.platform.core.dto.enumeration.EnumerationMetaTypesDTO;
import de.hybris.platform.core.model.enumeration.EnumerationMetaTypeModel;
import de.hybris.platform.core.resource.enumeration.EnumerationMetaTypeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type EnumerationMetaType defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/enumerationmetatypes")
public class EnumerationMetaTypesResource extends AbstractCollectionResource <Collection<EnumerationMetaTypeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EnumerationMetaTypesResource()
	{
		super("EnumerationMetaType");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllEnumerationMetaTypes()
	{
		return createGetResponse().build(EnumerationMetaTypesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EnumerationMetaTypeResource} for current root resource 
	 */
	@Path("{enumerationmetatype}")
	public AbstractYResource getEnumerationMetaTypeResource(@PathParam("enumerationmetatype")  final String resourceKey)
	{
		final EnumerationMetaTypeResource  resource  = resourceCtx.getResource(EnumerationMetaTypeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<EnumerationMetaTypeModel> getEnumerationMetaTypesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setEnumerationMetaTypesCollection(final Collection<EnumerationMetaTypeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
