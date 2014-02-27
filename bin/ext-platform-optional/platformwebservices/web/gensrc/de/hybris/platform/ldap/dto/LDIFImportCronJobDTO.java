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
package de.hybris.platform.ldap.dto;

import de.hybris.platform.cronjob.dto.MediaProcessCronJobDTO;
import de.hybris.platform.impex.dto.ImpExMediaDTO;
import de.hybris.platform.ldap.dto.ConfigurationMediaDTO;
import de.hybris.platform.ldap.dto.LDIFMediaDTO;
import de.hybris.platform.ldap.model.LDIFImportCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type LDIFImportCronJob first defined at extension ldap
 */
@SuppressWarnings("all")
@GraphNode(target = LDIFImportCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "ldifimportcronjob")
public class LDIFImportCronJobDTO extends MediaProcessCronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.searchbase</code> attribute defined at extension <code> */
	private java.lang.String _searchbase;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.configFile2</code> attribute defined at extension <code> */
	private de.hybris.platform.ldap.dto.ConfigurationMediaDTO _configFile2;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.importmode</code> attribute defined at extension <code> */
	private java.lang.String _importmode;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.dumpMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _dumpMedia;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.configFile</code> attribute defined at extension <code> */
	private de.hybris.platform.ldap.dto.ConfigurationMediaDTO _configFile;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.ldapquery</code> attribute defined at extension <code> */
	private java.lang.String _ldapquery;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.destMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _destMedia;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.ldifFile</code> attribute defined at extension <code> */
	private de.hybris.platform.ldap.dto.LDIFMediaDTO _ldifFile;
	/** <i>Generated variable</i> - Variable of <code>LDIFImportCronJob.resultfilter</code> attribute defined at extension <code> */
	private java.lang.String _resultfilter;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFImportCronJobDTO()
	{
		super();
	}
	
	
	public ConfigurationMediaDTO getConfigFile()
	{
		return this._configFile;
	}
	
	public ConfigurationMediaDTO getConfigFile2()
	{
		return this._configFile2;
	}
	
	public ImpExMediaDTO getDestMedia()
	{
		return this._destMedia;
	}
	
	public ImpExMediaDTO getDumpMedia()
	{
		return this._dumpMedia;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getImportmode()
	{
		return this._importmode;
	}
	
	public String getLdapquery()
	{
		return this._ldapquery;
	}
	
	public LDIFMediaDTO getLdifFile()
	{
		return this._ldifFile;
	}
	
	public String getResultfilter()
	{
		return this._resultfilter;
	}
	
	public String getSearchbase()
	{
		return this._searchbase;
	}
	
	public void setConfigFile(final ConfigurationMediaDTO value)
	{
		this.modifiedPropsSet.add("configFile");
		this._configFile = value;
	}
	
	public void setConfigFile2(final ConfigurationMediaDTO value)
	{
		this.modifiedPropsSet.add("configFile2");
		this._configFile2 = value;
	}
	
	public void setDestMedia(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("destMedia");
		this._destMedia = value;
	}
	
	public void setDumpMedia(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("dumpMedia");
		this._dumpMedia = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setImportmode(final String value)
	{
		this.modifiedPropsSet.add("importmode");
		this._importmode = value;
	}
	
	public void setLdapquery(final String value)
	{
		this.modifiedPropsSet.add("ldapquery");
		this._ldapquery = value;
	}
	
	public void setLdifFile(final LDIFMediaDTO value)
	{
		this.modifiedPropsSet.add("ldifFile");
		this._ldifFile = value;
	}
	
	public void setResultfilter(final String value)
	{
		this.modifiedPropsSet.add("resultfilter");
		this._resultfilter = value;
	}
	
	public void setSearchbase(final String value)
	{
		this.modifiedPropsSet.add("searchbase");
		this._searchbase = value;
	}
	
}
