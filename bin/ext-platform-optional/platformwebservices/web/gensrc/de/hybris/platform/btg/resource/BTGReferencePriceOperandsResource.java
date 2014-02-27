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

import de.hybris.platform.btg.dto.BTGReferencePriceOperandsDTO;
import de.hybris.platform.btg.model.BTGReferencePriceOperandModel;
import de.hybris.platform.btg.resource.BTGReferencePriceOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGReferencePriceOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgreferencepriceoperands")
public class BTGReferencePriceOperandsResource extends AbstractCollectionResource <Collection<BTGReferencePriceOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferencePriceOperandsResource()
	{
		super("BTGReferencePriceOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGReferencePriceOperands()
	{
		return createGetResponse().build(BTGReferencePriceOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferencePriceOperandResource} for current root resource 
	 */
	@Path("{btgreferencepriceoperand}")
	public AbstractYResource getBTGReferencePriceOperandResource(@PathParam("btgreferencepriceoperand")  final String resourceKey)
	{
		final BTGReferencePriceOperandResource  resource  = resourceCtx.getResource(BTGReferencePriceOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGReferencePriceOperandModel> getBTGReferencePriceOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGReferencePriceOperandsCollection(final Collection<BTGReferencePriceOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
