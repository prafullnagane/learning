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
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexConfigModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrIndexConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexConfigModel.class, factory = GenericNodeFactory.class, uidProperties="name")
@XmlRootElement(name = "solrindexconfig")
public class SolrIndexConfigDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.numberOfThreads</code> attribute defined at extension <code> */
	private int _numberOfThreads;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.batchSize</code> attribute defined at extension <code> */
	private int _batchSize;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.indexMode</code> attribute defined at extension <code> */
	private java.lang.String _indexMode;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexConfig.exportPath</code> attribute defined at extension <code> */
	private java.lang.String _exportPath;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexConfigDTO()
	{
		super();
	}
	
	
	public int getBatchSize()
	{
		return this._batchSize;
	}
	
	public String getExportPath()
	{
		return this._exportPath;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getIndexMode()
	{
		return this._indexMode;
	}
	
	@XmlAttribute
	public String getName()
	{
		return this._name;
	}
	
	public int getNumberOfThreads()
	{
		return this._numberOfThreads;
	}
	
	public void setBatchSize(final int value)
	{
		this.modifiedPropsSet.add("batchSize");
		this._batchSize = value;
	}
	
	public void setExportPath(final String value)
	{
		this.modifiedPropsSet.add("exportPath");
		this._exportPath = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setIndexMode(final String value)
	{
		this.modifiedPropsSet.add("indexMode");
		this._indexMode = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setNumberOfThreads(final int value)
	{
		this.modifiedPropsSet.add("numberOfThreads");
		this._numberOfThreads = value;
	}
	
}
