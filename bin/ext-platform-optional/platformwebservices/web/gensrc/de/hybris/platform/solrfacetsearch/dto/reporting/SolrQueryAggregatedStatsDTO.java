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
package de.hybris.platform.solrfacetsearch.dto.reporting;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.model.reporting.SolrQueryAggregatedStatsModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrQueryAggregatedStats first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrQueryAggregatedStatsModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrqueryaggregatedstats")
public class SolrQueryAggregatedStatsDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.query</code> attribute defined at extension <code> */
	private java.lang.String _query;
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.count</code> attribute defined at extension <code> */
	private long _count;
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.time</code> attribute defined at extension <code> */
	private java.util.Date _time;
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.avgNumberOfResults</code> attribute defined at extension <code> */
	private double _avgNumberOfResults;
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	/** <i>Generated variable</i> - Variable of <code>SolrQueryAggregatedStats.indexConfig</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO _indexConfig;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryAggregatedStatsDTO()
	{
		super();
	}
	
	
	public double getAvgNumberOfResults()
	{
		return this._avgNumberOfResults;
	}
	
	public long getCount()
	{
		return this._count;
	}
	
	public SolrFacetSearchConfigDTO getIndexConfig()
	{
		return this._indexConfig;
	}
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public String getQuery()
	{
		return this._query;
	}
	
	public Date getTime()
	{
		return this._time;
	}
	
	public void setAvgNumberOfResults(final double value)
	{
		this.modifiedPropsSet.add("avgNumberOfResults");
		this._avgNumberOfResults = value;
	}
	
	public void setCount(final long value)
	{
		this.modifiedPropsSet.add("count");
		this._count = value;
	}
	
	public void setIndexConfig(final SolrFacetSearchConfigDTO value)
	{
		this.modifiedPropsSet.add("indexConfig");
		this._indexConfig = value;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setQuery(final String value)
	{
		this.modifiedPropsSet.add("query");
		this._query = value;
	}
	
	public void setTime(final Date value)
	{
		this.modifiedPropsSet.add("time");
		this._time = value;
	}
	
}
