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
import de.hybris.platform.workflow.dto.WorkflowDecisionTemplatesDTO;
import de.hybris.platform.workflow.model.WorkflowDecisionTemplateModel;
import de.hybris.platform.workflow.resource.WorkflowDecisionTemplateResource;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated REST root resource for a collection of elements of  type WorkflowDecisionTemplate defined at extension workflow Allowed methods: GET, POST, PUT, DELETE, HEADER  
 */
@SuppressWarnings("all")
@Path("/workflowdecisiontemplates")
public class WorkflowDecisionTemplatesResource extends AbstractCollectionResource <Collection<WorkflowDecisionTemplateModel>>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WorkflowDecisionTemplatesResource()
	{
		super("WorkflowDecisionTemplate");
	}
	
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getAllWorkflowDecisionTemplates()
	{
		return createGetResponse().build(WorkflowDecisionTemplatesDTO.class);
	}
	
	/**
	 *  Generated getter for sub resource of type {@link WorkflowDecisionTemplateResource} for current root resource 
	 */
	@Path("{workflowdecisiontemplate}")
	public AbstractYResource getWorkflowDecisionTemplateResource(@PathParam("workflowdecisiontemplate")  final String resourceKey)
	{
		final WorkflowDecisionTemplateResource  resource  = resourceCtx.getResource(WorkflowDecisionTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		super.prepareJaloSession();
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public Collection<WorkflowDecisionTemplateModel> getWorkflowDecisionTemplatesCollection()
	{
		return super.getResourceValue();
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(Collection)}
	 */
	public void setWorkflowDecisionTemplatesCollection(final Collection<WorkflowDecisionTemplateModel> value)
	{
		super.setResourceValue(value);
	}
	
}
