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

import de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortDTO;
import de.hybris.platform.commerceservices.model.solrsearch.config.SolrSortFieldModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrSortField first defined at extension commerceservices
 */
@SuppressWarnings("all")
@GraphNode(target = SolrSortFieldModel.class, factory = GenericNodeFactory.class, uidProperties="fieldName")
@XmlRootElement(name = "solrsortfield")
public class SolrSortFieldDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrSortField.ascending</code> attribute defined at extension <code> */
	private boolean _ascending;
	/** <i>Generated variable</i> - Variable of <code>SolrSortField.fieldName</code> attribute defined at extension <code> */
	private java.lang.String _fieldName;
	/** <i>Generated variable</i> - Variable of <code>SolrSortField.sort</code> attribute defined at extension <code> */
	private de.hybris.platform.commerceservices.dto.solrsearch.config.SolrSortDTO _sort;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrSortFieldDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getFieldName()
	{
		return this._fieldName;
	}
	
	public SolrSortDTO getSort()
	{
		return this._sort;
	}
	
	@XmlAttribute
	public boolean isAscending()
	{
		return this._ascending;
	}
	
	public void setAscending(final boolean value)
	{
		this.modifiedPropsSet.add("ascending");
		this._ascending = value;
	}
	
	public void setFieldName(final String value)
	{
		this.modifiedPropsSet.add("fieldName");
		this._fieldName = value;
	}
	
	public void setSort(final SolrSortDTO value)
	{
		this.modifiedPropsSet.add("sort");
		this._sort = value;
	}
	
}
