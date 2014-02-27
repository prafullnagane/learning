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
import de.hybris.platform.lucenesearch.dto.AbstractLuceneItemDTO;
import de.hybris.platform.lucenesearch.dto.IndexConfigurationDTO;
import de.hybris.platform.lucenesearch.model.AttributeConfigurationModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AttributeConfiguration first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@GraphNode(target = AttributeConfigurationModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "attributeconfiguration")
public class AttributeConfigurationDTO extends AbstractLuceneItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.availableIndexableAttributes</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.AttributeDescriptorDTO> _availableIndexableAttributes;
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.storeData</code> attribute defined at extension <code> */
	private java.lang.Boolean _storeData;
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code> */
	private java.lang.String _fieldName;
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.AttributeDescriptorDTO _indexedAttribute;
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.weight</code> attribute defined at extension <code> */
	private java.lang.Double _weight;
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code> */
	private de.hybris.platform.lucenesearch.dto.IndexConfigurationDTO _indexConfiguration;
	/** <i>Generated variable</i> - Variable of <code>AttributeConfiguration.exact</code> attribute defined at extension <code> */
	private java.lang.Boolean _exact;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AttributeConfigurationDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "availableIndexableAttributes")
	@XmlElement(name = "attributeDescriptor")
	public Collection<AttributeDescriptorDTO> getAvailableIndexableAttributes()
	{
		return this._availableIndexableAttributes;
	}
	
	public Boolean getExact()
	{
		return this._exact;
	}
	
	public String getFieldName()
	{
		return this._fieldName;
	}
	
	public IndexConfigurationDTO getIndexConfiguration()
	{
		return this._indexConfiguration;
	}
	
	public AttributeDescriptorDTO getIndexedAttribute()
	{
		return this._indexedAttribute;
	}
	
	public Boolean getStoreData()
	{
		return this._storeData;
	}
	
	public Double getWeight()
	{
		return this._weight;
	}
	
	public void setAvailableIndexableAttributes(final Collection<AttributeDescriptorDTO> value)
	{
		this.modifiedPropsSet.add("availableIndexableAttributes");
		this._availableIndexableAttributes = value;
	}
	
	public void setExact(final Boolean value)
	{
		this.modifiedPropsSet.add("exact");
		this._exact = value;
	}
	
	public void setFieldName(final String value)
	{
		this.modifiedPropsSet.add("fieldName");
		this._fieldName = value;
	}
	
	public void setIndexConfiguration(final IndexConfigurationDTO value)
	{
		this.modifiedPropsSet.add("indexConfiguration");
		this._indexConfiguration = value;
	}
	
	public void setIndexedAttribute(final AttributeDescriptorDTO value)
	{
		this.modifiedPropsSet.add("indexedAttribute");
		this._indexedAttribute = value;
	}
	
	public void setStoreData(final Boolean value)
	{
		this.modifiedPropsSet.add("storeData");
		this._storeData = value;
	}
	
	public void setWeight(final Double value)
	{
		this.modifiedPropsSet.add("weight");
		this._weight = value;
	}
	
}
