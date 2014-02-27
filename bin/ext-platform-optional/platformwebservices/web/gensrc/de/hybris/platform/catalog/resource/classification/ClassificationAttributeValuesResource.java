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

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeValuesDTO;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeValueModel;
import de.hybris.platform.catalog.resource.classification.ClassificationAttributeValueResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ClassificationAttributeValue defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/classificationattributevalues")
public class ClassificationAttributeValuesResource extends AbstractCollectionResource <Collection<ClassificationAttributeValueModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeValuesResource()
	{
		super("ClassificationAttributeValue");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllClassificationAttributeValues()
	{
		return createGetResponse().build(ClassificationAttributeValuesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationAttributeValueResource} for current root resource 
	 */
	@Path("{classificationattributevalue}")
	public AbstractYResource getClassificationAttributeValueResource(@PathParam("classificationattributevalue")  final String resourceKey)
	{
		final ClassificationAttributeValueResource  resource  = resourceCtx.getResource(ClassificationAttributeValueResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ClassificationAttributeValueModel> getClassificationAttributeValuesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setClassificationAttributeValuesCollection(final Collection<ClassificationAttributeValueModel> value)
	{
		super.setResourceValue(value);
	}
	
}
