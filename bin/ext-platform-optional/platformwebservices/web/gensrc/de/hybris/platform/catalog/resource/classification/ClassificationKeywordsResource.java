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

import de.hybris.platform.catalog.dto.classification.ClassificationKeywordsDTO;
import de.hybris.platform.catalog.model.classification.ClassificationKeywordModel;
import de.hybris.platform.catalog.resource.classification.ClassificationKeywordResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type ClassificationKeyword defined at extension catalog Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/classificationkeywords")
public class ClassificationKeywordsResource extends AbstractCollectionResource <Collection<ClassificationKeywordModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationKeywordsResource()
	{
		super("ClassificationKeyword");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllClassificationKeywords()
	{
		return createGetResponse().build(ClassificationKeywordsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationKeywordResource} for current root resource 
	 */
	@Path("{classificationkeyword}")
	public AbstractYResource getClassificationKeywordResource(@PathParam("classificationkeyword")  final String resourceKey)
	{
		final ClassificationKeywordResource  resource  = resourceCtx.getResource(ClassificationKeywordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<ClassificationKeywordModel> getClassificationKeywordsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setClassificationKeywordsCollection(final Collection<ClassificationKeywordModel> value)
	{
		super.setResourceValue(value);
	}
	
}
