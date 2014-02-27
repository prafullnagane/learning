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

import de.hybris.platform.btg.dto.BTGCartTotalSumOperandsDTO;
import de.hybris.platform.btg.model.BTGCartTotalSumOperandModel;
import de.hybris.platform.btg.resource.BTGCartTotalSumOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGCartTotalSumOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgcarttotalsumoperands")
public class BTGCartTotalSumOperandsResource extends AbstractCollectionResource <Collection<BTGCartTotalSumOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCartTotalSumOperandsResource()
	{
		super("BTGCartTotalSumOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGCartTotalSumOperands()
	{
		return createGetResponse().build(BTGCartTotalSumOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGCartTotalSumOperandResource} for current root resource 
	 */
	@Path("{btgcarttotalsumoperand}")
	public AbstractYResource getBTGCartTotalSumOperandResource(@PathParam("btgcarttotalsumoperand")  final String resourceKey)
	{
		final BTGCartTotalSumOperandResource  resource  = resourceCtx.getResource(BTGCartTotalSumOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGCartTotalSumOperandModel> getBTGCartTotalSumOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGCartTotalSumOperandsCollection(final Collection<BTGCartTotalSumOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
