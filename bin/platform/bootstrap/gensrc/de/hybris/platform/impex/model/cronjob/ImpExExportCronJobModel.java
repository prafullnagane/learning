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
package de.hybris.platform.impex.model.cronjob;

import de.hybris.platform.core.enums.EncodingEnum;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.impex.enums.ExportConverterEnum;
import de.hybris.platform.impex.enums.ImpExValidationModeEnum;
import de.hybris.platform.impex.model.ImpExMediaModel;
import de.hybris.platform.impex.model.exp.ExportModel;
import de.hybris.platform.impex.model.exp.HeaderLibraryModel;
import de.hybris.platform.impex.model.exp.ImpExExportMediaModel;
import de.hybris.platform.impex.model.exp.ReportModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ImpExExportCronJob first defined at extension impex.
 */
@SuppressWarnings("all")
public class ImpExExportCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ImpExExportCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.fieldSeparator</code> attribute defined at extension <code>impex</code>. */
	public static final String FIELDSEPARATOR = "fieldSeparator";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.exportTemplate</code> attribute defined at extension <code>impex</code>. */
	public static final String EXPORTTEMPLATE = "exportTemplate";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.itemsExported</code> attribute defined at extension <code>impex</code>. */
	public static final String ITEMSEXPORTED = "itemsExported";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.report</code> attribute defined at extension <code>impex</code>. */
	public static final String REPORT = "report";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.itemsMaxCount</code> attribute defined at extension <code>impex</code>. */
	public static final String ITEMSMAXCOUNT = "itemsMaxCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.mediasExportMediaCode</code> attribute defined at extension <code>impex</code>. */
	public static final String MEDIASEXPORTMEDIACODE = "mediasExportMediaCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.dataExportTarget</code> attribute defined at extension <code>impex</code>. */
	public static final String DATAEXPORTTARGET = "dataExportTarget";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.encoding</code> attribute defined at extension <code>impex</code>. */
	public static final String ENCODING = "encoding";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.jobMedia</code> attribute defined at extension <code>impex</code>. */
	public static final String JOBMEDIA = "jobMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.singleFile</code> attribute defined at extension <code>impex</code>. */
	public static final String SINGLEFILE = "singleFile";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.dataExportMediaCode</code> attribute defined at extension <code>impex</code>. */
	public static final String DATAEXPORTMEDIACODE = "dataExportMediaCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.commentCharacter</code> attribute defined at extension <code>impex</code>. */
	public static final String COMMENTCHARACTER = "commentCharacter";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.export</code> attribute defined at extension <code>impex</code>. */
	public static final String EXPORT = "export";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.mediasExportTarget</code> attribute defined at extension <code>impex</code>. */
	public static final String MEDIASEXPORTTARGET = "mediasExportTarget";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.quoteCharacter</code> attribute defined at extension <code>impex</code>. */
	public static final String QUOTECHARACTER = "quoteCharacter";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.itemsSkipped</code> attribute defined at extension <code>impex</code>. */
	public static final String ITEMSSKIPPED = "itemsSkipped";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.converterClass</code> attribute defined at extension <code>impex</code>. */
	public static final String CONVERTERCLASS = "converterClass";
	
	/** <i>Generated constant</i> - Attribute key of <code>ImpExExportCronJob.mode</code> attribute defined at extension <code>impex</code>. */
	public static final String MODE = "mode";
	
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.fieldSeparator</code> attribute defined at extension <code>impex</code>. */
	private Character _fieldSeparator;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.exportTemplate</code> attribute defined at extension <code>impex</code>. */
	private HeaderLibraryModel _exportTemplate;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.itemsExported</code> attribute defined at extension <code>impex</code>. */
	private Integer _itemsExported;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.report</code> attribute defined at extension <code>impex</code>. */
	private ReportModel _report;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.itemsMaxCount</code> attribute defined at extension <code>impex</code>. */
	private Integer _itemsMaxCount;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.mediasExportMediaCode</code> attribute defined at extension <code>impex</code>. */
	private String _mediasExportMediaCode;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.dataExportTarget</code> attribute defined at extension <code>impex</code>. */
	private ImpExExportMediaModel _dataExportTarget;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.encoding</code> attribute defined at extension <code>impex</code>. */
	private EncodingEnum _encoding;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.jobMedia</code> attribute defined at extension <code>impex</code>. */
	private ImpExMediaModel _jobMedia;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.singleFile</code> attribute defined at extension <code>impex</code>. */
	private Boolean _singleFile;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.dataExportMediaCode</code> attribute defined at extension <code>impex</code>. */
	private String _dataExportMediaCode;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.commentCharacter</code> attribute defined at extension <code>impex</code>. */
	private Character _commentCharacter;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.export</code> attribute defined at extension <code>impex</code>. */
	private ExportModel _export;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.mediasExportTarget</code> attribute defined at extension <code>impex</code>. */
	private ImpExExportMediaModel _mediasExportTarget;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.quoteCharacter</code> attribute defined at extension <code>impex</code>. */
	private Character _quoteCharacter;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.itemsSkipped</code> attribute defined at extension <code>impex</code>. */
	private Integer _itemsSkipped;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.converterClass</code> attribute defined at extension <code>impex</code>. */
	private ExportConverterEnum _converterClass;
	
	/** <i>Generated variable</i> - Variable of <code>ImpExExportCronJob.mode</code> attribute defined at extension <code>impex</code>. */
	private ImpExValidationModeEnum _mode;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ImpExExportCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ImpExExportCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public ImpExExportCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ImpExExportCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.commentCharacter</code> attribute defined at extension <code>impex</code>. 
	 * @return the commentCharacter - Character used for indicating a comment
	 */
	public Character getCommentCharacter()
	{
		return _commentCharacter = getPersistenceContext().getValue(COMMENTCHARACTER, _commentCharacter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.converterClass</code> attribute defined at extension <code>impex</code>. 
	 * @return the converterClass - class, which will be used for report generation
	 */
	public ExportConverterEnum getConverterClass()
	{
		return _converterClass = getPersistenceContext().getValue(CONVERTERCLASS, _converterClass);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.dataExportMediaCode</code> attribute defined at extension <code>impex</code>. 
	 * @return the dataExportMediaCode - Code of the generated export media, containing the exported data
	 */
	public String getDataExportMediaCode()
	{
		return _dataExportMediaCode = getPersistenceContext().getValue(DATAEXPORTMEDIACODE, _dataExportMediaCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.dataExportTarget</code> attribute defined at extension <code>impex</code>. 
	 * @return the dataExportTarget
	 */
	public ImpExExportMediaModel getDataExportTarget()
	{
		return _dataExportTarget = getPersistenceContext().getValue(DATAEXPORTTARGET, _dataExportTarget);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.encoding</code> attribute defined at extension <code>impex</code>. 
	 * @return the encoding
	 */
	public EncodingEnum getEncoding()
	{
		return _encoding = getPersistenceContext().getValue(ENCODING, _encoding);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.export</code> attribute defined at extension <code>impex</code>. 
	 * @return the export
	 */
	public ExportModel getExport()
	{
		return _export = getPersistenceContext().getValue(EXPORT, _export);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.exportTemplate</code> attribute defined at extension <code>impex</code>. 
	 * @return the exportTemplate
	 */
	public HeaderLibraryModel getExportTemplate()
	{
		return _exportTemplate = getPersistenceContext().getValue(EXPORTTEMPLATE, _exportTemplate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.fieldSeparator</code> attribute defined at extension <code>impex</code>. 
	 * @return the fieldSeparator - Character used for separating columns in CSV-lines
	 */
	public Character getFieldSeparator()
	{
		return _fieldSeparator = getPersistenceContext().getValue(FIELDSEPARATOR, _fieldSeparator);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.itemsExported</code> attribute defined at extension <code>impex</code>. 
	 * @return the itemsExported
	 */
	public Integer getItemsExported()
	{
		return _itemsExported = getPersistenceContext().getValue(ITEMSEXPORTED, _itemsExported);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.itemsMaxCount</code> attribute defined at extension <code>impex</code>. 
	 * @return the itemsMaxCount
	 */
	public Integer getItemsMaxCount()
	{
		return _itemsMaxCount = getPersistenceContext().getValue(ITEMSMAXCOUNT, _itemsMaxCount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.itemsSkipped</code> attribute defined at extension <code>impex</code>. 
	 * @return the itemsSkipped
	 */
	public Integer getItemsSkipped()
	{
		return _itemsSkipped = getPersistenceContext().getValue(ITEMSSKIPPED, _itemsSkipped);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.jobMedia</code> attribute defined at extension <code>impex</code>. 
	 * @return the jobMedia
	 */
	public ImpExMediaModel getJobMedia()
	{
		return _jobMedia = getPersistenceContext().getValue(JOBMEDIA, _jobMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.mediasExportMediaCode</code> attribute defined at extension <code>impex</code>. 
	 * @return the mediasExportMediaCode - Code of the generated export media, containing the exported medias
	 */
	public String getMediasExportMediaCode()
	{
		return _mediasExportMediaCode = getPersistenceContext().getValue(MEDIASEXPORTMEDIACODE, _mediasExportMediaCode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.mediasExportTarget</code> attribute defined at extension <code>impex</code>. 
	 * @return the mediasExportTarget
	 */
	public ImpExExportMediaModel getMediasExportTarget()
	{
		return _mediasExportTarget = getPersistenceContext().getValue(MEDIASEXPORTTARGET, _mediasExportTarget);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.mode</code> attribute defined at extension <code>impex</code>. 
	 * @return the mode
	 */
	public ImpExValidationModeEnum getMode()
	{
		return _mode = getPersistenceContext().getValue(MODE, _mode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.quoteCharacter</code> attribute defined at extension <code>impex</code>. 
	 * @return the quoteCharacter - Character used for escaping columns in CSV-lines
	 */
	public Character getQuoteCharacter()
	{
		return _quoteCharacter = getPersistenceContext().getValue(QUOTECHARACTER, _quoteCharacter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.report</code> attribute defined at extension <code>impex</code>. 
	 * @return the report
	 */
	public ReportModel getReport()
	{
		return _report = getPersistenceContext().getValue(REPORT, _report);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ImpExExportCronJob.singleFile</code> attribute defined at extension <code>impex</code>. 
	 * @return the singleFile - Export result as a single file instead of Zip archive
	 */
	public Boolean getSingleFile()
	{
		return _singleFile = getPersistenceContext().getValue(SINGLEFILE, _singleFile);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.commentCharacter</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the commentCharacter - Character used for indicating a comment
	 */
	public void setCommentCharacter(final Character value)
	{
		_commentCharacter = getPersistenceContext().setValue(COMMENTCHARACTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.converterClass</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the converterClass - class, which will be used for report generation
	 */
	public void setConverterClass(final ExportConverterEnum value)
	{
		_converterClass = getPersistenceContext().setValue(CONVERTERCLASS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.dataExportMediaCode</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the dataExportMediaCode - Code of the generated export media, containing the exported data
	 */
	public void setDataExportMediaCode(final String value)
	{
		_dataExportMediaCode = getPersistenceContext().setValue(DATAEXPORTMEDIACODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.dataExportTarget</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the dataExportTarget
	 */
	public void setDataExportTarget(final ImpExExportMediaModel value)
	{
		_dataExportTarget = getPersistenceContext().setValue(DATAEXPORTTARGET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.encoding</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the encoding
	 */
	public void setEncoding(final EncodingEnum value)
	{
		_encoding = getPersistenceContext().setValue(ENCODING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.export</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the export
	 */
	public void setExport(final ExportModel value)
	{
		_export = getPersistenceContext().setValue(EXPORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.exportTemplate</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the exportTemplate
	 */
	public void setExportTemplate(final HeaderLibraryModel value)
	{
		_exportTemplate = getPersistenceContext().setValue(EXPORTTEMPLATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.fieldSeparator</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the fieldSeparator - Character used for separating columns in CSV-lines
	 */
	public void setFieldSeparator(final Character value)
	{
		_fieldSeparator = getPersistenceContext().setValue(FIELDSEPARATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.jobMedia</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the jobMedia
	 */
	public void setJobMedia(final ImpExMediaModel value)
	{
		_jobMedia = getPersistenceContext().setValue(JOBMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.mediasExportMediaCode</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the mediasExportMediaCode - Code of the generated export media, containing the exported medias
	 */
	public void setMediasExportMediaCode(final String value)
	{
		_mediasExportMediaCode = getPersistenceContext().setValue(MEDIASEXPORTMEDIACODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.mediasExportTarget</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the mediasExportTarget
	 */
	public void setMediasExportTarget(final ImpExExportMediaModel value)
	{
		_mediasExportTarget = getPersistenceContext().setValue(MEDIASEXPORTTARGET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.mode</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the mode
	 */
	public void setMode(final ImpExValidationModeEnum value)
	{
		_mode = getPersistenceContext().setValue(MODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.quoteCharacter</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the quoteCharacter - Character used for escaping columns in CSV-lines
	 */
	public void setQuoteCharacter(final Character value)
	{
		_quoteCharacter = getPersistenceContext().setValue(QUOTECHARACTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.report</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the report
	 */
	public void setReport(final ReportModel value)
	{
		_report = getPersistenceContext().setValue(REPORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ImpExExportCronJob.singleFile</code> attribute defined at extension <code>impex</code>. 
	 *  
	 * @param value the singleFile - Export result as a single file instead of Zip archive
	 */
	public void setSingleFile(final Boolean value)
	{
		_singleFile = getPersistenceContext().setValue(SINGLEFILE, value);
	}
	
}
