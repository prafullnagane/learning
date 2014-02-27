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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.dto.type.RelationDescriptorDTO;
import de.hybris.platform.core.model.type.RelationMetaTypeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RelationMetaType first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = RelationMetaTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "relationmetatype")
public class RelationMetaTypeDTO extends ComposedTypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _targetType;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.localized</code> attribute defined at extension <code> */
	private java.lang.Boolean _localized;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.RelationDescriptorDTO _sourceAttribute;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _sourceType;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.localizationAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _localizationAttribute;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetTypeCardinality</code> attribute defined at extension <code> */
	private java.lang.String _targetTypeCardinality;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetTypeRole</code> attribute defined at extension <code> */
	private java.lang.String _targetTypeRole;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.orderingAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _orderingAttribute;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceTypeCardinality</code> attribute defined at extension <code> */
	private java.lang.String _sourceTypeCardinality;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.RelationDescriptorDTO _targetAttribute;
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceTypeRole</code> attribute defined at extension <code> */
	private java.lang.String _sourceTypeRole;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationMetaTypeDTO()
	{
		super();
	}
	
	
	public AttributeDescriptorDTO getLocalizationAttribute()
	{
		return this._localizationAttribute;
	}
	
	public Boolean getLocalized()
	{
		return this._localized;
	}
	
	public AttributeDescriptorDTO getOrderingAttribute()
	{
		return this._orderingAttribute;
	}
	
	public RelationDescriptorDTO getSourceAttribute()
	{
		return this._sourceAttribute;
	}
	
	public ComposedTypeDTO getSourceType()
	{
		return this._sourceType;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getSourceTypeCardinality()
	{
		return this._sourceTypeCardinality;
	}
	
	public String getSourceTypeRole()
	{
		return this._sourceTypeRole;
	}
	
	public RelationDescriptorDTO getTargetAttribute()
	{
		return this._targetAttribute;
	}
	
	public ComposedTypeDTO getTargetType()
	{
		return this._targetType;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getTargetTypeCardinality()
	{
		return this._targetTypeCardinality;
	}
	
	public String getTargetTypeRole()
	{
		return this._targetTypeRole;
	}
	
	public void setLocalizationAttribute(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("localizationAttribute");
		this._localizationAttribute = value;
	}
	
	public void setLocalized(final Boolean value)
	{
		this.modifiedPropsSet.add("localized");
		this._localized = value;
	}
	
	public void setOrderingAttribute(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("orderingAttribute");
		this._orderingAttribute = value;
	}
	
	public void setSourceAttribute(final RelationDescriptorDTO value)
	{
		this.modifiedPropsSet.add("sourceAttribute");
		this._sourceAttribute = value;
	}
	
	public void setSourceType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("sourceType");
		this._sourceType = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setSourceTypeCardinality(final String value)
	{
		this.modifiedPropsSet.add("sourceTypeCardinality");
		this._sourceTypeCardinality = value;
	}
	
	public void setSourceTypeRole(final String value)
	{
		this.modifiedPropsSet.add("sourceTypeRole");
		this._sourceTypeRole = value;
	}
	
	public void setTargetAttribute(final RelationDescriptorDTO value)
	{
		this.modifiedPropsSet.add("targetAttribute");
		this._targetAttribute = value;
	}
	
	public void setTargetType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("targetType");
		this._targetType = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setTargetTypeCardinality(final String value)
	{
		this.modifiedPropsSet.add("targetTypeCardinality");
		this._targetTypeCardinality = value;
	}
	
	public void setTargetTypeRole(final String value)
	{
		this.modifiedPropsSet.add("targetTypeRole");
		this._targetTypeRole = value;
	}
	
}
