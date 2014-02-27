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
package de.hybris.platform.workflow.resource;

import de.hybris.platform.webservices.AbstractCollectionResource;
import de.hybris.platform.webservices.AbstractYResource;
import de.hybris.platform.workflow.dto.AbstractWorkflowDecisionsDTO;
import de.hybris.platform.workflow.model.AbstractWorkflowDecisionModel;
import de.hybris.platform.workflow.resource.AbstractWorkflowDecisionResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type AbstractWorkflowDecision defined at extension workflow Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/abstractworkflowdecisions")
public class AbstractWorkflowDecisionsResource extends AbstractCollectionResource <Collection<AbstractWorkflowDecisionModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractWorkflowDecisionsResource()
	{
		super("AbstractWorkflowDecision");
	}
	
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractWorkflowDecisionResource} for current root resource 
	 */
	@Path("{abstractworkflowdecision}")
	public AbstractYResource getAbstractWorkflowDecisionResource(@PathParam("abstractworkflowdecision")  final String resourceKey)
	{
		final AbstractWorkflowDecisionResource  resource  = resourceCtx.getResource(AbstractWorkflowDecisionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<AbstractWorkflowDecisionModel> getAbstractWorkflowDecisionsCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllAbstractWorkflowDecisions()
	{
		return createGetResponse().build(AbstractWorkflowDecisionsDTO.class);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setAbstractWorkflowDecisionsCollection(final Collection<AbstractWorkflowDecisionModel> value)
	{
		super.setResourceValue(value);
	}
	
}
