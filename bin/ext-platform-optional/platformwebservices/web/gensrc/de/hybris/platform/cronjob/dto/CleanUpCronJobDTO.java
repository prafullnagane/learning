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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.model.CleanUpCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumCollectionToStringValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringCollectionToHybrisEnumValuesConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CleanUpCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = CleanUpCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cleanupcronjob")
public class CleanUpCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>CleanUpCronJob.xDaysOld</code> attribute defined at extension <code> */
	private int _xDaysOld;
	/** <i>Generated variable</i> - Variable of <code>CleanUpCronJob.excludeCronJobs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cronjob.dto.CronJobDTO> _excludeCronJobs;
	/** <i>Generated variable</i> - Variable of <code>CleanUpCronJob.resultcoll</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _resultcoll;
	/** <i>Generated variable</i> - Variable of <code>CleanUpCronJob.statuscoll</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _statuscoll;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CleanUpCronJobDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "excludeCronJobs")
	@XmlElement(name = "cronJob")
	public List<CronJobDTO> getExcludeCronJobs()
	{
		return this._excludeCronJobs;
	}
	
	@GraphProperty(interceptor = StringCollectionToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "resultcoll")
	@XmlElement(name = "cronJobResult")
	public Collection<String> getResultcoll()
	{
		return this._resultcoll;
	}
	
	@GraphProperty(interceptor = StringCollectionToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "statuscoll")
	@XmlElement(name = "cronJobStatus")
	public Collection<String> getStatuscoll()
	{
		return this._statuscoll;
	}
	
	public int getXDaysOld()
	{
		return this._xDaysOld;
	}
	
	public void setExcludeCronJobs(final List<CronJobDTO> value)
	{
		this.modifiedPropsSet.add("excludeCronJobs");
		this._excludeCronJobs = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumCollectionToStringValuesConverter.class)
	public void setResultcoll(final Collection<String> value)
	{
		this.modifiedPropsSet.add("resultcoll");
		this._resultcoll = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumCollectionToStringValuesConverter.class)
	public void setStatuscoll(final Collection<String> value)
	{
		this.modifiedPropsSet.add("statuscoll");
		this._statuscoll = value;
	}
	
	public void setXDaysOld(final int value)
	{
		this.modifiedPropsSet.add("xDaysOld");
		this._xDaysOld = value;
	}
	
}
