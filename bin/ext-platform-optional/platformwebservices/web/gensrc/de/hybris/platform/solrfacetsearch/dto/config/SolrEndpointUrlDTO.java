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
import de.hybris.platform.solrfacetsearch.dto.config.SolrServerConfigDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrEndpointUrlModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrEndpointUrl first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrEndpointUrlModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrendpointurl")
public class SolrEndpointUrlDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrEndpointUrl.solrServerConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrServerConfigDTO _solrServerConfig;
	/** <i>Generated variable</i> - Variable of <code>SolrEndpointUrl.url</code> attribute defined at extension <code> */
	private java.lang.String _url;
	/** <i>Generated variable</i> - Variable of <code>SolrEndpointUrl.master</code> attribute defined at extension <code> */
	private boolean _master;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrEndpointUrlDTO()
	{
		super();
	}
	
	
	public SolrServerConfigDTO getSolrServerConfig()
	{
		return this._solrServerConfig;
	}
	
	public String getUrl()
	{
		return this._url;
	}
	
	public boolean isMaster()
	{
		return this._master;
	}
	
	public void setMaster(final boolean value)
	{
		this.modifiedPropsSet.add("master");
		this._master = value;
	}
	
	public void setSolrServerConfig(final SolrServerConfigDTO value)
	{
		this.modifiedPropsSet.add("solrServerConfig");
		this._solrServerConfig = value;
	}
	
	public void setUrl(final String value)
	{
		this.modifiedPropsSet.add("url");
		this._url = value;
	}
	
}
