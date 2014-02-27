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

import de.hybris.platform.core.dto.c2l.LanguagesDTO;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.resource.c2l.LanguageResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type Language defined at extension core Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/languages")
public class LanguagesResource extends AbstractCollectionResource <Collection<LanguageModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LanguagesResource()
	{
		super("Language");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllLanguages()
	{
		return createGetResponse().build(LanguagesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LanguageResource} for current root resource 
	 */
	@Path("{language}")
	public AbstractYResource getLanguageResource(@PathParam("language")  final String resourceKey)
	{
		final LanguageResource  resource  = resourceCtx.getResource(LanguageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<LanguageModel> getLanguagesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setLanguagesCollection(final Collection<LanguageModel> value)
	{
		super.setResourceValue(value);
	}
	
}
