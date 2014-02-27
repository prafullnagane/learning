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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.ldap.model.LDAPConfigProxyItemModel;
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
 * Generated dto class for type LDAPConfigProxyItem first defined at extension ldap
 */
@SuppressWarnings("all")
@GraphNode(target = LDAPConfigProxyItemModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "ldapconfigproxyitem")
public class LDAPConfigProxyItemDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.caKeystoreType</code> attribute defined at extension <code> */
	private java.lang.String _caKeystoreType;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.poolPrefsize</code> attribute defined at extension <code> */
	private java.lang.Integer _poolPrefsize;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.jndiAuthentication</code> attribute defined at extension <code> */
	private java.lang.String _jndiAuthentication;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.poolTimeout</code> attribute defined at extension <code> */
	private java.lang.Integer _poolTimeout;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.socketFactory</code> attribute defined at extension <code> */
	private java.lang.String _socketFactory;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.poolMaxsize</code> attribute defined at extension <code> */
	private java.lang.Integer _poolMaxsize;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.jndiVersion</code> attribute defined at extension <code> */
	private java.lang.String _jndiVersion;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.loginField</code> attribute defined at extension <code> */
	private java.lang.String _loginField;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.clientcerts</code> attribute defined at extension <code> */
	private java.lang.String _clientcerts;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.jndiPrincipals</code> attribute defined at extension <code> */
	private java.lang.String _jndiPrincipals;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.clientKeystoreType</code> attribute defined at extension <code> */
	private java.lang.String _clientKeystoreType;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.serverUrl</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _serverUrl;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.serverRootDN</code> attribute defined at extension <code> */
	private java.lang.String _serverRootDN;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.poolInitsize</code> attribute defined at extension <code> */
	private java.lang.Integer _poolInitsize;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.jndiCredentials</code> attribute defined at extension <code> */
	private java.lang.String _jndiCredentials;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.securityProtocol</code> attribute defined at extension <code> */
	private java.lang.String _securityProtocol;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.minimumFailbackTime</code> attribute defined at extension <code> */
	private java.lang.Integer _minimumFailbackTime;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.cacerts</code> attribute defined at extension <code> */
	private java.lang.String _cacerts;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.jndiFactory</code> attribute defined at extension <code> */
	private java.lang.String _jndiFactory;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.caKeystorePwd</code> attribute defined at extension <code> */
	private java.lang.String _caKeystorePwd;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.localAccountsOnly</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.security.PrincipalDTO> _localAccountsOnly;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.jndiConnectTimeout</code> attribute defined at extension <code> */
	private java.lang.Integer _jndiConnectTimeout;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.clientKeystorePwd</code> attribute defined at extension <code> */
	private java.lang.String _clientKeystorePwd;
	/** <i>Generated variable</i> - Variable of <code>LDAPConfigProxyItem.poolEnabled</code> attribute defined at extension <code> */
	private java.lang.Boolean _poolEnabled;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDAPConfigProxyItemDTO()
	{
		super();
	}
	
	
	public String getCacerts()
	{
		return this._cacerts;
	}
	
	public String getCaKeystorePwd()
	{
		return this._caKeystorePwd;
	}
	
	public String getCaKeystoreType()
	{
		return this._caKeystoreType;
	}
	
	public String getClientcerts()
	{
		return this._clientcerts;
	}
	
	public String getClientKeystorePwd()
	{
		return this._clientKeystorePwd;
	}
	
	public String getClientKeystoreType()
	{
		return this._clientKeystoreType;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getJndiAuthentication()
	{
		return this._jndiAuthentication;
	}
	
	public Integer getJndiConnectTimeout()
	{
		return this._jndiConnectTimeout;
	}
	
	public String getJndiCredentials()
	{
		return this._jndiCredentials;
	}
	
	public String getJndiFactory()
	{
		return this._jndiFactory;
	}
	
	public String getJndiPrincipals()
	{
		return this._jndiPrincipals;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getJndiVersion()
	{
		return this._jndiVersion;
	}
	
	@XmlElementWrapper(name = "localAccountsOnly")
	@XmlElement(name = "principal")
	public Collection<PrincipalDTO> getLocalAccountsOnly()
	{
		return this._localAccountsOnly;
	}
	
	public String getLoginField()
	{
		return this._loginField;
	}
	
	public Integer getMinimumFailbackTime()
	{
		return this._minimumFailbackTime;
	}
	
	public Boolean getPoolEnabled()
	{
		return this._poolEnabled;
	}
	
	public Integer getPoolInitsize()
	{
		return this._poolInitsize;
	}
	
	public Integer getPoolMaxsize()
	{
		return this._poolMaxsize;
	}
	
	public Integer getPoolPrefsize()
	{
		return this._poolPrefsize;
	}
	
	public Integer getPoolTimeout()
	{
		return this._poolTimeout;
	}
	
	public String getSecurityProtocol()
	{
		return this._securityProtocol;
	}
	
	public String getServerRootDN()
	{
		return this._serverRootDN;
	}
	
	@XmlElementWrapper(name = "serverUrl")
	@XmlElement(name = "value")
	public Collection<String> getServerUrl()
	{
		return this._serverUrl;
	}
	
	public String getSocketFactory()
	{
		return this._socketFactory;
	}
	
	public void setCacerts(final String value)
	{
		this.modifiedPropsSet.add("cacerts");
		this._cacerts = value;
	}
	
	public void setCaKeystorePwd(final String value)
	{
		this.modifiedPropsSet.add("caKeystorePwd");
		this._caKeystorePwd = value;
	}
	
	public void setCaKeystoreType(final String value)
	{
		this.modifiedPropsSet.add("caKeystoreType");
		this._caKeystoreType = value;
	}
	
	public void setClientcerts(final String value)
	{
		this.modifiedPropsSet.add("clientcerts");
		this._clientcerts = value;
	}
	
	public void setClientKeystorePwd(final String value)
	{
		this.modifiedPropsSet.add("clientKeystorePwd");
		this._clientKeystorePwd = value;
	}
	
	public void setClientKeystoreType(final String value)
	{
		this.modifiedPropsSet.add("clientKeystoreType");
		this._clientKeystoreType = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setJndiAuthentication(final String value)
	{
		this.modifiedPropsSet.add("jndiAuthentication");
		this._jndiAuthentication = value;
	}
	
	public void setJndiConnectTimeout(final Integer value)
	{
		this.modifiedPropsSet.add("jndiConnectTimeout");
		this._jndiConnectTimeout = value;
	}
	
	public void setJndiCredentials(final String value)
	{
		this.modifiedPropsSet.add("jndiCredentials");
		this._jndiCredentials = value;
	}
	
	public void setJndiFactory(final String value)
	{
		this.modifiedPropsSet.add("jndiFactory");
		this._jndiFactory = value;
	}
	
	public void setJndiPrincipals(final String value)
	{
		this.modifiedPropsSet.add("jndiPrincipals");
		this._jndiPrincipals = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setJndiVersion(final String value)
	{
		this.modifiedPropsSet.add("jndiVersion");
		this._jndiVersion = value;
	}
	
	public void setLocalAccountsOnly(final Collection<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("localAccountsOnly");
		this._localAccountsOnly = value;
	}
	
	public void setLoginField(final String value)
	{
		this.modifiedPropsSet.add("loginField");
		this._loginField = value;
	}
	
	public void setMinimumFailbackTime(final Integer value)
	{
		this.modifiedPropsSet.add("minimumFailbackTime");
		this._minimumFailbackTime = value;
	}
	
	public void setPoolEnabled(final Boolean value)
	{
		this.modifiedPropsSet.add("poolEnabled");
		this._poolEnabled = value;
	}
	
	public void setPoolInitsize(final Integer value)
	{
		this.modifiedPropsSet.add("poolInitsize");
		this._poolInitsize = value;
	}
	
	public void setPoolMaxsize(final Integer value)
	{
		this.modifiedPropsSet.add("poolMaxsize");
		this._poolMaxsize = value;
	}
	
	public void setPoolPrefsize(final Integer value)
	{
		this.modifiedPropsSet.add("poolPrefsize");
		this._poolPrefsize = value;
	}
	
	public void setPoolTimeout(final Integer value)
	{
		this.modifiedPropsSet.add("poolTimeout");
		this._poolTimeout = value;
	}
	
	public void setSecurityProtocol(final String value)
	{
		this.modifiedPropsSet.add("securityProtocol");
		this._securityProtocol = value;
	}
	
	public void setServerRootDN(final String value)
	{
		this.modifiedPropsSet.add("serverRootDN");
		this._serverRootDN = value;
	}
	
	public void setServerUrl(final Collection<String> value)
	{
		this.modifiedPropsSet.add("serverUrl");
		this._serverUrl = value;
	}
	
	public void setSocketFactory(final String value)
	{
		this.modifiedPropsSet.add("socketFactory");
		this._socketFactory = value;
	}
	
}
