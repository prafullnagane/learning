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
package de.hybris.platform.solrfacetsearch.dto.indexer.cron;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.solrfacetsearch.dto.indexer.cron.SolrIndexerCronJobDTO;
import de.hybris.platform.solrfacetsearch.model.indexer.cron.SolrIndexerHotUpdateCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrIndexerHotUpdateCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexerHotUpdateCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "solrindexerhotupdatecronjob")
public class SolrIndexerHotUpdateCronJobDTO extends SolrIndexerCronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerHotUpdateCronJob.items</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.ItemDTO> _items;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexerHotUpdateCronJob.indexTypeName</code> attribute defined at extension <code> */
	private java.lang.String _indexTypeName;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexerHotUpdateCronJobDTO()
	{
		super();
	}
	
	
	public String getIndexTypeName()
	{
		return this._indexTypeName;
	}
	
	@XmlElementWrapper(name = "items")
	@XmlElement(name = "item")
	public Collection<ItemDTO> getItems()
	{
		return this._items;
	}
	
	public void setIndexTypeName(final String value)
	{
		this.modifiedPropsSet.add("indexTypeName");
		this._indexTypeName = value;
	}
	
	public void setItems(final Collection<ItemDTO> value)
	{
		this.modifiedPropsSet.add("items");
		this._items = value;
	}
	
}
