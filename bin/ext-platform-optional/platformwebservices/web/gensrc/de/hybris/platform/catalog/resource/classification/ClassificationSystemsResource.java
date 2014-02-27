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

import de.hybris.platform.catalog.dto.classification.ClassificationSystemsDTO;
import de.hybris.platform.catalog.model.classification.ClassificationSystemModel;
import de.hybris.platform.catalog.resource.classification.ClassificationSystemResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ClassificationSystem defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/classificationsystems")
public class ClassificationSystemsResource extends AbstractCollectionResource <Collection<ClassificationSystemModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationSystemsResource()
	{
		super("ClassificationSystem");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllClassificationSystems()
	{
		return createGetResponse().build(ClassificationSystemsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationSystemResource} for current root resource 
	 */
	@Path("{classificationsystem}")
	public AbstractYResource getClassificationSystemResource(@PathParam("classificationsystem")  final String resourceKey)
	{
		final ClassificationSystemResource  resource  = resourceCtx.getResource(ClassificationSystemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ClassificationSystemModel> getClassificationSystemsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setClassificationSystemsCollection(final Collection<ClassificationSystemModel> value)
	{
		super.setResourceValue(value);
	}
	
}
