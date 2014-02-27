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
package de.hybris.platform.catalog.dto.classification;

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationAttributeUnitDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationAttributeValueDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationClassDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO;
import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.core.dto.ItemDTO;
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
 * Generated dto class for type ClassAttributeAssignment first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ClassAttributeAssignmentModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "classattributeassignment")
public class ClassAttributeAssignmentDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.classificationAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO _classificationAttribute;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.attributeValueDisplayString</code> attribute defined at extension <code> */
	private java.lang.String _attributeValueDisplayString;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.position</code> attribute defined at extension <code> */
	private java.lang.Integer _position;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.unit</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationAttributeUnitDTO _unit;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.systemVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO _systemVersion;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.listable</code> attribute defined at extension <code> */
	private java.lang.Boolean _listable;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.range</code> attribute defined at extension <code> */
	private java.lang.Boolean _range;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.classificationClass</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationClassDTO _classificationClass;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.localized</code> attribute defined at extension <code> */
	private java.lang.Boolean _localized;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.searchable</code> attribute defined at extension <code> */
	private java.lang.Boolean _searchable;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.comparable</code> attribute defined at extension <code> */
	private java.lang.Boolean _comparable;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.externalID</code> attribute defined at extension <code> */
	private java.lang.String _externalID;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.mandatory</code> attribute defined at extension <code> */
	private java.lang.Boolean _mandatory;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.formatDefinition</code> attribute defined at extension <code> */
	private java.lang.String _formatDefinition;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.visibility</code> attribute defined at extension <code> */
	private java.lang.String _visibility;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.multiValued</code> attribute defined at extension <code> */
	private java.lang.Boolean _multiValued;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.attributeType</code> attribute defined at extension <code> */
	private java.lang.String _attributeType;
	/** <i>Generated variable</i> - Variable of <code>ClassAttributeAssignment.attributeValues</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassificationAttributeValueDTO> _attributeValues;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassAttributeAssignmentDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getAttributeType()
	{
		return this._attributeType;
	}
	
	public String getAttributeValueDisplayString()
	{
		return this._attributeValueDisplayString;
	}
	
	@XmlElementWrapper(name = "attributeValues")
	@XmlElement(name = "classificationAttributeValue")
	public List<ClassificationAttributeValueDTO> getAttributeValues()
	{
		return this._attributeValues;
	}
	
	public ClassificationAttributeDTO getClassificationAttribute()
	{
		return this._classificationAttribute;
	}
	
	public ClassificationClassDTO getClassificationClass()
	{
		return this._classificationClass;
	}
	
	public Boolean getComparable()
	{
		return this._comparable;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getExternalID()
	{
		return this._externalID;
	}
	
	public String getFormatDefinition()
	{
		return this._formatDefinition;
	}
	
	public Boolean getListable()
	{
		return this._listable;
	}
	
	public Boolean getLocalized()
	{
		return this._localized;
	}
	
	public Boolean getMandatory()
	{
		return this._mandatory;
	}
	
	public Boolean getMultiValued()
	{
		return this._multiValued;
	}
	
	public Integer getPosition()
	{
		return this._position;
	}
	
	public Boolean getRange()
	{
		return this._range;
	}
	
	public Boolean getSearchable()
	{
		return this._searchable;
	}
	
	public ClassificationSystemVersionDTO getSystemVersion()
	{
		return this._systemVersion;
	}
	
	public ClassificationAttributeUnitDTO getUnit()
	{
		return this._unit;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getVisibility()
	{
		return this._visibility;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setAttributeType(final String value)
	{
		this.modifiedPropsSet.add("attributeType");
		this._attributeType = value;
	}
	
	public void setAttributeValueDisplayString(final String value)
	{
		this.modifiedPropsSet.add("attributeValueDisplayString");
		this._attributeValueDisplayString = value;
	}
	
	public void setAttributeValues(final List<ClassificationAttributeValueDTO> value)
	{
		this.modifiedPropsSet.add("attributeValues");
		this._attributeValues = value;
	}
	
	public void setClassificationAttribute(final ClassificationAttributeDTO value)
	{
		this.modifiedPropsSet.add("classificationAttribute");
		this._classificationAttribute = value;
	}
	
	public void setClassificationClass(final ClassificationClassDTO value)
	{
		this.modifiedPropsSet.add("classificationClass");
		this._classificationClass = value;
	}
	
	public void setComparable(final Boolean value)
	{
		this.modifiedPropsSet.add("comparable");
		this._comparable = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setExternalID(final String value)
	{
		this.modifiedPropsSet.add("externalID");
		this._externalID = value;
	}
	
	public void setFormatDefinition(final String value)
	{
		this.modifiedPropsSet.add("formatDefinition");
		this._formatDefinition = value;
	}
	
	public void setListable(final Boolean value)
	{
		this.modifiedPropsSet.add("listable");
		this._listable = value;
	}
	
	public void setLocalized(final Boolean value)
	{
		this.modifiedPropsSet.add("localized");
		this._localized = value;
	}
	
	public void setMandatory(final Boolean value)
	{
		this.modifiedPropsSet.add("mandatory");
		this._mandatory = value;
	}
	
	public void setMultiValued(final Boolean value)
	{
		this.modifiedPropsSet.add("multiValued");
		this._multiValued = value;
	}
	
	public void setPosition(final Integer value)
	{
		this.modifiedPropsSet.add("position");
		this._position = value;
	}
	
	public void setRange(final Boolean value)
	{
		this.modifiedPropsSet.add("range");
		this._range = value;
	}
	
	public void setSearchable(final Boolean value)
	{
		this.modifiedPropsSet.add("searchable");
		this._searchable = value;
	}
	
	public void setSystemVersion(final ClassificationSystemVersionDTO value)
	{
		this.modifiedPropsSet.add("systemVersion");
		this._systemVersion = value;
	}
	
	public void setUnit(final ClassificationAttributeUnitDTO value)
	{
		this.modifiedPropsSet.add("unit");
		this._unit = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setVisibility(final String value)
	{
		this.modifiedPropsSet.add("visibility");
		this._visibility = value;
	}
	
}
