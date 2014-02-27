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
package de.hybris.platform.processengine.dto;

import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.processengine.model.ProcessTaskModel;
import de.hybris.platform.task.TaskDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProcessTask first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = ProcessTaskModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "processtask")
public class ProcessTaskDTO extends TaskDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProcessTask.action</code> attribute defined at extension <code> */
	private java.lang.String _action;
	/** <i>Generated variable</i> - Variable of <code>ProcessTask.process</code> attribute defined at extension <code> */
	private de.hybris.platform.processengine.dto.BusinessProcessDTO _process;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProcessTaskDTO()
	{
		super();
	}
	
	
	public String getAction()
	{
		return this._action;
	}
	
	public BusinessProcessDTO getProcess()
	{
		return this._process;
	}
	
	public void setAction(final String value)
	{
		this.modifiedPropsSet.add("action");
		this._action = value;
	}
	
	public void setProcess(final BusinessProcessDTO value)
	{
		this.modifiedPropsSet.add("process");
		this._process = value;
	}
	
}
