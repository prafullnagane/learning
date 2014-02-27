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
package de.hybris.platform.variants.resource;

import de.hybris.platform.variants.dto.VariantTypesDTO;
import de.hybris.platform.variants.model.VariantTypeModel;
import de.hybris.platform.variants.resource.VariantTypeResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type VariantType defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/varianttypes")
public class VariantTypesResource extends AbstractCollectionResource <Collection<VariantTypeModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantTypesResource()
	{
		super("VariantType");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllVariantTypes()
	{
		return createGetResponse().build(VariantTypesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VariantTypeResource} for current root resource 
	 */
	@Path("{varianttype}")
	public AbstractYResource getVariantTypeResource(@PathParam("varianttype")  final String resourceKey)
	{
		final VariantTypeResource  resource  = resourceCtx.getResource(VariantTypeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<VariantTypeModel> getVariantTypesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setVariantTypesCollection(final Collection<VariantTypeModel> value)
	{
		super.setResourceValue(value);
	}
	
}
