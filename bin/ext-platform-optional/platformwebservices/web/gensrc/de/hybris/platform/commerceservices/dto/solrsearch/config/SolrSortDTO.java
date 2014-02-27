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
package de.hybris.platform.commerceservices.dto.solrsearch.config;

import de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortFieldDTO;
import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrSort first defined at extension commerceservices
 */
@SuppressWarnings("all")
@GraphNode(target = SolrSortModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "solrsort")
public class SolrSortDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrSort.indexedType</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO _indexedType;
	/** <i>Generated variable</i> - Variable of <code>SolrSort.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>SolrSort.fields</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortFieldDTO> _fields;
	/** <i>Generated variable</i> - Variable of <code>SolrSort.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSortDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "fields")
	@XmlElement(name = "solrSortField")
	public List<SolrSortFieldDTO> getFields()
	{
		return this._fields;
	}
	
	public SolrIndexedTypeDTO getIndexedType()
	{
		return this._indexedType;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setFields(final List<SolrSortFieldDTO> value)
	{
		this.modifiedPropsSet.add("fields");
		this._fields = value;
	}
	
	public void setIndexedType(final SolrIndexedTypeDTO value)
	{
		this.modifiedPropsSet.add("indexedType");
		this._indexedType = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
}
