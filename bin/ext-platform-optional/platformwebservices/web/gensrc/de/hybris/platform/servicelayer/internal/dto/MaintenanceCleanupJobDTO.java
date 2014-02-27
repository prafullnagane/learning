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

import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.servicelayer.internal.dto.ServicelayerJobDTO;
import de.hybris.platform.servicelayer.internal.model.MaintenanceCleanupJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MaintenanceCleanupJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = MaintenanceCleanupJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "maintenancecleanupjob")
public class MaintenanceCleanupJobDTO extends ServicelayerJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>MaintenanceCleanupJob.searchType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _searchType;
	/** <i>Generated variable</i> - Variable of <code>MaintenanceCleanupJob.threshold</code> attribute defined at extension <code> */
	private java.lang.Integer _threshold;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MaintenanceCleanupJobDTO()
	{
		super();
	}
	
	
	public ComposedTypeDTO getSearchType()
	{
		return this._searchType;
	}
	
	public Integer getThreshold()
	{
		return this._threshold;
	}
	
	public void setSearchType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("searchType");
		this._searchType = value;
	}
	
	public void setThreshold(final Integer value)
	{
		this.modifiedPropsSet.add("threshold");
		this._threshold = value;
	}
	
}
