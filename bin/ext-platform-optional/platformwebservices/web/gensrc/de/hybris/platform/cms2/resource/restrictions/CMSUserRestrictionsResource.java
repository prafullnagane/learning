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
package de.hybris.platform.cms2.resource.restrictions;

import de.hybris.platform.cms2.dto.restrictions.CMSUserRestrictionsDTO;
import de.hybris.platform.cms2.model.restrictions.CMSUserRestrictionModel;
import de.hybris.platform.cms2.resource.restrictions.CMSUserRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSUserRestriction defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsuserrestrictions")
public class CMSUserRestrictionsResource extends AbstractCollectionResource <Collection<CMSUserRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserRestrictionsResource()
	{
		super("CMSUserRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSUserRestrictions()
	{
		return createGetResponse().build(CMSUserRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSUserRestrictionResource} for current root resource 
	 */
	@Path("{cmsuserrestriction}")
	public AbstractYResource getCMSUserRestrictionResource(@PathParam("cmsuserrestriction")  final String resourceKey)
	{
		final CMSUserRestrictionResource  resource  = resourceCtx.getResource(CMSUserRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSUserRestrictionModel> getCMSUserRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSUserRestrictionsCollection(final Collection<CMSUserRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
