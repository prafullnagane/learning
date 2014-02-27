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
package de.hybris.platform.servicelayer.internal.dto;

import de.hybris.platform.servicelayer.internal.dto.MaintenanceCleanupJobDTO;
import de.hybris.platform.servicelayer.internal.model.DynamicMaintenanceCleanupJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DynamicMaintenanceCleanupJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = DynamicMaintenanceCleanupJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "dynamicmaintenancecleanupjob")
public class DynamicMaintenanceCleanupJobDTO extends MaintenanceCleanupJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>DynamicMaintenanceCleanupJob.searchScript</code> attribute defined at extension <code> */
	private java.lang.String _searchScript;
	/** <i>Generated variable</i> - Variable of <code>DynamicMaintenanceCleanupJob.processScript</code> attribute defined at extension <code> */
	private java.lang.String _processScript;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicMaintenanceCleanupJobDTO()
	{
		super();
	}
	
	
	public String getProcessScript()
	{
		return this._processScript;
	}
	
	public String getSearchScript()
	{
		return this._searchScript;
	}
	
	public void setProcessScript(final String value)
	{
		this.modifiedPropsSet.add("processScript");
		this._processScript = value;
	}
	
	public void setSearchScript(final String value)
	{
		this.modifiedPropsSet.add("searchScript");
		this._searchScript = value;
	}
	
}
