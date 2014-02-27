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

import de.hybris.platform.btg.dto.BTGReferenceKeyValuePairListOperandsDTO;
import de.hybris.platform.btg.model.BTGReferenceKeyValuePairListOperandModel;
import de.hybris.platform.btg.resource.BTGReferenceKeyValuePairListOperandResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGReferenceKeyValuePairListOperand defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgreferencekeyvaluepairlistoperands")
public class BTGReferenceKeyValuePairListOperandsResource extends AbstractCollectionResource <Collection<BTGReferenceKeyValuePairListOperandModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceKeyValuePairListOperandsResource()
	{
		super("BTGReferenceKeyValuePairListOperand");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGReferenceKeyValuePairListOperands()
	{
		return createGetResponse().build(BTGReferenceKeyValuePairListOperandsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceKeyValuePairListOperandResource} for current root resource 
	 */
	@Path("{btgreferencekeyvaluepairlistoperand}")
	public AbstractYResource getBTGReferenceKeyValuePairListOperandResource(@PathParam("btgreferencekeyvaluepairlistoperand")  final String resourceKey)
	{
		final BTGReferenceKeyValuePairListOperandResource  resource  = resourceCtx.getResource(BTGReferenceKeyValuePairListOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGReferenceKeyValuePairListOperandModel> getBTGReferenceKeyValuePairListOperandsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGReferenceKeyValuePairListOperandsCollection(final Collection<BTGReferenceKeyValuePairListOperandModel> value)
	{
		super.setResourceValue(value);
	}
	
}
