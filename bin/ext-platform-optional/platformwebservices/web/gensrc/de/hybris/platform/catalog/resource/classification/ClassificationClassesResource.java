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

import de.hybris.platform.catalog.dto.classification.ClassificationClassesDTO;
import de.hybris.platform.catalog.model.classification.ClassificationClassModel;
import de.hybris.platform.catalog.resource.classification.ClassificationClassResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ClassificationClass defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/classificationclasses")
public class ClassificationClassesResource extends AbstractCollectionResource <Collection<ClassificationClassModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationClassesResource()
	{
		super("ClassificationClass");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllClassificationClasses()
	{
		return createGetResponse().build(ClassificationClassesDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ClassificationClassModel> getClassificationClassesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationClassResource} for current root resource 
	 */
	@Path("{classificationclass}")
	public AbstractYResource getClassificationClassResource(@PathParam("classificationclass")  final String resourceKey)
	{
		final ClassificationClassResource  resource  = resourceCtx.getResource(ClassificationClassResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setClassificationClassesCollection(final Collection<ClassificationClassModel> value)
	{
		super.setResourceValue(value);
	}
	
}
