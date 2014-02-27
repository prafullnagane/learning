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
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrSearchConfigModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrSearchConfig first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrSearchConfigModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrsearchconfig")
public class SolrSearchConfigDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.groupingProperty</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO _groupingProperty;
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.defaultSortOrder</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _defaultSortOrder;
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.pageSize</code> attribute defined at extension <code> */
	private java.lang.Integer _pageSize;
	/** <i>Generated variable</i> - Variable of <code>SolrSearchConfig.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSearchConfigDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "defaultSortOrder")
	@XmlElement(name = "value")
	public Collection<String> getDefaultSortOrder()
	{
		return this._defaultSortOrder;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public SolrIndexedPropertyDTO getGroupingProperty()
	{
		return this._groupingProperty;
	}
	
	public Integer getPageSize()
	{
		return this._pageSize;
	}
	
	public void setDefaultSortOrder(final Collection<String> value)
	{
		this.modifiedPropsSet.add("defaultSortOrder");
		this._defaultSortOrder = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setGroupingProperty(final SolrIndexedPropertyDTO value)
	{
		this.modifiedPropsSet.add("groupingProperty");
		this._groupingProperty = value;
	}
	
	public void setPageSize(final Integer value)
	{
		this.modifiedPropsSet.add("pageSize");
		this._pageSize = value;
	}
	
}
