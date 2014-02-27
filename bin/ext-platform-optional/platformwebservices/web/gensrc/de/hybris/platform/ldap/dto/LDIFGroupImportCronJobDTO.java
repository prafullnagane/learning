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
import de.hybris.platform.ldap.model.LDIFGroupImportCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type LDIFGroupImportCronJob first defined at extension ldap
 */
@SuppressWarnings("all")
@GraphNode(target = LDIFGroupImportCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "ldifgroupimportcronjob")
public class LDIFGroupImportCronJobDTO extends MediaProcessCronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.userSearchFieldQualifier</code> attribute defined at extension <code> */
	private java.lang.String _userSearchFieldQualifier;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.ldifFile</code> attribute defined at extension <code> */
	private de.hybris.platform.ldap.dto.LDIFMediaDTO _ldifFile;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.resultfilter</code> attribute defined at extension <code> */
	private java.lang.String _resultfilter;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.ldapquery</code> attribute defined at extension <code> */
	private java.lang.String _ldapquery;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.searchbase</code> attribute defined at extension <code> */
	private java.lang.String _searchbase;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.codeExecution</code> attribute defined at extension <code> */
	private java.lang.Boolean _codeExecution;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.userRootDN</code> attribute defined at extension <code> */
	private java.lang.String _userRootDN;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.destMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _destMedia;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.dumpMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _dumpMedia;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.configFile</code> attribute defined at extension <code> */
	private de.hybris.platform.ldap.dto.ConfigurationMediaDTO _configFile;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.importUsers</code> attribute defined at extension <code> */
	private java.lang.Boolean _importUsers;
	/** <i>Generated variable</i> - Variable of <code>LDIFGroupImportCronJob.userResultfilter</code> attribute defined at extension <code> */
	private java.lang.String _userResultfilter;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFGroupImportCronJobDTO()
	{
		super();
	}
	
	
	public Boolean getCodeExecution()
	{
		return this._codeExecution;
	}
	
	public ConfigurationMediaDTO getConfigFile()
	{
		return this._configFile;
	}
	
	public ImpExMediaDTO getDestMedia()
	{
		return this._destMedia;
	}
	
	public ImpExMediaDTO getDumpMedia()
	{
		return this._dumpMedia;
	}
	
	public Boolean getImportUsers()
	{
		return this._importUsers;
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
	
	public String getUserResultfilter()
	{
		return this._userResultfilter;
	}
	
	public String getUserRootDN()
	{
		return this._userRootDN;
	}
	
	public String getUserSearchFieldQualifier()
	{
		return this._userSearchFieldQualifier;
	}
	
	public void setCodeExecution(final Boolean value)
	{
		this.modifiedPropsSet.add("codeExecution");
		this._codeExecution = value;
	}
	
	public void setConfigFile(final ConfigurationMediaDTO value)
	{
		this.modifiedPropsSet.add("configFile");
		this._configFile = value;
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
	
	public void setImportUsers(final Boolean value)
	{
		this.modifiedPropsSet.add("importUsers");
		this._importUsers = value;
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
	
	public void setUserResultfilter(final String value)
	{
		this.modifiedPropsSet.add("userResultfilter");
		this._userResultfilter = value;
	}
	
	public void setUserRootDN(final String value)
	{
		this.modifiedPropsSet.add("userRootDN");
		this._userRootDN = value;
	}
	
	public void setUserSearchFieldQualifier(final String value)
	{
		this.modifiedPropsSet.add("userSearchFieldQualifier");
		this._userSearchFieldQualifier = value;
	}
	
}
