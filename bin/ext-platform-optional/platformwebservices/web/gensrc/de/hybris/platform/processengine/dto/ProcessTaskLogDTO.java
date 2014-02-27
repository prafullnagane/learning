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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.processengine.dto.BusinessProcessDTO;
import de.hybris.platform.processengine.model.ProcessTaskLogModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProcessTaskLog first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = ProcessTaskLogModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "processtasklog")
public class ProcessTaskLogDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProcessTaskLog.actionId</code> attribute defined at extension <code> */
	private java.lang.String _actionId;
	/** <i>Generated variable</i> - Variable of <code>ProcessTaskLog.clusterId</code> attribute defined at extension <code> */
	private java.lang.Integer _clusterId;
	/** <i>Generated variable</i> - Variable of <code>ProcessTaskLog.startDate</code> attribute defined at extension <code> */
	private java.util.Date _startDate;
	/** <i>Generated variable</i> - Variable of <code>ProcessTaskLog.endDate</code> attribute defined at extension <code> */
	private java.util.Date _endDate;
	/** <i>Generated variable</i> - Variable of <code>ProcessTaskLog.logMessages</code> attribute defined at extension <code> */
	private java.lang.String _logMessages;
	/** <i>Generated variable</i> - Variable of <code>ProcessTaskLog.process</code> attribute defined at extension <code> */
	private de.hybris.platform.processengine.dto.BusinessProcessDTO _process;
	/** <i>Generated variable</i> - Variable of <code>ProcessTaskLog.returnCode</code> attribute defined at extension <code> */
	private java.lang.String _returnCode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProcessTaskLogDTO()
	{
		super();
	}
	
	
	public String getActionId()
	{
		return this._actionId;
	}
	
	public Integer getClusterId()
	{
		return this._clusterId;
	}
	
	public Date getEndDate()
	{
		return this._endDate;
	}
	
	public String getLogMessages()
	{
		return this._logMessages;
	}
	
	public BusinessProcessDTO getProcess()
	{
		return this._process;
	}
	
	public String getReturnCode()
	{
		return this._returnCode;
	}
	
	public Date getStartDate()
	{
		return this._startDate;
	}
	
	public void setActionId(final String value)
	{
		this.modifiedPropsSet.add("actionId");
		this._actionId = value;
	}
	
	public void setClusterId(final Integer value)
	{
		this.modifiedPropsSet.add("clusterId");
		this._clusterId = value;
	}
	
	public void setEndDate(final Date value)
	{
		this.modifiedPropsSet.add("endDate");
		this._endDate = value;
	}
	
	public void setLogMessages(final String value)
	{
		this.modifiedPropsSet.add("logMessages");
		this._logMessages = value;
	}
	
	public void setProcess(final BusinessProcessDTO value)
	{
		this.modifiedPropsSet.add("process");
		this._process = value;
	}
	
	public void setReturnCode(final String value)
	{
		this.modifiedPropsSet.add("returnCode");
		this._returnCode = value;
	}
	
	public void setStartDate(final Date value)
	{
		this.modifiedPropsSet.add("startDate");
		this._startDate = value;
	}
	
}
