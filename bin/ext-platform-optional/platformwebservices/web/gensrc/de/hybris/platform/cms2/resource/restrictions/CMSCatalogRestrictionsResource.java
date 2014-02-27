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

import de.hybris.platform.cms2.dto.restrictions.CMSCatalogRestrictionsDTO;
import de.hybris.platform.cms2.model.restrictions.CMSCatalogRestrictionModel;
import de.hybris.platform.cms2.resource.restrictions.CMSCatalogRestrictionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type CMSCatalogRestriction defined at extension cms2 Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/cmscatalogrestrictions")
public class CMSCatalogRestrictionsResource extends AbstractCollectionResource <Collection<CMSCatalogRestrictionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSCatalogRestrictionsResource()
	{
		super("CMSCatalogRestriction");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllCMSCatalogRestrictions()
	{
		return createGetResponse().build(CMSCatalogRestrictionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSCatalogRestrictionResource} for current root resource 
	 */
	@Path("{cmscatalogrestriction}")
	public AbstractYResource getCMSCatalogRestrictionResource(@PathParam("cmscatalogrestriction")  final String resourceKey)
	{
		final CMSCatalogRestrictionResource  resource  = resourceCtx.getResource(CMSCatalogRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<CMSCatalogRestrictionModel> getCMSCatalogRestrictionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setCMSCatalogRestrictionsCollection(final Collection<CMSCatalogRestrictionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
