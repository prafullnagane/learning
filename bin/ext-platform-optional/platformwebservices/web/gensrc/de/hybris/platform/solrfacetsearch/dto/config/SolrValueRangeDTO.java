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
import de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrValueRangeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrValueRange first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrValueRangeModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrvaluerange")
public class SolrValueRangeDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.to</code> attribute defined at extension <code> */
	private java.lang.String _to;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.from</code> attribute defined at extension <code> */
	private java.lang.String _from;
	/** <i>Generated variable</i> - Variable of <code>SolrValueRange.solrValueRangeSet</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO _solrValueRangeSet;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrValueRangeDTO()
	{
		super();
	}
	
	
	public String getFrom()
	{
		return this._from;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public SolrValueRangeSetDTO getSolrValueRangeSet()
	{
		return this._solrValueRangeSet;
	}
	
	public String getTo()
	{
		return this._to;
	}
	
	public void setFrom(final String value)
	{
		this.modifiedPropsSet.add("from");
		this._from = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSolrValueRangeSet(final SolrValueRangeSetDTO value)
	{
		this.modifiedPropsSet.add("solrValueRangeSet");
		this._solrValueRangeSet = value;
	}
	
	public void setTo(final String value)
	{
		this.modifiedPropsSet.add("to");
		this._to = value;
	}
	
}
