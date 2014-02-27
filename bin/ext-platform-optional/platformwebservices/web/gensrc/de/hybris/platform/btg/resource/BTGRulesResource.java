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
package de.hybris.platform.btg.resource;

import de.hybris.platform.btg.dto.BTGRulesDTO;
import de.hybris.platform.btg.model.BTGRuleModel;
import de.hybris.platform.btg.resource.BTGRuleResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGRule defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgrules")
public class BTGRulesResource extends AbstractCollectionResource <Collection<BTGRuleModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGRulesResource()
	{
		super("BTGRule");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGRules()
	{
		return createGetResponse().build(BTGRulesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGRuleResource} for current root resource 
	 */
	@Path("{btgrule}")
	public AbstractYResource getBTGRuleResource(@PathParam("btgrule")  final String resourceKey)
	{
		final BTGRuleResource  resource  = resourceCtx.getResource(BTGRuleResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGRuleModel> getBTGRulesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGRulesCollection(final Collection<BTGRuleModel> value)
	{
		super.setResourceValue(value);
	}
	
}
