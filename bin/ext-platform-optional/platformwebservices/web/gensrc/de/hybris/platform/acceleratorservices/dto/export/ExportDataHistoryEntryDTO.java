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
package de.hybris.platform.acceleratorservices.dto.export;

import de.hybris.platform.acceleratorservices.dto.export.ExportDataCronJobDTO;
import de.hybris.platform.acceleratorservices.model.export.ExportDataHistoryEntryModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ExportDataHistoryEntry first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = ExportDataHistoryEntryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "exportdatahistoryentry")
public class ExportDataHistoryEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.startTime</code> attribute defined at extension <code> */
	private java.util.Date _startTime;
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.exportDataCronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.acceleratorservices.dto.export.ExportDataCronJobDTO _exportDataCronJob;
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.finishTime</code> attribute defined at extension <code> */
	private java.util.Date _finishTime;
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.processedResultCount</code> attribute defined at extension <code> */
	private java.lang.Integer _processedResultCount;
	/** <i>Generated variable</i> - Variable of <code>ExportDataHistoryEntry.failureMessage</code> attribute defined at extension <code> */
	private java.lang.String _failureMessage;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataHistoryEntryDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public ExportDataCronJobDTO getExportDataCronJob()
	{
		return this._exportDataCronJob;
	}
	
	public String getFailureMessage()
	{
		return this._failureMessage;
	}
	
	public Date getFinishTime()
	{
		return this._finishTime;
	}
	
	public Integer getProcessedResultCount()
	{
		return this._processedResultCount;
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
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setExportDataCronJob(final ExportDataCronJobDTO value)
	{
		this.modifiedPropsSet.add("exportDataCronJob");
		this._exportDataCronJob = value;
	}
	
	public void setFailureMessage(final String value)
	{
		this.modifiedPropsSet.add("failureMessage");
		this._failureMessage = value;
	}
	
	public void setFinishTime(final Date value)
	{
		this.modifiedPropsSet.add("finishTime");
		this._finishTime = value;
	}
	
	public void setProcessedResultCount(final Integer value)
	{
		this.modifiedPropsSet.add("processedResultCount");
		this._processedResultCount = value;
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
	
}
