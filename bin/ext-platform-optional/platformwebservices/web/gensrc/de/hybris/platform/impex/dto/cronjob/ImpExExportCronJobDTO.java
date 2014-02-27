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
package de.hybris.platform.impex.dto.cronjob;

import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.impex.dto.ImpExMediaDTO;
import de.hybris.platform.impex.dto.exp.ExportDTO;
import de.hybris.platform.impex.dto.exp.HeaderLibraryDTO;
import de.hybris.platform.impex.dto.exp.ImpExExportMediaDTO;
import de.hybris.platform.impex.dto.exp.ReportDTO;
import de.hybris.platform.impex.model.cronjob.ImpExExportCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ImpExExportCronJob first defined at extension impex
 */
@SuppressWarnings("all")
@GraphNode(target = ImpExExportCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "impexexportcronjob")
public class ImpExExportCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.fieldSeparator</code> attribute defined at extension <code> */
	private java.lang.Character _fieldSeparator;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.exportTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.exp.HeaderLibraryDTO _exportTemplate;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.itemsExported</code> attribute defined at extension <code> */
	private java.lang.Integer _itemsExported;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.report</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.exp.ReportDTO _report;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.itemsMaxCount</code> attribute defined at extension <code> */
	private java.lang.Integer _itemsMaxCount;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.mediasExportMediaCode</code> attribute defined at extension <code> */
	private java.lang.String _mediasExportMediaCode;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.dataExportTarget</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.exp.ImpExExportMediaDTO _dataExportTarget;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.encoding</code> attribute defined at extension <code> */
	private java.lang.String _encoding;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.jobMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _jobMedia;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.singleFile</code> attribute defined at extension <code> */
	private java.lang.Boolean _singleFile;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.dataExportMediaCode</code> attribute defined at extension <code> */
	private java.lang.String _dataExportMediaCode;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.commentCharacter</code> attribute defined at extension <code> */
	private java.lang.Character _commentCharacter;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.mediasExportTarget</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.exp.ImpExExportMediaDTO _mediasExportTarget;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.export</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.exp.ExportDTO _export;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.quoteCharacter</code> attribute defined at extension <code> */
	private java.lang.Character _quoteCharacter;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.itemsSkipped</code> attribute defined at extension <code> */
	private java.lang.Integer _itemsSkipped;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.mode</code> attribute defined at extension <code> */
	private java.lang.String _mode;
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.converterClass</code> attribute defined at extension <code> */
	private java.lang.String _converterClass;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportCronJobDTO()
	{
		super();
	}
	
	
	public Character getCommentCharacter()
	{
		return this._commentCharacter;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getConverterClass()
	{
		return this._converterClass;
	}
	
	public String getDataExportMediaCode()
	{
		return this._dataExportMediaCode;
	}
	
	public ImpExExportMediaDTO getDataExportTarget()
	{
		return this._dataExportTarget;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEncoding()
	{
		return this._encoding;
	}
	
	public ExportDTO getExport()
	{
		return this._export;
	}
	
	public HeaderLibraryDTO getExportTemplate()
	{
		return this._exportTemplate;
	}
	
	public Character getFieldSeparator()
	{
		return this._fieldSeparator;
	}
	
	public Integer getItemsExported()
	{
		return this._itemsExported;
	}
	
	public Integer getItemsMaxCount()
	{
		return this._itemsMaxCount;
	}
	
	public Integer getItemsSkipped()
	{
		return this._itemsSkipped;
	}
	
	public ImpExMediaDTO getJobMedia()
	{
		return this._jobMedia;
	}
	
	public String getMediasExportMediaCode()
	{
		return this._mediasExportMediaCode;
	}
	
	public ImpExExportMediaDTO getMediasExportTarget()
	{
		return this._mediasExportTarget;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getMode()
	{
		return this._mode;
	}
	
	public Character getQuoteCharacter()
	{
		return this._quoteCharacter;
	}
	
	public ReportDTO getReport()
	{
		return this._report;
	}
	
	public Boolean getSingleFile()
	{
		return this._singleFile;
	}
	
	public void setCommentCharacter(final Character value)
	{
		this.modifiedPropsSet.add("commentCharacter");
		this._commentCharacter = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setConverterClass(final String value)
	{
		this.modifiedPropsSet.add("converterClass");
		this._converterClass = value;
	}
	
	public void setDataExportMediaCode(final String value)
	{
		this.modifiedPropsSet.add("dataExportMediaCode");
		this._dataExportMediaCode = value;
	}
	
	public void setDataExportTarget(final ImpExExportMediaDTO value)
	{
		this.modifiedPropsSet.add("dataExportTarget");
		this._dataExportTarget = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEncoding(final String value)
	{
		this.modifiedPropsSet.add("encoding");
		this._encoding = value;
	}
	
	public void setExport(final ExportDTO value)
	{
		this.modifiedPropsSet.add("export");
		this._export = value;
	}
	
	public void setExportTemplate(final HeaderLibraryDTO value)
	{
		this.modifiedPropsSet.add("exportTemplate");
		this._exportTemplate = value;
	}
	
	public void setFieldSeparator(final Character value)
	{
		this.modifiedPropsSet.add("fieldSeparator");
		this._fieldSeparator = value;
	}
	
	public void setItemsExported(final Integer value)
	{
		this.modifiedPropsSet.add("itemsExported");
		this._itemsExported = value;
	}
	
	public void setItemsMaxCount(final Integer value)
	{
		this.modifiedPropsSet.add("itemsMaxCount");
		this._itemsMaxCount = value;
	}
	
	public void setItemsSkipped(final Integer value)
	{
		this.modifiedPropsSet.add("itemsSkipped");
		this._itemsSkipped = value;
	}
	
	public void setJobMedia(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("jobMedia");
		this._jobMedia = value;
	}
	
	public void setMediasExportMediaCode(final String value)
	{
		this.modifiedPropsSet.add("mediasExportMediaCode");
		this._mediasExportMediaCode = value;
	}
	
	public void setMediasExportTarget(final ImpExExportMediaDTO value)
	{
		this.modifiedPropsSet.add("mediasExportTarget");
		this._mediasExportTarget = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setMode(final String value)
	{
		this.modifiedPropsSet.add("mode");
		this._mode = value;
	}
	
	public void setQuoteCharacter(final Character value)
	{
		this.modifiedPropsSet.add("quoteCharacter");
		this._quoteCharacter = value;
	}
	
	public void setReport(final ReportDTO value)
	{
		this.modifiedPropsSet.add("report");
		this._report = value;
	}
	
	public void setSingleFile(final Boolean value)
	{
		this.modifiedPropsSet.add("singleFile");
		this._singleFile = value;
	}
	
}
