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
package de.hybris.platform.commons.dto.translator;

import de.hybris.platform.commons.dto.translator.JaloTranslatorConfigurationDTO;
import de.hybris.platform.commons.model.translator.RenderersPropertyModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RenderersProperty first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = RenderersPropertyModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "renderersproperty")
public class RenderersPropertyDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>RenderersProperty.value</code> attribute defined at extension <code> */
	private java.lang.String _value;
	/** <i>Generated variable</i> - Variable of <code>RenderersProperty.translatorConfiguration</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.translator.JaloTranslatorConfigurationDTO _translatorConfiguration;
	/** <i>Generated variable</i> - Variable of <code>RenderersProperty.key</code> attribute defined at extension <code> */
	private java.lang.String _key;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RenderersPropertyDTO()
	{
		super();
	}
	
	
	public String getKey()
	{
		return this._key;
	}
	
	public JaloTranslatorConfigurationDTO getTranslatorConfiguration()
	{
		return this._translatorConfiguration;
	}
	
	public String getValue()
	{
		return this._value;
	}
	
	public void setKey(final String value)
	{
		this.modifiedPropsSet.add("key");
		this._key = value;
	}
	
	public void setTranslatorConfiguration(final JaloTranslatorConfigurationDTO value)
	{
		this.modifiedPropsSet.add("translatorConfiguration");
		this._translatorConfiguration = value;
	}
	
	public void setValue(final String value)
	{
		this.modifiedPropsSet.add("value");
		this._value = value;
	}
	
}
