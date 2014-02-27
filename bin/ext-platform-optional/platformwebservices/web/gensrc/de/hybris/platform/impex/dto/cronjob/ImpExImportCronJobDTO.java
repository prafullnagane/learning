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

import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.impex.dto.ImpExMediaDTO;
import de.hybris.platform.impex.dto.cronjob.ImpExImportJobDTO;
import de.hybris.platform.impex.model.cronjob.ImpExImportCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ImpExImportCronJob first defined at extension impex
 */
@SuppressWarnings("all")
@GraphNode(target = ImpExImportCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "impeximportcronjob")
public class ImpExImportCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.unresolvedDataStore</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _unresolvedDataStore;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.locale</code> attribute defined at extension <code> */
	private java.lang.String _locale;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.lastSuccessfulLine</code> attribute defined at extension <code> */
	private java.lang.Integer _lastSuccessfulLine;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.enableHmcSavedValues</code> attribute defined at extension <code> */
	private java.lang.Boolean _enableHmcSavedValues;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.valueCount</code> attribute defined at extension <code> */
	private java.lang.Integer _valueCount;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.mediasTarget</code> attribute defined at extension <code> */
	private java.lang.String _mediasTarget;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.jobMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _jobMedia;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.unzipMediasMedia</code> attribute defined at extension <code> */
	private java.lang.Boolean _unzipMediasMedia;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.externalDataCollection</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.impex.dto.ImpExMediaDTO> _externalDataCollection;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.zipentry</code> attribute defined at extension <code> */
	private java.lang.String _zipentry;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.dumpFileEncoding</code> attribute defined at extension <code> */
	private java.lang.String _dumpFileEncoding;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.mode</code> attribute defined at extension <code> */
	private java.lang.String _mode;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.enableExternalCodeExecution</code> attribute defined at extension <code> */
	private java.lang.Boolean _enableExternalCodeExecution;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.enableCodeExecution</code> attribute defined at extension <code> */
	private java.lang.Boolean _enableCodeExecution;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.mediasMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _mediasMedia;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.legacyMode</code> attribute defined at extension <code> */
	private java.lang.Boolean _legacyMode;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.dumpingAllowed</code> attribute defined at extension <code> */
	private java.lang.Boolean _dumpingAllowed;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.workMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _workMedia;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.maxThreads</code> attribute defined at extension <code> */
	private java.lang.Integer _maxThreads;
	/** <i>Generated variable</i> - Variable of <code>ImpExImportCronJob.enableExternalSyntaxParsing</code> attribute defined at extension <code> */
	private java.lang.Boolean _enableExternalSyntaxParsing;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportCronJobDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDumpFileEncoding()
	{
		return this._dumpFileEncoding;
	}
	
	public Boolean getDumpingAllowed()
	{
		return this._dumpingAllowed;
	}
	
	public Boolean getEnableCodeExecution()
	{
		return this._enableCodeExecution;
	}
	
	public Boolean getEnableExternalCodeExecution()
	{
		return this._enableExternalCodeExecution;
	}
	
	public Boolean getEnableExternalSyntaxParsing()
	{
		return this._enableExternalSyntaxParsing;
	}
	
	public Boolean getEnableHmcSavedValues()
	{
		return this._enableHmcSavedValues;
	}
	
	@XmlElementWrapper(name = "externalDataCollection")
	@XmlElement(name = "impExMedia")
	public Collection<ImpExMediaDTO> getExternalDataCollection()
	{
		return this._externalDataCollection;
	}
	
	@Override
	public ImpExImportJobDTO getJob()
	{
		return (de.hybris.platform.impex.dto.cronjob.ImpExImportJobDTO) super.getJob();
	}
	
	public ImpExMediaDTO getJobMedia()
	{
		return this._jobMedia;
	}
	
	public Integer getLastSuccessfulLine()
	{
		return this._lastSuccessfulLine;
	}
	
	public Boolean getLegacyMode()
	{
		return this._legacyMode;
	}
	
	public String getLocale()
	{
		return this._locale;
	}
	
	public Integer getMaxThreads()
	{
		return this._maxThreads;
	}
	
	public MediaDTO getMediasMedia()
	{
		return this._mediasMedia;
	}
	
	public String getMediasTarget()
	{
		return this._mediasTarget;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getMode()
	{
		return this._mode;
	}
	
	public ImpExMediaDTO getUnresolvedDataStore()
	{
		return this._unresolvedDataStore;
	}
	
	public Boolean getUnzipMediasMedia()
	{
		return this._unzipMediasMedia;
	}
	
	public Integer getValueCount()
	{
		return this._valueCount;
	}
	
	public ImpExMediaDTO getWorkMedia()
	{
		return this._workMedia;
	}
	
	public String getZipentry()
	{
		return this._zipentry;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDumpFileEncoding(final String value)
	{
		this.modifiedPropsSet.add("dumpFileEncoding");
		this._dumpFileEncoding = value;
	}
	
	public void setDumpingAllowed(final Boolean value)
	{
		this.modifiedPropsSet.add("dumpingAllowed");
		this._dumpingAllowed = value;
	}
	
	public void setEnableCodeExecution(final Boolean value)
	{
		this.modifiedPropsSet.add("enableCodeExecution");
		this._enableCodeExecution = value;
	}
	
	public void setEnableExternalCodeExecution(final Boolean value)
	{
		this.modifiedPropsSet.add("enableExternalCodeExecution");
		this._enableExternalCodeExecution = value;
	}
	
	public void setEnableExternalSyntaxParsing(final Boolean value)
	{
		this.modifiedPropsSet.add("enableExternalSyntaxParsing");
		this._enableExternalSyntaxParsing = value;
	}
	
	public void setEnableHmcSavedValues(final Boolean value)
	{
		this.modifiedPropsSet.add("enableHmcSavedValues");
		this._enableHmcSavedValues = value;
	}
	
	public void setExternalDataCollection(final Collection<ImpExMediaDTO> value)
	{
		this.modifiedPropsSet.add("externalDataCollection");
		this._externalDataCollection = value;
	}
	
	public void setJobMedia(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("jobMedia");
		this._jobMedia = value;
	}
	
	public void setLastSuccessfulLine(final Integer value)
	{
		this.modifiedPropsSet.add("lastSuccessfulLine");
		this._lastSuccessfulLine = value;
	}
	
	public void setLegacyMode(final Boolean value)
	{
		this.modifiedPropsSet.add("legacyMode");
		this._legacyMode = value;
	}
	
	public void setLocale(final String value)
	{
		this.modifiedPropsSet.add("locale");
		this._locale = value;
	}
	
	public void setMaxThreads(final Integer value)
	{
		this.modifiedPropsSet.add("maxThreads");
		this._maxThreads = value;
	}
	
	public void setMediasMedia(final MediaDTO value)
	{
		this.modifiedPropsSet.add("mediasMedia");
		this._mediasMedia = value;
	}
	
	public void setMediasTarget(final String value)
	{
		this.modifiedPropsSet.add("mediasTarget");
		this._mediasTarget = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setMode(final String value)
	{
		this.modifiedPropsSet.add("mode");
		this._mode = value;
	}
	
	public void setUnresolvedDataStore(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("unresolvedDataStore");
		this._unresolvedDataStore = value;
	}
	
	public void setUnzipMediasMedia(final Boolean value)
	{
		this.modifiedPropsSet.add("unzipMediasMedia");
		this._unzipMediasMedia = value;
	}
	
	public void setValueCount(final Integer value)
	{
		this.modifiedPropsSet.add("valueCount");
		this._valueCount = value;
	}
	
	public void setWorkMedia(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("workMedia");
		this._workMedia = value;
	}
	
	public void setZipentry(final String value)
	{
		this.modifiedPropsSet.add("zipentry");
		this._zipentry = value;
	}
	
}
