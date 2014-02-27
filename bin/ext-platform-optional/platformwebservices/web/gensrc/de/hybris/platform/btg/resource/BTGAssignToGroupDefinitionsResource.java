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

import de.hybris.platform.btg.dto.BTGAssignToGroupDefinitionsDTO;
import de.hybris.platform.btg.model.BTGAssignToGroupDefinitionModel;
import de.hybris.platform.btg.resource.BTGAssignToGroupDefinitionResource;
import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type BTGAssignToGroupDefinition defined at extension btg Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/btgassigntogroupdefinitions")
public class BTGAssignToGroupDefinitionsResource extends AbstractCollectionResource <Collection<BTGAssignToGroupDefinitionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAssignToGroupDefinitionsResource()
	{
		super("BTGAssignToGroupDefinition");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllBTGAssignToGroupDefinitions()
	{
		return createGetResponse().build(BTGAssignToGroupDefinitionsDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAssignToGroupDefinitionResource} for current root resource 
	 */
	@Path("{btgassigntogroupdefinition}")
	public AbstractYResource getBTGAssignToGroupDefinitionResource(@PathParam("btgassigntogroupdefinition")  final String resourceKey)
	{
		final BTGAssignToGroupDefinitionResource  resource  = resourceCtx.getResource(BTGAssignToGroupDefinitionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<BTGAssignToGroupDefinitionModel> getBTGAssignToGroupDefinitionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setBTGAssignToGroupDefinitionsCollection(final Collection<BTGAssignToGroupDefinitionModel> value)
	{
		super.setResourceValue(value);
	}
	
}