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
package de.hybris.platform.core.resource.c2l;

import de.hybris.platform.catalog.resource.KeywordResource;
import de.hybris.platform.catalog.resource.ProductFeatureResource;
import de.hybris.platform.catalog.resource.classification.ClassificationKeywordResource;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.lucenesearch.resource.LanguageConfigurationResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type Language first defined at extension core
 */
@SuppressWarnings("all")
public class LanguageResource extends AbstractYResource<LanguageModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguageResource()
	{
		super("Language");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteLanguage()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationKeywordResource} for current root resource 
	 */
	@Path("/classificationkeywords/{classificationkeyword}")
	public AbstractYResource getClassificationKeywordResource(@PathParam("classificationkeyword")  final String resourceKey)
	{
		final ClassificationKeywordResource  resource  = resourceCtx.getResource(ClassificationKeywordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link KeywordResource} for current root resource 
	 */
	@Path("/keywords/{keyword}")
	public AbstractYResource getKeywordResource(@PathParam("keyword")  final String resourceKey)
	{
		final KeywordResource  resource  = resourceCtx.getResource(KeywordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getLanguage()
	{
		return createGetResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LanguageConfigurationResource} for current root resource 
	 */
	@Path("/languageconfigurations/{languageconfiguration}")
	public AbstractYResource getLanguageConfigurationResource(@PathParam("languageconfiguration")  final String resourceKey)
	{
		final LanguageConfigurationResource  resource  = resourceCtx.getResource(LanguageConfigurationResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public LanguageModel getLanguageModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductFeatureResource} for current root resource 
	 */
	@Path("/productfeatures/{productfeature}")
	public AbstractYResource getProductFeatureResource(@PathParam("productfeature")  final String resourceKey)
	{
		final ProductFeatureResource  resource  = resourceCtx.getResource(ProductFeatureResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putLanguage(final LanguageDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link LanguageModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected LanguageModel readResource(final String resourceId) throws Exception
	{
		LanguageModel model = new LanguageModel();
		model.setIsocode(resourceId);
		return (LanguageModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(LanguageModel)}
	 */
	public void setLanguageModel(final LanguageModel value)
	{
		super.setResourceValue(value);
	}
	
}
