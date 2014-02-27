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
package de.hybris.platform.solrfacetsearch.dto.config;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrEndpointUrlDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrServerConfigModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrServerConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrServerConfigModel.class, factory = GenericNodeFactory.class, uidProperties="name")
@XmlRootElement(name = "solrserverconfig")
public class SolrServerConfigDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.socketTimeout</code> attribute defined at extension <code> */
	private java.lang.Integer _socketTimeout;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.useMasterNodeExclusivelyForIndexing</code> attribute defined at extension <code> */
	private boolean _useMasterNodeExclusivelyForIndexing;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.aliveCheckInterval</code> attribute defined at extension <code> */
	private java.lang.Integer _aliveCheckInterval;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.readTimeout</code> attribute defined at extension <code> */
	private java.lang.Integer _readTimeout;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.tcpNoDelay</code> attribute defined at extension <code> */
	private boolean _tcpNoDelay;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.solrEndpointUrls</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrEndpointUrlDTO> _solrEndpointUrls;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.connectionTimeout</code> attribute defined at extension <code> */
	private java.lang.Integer _connectionTimeout;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.maxTotalConnectionsPerHostConfig</code> attribute defined at extension <code> */
	private java.lang.Integer _maxTotalConnectionsPerHostConfig;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.embeddedMaster</code> attribute defined at extension <code> */
	private boolean _embeddedMaster;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.maxTotalConnections</code> attribute defined at extension <code> */
	private java.lang.Integer _maxTotalConnections;
	/** <i>Generated variable</i> - Variable of <code>SolrServerConfig.mode</code> attribute defined at extension <code> */
	private java.lang.String _mode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrServerConfigDTO()
	{
		super();
	}
	
	
	public Integer getAliveCheckInterval()
	{
		return this._aliveCheckInterval;
	}
	
	public Integer getConnectionTimeout()
	{
		return this._connectionTimeout;
	}
	
	public Integer getMaxTotalConnections()
	{
		return this._maxTotalConnections;
	}
	
	public Integer getMaxTotalConnectionsPerHostConfig()
	{
		return this._maxTotalConnectionsPerHostConfig;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getMode()
	{
		return this._mode;
	}
	
	@XmlAttribute
	public String getName()
	{
		return this._name;
	}
	
	public Integer getReadTimeout()
	{
		return this._readTimeout;
	}
	
	public Integer getSocketTimeout()
	{
		return this._socketTimeout;
	}
	
	@XmlElementWrapper(name = "solrEndpointUrls")
	@XmlElement(name = "solrEndpointUrl")
	public List<SolrEndpointUrlDTO> getSolrEndpointUrls()
	{
		return this._solrEndpointUrls;
	}
	
	public boolean isEmbeddedMaster()
	{
		return this._embeddedMaster;
	}
	
	public boolean isTcpNoDelay()
	{
		return this._tcpNoDelay;
	}
	
	public boolean isUseMasterNodeExclusivelyForIndexing()
	{
		return this._useMasterNodeExclusivelyForIndexing;
	}
	
	public void setAliveCheckInterval(final Integer value)
	{
		this.modifiedPropsSet.add("aliveCheckInterval");
		this._aliveCheckInterval = value;
	}
	
	public void setConnectionTimeout(final Integer value)
	{
		this.modifiedPropsSet.add("connectionTimeout");
		this._connectionTimeout = value;
	}
	
	public void setEmbeddedMaster(final boolean value)
	{
		this.modifiedPropsSet.add("embeddedMaster");
		this._embeddedMaster = value;
	}
	
	public void setMaxTotalConnections(final Integer value)
	{
		this.modifiedPropsSet.add("maxTotalConnections");
		this._maxTotalConnections = value;
	}
	
	public void setMaxTotalConnectionsPerHostConfig(final Integer value)
	{
		this.modifiedPropsSet.add("maxTotalConnectionsPerHostConfig");
		this._maxTotalConnectionsPerHostConfig = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setMode(final String value)
	{
		this.modifiedPropsSet.add("mode");
		this._mode = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setReadTimeout(final Integer value)
	{
		this.modifiedPropsSet.add("readTimeout");
		this._readTimeout = value;
	}
	
	public void setSocketTimeout(final Integer value)
	{
		this.modifiedPropsSet.add("socketTimeout");
		this._socketTimeout = value;
	}
	
	public void setSolrEndpointUrls(final List<SolrEndpointUrlDTO> value)
	{
		this.modifiedPropsSet.add("solrEndpointUrls");
		this._solrEndpointUrls = value;
	}
	
	public void setTcpNoDelay(final boolean value)
	{
		this.modifiedPropsSet.add("tcpNoDelay");
		this._tcpNoDelay = value;
	}
	
	public void setUseMasterNodeExclusivelyForIndexing(final boolean value)
	{
		this.modifiedPropsSet.add("useMasterNodeExclusivelyForIndexing");
		this._useMasterNodeExclusivelyForIndexing = value;
	}
	
}
