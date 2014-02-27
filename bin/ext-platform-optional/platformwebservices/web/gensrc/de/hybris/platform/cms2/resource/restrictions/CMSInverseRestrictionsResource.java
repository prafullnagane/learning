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

import de.hybris.platform.cms2.dto.restrictions.CMSInverseRestrictionsDTO;
import de.hybris.platform.cms2.model.restrictions.CMSInverseRestrictionModel;
import de.hybris.platform.cms2.resource.restrictions.CMSInverseRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSInverseRestriction defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmsinverserestrictions")
public class CMSInverseRestrictionsResource extends AbstractCollectionResource <Collection<CMSInverseRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSInverseRestrictionsResource()
	{
		super("CMSInverseRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSInverseRestrictions()
	{
		return createGetResponse().build(CMSInverseRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSInverseRestrictionResource} for current root resource 
	 */
	@Path("{cmsinverserestriction}")
	public AbstractYResource getCMSInverseRestrictionResource(@PathParam("cmsinverserestriction")  final String resourceKey)
	{
		final CMSInverseRestrictionResource  resource  = resourceCtx.getResource(CMSInverseRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSInverseRestrictionModel> getCMSInverseRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSInverseRestrictionsCollection(final Collection<CMSInverseRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
