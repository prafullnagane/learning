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
package de.hybris.platform.deeplink.resource.rules;

import de.hybris.platform.deeplink.dto.rules.DeeplinkUrlRuleDTO;
import de.hybris.platform.deeplink.dto.rules.DeeplinkUrlRulesDTO;
import de.hybris.platform.deeplink.model.rules.DeeplinkUrlRuleModel;
import de.hybris.platform.deeplink.resource.rules.DeeplinkUrlRuleResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type DeeplinkUrlRule defined at extension basecommerce Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/deeplinkurlrules")
public class DeeplinkUrlRulesResource extends AbstractCollectionResource <Collection<DeeplinkUrlRuleModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeeplinkUrlRulesResource()
	{
		super("DeeplinkUrlRule");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllDeeplinkUrlRules()
	{
		return createGetResponse().build(DeeplinkUrlRulesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DeeplinkUrlRuleResource} for current root resource 
	 */
	@Path("{deeplinkurlrule}")
	public AbstractYResource getDeeplinkUrlRuleResource(@PathParam("deeplinkurlrule")  final String resourceKey)
	{
		final DeeplinkUrlRuleResource  resource  = resourceCtx.getResource(DeeplinkUrlRuleResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<DeeplinkUrlRuleModel> getDeeplinkUrlRulesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering POST requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@POST
	public Response postDeeplinkUrlRule(final DeeplinkUrlRuleDTO dto)
	{
		return createPostResponse(dto).build();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setDeeplinkUrlRulesCollection(final Collection<DeeplinkUrlRuleModel> value)
	{
		super.setResourceValue(value);
	}
	
}
