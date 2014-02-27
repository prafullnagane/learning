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
package de.hybris.platform.core.model.type;

import de.hybris.platform.core.enums.RelationEndCardinalityEnum;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.core.model.type.RelationDescriptorModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type RelationMetaType first defined at extension core.
 */
@SuppressWarnings("all")
public class RelationMetaTypeModel extends ComposedTypeModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "RelationMetaType";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.targetType</code> attribute defined at extension <code>core</code>. */
	public static final String TARGETTYPE = "targetType";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.sourceAttribute</code> attribute defined at extension <code>core</code>. */
	public static final String SOURCEATTRIBUTE = "sourceAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.localized</code> attribute defined at extension <code>core</code>. */
	public static final String LOCALIZED = "localized";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.localizationAttribute</code> attribute defined at extension <code>core</code>. */
	public static final String LOCALIZATIONATTRIBUTE = "localizationAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.sourceType</code> attribute defined at extension <code>core</code>. */
	public static final String SOURCETYPE = "sourceType";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.targetTypeCardinality</code> attribute defined at extension <code>core</code>. */
	public static final String TARGETTYPECARDINALITY = "targetTypeCardinality";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.orderingAttribute</code> attribute defined at extension <code>core</code>. */
	public static final String ORDERINGATTRIBUTE = "orderingAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.targetTypeRole</code> attribute defined at extension <code>core</code>. */
	public static final String TARGETTYPEROLE = "targetTypeRole";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.sourceTypeCardinality</code> attribute defined at extension <code>core</code>. */
	public static final String SOURCETYPECARDINALITY = "sourceTypeCardinality";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.sourceTypeRole</code> attribute defined at extension <code>core</code>. */
	public static final String SOURCETYPEROLE = "sourceTypeRole";
	
	/** <i>Generated constant</i> - Attribute key of <code>RelationMetaType.targetAttribute</code> attribute defined at extension <code>core</code>. */
	public static final String TARGETATTRIBUTE = "targetAttribute";
	
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetType</code> attribute defined at extension <code>core</code>. */
	private ComposedTypeModel _targetType;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceAttribute</code> attribute defined at extension <code>core</code>. */
	private RelationDescriptorModel _sourceAttribute;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.localized</code> attribute defined at extension <code>core</code>. */
	private Boolean _localized;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.localizationAttribute</code> attribute defined at extension <code>core</code>. */
	private AttributeDescriptorModel _localizationAttribute;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceType</code> attribute defined at extension <code>core</code>. */
	private ComposedTypeModel _sourceType;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetTypeCardinality</code> attribute defined at extension <code>core</code>. */
	private RelationEndCardinalityEnum _targetTypeCardinality;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.orderingAttribute</code> attribute defined at extension <code>core</code>. */
	private AttributeDescriptorModel _orderingAttribute;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetTypeRole</code> attribute defined at extension <code>core</code>. */
	private String _targetTypeRole;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceTypeCardinality</code> attribute defined at extension <code>core</code>. */
	private RelationEndCardinalityEnum _sourceTypeCardinality;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.sourceTypeRole</code> attribute defined at extension <code>core</code>. */
	private String _sourceTypeRole;
	
	/** <i>Generated variable</i> - Variable of <code>RelationMetaType.targetAttribute</code> attribute defined at extension <code>core</code>. */
	private RelationDescriptorModel _targetAttribute;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public RelationMetaTypeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public RelationMetaTypeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogItemType initial attribute declared by type <code>ComposedType</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Type</code> at extension <code>core</code>
	 * @param _generate initial attribute declared by type <code>TypeManagerManaged</code> at extension <code>core</code>
	 * @param _localized initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _singleton initial attribute declared by type <code>ComposedType</code> at extension <code>core</code>
	 * @param _superType initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 */
	@Deprecated
	public RelationMetaTypeModel(final Boolean _catalogItemType, final String _code, final Boolean _generate, final Boolean _localized, final Boolean _singleton, final ComposedTypeModel _superType)
	{
		super();
		setCatalogItemType(_catalogItemType);
		setCode(_code);
		setGenerate(_generate);
		setLocalized(_localized);
		setSingleton(_singleton);
		setSuperType(_superType);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogItemType initial attribute declared by type <code>ComposedType</code> at extension <code>catalog</code>
	 * @param _code initial attribute declared by type <code>Type</code> at extension <code>core</code>
	 * @param _generate initial attribute declared by type <code>TypeManagerManaged</code> at extension <code>core</code>
	 * @param _localizationAttribute initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _localized initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _orderingAttribute initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _singleton initial attribute declared by type <code>ComposedType</code> at extension <code>core</code>
	 * @param _sourceAttribute initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _sourceType initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _sourceTypeCardinality initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _sourceTypeRole initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _superType initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _targetAttribute initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _targetType initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _targetTypeCardinality initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 * @param _targetTypeRole initial attribute declared by type <code>RelationMetaType</code> at extension <code>core</code>
	 */
	@Deprecated
	public RelationMetaTypeModel(final Boolean _catalogItemType, final String _code, final Boolean _generate, final AttributeDescriptorModel _localizationAttribute, final Boolean _localized, final AttributeDescriptorModel _orderingAttribute, final ItemModel _owner, final Boolean _singleton, final RelationDescriptorModel _sourceAttribute, final ComposedTypeModel _sourceType, final RelationEndCardinalityEnum _sourceTypeCardinality, final String _sourceTypeRole, final ComposedTypeModel _superType, final RelationDescriptorModel _targetAttribute, final ComposedTypeModel _targetType, final RelationEndCardinalityEnum _targetTypeCardinality, final String _targetTypeRole)
	{
		super();
		setCatalogItemType(_catalogItemType);
		setCode(_code);
		setGenerate(_generate);
		setLocalizationAttribute(_localizationAttribute);
		setLocalized(_localized);
		setOrderingAttribute(_orderingAttribute);
		setOwner(_owner);
		setSingleton(_singleton);
		setSourceAttribute(_sourceAttribute);
		setSourceType(_sourceType);
		setSourceTypeCardinality(_sourceTypeCardinality);
		setSourceTypeRole(_sourceTypeRole);
		setSuperType(_superType);
		setTargetAttribute(_targetAttribute);
		setTargetType(_targetType);
		setTargetTypeCardinality(_targetTypeCardinality);
		setTargetTypeRole(_targetTypeRole);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.localizationAttribute</code> attribute defined at extension <code>core</code>. 
	 * @return the localizationAttribute
	 */
	public AttributeDescriptorModel getLocalizationAttribute()
	{
		return _localizationAttribute = getPersistenceContext().getValue(LOCALIZATIONATTRIBUTE, _localizationAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.localized</code> attribute defined at extension <code>core</code>. 
	 * @return the localized
	 */
	public Boolean getLocalized()
	{
		return _localized = getPersistenceContext().getValue(LOCALIZED, _localized);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.orderingAttribute</code> attribute defined at extension <code>core</code>. 
	 * @return the orderingAttribute
	 */
	public AttributeDescriptorModel getOrderingAttribute()
	{
		return _orderingAttribute = getPersistenceContext().getValue(ORDERINGATTRIBUTE, _orderingAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.sourceAttribute</code> attribute defined at extension <code>core</code>. 
	 * @return the sourceAttribute
	 */
	public RelationDescriptorModel getSourceAttribute()
	{
		return _sourceAttribute = getPersistenceContext().getValue(SOURCEATTRIBUTE, _sourceAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.sourceType</code> attribute defined at extension <code>core</code>. 
	 * @return the sourceType
	 */
	public ComposedTypeModel getSourceType()
	{
		return _sourceType = getPersistenceContext().getValue(SOURCETYPE, _sourceType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.sourceTypeCardinality</code> attribute defined at extension <code>core</code>. 
	 * @return the sourceTypeCardinality
	 */
	public RelationEndCardinalityEnum getSourceTypeCardinality()
	{
		return _sourceTypeCardinality = getPersistenceContext().getValue(SOURCETYPECARDINALITY, _sourceTypeCardinality);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.sourceTypeRole</code> attribute defined at extension <code>core</code>. 
	 * @return the sourceTypeRole
	 */
	public String getSourceTypeRole()
	{
		return _sourceTypeRole = getPersistenceContext().getValue(SOURCETYPEROLE, _sourceTypeRole);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.targetAttribute</code> attribute defined at extension <code>core</code>. 
	 * @return the targetAttribute
	 */
	public RelationDescriptorModel getTargetAttribute()
	{
		return _targetAttribute = getPersistenceContext().getValue(TARGETATTRIBUTE, _targetAttribute);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.targetType</code> attribute defined at extension <code>core</code>. 
	 * @return the targetType
	 */
	public ComposedTypeModel getTargetType()
	{
		return _targetType = getPersistenceContext().getValue(TARGETTYPE, _targetType);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.targetTypeCardinality</code> attribute defined at extension <code>core</code>. 
	 * @return the targetTypeCardinality
	 */
	public RelationEndCardinalityEnum getTargetTypeCardinality()
	{
		return _targetTypeCardinality = getPersistenceContext().getValue(TARGETTYPECARDINALITY, _targetTypeCardinality);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RelationMetaType.targetTypeRole</code> attribute defined at extension <code>core</code>. 
	 * @return the targetTypeRole
	 */
	public String getTargetTypeRole()
	{
		return _targetTypeRole = getPersistenceContext().getValue(TARGETTYPEROLE, _targetTypeRole);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.localizationAttribute</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the localizationAttribute
	 */
	public void setLocalizationAttribute(final AttributeDescriptorModel value)
	{
		_localizationAttribute = getPersistenceContext().setValue(LOCALIZATIONATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.localized</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the localized
	 */
	public void setLocalized(final Boolean value)
	{
		_localized = getPersistenceContext().setValue(LOCALIZED, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.orderingAttribute</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the orderingAttribute
	 */
	public void setOrderingAttribute(final AttributeDescriptorModel value)
	{
		_orderingAttribute = getPersistenceContext().setValue(ORDERINGATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.sourceAttribute</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the sourceAttribute
	 */
	public void setSourceAttribute(final RelationDescriptorModel value)
	{
		_sourceAttribute = getPersistenceContext().setValue(SOURCEATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.sourceType</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the sourceType
	 */
	public void setSourceType(final ComposedTypeModel value)
	{
		_sourceType = getPersistenceContext().setValue(SOURCETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.sourceTypeCardinality</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the sourceTypeCardinality
	 */
	public void setSourceTypeCardinality(final RelationEndCardinalityEnum value)
	{
		_sourceTypeCardinality = getPersistenceContext().setValue(SOURCETYPECARDINALITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.sourceTypeRole</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the sourceTypeRole
	 */
	public void setSourceTypeRole(final String value)
	{
		_sourceTypeRole = getPersistenceContext().setValue(SOURCETYPEROLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.targetAttribute</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the targetAttribute
	 */
	public void setTargetAttribute(final RelationDescriptorModel value)
	{
		_targetAttribute = getPersistenceContext().setValue(TARGETATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.targetType</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the targetType
	 */
	public void setTargetType(final ComposedTypeModel value)
	{
		_targetType = getPersistenceContext().setValue(TARGETTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.targetTypeCardinality</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the targetTypeCardinality
	 */
	public void setTargetTypeCardinality(final RelationEndCardinalityEnum value)
	{
		_targetTypeCardinality = getPersistenceContext().setValue(TARGETTYPECARDINALITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>RelationMetaType.targetTypeRole</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the targetTypeRole
	 */
	public void setTargetTypeRole(final String value)
	{
		_targetTypeRole = getPersistenceContext().setValue(TARGETTYPEROLE, value);
	}
	
}
