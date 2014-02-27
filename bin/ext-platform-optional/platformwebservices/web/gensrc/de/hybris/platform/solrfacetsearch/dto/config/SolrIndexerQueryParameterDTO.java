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
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexerQueryParameterModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrIndexerQueryParameter first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexerQueryParameterModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrindexerqueryparameter")
public class SolrIndexerQueryParameterDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQueryParameter.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQueryParameter.solrIndexerQuery</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrIndexerQueryDTO _solrIndexerQuery;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerQueryParameter.value</code> attribute defined at extension <code> */
	private java.lang.String _value;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerQueryParameterDTO()
	{
		super();
	}
	
	
	public String getName()
	{
		return this._name;
	}
	
	public SolrIndexerQueryDTO getSolrIndexerQuery()
	{
		return this._solrIndexerQuery;
	}
	
	public String getValue()
	{
		return this._value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSolrIndexerQuery(final SolrIndexerQueryDTO value)
	{
		this.modifiedPropsSet.add("solrIndexerQuery");
		this._solrIndexerQuery = value;
	}
	
	public void setValue(final String value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
