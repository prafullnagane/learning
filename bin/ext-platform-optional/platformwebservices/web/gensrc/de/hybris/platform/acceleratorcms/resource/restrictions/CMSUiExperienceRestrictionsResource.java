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
package de.hybris.platform.acceleratorcms.resource.restrictions;

import de.hybris.platform.acceleratorcms.dto.restrictions.CMSUiExperienceRestrictionsDTO;
import de.hybris.platform.acceleratorcms.model.restrictions.CMSUiExperienceRestrictionModel;
import de.hybris.platform.acceleratorcms.resource.restrictions.CMSUiExperienceRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSUiExperienceRestriction defined at extension acceleratorcms Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsuiexperiencerestrictions")
public class CMSUiExperienceRestrictionsResource extends AbstractCollectionResource <Collection<CMSUiExperienceRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUiExperienceRestrictionsResource()
	{
		super("CMSUiExperienceRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSUiExperienceRestrictions()
	{
		return createGetResponse().build(CMSUiExperienceRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSUiExperienceRestrictionResource} for current root resource 
	 */
	@Path("{cmsuiexperiencerestriction}")
	public AbstractYResource getCMSUiExperienceRestrictionResource(@PathParam("cmsuiexperiencerestriction")  final String resourceKey)
	{
		final CMSUiExperienceRestrictionResource  resource  = resourceCtx.getResource(CMSUiExperienceRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSUiExperienceRestrictionModel> getCMSUiExperienceRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSUiExperienceRestrictionsCollection(final Collection<CMSUiExperienceRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
