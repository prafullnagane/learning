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

import de.hybris.platform.cms2.dto.restrictions.CMSTimeRestrictionsDTO;
import de.hybris.platform.cms2.model.restrictions.CMSTimeRestrictionModel;
import de.hybris.platform.cms2.resource.restrictions.CMSTimeRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSTimeRestriction defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmstimerestrictions")
public class CMSTimeRestrictionsResource extends AbstractCollectionResource <Collection<CMSTimeRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTimeRestrictionsResource()
	{
		super("CMSTimeRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSTimeRestrictions()
	{
		return createGetResponse().build(CMSTimeRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSTimeRestrictionResource} for current root resource 
	 */
	@Path("{cmstimerestriction}")
	public AbstractYResource getCMSTimeRestrictionResource(@PathParam("cmstimerestriction")  final String resourceKey)
	{
		final CMSTimeRestrictionResource  resource  = resourceCtx.getResource(CMSTimeRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSTimeRestrictionModel> getCMSTimeRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSTimeRestrictionsCollection(final Collection<CMSTimeRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
