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
package de.hybris.platform.advancedsavedquery.dto;

import de.hybris.platform.advancedsavedquery.dto.WherePartDTO;
import de.hybris.platform.advancedsavedquery.model.AbstractAdvancedSavedQuerySearchParameterModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractAdvancedSavedQuerySearchParameter first defined at extension advancedsavedquery
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractAdvancedSavedQuerySearchParameterModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "abstractadvancedsavedquerysearchparameter")
public class AbstractAdvancedSavedQuerySearchParameterDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.joinAlias</code> attribute defined at extension <code> */
	private java.lang.String _joinAlias;
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.searchParameterName</code> attribute defined at extension <code> */
	private java.lang.String _searchParameterName;
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.comparator</code> attribute defined at extension <code> */
	private java.lang.String _comparator;
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.wherePart</code> attribute defined at extension <code> */
	private de.hybris.platform.advancedsavedquery.dto.WherePartDTO _wherePart;
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.lower</code> attribute defined at extension <code> */
	private java.lang.Boolean _lower;
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.emptyHandling</code> attribute defined at extension <code> */
	private java.lang.String _emptyHandling;
	/** <i>Generated variable</i> - Variable of <code>AbstractAdvancedSavedQuerySearchParameter.valueType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.TypeDTO _valueType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractAdvancedSavedQuerySearchParameterDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getComparator()
	{
		return this._comparator;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEmptyHandling()
	{
		return this._emptyHandling;
	}
	
	public String getJoinAlias()
	{
		return this._joinAlias;
	}
	
	public Boolean getLower()
	{
		return this._lower;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getSearchParameterName()
	{
		return this._searchParameterName;
	}
	
	public TypeDTO getValueType()
	{
		return this._valueType;
	}
	
	public WherePartDTO getWherePart()
	{
		return this._wherePart;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setComparator(final String value)
	{
		this.modifiedPropsSet.add("comparator");
		this._comparator = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEmptyHandling(final String value)
	{
		this.modifiedPropsSet.add("emptyHandling");
		this._emptyHandling = value;
	}
	
	public void setJoinAlias(final String value)
	{
		this.modifiedPropsSet.add("joinAlias");
		this._joinAlias = value;
	}
	
	public void setLower(final Boolean value)
	{
		this.modifiedPropsSet.add("lower");
		this._lower = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSearchParameterName(final String value)
	{
		this.modifiedPropsSet.add("searchParameterName");
		this._searchParameterName = value;
	}
	
	public void setValueType(final TypeDTO value)
	{
		this.modifiedPropsSet.add("valueType");
		this._valueType = value;
	}
	
	public void setWherePart(final WherePartDTO value)
	{
		this.modifiedPropsSet.add("wherePart");
		this._wherePart = value;
	}
	
}
