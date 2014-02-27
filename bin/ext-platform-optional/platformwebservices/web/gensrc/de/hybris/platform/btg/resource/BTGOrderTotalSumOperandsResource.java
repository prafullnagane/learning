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

import de.hybris.platform.btg.dto.BTGOrderTotalSumOperandsDTO;
import de.hybris.platform.btg.model.BTGOrderTotalSumOperandModel;
import de.hybris.platform.btg.resource.BTGOrderTotalSumOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGOrderTotalSumOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgordertotalsumoperands")
public class BTGOrderTotalSumOperandsResource extends AbstractCollectionResource <Collection<BTGOrderTotalSumOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOrderTotalSumOperandsResource()
	{
		super("BTGOrderTotalSumOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGOrderTotalSumOperands()
	{
		return createGetResponse().build(BTGOrderTotalSumOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGOrderTotalSumOperandResource} for current root resource 
	 */
	@Path("{btgordertotalsumoperand}")
	public AbstractYResource getBTGOrderTotalSumOperandResource(@PathParam("btgordertotalsumoperand")  final String resourceKey)
	{
		final BTGOrderTotalSumOperandResource  resource  = resourceCtx.getResource(BTGOrderTotalSumOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGOrderTotalSumOperandModel> getBTGOrderTotalSumOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGOrderTotalSumOperandsCollection(final Collection<BTGOrderTotalSumOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
