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
package de.hybris.platform.solrfacetsearch.dto.indexer;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.solrfacetsearch.dto.SolrIndexOperationRecordDTO;
import de.hybris.platform.solrfacetsearch.model.indexer.SolrIndexedCoresRecordModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrIndexedCoresRecord first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexedCoresRecordModel.class, factory = GenericNodeFactory.class, uidProperties="coreName")
@XmlRootElement(name = "solrindexedcoresrecord")
public class SolrIndexedCoresRecordDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.serverMode</code> attribute defined at extension <code> */
	private java.lang.String _serverMode;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.indexName</code> attribute defined at extension <code> */
	private java.lang.String _indexName;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.indexTime</code> attribute defined at extension <code> */
	private java.util.Date _indexTime;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.indexOperations</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.solrfacetsearch.dto.SolrIndexOperationRecordDTO> _indexOperations;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.currentIndexDataSubDirectory</code> attribute defined at extension <code> */
	private java.lang.String _currentIndexDataSubDirectory;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedCoresRecord.coreName</code> attribute defined at extension <code> */
	private java.lang.String _coreName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedCoresRecordDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCoreName()
	{
		return this._coreName;
	}
	
	public String getCurrentIndexDataSubDirectory()
	{
		return this._currentIndexDataSubDirectory;
	}
	
	public String getIndexName()
	{
		return this._indexName;
	}
	
	@XmlElementWrapper(name = "indexOperations")
	@XmlElement(name = "solrIndexOperationRecord")
	public Collection<SolrIndexOperationRecordDTO> getIndexOperations()
	{
		return this._indexOperations;
	}
	
	public Date getIndexTime()
	{
		return this._indexTime;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getServerMode()
	{
		return this._serverMode;
	}
	
	public void setCoreName(final String value)
	{
		this.modifiedPropsSet.add("coreName");
		this._coreName = value;
	}
	
	public void setCurrentIndexDataSubDirectory(final String value)
	{
		this.modifiedPropsSet.add("currentIndexDataSubDirectory");
		this._currentIndexDataSubDirectory = value;
	}
	
	public void setIndexName(final String value)
	{
		this.modifiedPropsSet.add("indexName");
		this._indexName = value;
	}
	
	public void setIndexOperations(final Collection<SolrIndexOperationRecordDTO> value)
	{
		this.modifiedPropsSet.add("indexOperations");
		this._indexOperations = value;
	}
	
	public void setIndexTime(final Date value)
	{
		this.modifiedPropsSet.add("indexTime");
		this._indexTime = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setServerMode(final String value)
	{
		this.modifiedPropsSet.add("serverMode");
		this._serverMode = value;
	}
	
}
