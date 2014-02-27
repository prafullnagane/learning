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

import de.hybris.platform.core.dto.enumeration.EnumerationValuesDTO;
import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.core.resource.enumeration.EnumerationValueResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type EnumerationValue defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/enumerationvalues")
public class EnumerationValuesResource extends AbstractCollectionResource <Collection<EnumerationValueModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EnumerationValuesResource()
	{
		super("EnumerationValue");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllEnumerationValues()
	{
		return createGetResponse().build(EnumerationValuesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EnumerationValueResource} for current root resource 
	 */
	@Path("{enumerationvalue}")
	public AbstractYResource getEnumerationValueResource(@PathParam("enumerationvalue")  final String resourceKey)
	{
		final EnumerationValueResource  resource  = resourceCtx.getResource(EnumerationValueResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<EnumerationValueModel> getEnumerationValuesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setEnumerationValuesCollection(final Collection<EnumerationValueModel> value)
	{
		super.setResourceValue(value);
	}
	
}