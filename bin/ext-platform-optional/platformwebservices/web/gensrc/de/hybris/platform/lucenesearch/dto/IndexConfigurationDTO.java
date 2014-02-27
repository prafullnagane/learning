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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.core.dto.type.AttributeDescriptorDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.lucenesearch.dto.AbstractLuceneItemDTO;
import de.hybris.platform.lucenesearch.dto.AttributeConfigurationDTO;
import de.hybris.platform.lucenesearch.dto.IndexUpdateDTO;
import de.hybris.platform.lucenesearch.dto.LuceneIndexDTO;
import de.hybris.platform.lucenesearch.model.IndexConfigurationModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type IndexConfiguration first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@GraphNode(target = IndexConfigurationModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "indexconfiguration")
public class IndexConfigurationDTO extends AbstractLuceneItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.availableActivationAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _availableActivationAttributes;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.availableGroupingAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _availableGroupingAttributes;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code> */
	private java.lang.String _indexedDataParams;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _groupingAttribute;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.lucenesearch.dto.IndexUpdateDTO> _pendingUpdates;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.allAvailableAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _allAvailableAttributes;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code> */
	private de.hybris.platform.lucenesearch.dto.LuceneIndexDTO _luceneIndex;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _activationAttribute;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.availableIndexableAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _availableIndexableAttributes;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.lucenesearch.dto.AttributeConfigurationDTO> _attributeConfigurations;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code> */
	private java.lang.String _indexedDataFactoryClassName;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.indexedType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _indexedType;
	/** <i>Generated variable</i> - Variable of <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.ComposedTypeDTO> _includedTypes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexConfigurationDTO()
	{
		super();
	}
	
	
	public AttributeDescriptorDTO getActivationAttribute()
	{
		return this._activationAttribute;
	}
	
	@XmlElementWrapper(name = "allAvailableAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getAllAvailableAttributes()
	{
		return this._allAvailableAttributes;
	}
	
	@XmlElementWrapper(name = "attributeConfigurations")
	@XmlElement(name = "attributeConfiguration")
	public Collection<AttributeConfigurationDTO> getAttributeConfigurations()
	{
		return this._attributeConfigurations;
	}
	
	@XmlElementWrapper(name = "availableActivationAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getAvailableActivationAttributes()
	{
		return this._availableActivationAttributes;
	}
	
	@XmlElementWrapper(name = "availableGroupingAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getAvailableGroupingAttributes()
	{
		return this._availableGroupingAttributes;
	}
	
	@XmlElementWrapper(name = "availableIndexableAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getAvailableIndexableAttributes()
	{
		return this._availableIndexableAttributes;
	}
	
	public AttributeDescriptorDTO getGroupingAttribute()
	{
		return this._groupingAttribute;
	}
	
	@XmlElementWrapper(name = "includedTypes")
	@XmlElement(name = "composedType")
	public Collection<ComposedTypeDTO> getIncludedTypes()
	{
		return this._includedTypes;
	}
	
	public String getIndexedDataFactoryClassName()
	{
		return this._indexedDataFactoryClassName;
	}
	
	public String getIndexedDataParams()
	{
		return this._indexedDataParams;
	}
	
	public ComposedTypeDTO getIndexedType()
	{
		return this._indexedType;
	}
	
	public LuceneIndexDTO getLuceneIndex()
	{
		return this._luceneIndex;
	}
	
	@XmlElementWrapper(name = "pendingUpdates")
	@XmlElement(name = "indexUpdate")
	public Collection<IndexUpdateDTO> getPendingUpdates()
	{
		return this._pendingUpdates;
	}
	
	public void setActivationAttribute(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("activationAttribute");
		this._activationAttribute = value;
	}
	
	public void setAllAvailableAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("allAvailableAttributes");
		this._allAvailableAttributes = value;
	}
	
	public void setAttributeConfigurations(final Collection<AttributeConfigurationDTO> value)
	{
		this.modifiedPropsSet.add("attributeConfigurations");
		this._attributeConfigurations = value;
	}
	
	public void setAvailableActivationAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("availableActivationAttributes");
		this._availableActivationAttributes = value;
	}
	
	public void setAvailableGroupingAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("availableGroupingAttributes");
		this._availableGroupingAttributes = value;
	}
	
	public void setAvailableIndexableAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("availableIndexableAttributes");
		this._availableIndexableAttributes = value;
	}
	
	public void setGroupingAttribute(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("groupingAttribute");
		this._groupingAttribute = value;
	}
	
	public void setIncludedTypes(final Collection<ComposedTypeDTO> value)
	{
		this.modifiedPropsSet.add("includedTypes");
		this._includedTypes = value;
	}
	
	public void setIndexedDataFactoryClassName(final String value)
	{
		this.modifiedPropsSet.add("indexedDataFactoryClassName");
		this._indexedDataFactoryClassName = value;
	}
	
	public void setIndexedDataParams(final String value)
	{
		this.modifiedPropsSet.add("indexedDataParams");
		this._indexedDataParams = value;
	}
	
	public void setIndexedType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("indexedType");
		this._indexedType = value;
	}
	
	public void setLuceneIndex(final LuceneIndexDTO value)
	{
		this.modifiedPropsSet.add("luceneIndex");
		this._luceneIndex = value;
	}
	
	public void setPendingUpdates(final Collection<IndexUpdateDTO> value)
	{
		this.modifiedPropsSet.add("pendingUpdates");
		this._pendingUpdates = value;
	}
	
}
