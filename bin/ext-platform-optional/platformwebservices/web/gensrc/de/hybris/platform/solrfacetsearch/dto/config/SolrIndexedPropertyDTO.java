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

import de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO;
import de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedPropertyModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrIndexedProperty first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrIndexedPropertyModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "solrindexedproperty")
public class SolrIndexedPropertyDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facetDisplayNameProvider</code> attribute defined at extension <code> */
	private java.lang.String _facetDisplayNameProvider;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.valueProviderParameter</code> attribute defined at extension <code> */
	private java.lang.String _valueProviderParameter;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.sortableType</code> attribute defined at extension <code> */
	private java.lang.String _sortableType;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.exportId</code> attribute defined at extension <code> */
	private java.lang.String _exportId;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.multiValue</code> attribute defined at extension <code> */
	private boolean _multiValue;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.priority</code> attribute defined at extension <code> */
	private int _priority;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.customFacetSortProvider</code> attribute defined at extension <code> */
	private java.lang.String _customFacetSortProvider;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.rangeSets</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO> _rangeSets;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facet</code> attribute defined at extension <code> */
	private boolean _facet;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.useForAutocomplete</code> attribute defined at extension <code> */
	private java.lang.Boolean _useForAutocomplete;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.localized</code> attribute defined at extension <code> */
	private boolean _localized;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.fieldValueProvider</code> attribute defined at extension <code> */
	private java.lang.String _fieldValueProvider;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facetType</code> attribute defined at extension <code> */
	private java.lang.String _facetType;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.facetSort</code> attribute defined at extension <code> */
	private java.lang.String _facetSort;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.displayName</code> attribute defined at extension <code> */
	private java.lang.String _displayName;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.currency</code> attribute defined at extension <code> */
	private boolean _currency;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.topValuesProvider</code> attribute defined at extension <code> */
	private java.lang.String _topValuesProvider;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.solrIndexedType</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrIndexedTypeDTO _solrIndexedType;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.rangeSet</code> attribute defined at extension <code> */
	private de.hybris.platform.solrfacetsearch.dto.config.SolrValueRangeSetDTO _rangeSet;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.useForSpellchecking</code> attribute defined at extension <code> */
	private java.lang.Boolean _useForSpellchecking;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.classAttributeAssignment</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO _classAttributeAssignment;
	/** <i>Generated variable</i> - Variable of <code>SolrIndexedProperty.categoryField</code> attribute defined at extension <code> */
	private boolean _categoryField;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedPropertyDTO()
	{
		super();
	}
	
	
	public ClassAttributeAssignmentDTO getClassAttributeAssignment()
	{
		return this._classAttributeAssignment;
	}
	
	public String getCustomFacetSortProvider()
	{
		return this._customFacetSortProvider;
	}
	
	public String getDisplayName()
	{
		return this._displayName;
	}
	
	public String getExportId()
	{
		return this._exportId;
	}
	
	public String getFacetDisplayNameProvider()
	{
		return this._facetDisplayNameProvider;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getFacetSort()
	{
		return this._facetSort;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getFacetType()
	{
		return this._facetType;
	}
	
	public String getFieldValueProvider()
	{
		return this._fieldValueProvider;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public int getPriority()
	{
		return this._priority;
	}
	
	public SolrValueRangeSetDTO getRangeSet()
	{
		return this._rangeSet;
	}
	
	@XmlElementWrapper(name = "rangeSets")
	@XmlElement(name = "solrValueRangeSet")
	public List<SolrValueRangeSetDTO> getRangeSets()
	{
		return this._rangeSets;
	}
	
	public SolrIndexedTypeDTO getSolrIndexedType()
	{
		return this._solrIndexedType;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getSortableType()
	{
		return this._sortableType;
	}
	
	public String getTopValuesProvider()
	{
		return this._topValuesProvider;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getType()
	{
		return this._type;
	}
	
	public Boolean getUseForAutocomplete()
	{
		return this._useForAutocomplete;
	}
	
	public Boolean getUseForSpellchecking()
	{
		return this._useForSpellchecking;
	}
	
	public String getValueProviderParameter()
	{
		return this._valueProviderParameter;
	}
	
	public boolean isCategoryField()
	{
		return this._categoryField;
	}
	
	public boolean isCurrency()
	{
		return this._currency;
	}
	
	public boolean isFacet()
	{
		return this._facet;
	}
	
	public boolean isLocalized()
	{
		return this._localized;
	}
	
	public boolean isMultiValue()
	{
		return this._multiValue;
	}
	
	public void setCategoryField(final boolean value)
	{
		this.modifiedPropsSet.add("categoryField");
		this._categoryField = value;
	}
	
	public void setClassAttributeAssignment(final ClassAttributeAssignmentDTO value)
	{
		this.modifiedPropsSet.add("classAttributeAssignment");
		this._classAttributeAssignment = value;
	}
	
	public void setCurrency(final boolean value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setCustomFacetSortProvider(final String value)
	{
		this.modifiedPropsSet.add("customFacetSortProvider");
		this._customFacetSortProvider = value;
	}
	
	public void setDisplayName(final String value)
	{
		this.modifiedPropsSet.add("displayName");
		this._displayName = value;
	}
	
	public void setExportId(final String value)
	{
		this.modifiedPropsSet.add("exportId");
		this._exportId = value;
	}
	
	public void setFacet(final boolean value)
	{
		this.modifiedPropsSet.add("facet");
		this._facet = value;
	}
	
	public void setFacetDisplayNameProvider(final String value)
	{
		this.modifiedPropsSet.add("facetDisplayNameProvider");
		this._facetDisplayNameProvider = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setFacetSort(final String value)
	{
		this.modifiedPropsSet.add("facetSort");
		this._facetSort = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setFacetType(final String value)
	{
		this.modifiedPropsSet.add("facetType");
		this._facetType = value;
	}
	
	public void setFieldValueProvider(final String value)
	{
		this.modifiedPropsSet.add("fieldValueProvider");
		this._fieldValueProvider = value;
	}
	
	public void setLocalized(final boolean value)
	{
		this.modifiedPropsSet.add("localized");
		this._localized = value;
	}
	
	public void setMultiValue(final boolean value)
	{
		this.modifiedPropsSet.add("multiValue");
		this._multiValue = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setPriority(final int value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setRangeSet(final SolrValueRangeSetDTO value)
	{
		this.modifiedPropsSet.add("rangeSet");
		this._rangeSet = value;
	}
	
	public void setRangeSets(final List<SolrValueRangeSetDTO> value)
	{
		this.modifiedPropsSet.add("rangeSets");
		this._rangeSets = value;
	}
	
	public void setSolrIndexedType(final SolrIndexedTypeDTO value)
	{
		this.modifiedPropsSet.add("solrIndexedType");
		this._solrIndexedType = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setSortableType(final String value)
	{
		this.modifiedPropsSet.add("sortableType");
		this._sortableType = value;
	}
	
	public void setTopValuesProvider(final String value)
	{
		this.modifiedPropsSet.add("topValuesProvider");
		this._topValuesProvider = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setUseForAutocomplete(final Boolean value)
	{
		this.modifiedPropsSet.add("useForAutocomplete");
		this._useForAutocomplete = value;
	}
	
	public void setUseForSpellchecking(final Boolean value)
	{
		this.modifiedPropsSet.add("useForSpellchecking");
		this._useForSpellchecking = value;
	}
	
	public void setValueProviderParameter(final String value)
	{
		this.modifiedPropsSet.add("valueProviderParameter");
		this._valueProviderParameter = value;
	}
	
}
