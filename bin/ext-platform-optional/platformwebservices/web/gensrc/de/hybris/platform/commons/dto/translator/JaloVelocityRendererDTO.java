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
import de.hybris.platform.commons.model.translator.JaloVelocityRendererModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type JaloVelocityRenderer first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = JaloVelocityRendererModel.class, factory = GenericNodeFactory.class, uidProperties="name")
@XmlRootElement(name = "jalovelocityrenderer")
public class JaloVelocityRendererDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>JaloVelocityRenderer.translatorConfiguration</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.translator.JaloTranslatorConfigurationDTO _translatorConfiguration;
	/** <i>Generated variable</i> - Variable of <code>JaloVelocityRenderer.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>JaloVelocityRenderer.template</code> attribute defined at extension <code> */
	private java.lang.String _template;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JaloVelocityRendererDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getName()
	{
		return this._name;
	}
	
	public String getTemplate()
	{
		return this._template;
	}
	
	public JaloTranslatorConfigurationDTO getTranslatorConfiguration()
	{
		return this._translatorConfiguration;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setTemplate(final String value)
	{
		this.modifiedPropsSet.add("template");
		this._template = value;
	}
	
	public void setTranslatorConfiguration(final JaloTranslatorConfigurationDTO value)
	{
		this.modifiedPropsSet.add("translatorConfiguration");
		this._translatorConfiguration = value;
	}
	
}
