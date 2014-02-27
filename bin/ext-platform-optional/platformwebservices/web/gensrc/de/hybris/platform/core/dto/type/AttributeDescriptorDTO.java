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
import de.hybris.platform.core.dto.type.DescriptorDTO;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.validation.dto.constraints.AttributeConstraintDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AttributeDescriptor first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = AttributeDescriptorModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "attributedescriptor")
public class AttributeDescriptorDTO extends DescriptorDTO
{
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.localized</code> attribute defined at extension <code> */
	private java.lang.Boolean _localized;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.writable</code> attribute defined at extension <code> */
	private java.lang.Boolean _writable;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.partOf</code> attribute defined at extension <code> */
	private java.lang.Boolean _partOf;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.hmcIndexField</code> attribute defined at extension <code> */
	private java.lang.String _hmcIndexField;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.dontCopy</code> attribute defined at extension <code> */
	private java.lang.Boolean _dontCopy;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.encrypted</code> attribute defined at extension <code> */
	private java.lang.Boolean _encrypted;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.property</code> attribute defined at extension <code> */
	private java.lang.Boolean _property;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.modifiers</code> attribute defined at extension <code> */
	private java.lang.Integer _modifiers;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.persistenceClass</code> attribute defined at extension <code> */
	private java.lang.Class _persistenceClass;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.primitive</code> attribute defined at extension <code> */
	private java.lang.Boolean _primitive;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.proposedDatabaseColumn</code> attribute defined at extension <code> */
	private java.lang.String _proposedDatabaseColumn;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.enclosingType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _enclosingType;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.declaringEnclosingType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _declaringEnclosingType;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.readable</code> attribute defined at extension <code> */
	private java.lang.Boolean _readable;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.selectionOf</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _selectionOf;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.optional</code> attribute defined at extension <code> */
	private java.lang.Boolean _optional;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.removable</code> attribute defined at extension <code> */
	private java.lang.Boolean _removable;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.forceLuceneIndexable</code> attribute defined at extension <code> */
	private java.lang.Boolean _forceLuceneIndexable;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.databaseColumn</code> attribute defined at extension <code> */
	private java.lang.String _databaseColumn;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.defaultValue</code> attribute defined at extension <code> */
	private java.lang.Object _defaultValue;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.attributeHandler</code> attribute defined at extension <code> */
	private java.lang.String _attributeHandler;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.private</code> attribute defined at extension <code> */
	private java.lang.Boolean _private;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.initial</code> attribute defined at extension <code> */
	private java.lang.Boolean _initial;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.unique</code> attribute defined at extension <code> */
	private java.lang.Boolean _unique;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.search</code> attribute defined at extension <code> */
	private java.lang.Boolean _search;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.constraints</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.validation.dto.constraints.AttributeConstraintDTO> _constraints;
	/** <i>Generated variable</i> - Variable of <code>AttributeDescriptor.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeDescriptorDTO()
	{
		super();
	}
	
	
	public String getAttributeHandler()
	{
		return this._attributeHandler;
	}
	
	@XmlElementWrapper(name = "constraints")
	@XmlElement(name = "attributeConstraint")
	public Set<AttributeConstraintDTO> getConstraints()
	{
		return this._constraints;
	}
	
	public String getDatabaseColumn()
	{
		return this._databaseColumn;
	}
	
	public ComposedTypeDTO getDeclaringEnclosingType()
	{
		return this._declaringEnclosingType;
	}
	
	public Object getDefaultValue()
	{
		return this._defaultValue;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public Boolean getDontCopy()
	{
		return this._dontCopy;
	}
	
	public ComposedTypeDTO getEnclosingType()
	{
		return this._enclosingType;
	}
	
	public Boolean getEncrypted()
	{
		return this._encrypted;
	}
	
	public Boolean getForceLuceneIndexable()
	{
		return this._forceLuceneIndexable;
	}
	
	public String getHmcIndexField()
	{
		return this._hmcIndexField;
	}
	
	public Boolean getInitial()
	{
		return this._initial;
	}
	
	public Boolean getLocalized()
	{
		return this._localized;
	}
	
	public Integer getModifiers()
	{
		return this._modifiers;
	}
	
	public Boolean getOptional()
	{
		return this._optional;
	}
	
	public Boolean getPartOf()
	{
		return this._partOf;
	}
	
	public Class getPersistenceClass()
	{
		return this._persistenceClass;
	}
	
	public Boolean getPrimitive()
	{
		return this._primitive;
	}
	
	public Boolean getPrivate()
	{
		return this._private;
	}
	
	public Boolean getProperty()
	{
		return this._property;
	}
	
	public String getProposedDatabaseColumn()
	{
		return this._proposedDatabaseColumn;
	}
	
	public Boolean getReadable()
	{
		return this._readable;
	}
	
	public Boolean getRemovable()
	{
		return this._removable;
	}
	
	public Boolean getSearch()
	{
		return this._search;
	}
	
	public AttributeDescriptorDTO getSelectionOf()
	{
		return this._selectionOf;
	}
	
	public Boolean getUnique()
	{
		return this._unique;
	}
	
	public Boolean getWritable()
	{
		return this._writable;
	}
	
	public void setAttributeHandler(final String value)
	{
		this.modifiedPropsSet.add("attributeHandler");
		this._attributeHandler = value;
	}
	
	public void setConstraints(final Set<AttributeConstraintDTO> value)
	{
		this.modifiedPropsSet.add("constraints");
		this._constraints = value;
	}
	
	public void setDatabaseColumn(final String value)
	{
		this.modifiedPropsSet.add("databaseColumn");
		this._databaseColumn = value;
	}
	
	public void setDeclaringEnclosingType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("declaringEnclosingType");
		this._declaringEnclosingType = value;
	}
	
	public void setDefaultValue(final Object value)
	{
		this.modifiedPropsSet.add("defaultValue");
		this._defaultValue = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDontCopy(final Boolean value)
	{
		this.modifiedPropsSet.add("dontCopy");
		this._dontCopy = value;
	}
	
	public void setEnclosingType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("enclosingType");
		this._enclosingType = value;
	}
	
	public void setEncrypted(final Boolean value)
	{
		this.modifiedPropsSet.add("encrypted");
		this._encrypted = value;
	}
	
	public void setForceLuceneIndexable(final Boolean value)
	{
		this.modifiedPropsSet.add("forceLuceneIndexable");
		this._forceLuceneIndexable = value;
	}
	
	public void setHmcIndexField(final String value)
	{
		this.modifiedPropsSet.add("hmcIndexField");
		this._hmcIndexField = value;
	}
	
	public void setInitial(final Boolean value)
	{
		this.modifiedPropsSet.add("initial");
		this._initial = value;
	}
	
	public void setLocalized(final Boolean value)
	{
		this.modifiedPropsSet.add("localized");
		this._localized = value;
	}
	
	public void setModifiers(final Integer value)
	{
		this.modifiedPropsSet.add("modifiers");
		this._modifiers = value;
	}
	
	public void setOptional(final Boolean value)
	{
		this.modifiedPropsSet.add("optional");
		this._optional = value;
	}
	
	public void setPartOf(final Boolean value)
	{
		this.modifiedPropsSet.add("partOf");
		this._partOf = value;
	}
	
	public void setPersistenceClass(final Class value)
	{
		this.modifiedPropsSet.add("persistenceClass");
		this._persistenceClass = value;
	}
	
	public void setPrimitive(final Boolean value)
	{
		this.modifiedPropsSet.add("primitive");
		this._primitive = value;
	}
	
	public void setPrivate(final Boolean value)
	{
		this.modifiedPropsSet.add("private");
		this._private = value;
	}
	
	public void setProperty(final Boolean value)
	{
		this.modifiedPropsSet.add("property");
		this._property = value;
	}
	
	public void setProposedDatabaseColumn(final String value)
	{
		this.modifiedPropsSet.add("proposedDatabaseColumn");
		this._proposedDatabaseColumn = value;
	}
	
	public void setReadable(final Boolean value)
	{
		this.modifiedPropsSet.add("readable");
		this._readable = value;
	}
	
	public void setRemovable(final Boolean value)
	{
		this.modifiedPropsSet.add("removable");
		this._removable = value;
	}
	
	public void setSearch(final Boolean value)
	{
		this.modifiedPropsSet.add("search");
		this._search = value;
	}
	
	public void setSelectionOf(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("selectionOf");
		this._selectionOf = value;
	}
	
	public void setUnique(final Boolean value)
	{
		this.modifiedPropsSet.add("unique");
		this._unique = value;
	}
	
	public void setWritable(final Boolean value)
	{
		this.modifiedPropsSet.add("writable");
		this._writable = value;
	}
	
}
