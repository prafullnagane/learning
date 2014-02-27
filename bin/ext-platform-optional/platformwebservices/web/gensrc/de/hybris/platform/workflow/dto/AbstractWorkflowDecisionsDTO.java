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
package de.hybris.platform.workflow.dto;

import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import de.hybris.platform.workflow.dto.AbstractWorkflowDecisionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractWorkflowDecision first defined at extension workflow
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractworkflowdecisions")
public class AbstractWorkflowDecisionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractWorkflowDecisionDTO*/
	private List<AbstractWorkflowDecisionDTO>  abstractworkflowdecisionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractWorkflowDecisionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractWorkflowDecisionsDTO(final List<AbstractWorkflowDecisionDTO> abstractworkflowdecisionsList)
	{
		super();
		this.abstractworkflowdecisionsList=abstractworkflowdecisionsList;
	}
	
	
	/**
	 * @return the abstractworkflowdecisions
	 */
	@XmlElement(name = "abstractworkflowdecision")
	public List<AbstractWorkflowDecisionDTO> getAbstractWorkflowDecisions()
	{
		return	abstractworkflowdecisionsList;
	}
	
	/**
	 * @param abstractworkflowdecisionsList 
	 *  the abstractworkflowdecisionsList to set   
	 */
	public void setAbstractWorkflowDecisions(final List<AbstractWorkflowDecisionDTO> abstractworkflowdecisionsList)
	{
		this.abstractworkflowdecisionsList=abstractworkflowdecisionsList;
	}
	
}
