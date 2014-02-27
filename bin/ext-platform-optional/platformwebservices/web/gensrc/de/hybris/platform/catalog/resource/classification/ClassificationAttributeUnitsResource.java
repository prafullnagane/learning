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
package de.hybris.platform.catalog.resource.classification;

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeUnitsDTO;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeUnitModel;
import de.hybris.platform.catalog.resource.classification.ClassificationAttributeUnitResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ClassificationAttributeUnit defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/classificationattributeunits")
public class ClassificationAttributeUnitsResource extends AbstractCollectionResource <Collection<ClassificationAttributeUnitModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeUnitsResource()
	{
		super("ClassificationAttributeUnit");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllClassificationAttributeUnits()
	{
		return createGetResponse().build(ClassificationAttributeUnitsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationAttributeUnitResource} for current root resource 
	 */
	@Path("{classificationattributeunit}")
	public AbstractYResource getClassificationAttributeUnitResource(@PathParam("classificationattributeunit")  final String resourceKey)
	{
		final ClassificationAttributeUnitResource  resource  = resourceCtx.getResource(ClassificationAttributeUnitResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ClassificationAttributeUnitModel> getClassificationAttributeUnitsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setClassificationAttributeUnitsCollection(final Collection<ClassificationAttributeUnitModel> value)
	{
		super.setResourceValue(value);
	}
	
}
