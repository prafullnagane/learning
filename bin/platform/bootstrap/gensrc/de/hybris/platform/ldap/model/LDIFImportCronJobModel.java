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
package de.hybris.platform.ldap.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.cronjob.model.MediaProcessCronJobModel;
import de.hybris.platform.impex.model.ImpExMediaModel;
import de.hybris.platform.ldap.enums.LDIFImportModeEnum;
import de.hybris.platform.ldap.model.ConfigurationMediaModel;
import de.hybris.platform.ldap.model.LDIFMediaModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type LDIFImportCronJob first defined at extension ldap.
 */
@SuppressWarnings("all")
public class LDIFImportCronJobModel extends MediaProcessCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "LDIFImportCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.searchbase</code> attribute defined at extension <code>ldap</code>. */
	public static final String SEARCHBASE = "searchbase";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.configFile2</code> attribute defined at extension <code>ldap</code>. */
	public static final String CONFIGFILE2 = "configFile2";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.importmode</code> attribute defined at extension <code>ldap</code>. */
	public static final String IMPORTMODE = "importmode";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.dumpMedia</code> attribute defined at extension <code>ldap</code>. */
	public static final String DUMPMEDIA = "dumpMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.configFile</code> attribute defined at extension <code>ldap</code>. */
	public static final String CONFIGFILE = "configFile";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.destMedia</code> attribute defined at extension <code>ldap</code>. */
	public static final String DESTMEDIA = "destMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.ldapquery</code> attribute defined at extension <code>ldap</code>. */
	public static final String LDAPQUERY = "ldapquery";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.resultfilter</code> attribute defined at extension <code>ldap</code>. */
	public static final String RESULTFILTER = "resultfilter";
	
	/** <i>Generated constant</i> - Attribute key of <code>LDIFImportCronJob.ldifFile</code> attribute defined at extension <code>ldap</code>. */
	public static final String LDIFFILE = "ldifFile";
	
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.searchbase</code> attribute defined at extension <code>ldap</code>. */
	private String _searchbase;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.configFile2</code> attribute defined at extension <code>ldap</code>. */
	private ConfigurationMediaModel _configFile2;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.importmode</code> attribute defined at extension <code>ldap</code>. */
	private LDIFImportModeEnum _importmode;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.dumpMedia</code> attribute defined at extension <code>ldap</code>. */
	private ImpExMediaModel _dumpMedia;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.configFile</code> attribute defined at extension <code>ldap</code>. */
	private ConfigurationMediaModel _configFile;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.destMedia</code> attribute defined at extension <code>ldap</code>. */
	private ImpExMediaModel _destMedia;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.ldapquery</code> attribute defined at extension <code>ldap</code>. */
	private String _ldapquery;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.resultfilter</code> attribute defined at extension <code>ldap</code>. */
	private String _resultfilter;
	
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.ldifFile</code> attribute defined at extension <code>ldap</code>. */
	private LDIFMediaModel _ldifFile;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LDIFImportCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LDIFImportCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _importmode initial attribute declared by type <code>LDIFImportCronJob</code> at extension <code>ldap</code>
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public LDIFImportCronJobModel(final LDIFImportModeEnum _importmode, final JobModel _job)
	{
		super();
		setImportmode(_importmode);
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _importmode initial attribute declared by type <code>LDIFImportCronJob</code> at extension <code>ldap</code>
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public LDIFImportCronJobModel(final LDIFImportModeEnum _importmode, final JobModel _job, final ItemModel _owner)
	{
		super();
		setImportmode(_importmode);
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.configFile</code> attribute defined at extension <code>ldap</code>. 
	 * @return the configFile
	 */
	public ConfigurationMediaModel getConfigFile()
	{
		return _configFile = getPersistenceContext().getValue(CONFIGFILE, _configFile);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.configFile2</code> attribute defined at extension <code>ldap</code>. 
	 * @return the configFile2
	 */
	public ConfigurationMediaModel getConfigFile2()
	{
		return _configFile2 = getPersistenceContext().getValue(CONFIGFILE2, _configFile2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.destMedia</code> attribute defined at extension <code>ldap</code>. 
	 * @return the destMedia
	 */
	public ImpExMediaModel getDestMedia()
	{
		return _destMedia = getPersistenceContext().getValue(DESTMEDIA, _destMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.dumpMedia</code> attribute defined at extension <code>ldap</code>. 
	 * @return the dumpMedia
	 */
	public ImpExMediaModel getDumpMedia()
	{
		return _dumpMedia = getPersistenceContext().getValue(DUMPMEDIA, _dumpMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.importmode</code> attribute defined at extension <code>ldap</code>. 
	 * @return the importmode
	 */
	public LDIFImportModeEnum getImportmode()
	{
		return _importmode = getPersistenceContext().getValue(IMPORTMODE, _importmode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.ldapquery</code> attribute defined at extension <code>ldap</code>. 
	 * @return the ldapquery
	 */
	public String getLdapquery()
	{
		return _ldapquery = getPersistenceContext().getValue(LDAPQUERY, _ldapquery);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.ldifFile</code> attribute defined at extension <code>ldap</code>. 
	 * @return the ldifFile
	 */
	public LDIFMediaModel getLdifFile()
	{
		return _ldifFile = getPersistenceContext().getValue(LDIFFILE, _ldifFile);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.resultfilter</code> attribute defined at extension <code>ldap</code>. 
	 * @return the resultfilter
	 */
	public String getResultfilter()
	{
		return _resultfilter = getPersistenceContext().getValue(RESULTFILTER, _resultfilter);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LDIFImportCronJob.searchbase</code> attribute defined at extension <code>ldap</code>. 
	 * @return the searchbase
	 */
	public String getSearchbase()
	{
		return _searchbase = getPersistenceContext().getValue(SEARCHBASE, _searchbase);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.configFile</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the configFile
	 */
	public void setConfigFile(final ConfigurationMediaModel value)
	{
		_configFile = getPersistenceContext().setValue(CONFIGFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.configFile2</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the configFile2
	 */
	public void setConfigFile2(final ConfigurationMediaModel value)
	{
		_configFile2 = getPersistenceContext().setValue(CONFIGFILE2, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.destMedia</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the destMedia
	 */
	public void setDestMedia(final ImpExMediaModel value)
	{
		_destMedia = getPersistenceContext().setValue(DESTMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.dumpMedia</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the dumpMedia
	 */
	public void setDumpMedia(final ImpExMediaModel value)
	{
		_dumpMedia = getPersistenceContext().setValue(DUMPMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.importmode</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the importmode
	 */
	public void setImportmode(final LDIFImportModeEnum value)
	{
		_importmode = getPersistenceContext().setValue(IMPORTMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.ldapquery</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the ldapquery
	 */
	public void setLdapquery(final String value)
	{
		_ldapquery = getPersistenceContext().setValue(LDAPQUERY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.ldifFile</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the ldifFile
	 */
	public void setLdifFile(final LDIFMediaModel value)
	{
		_ldifFile = getPersistenceContext().setValue(LDIFFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.resultfilter</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the resultfilter
	 */
	public void setResultfilter(final String value)
	{
		_resultfilter = getPersistenceContext().setValue(RESULTFILTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LDIFImportCronJob.searchbase</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the searchbase
	 */
	public void setSearchbase(final String value)
	{
		_searchbase = getPersistenceContext().setValue(SEARCHBASE, value);
	}
	
}
