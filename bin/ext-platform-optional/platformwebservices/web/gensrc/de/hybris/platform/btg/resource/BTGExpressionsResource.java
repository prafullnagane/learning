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

import de.hybris.platform.btg.dto.BTGExpressionsDTO;
import de.hybris.platform.btg.model.BTGExpressionModel;
import de.hybris.platform.btg.resource.BTGExpressionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGExpression defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgexpressions")
public class BTGExpressionsResource extends AbstractCollectionResource <Collection<BTGExpressionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGExpressionsResource()
	{
		super("BTGExpression");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGExpressions()
	{
		return createGetResponse().build(BTGExpressionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGExpressionResource} for current root resource 
	 */
	@Path("{btgexpression}")
	public AbstractYResource getBTGExpressionResource(@PathParam("btgexpression")  final String resourceKey)
	{
		final BTGExpressionResource  resource  = resourceCtx.getResource(BTGExpressionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGExpressionModel> getBTGExpressionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGExpressionsCollection(final Collection<BTGExpressionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
