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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.model.BTGConfigModel;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumCollectionToStringValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringCollectionToHybrisEnumValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGConfig first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGConfigModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "btgconfig")
public class BTGConfigDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code> */
	private java.util.Collection<java.lang.String> _usedRuleTypes;
	/** <i>Generated variable</i> - Variable of <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code> */
	private java.lang.String _defaultTimeUnit;
	/** <i>Generated variable</i> - Variable of <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _defaultCatalogVersion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConfigDTO()
	{
		super();
	}
	
	
	public CatalogVersionDTO getDefaultCatalogVersion()
	{
		return this._defaultCatalogVersion;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDefaultTimeUnit()
	{
		return this._defaultTimeUnit;
	}
	
	@GraphProperty(interceptor = StringCollectionToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "usedRuleTypes")
	@XmlElement(name = "bTGRuleType")
	public Collection<String> getUsedRuleTypes()
	{
		return this._usedRuleTypes;
	}
	
	public void setDefaultCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("defaultCatalogVersion");
		this._defaultCatalogVersion = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDefaultTimeUnit(final String value)
	{
		this.modifiedPropsSet.add("defaultTimeUnit");
		this._defaultTimeUnit = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumCollectionToStringValuesConverter.class)
	public void setUsedRuleTypes(final Collection<String> value)
	{
		this.modifiedPropsSet.add("usedRuleTypes");
		this._usedRuleTypes = value;
	}
	
}
