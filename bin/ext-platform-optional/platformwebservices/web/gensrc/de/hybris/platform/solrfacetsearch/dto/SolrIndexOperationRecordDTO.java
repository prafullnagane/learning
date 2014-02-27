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
package de.hybris.platform.solrfacetsearch.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.solrfacetsearch.dto.indexer.SolrIndexedCoresRecordDTO;
import de.hybris.platform.solrfacetsearch.model.SolrIndexOperationRecordModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrIndexOperationRecord first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexOperationRecordModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrindexoperationrecord")
public class SolrIndexOperationRecordDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.mode</code> attribute defined at extension <code> */
	private java.lang.String _mode;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.threadId</code> attribute defined at extension <code> */
	private java.lang.String _threadId;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.finishTime</code> attribute defined at extension <code> */
	private java.util.Date _finishTime;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.startTime</code> attribute defined at extension <code> */
	private java.util.Date _startTime;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.solrIndexCoreRecord</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.indexer.SolrIndexedCoresRecordDTO _solrIndexCoreRecord;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.failedReason</code> attribute defined at extension <code> */
	private java.lang.String _failedReason;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexOperationRecord.clusterId</code> attribute defined at extension <code> */
	private int _clusterId;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexOperationRecordDTO()
	{
		super();
	}
	
	
	public int getClusterId()
	{
		return this._clusterId;
	}
	
	public String getFailedReason()
	{
		return this._failedReason;
	}
	
	public Date getFinishTime()
	{
		return this._finishTime;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getMode()
	{
		return this._mode;
	}
	
	public SolrIndexedCoresRecordDTO getSolrIndexCoreRecord()
	{
		return this._solrIndexCoreRecord;
	}
	
	public Date getStartTime()
	{
		return this._startTime;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	public String getThreadId()
	{
		return this._threadId;
	}
	
	public void setClusterId(final int value)
	{
		this.modifiedPropsSet.add("clusterId");
		this._clusterId = value;
	}
	
	public void setFailedReason(final String value)
	{
		this.modifiedPropsSet.add("failedReason");
		this._failedReason = value;
	}
	
	public void setFinishTime(final Date value)
	{
		this.modifiedPropsSet.add("finishTime");
		this._finishTime = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setMode(final String value)
	{
		this.modifiedPropsSet.add("mode");
		this._mode = value;
	}
	
	public void setSolrIndexCoreRecord(final SolrIndexedCoresRecordDTO value)
	{
		this.modifiedPropsSet.add("solrIndexCoreRecord");
		this._solrIndexCoreRecord = value;
	}
	
	public void setStartTime(final Date value)
	{
		this.modifiedPropsSet.add("startTime");
		this._startTime = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setThreadId(final String value)
	{
		this.modifiedPropsSet.add("threadId");
		this._threadId = value;
	}
	
}
