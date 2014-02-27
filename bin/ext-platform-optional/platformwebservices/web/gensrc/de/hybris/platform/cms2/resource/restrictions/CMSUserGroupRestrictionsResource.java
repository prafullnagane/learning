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

import de.hybris.platform.cms2.dto.restrictions.CMSUserGroupRestrictionsDTO;
import de.hybris.platform.cms2.model.restrictions.CMSUserGroupRestrictionModel;
import de.hybris.platform.cms2.resource.restrictions.CMSUserGroupRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSUserGroupRestriction defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsusergrouprestrictions")
public class CMSUserGroupRestrictionsResource extends AbstractCollectionResource <Collection<CMSUserGroupRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSUserGroupRestrictionsResource()
	{
		super("CMSUserGroupRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSUserGroupRestrictions()
	{
		return createGetResponse().build(CMSUserGroupRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSUserGroupRestrictionResource} for current root resource 
	 */
	@Path("{cmsusergrouprestriction}")
	public AbstractYResource getCMSUserGroupRestrictionResource(@PathParam("cmsusergrouprestriction")  final String resourceKey)
	{
		final CMSUserGroupRestrictionResource  resource  = resourceCtx.getResource(CMSUserGroupRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSUserGroupRestrictionModel> getCMSUserGroupRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSUserGroupRestrictionsCollection(final Collection<CMSUserGroupRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
