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
import de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeSetModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrValueRangeSet first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrValueRangeSetModel.class, factory = GenericNodeFactory.class, uidProperties="name")
@XmlRootElement(name = "solrvaluerangeset")
public class SolrValueRangeSetDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.facetSearchConfigs</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrFacetSearchConfigDTO> _facetSearchConfigs;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.solrValueRanges</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeDTO> _solrValueRanges;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRangeSet.indexedProperties</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedPropertyDTO> _indexedProperties;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrValueRangeSetDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "facetSearchConfigs")
	@XmlElement(name = "solrFacetSearchConfig")
	public List<SolrFacetSearchConfigDTO> getFacetSearchConfigs()
	{
		return this._facetSearchConfigs;
	}
	
	@XmlElementWrapper(name = "indexedProperties")
	@XmlElement(name = "solrIndexedProperty")
	public List<SolrIndexedPropertyDTO> getIndexedProperties()
	{
		return this._indexedProperties;
	}
	
	@XmlAttribute
	public String getName()
	{
		return this._name;
	}
	
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	@XmlElementWrapper(name = "solrValueRanges")
	@XmlElement(name = "solrValueRange")
	public List<SolrValueRangeDTO> getSolrValueRanges()
	{
		return this._solrValueRanges;
	}
	
	public String getType()
	{
		return this._type;
	}
	
	public void setFacetSearchConfigs(final List<SolrFacetSearchConfigDTO> value)
	{
		this.modifiedPropsSet.add("facetSearchConfigs");
		this._facetSearchConfigs = value;
	}
	
	public void setIndexedProperties(final List<SolrIndexedPropertyDTO> value)
	{
		this.modifiedPropsSet.add("indexedProperties");
		this._indexedProperties = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
	public void setSolrValueRanges(final List<SolrValueRangeDTO> value)
	{
		this.modifiedPropsSet.add("solrValueRanges");
		this._solrValueRanges = value;
	}
	
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
}
