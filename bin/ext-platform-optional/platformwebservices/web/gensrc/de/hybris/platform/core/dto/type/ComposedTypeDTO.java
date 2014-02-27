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

import de.hybris.platform.cockpit.dto.template.CockpitItemTemplateDTO;
import de.hybris.platform.commons.dto.FormatDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.core.dto.type.TypeDTO;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.validation.dto.constraints.AbstractConstraintDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ComposedType first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = ComposedTypeModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "composedtype")
public class ComposedTypeDTO extends TypeDTO
{
	/** <i>Generated variable</i> - Variable of <code>ComposedType.singleton</code> attribute defined at extension <code> */
	private java.lang.Boolean _singleton;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.dumpPropertyTable</code> attribute defined at extension <code> */
	private java.lang.String _dumpPropertyTable;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.table</code> attribute defined at extension <code> */
	private java.lang.String _table;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.jndiName</code> attribute defined at extension <code> */
	private java.lang.String _jndiName;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.constraints</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.validation.dto.constraints.AbstractConstraintDTO> _constraints;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.uniqueKeyAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _uniqueKeyAttributes;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.cockpitItemTemplates</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cockpit.dto.template.CockpitItemTemplateDTO> _cockpitItemTemplates;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.hmcIcon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _hmcIcon;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.abstract</code> attribute defined at extension <code> */
	private java.lang.Boolean _abstract;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.declaredattributedescriptors</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _declaredattributedescriptors;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.inheritedattributedescriptors</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _inheritedattributedescriptors;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.jaloonly</code> attribute defined at extension <code> */
	private java.lang.Boolean _jaloonly;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.catalogItemType</code> attribute defined at extension <code> */
	private java.lang.Boolean _catalogItemType;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.dynamic</code> attribute defined at extension <code> */
	private java.lang.Boolean _dynamic;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.allSubTypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.ComposedTypeDTO> _allSubTypes;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.catalogVersionAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _catalogVersionAttribute;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.formats</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.commons.dto.FormatDTO> _formats;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.subtypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.ComposedTypeDTO> _subtypes;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.jaloclass</code> attribute defined at extension <code> */
	private java.lang.Class _jaloclass;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.allSuperTypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.ComposedTypeDTO> _allSuperTypes;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.superType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _superType;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.logHMCChanges</code> attribute defined at extension <code> */
	private java.lang.Boolean _logHMCChanges;
	/** <i>Generated variable</i> - Variable of <code>ComposedType.systemType</code> attribute defined at extension <code> */
	private java.lang.Boolean _systemType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ComposedTypeDTO()
	{
		super();
	}
	
	
	public Boolean getAbstract()
	{
		return this._abstract;
	}
	
	@XmlElementWrapper(name = "allSubTypes")
	@XmlElement(name = "composedType")
	public Collection<ComposedTypeDTO> getAllSubTypes()
	{
		return this._allSubTypes;
	}
	
	@XmlElementWrapper(name = "allSuperTypes")
	@XmlElement(name = "composedType")
	public Collection<ComposedTypeDTO> getAllSuperTypes()
	{
		return this._allSuperTypes;
	}
	
	public Boolean getCatalogItemType()
	{
		return this._catalogItemType;
	}
	
	public AttributeDescriptorDTO getCatalogVersionAttribute()
	{
		return this._catalogVersionAttribute;
	}
	
	@XmlElementWrapper(name = "cockpitItemTemplates")
	@XmlElement(name = "cockpitItemTemplate")
	public Set<CockpitItemTemplateDTO> getCockpitItemTemplates()
	{
		return this._cockpitItemTemplates;
	}
	
	@XmlElementWrapper(name = "constraints")
	@XmlElement(name = "abstractConstraint")
	public Set<AbstractConstraintDTO> getConstraints()
	{
		return this._constraints;
	}
	
	@XmlElementWrapper(name = "declaredattributedescriptors")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getDeclaredattributedescriptors()
	{
		return this._declaredattributedescriptors;
	}
	
	public String getDumpPropertyTable()
	{
		return this._dumpPropertyTable;
	}
	
	public Boolean getDynamic()
	{
		return this._dynamic;
	}
	
	@XmlElementWrapper(name = "formats")
	@XmlElement(name = "format")
	public Collection<FormatDTO> getFormats()
	{
		return this._formats;
	}
	
	public MediaDTO getHmcIcon()
	{
		return this._hmcIcon;
	}
	
	@XmlElementWrapper(name = "inheritedattributedescriptors")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getInheritedattributedescriptors()
	{
		return this._inheritedattributedescriptors;
	}
	
	public Class getJaloclass()
	{
		return this._jaloclass;
	}
	
	public Boolean getJaloonly()
	{
		return this._jaloonly;
	}
	
	public String getJndiName()
	{
		return this._jndiName;
	}
	
	public Boolean getLogHMCChanges()
	{
		return this._logHMCChanges;
	}
	
	public Boolean getSingleton()
	{
		return this._singleton;
	}
	
	@XmlElementWrapper(name = "subtypes")
	@XmlElement(name = "composedType")
	public Collection<ComposedTypeDTO> getSubtypes()
	{
		return this._subtypes;
	}
	
	public ComposedTypeDTO getSuperType()
	{
		return this._superType;
	}
	
	public Boolean getSystemType()
	{
		return this._systemType;
	}
	
	public String getTable()
	{
		return this._table;
	}
	
	@XmlElementWrapper(name = "uniqueKeyAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getUniqueKeyAttributes()
	{
		return this._uniqueKeyAttributes;
	}
	
	public void setAbstract(final Boolean value)
	{
		this.modifiedPropsSet.add("abstract");
		this._abstract = value;
	}
	
	public void setAllSubTypes(final Collection<ComposedTypeDTO> value)
	{
		this.modifiedPropsSet.add("allSubTypes");
		this._allSubTypes = value;
	}
	
	public void setAllSuperTypes(final Collection<ComposedTypeDTO> value)
	{
		this.modifiedPropsSet.add("allSuperTypes");
		this._allSuperTypes = value;
	}
	
	public void setCatalogItemType(final Boolean value)
	{
		this.modifiedPropsSet.add("catalogItemType");
		this._catalogItemType = value;
	}
	
	public void setCatalogVersionAttribute(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("catalogVersionAttribute");
		this._catalogVersionAttribute = value;
	}
	
	public void setCockpitItemTemplates(final Set<CockpitItemTemplateDTO> value)
	{
		this.modifiedPropsSet.add("cockpitItemTemplates");
		this._cockpitItemTemplates = value;
	}
	
	public void setConstraints(final Set<AbstractConstraintDTO> value)
	{
		this.modifiedPropsSet.add("constraints");
		this._constraints = value;
	}
	
	public void setDeclaredattributedescriptors(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("declaredattributedescriptors");
		this._declaredattributedescriptors = value;
	}
	
	public void setDumpPropertyTable(final String value)
	{
		this.modifiedPropsSet.add("dumpPropertyTable");
		this._dumpPropertyTable = value;
	}
	
	public void setDynamic(final Boolean value)
	{
		this.modifiedPropsSet.add("dynamic");
		this._dynamic = value;
	}
	
	public void setFormats(final Collection<FormatDTO> value)
	{
		this.modifiedPropsSet.add("formats");
		this._formats = value;
	}
	
	public void setHmcIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("hmcIcon");
		this._hmcIcon = value;
	}
	
	public void setInheritedattributedescriptors(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("inheritedattributedescriptors");
		this._inheritedattributedescriptors = value;
	}
	
	public void setJaloclass(final Class value)
	{
		this.modifiedPropsSet.add("jaloclass");
		this._jaloclass = value;
	}
	
	public void setJaloonly(final Boolean value)
	{
		this.modifiedPropsSet.add("jaloonly");
		this._jaloonly = value;
	}
	
	public void setJndiName(final String value)
	{
		this.modifiedPropsSet.add("jndiName");
		this._jndiName = value;
	}
	
	public void setLogHMCChanges(final Boolean value)
	{
		this.modifiedPropsSet.add("logHMCChanges");
		this._logHMCChanges = value;
	}
	
	public void setSingleton(final Boolean value)
	{
		this.modifiedPropsSet.add("singleton");
		this._singleton = value;
	}
	
	public void setSubtypes(final Collection<ComposedTypeDTO> value)
	{
		this.modifiedPropsSet.add("subtypes");
		this._subtypes = value;
	}
	
	public void setSuperType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("superType");
		this._superType = value;
	}
	
	public void setSystemType(final Boolean value)
	{
		this.modifiedPropsSet.add("systemType");
		this._systemType = value;
	}
	
	public void setTable(final String value)
	{
		this.modifiedPropsSet.add("table");
		this._table = value;
	}
	
	public void setUniqueKeyAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("uniqueKeyAttributes");
		this._uniqueKeyAttributes = value;
	}
	
}
