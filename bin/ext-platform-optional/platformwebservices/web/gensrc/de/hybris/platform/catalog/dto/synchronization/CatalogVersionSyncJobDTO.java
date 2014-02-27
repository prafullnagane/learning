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
package de.hybris.platform.catalog.dto.synchronization;

import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncJobDTO;
import de.hybris.platform.catalog.model.synchronization.CatalogVersionSyncJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CatalogVersionSyncJob first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CatalogVersionSyncJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "catalogversionsyncjob")
public class CatalogVersionSyncJobDTO extends SyncItemJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncJob.enableTransactions</code> attribute defined at extension <code> */
	private java.lang.Boolean _enableTransactions;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncJob.dependsOnSyncJobs</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncJobDTO> _dependsOnSyncJobs;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncJob.copyCacheSize</code> attribute defined at extension <code> */
	private java.lang.Integer _copyCacheSize;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncJob.maxThreads</code> attribute defined at extension <code> */
	private java.lang.Integer _maxThreads;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncJob.maxSchedulerThreads</code> attribute defined at extension <code> */
	private java.lang.Integer _maxSchedulerThreads;
	/** <i>Generated variable</i> - Variable of <code>CatalogVersionSyncJob.dependentSyncJobs</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.catalog.dto.synchronization.CatalogVersionSyncJobDTO> _dependentSyncJobs;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionSyncJobDTO()
	{
		super();
	}
	
	
	public Integer getCopyCacheSize()
	{
		return this._copyCacheSize;
	}
	
	@XmlElementWrapper(name = "dependentSyncJobs")
	@XmlElement(name = "catalogVersionSyncJob")
	public Set<CatalogVersionSyncJobDTO> getDependentSyncJobs()
	{
		return this._dependentSyncJobs;
	}
	
	@XmlElementWrapper(name = "dependsOnSyncJobs")
	@XmlElement(name = "catalogVersionSyncJob")
	public Set<CatalogVersionSyncJobDTO> getDependsOnSyncJobs()
	{
		return this._dependsOnSyncJobs;
	}
	
	public Boolean getEnableTransactions()
	{
		return this._enableTransactions;
	}
	
	public Integer getMaxSchedulerThreads()
	{
		return this._maxSchedulerThreads;
	}
	
	public Integer getMaxThreads()
	{
		return this._maxThreads;
	}
	
	public void setCopyCacheSize(final Integer value)
	{
		this.modifiedPropsSet.add("copyCacheSize");
		this._copyCacheSize = value;
	}
	
	public void setDependentSyncJobs(final Set<CatalogVersionSyncJobDTO> value)
	{
		this.modifiedPropsSet.add("dependentSyncJobs");
		this._dependentSyncJobs = value;
	}
	
	public void setDependsOnSyncJobs(final Set<CatalogVersionSyncJobDTO> value)
	{
		this.modifiedPropsSet.add("dependsOnSyncJobs");
		this._dependsOnSyncJobs = value;
	}
	
	public void setEnableTransactions(final Boolean value)
	{
		this.modifiedPropsSet.add("enableTransactions");
		this._enableTransactions = value;
	}
	
	public void setMaxSchedulerThreads(final Integer value)
	{
		this.modifiedPropsSet.add("maxSchedulerThreads");
		this._maxSchedulerThreads = value;
	}
	
	public void setMaxThreads(final Integer value)
	{
		this.modifiedPropsSet.add("maxThreads");
		this._maxThreads = value;
	}
	
}
