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

import de.hybris.platform.commons.dto.translator.JaloVelocityRendererDTO;
import de.hybris.platform.commons.dto.translator.ParserPropertyDTO;
import de.hybris.platform.commons.dto.translator.RenderersPropertyDTO;
import de.hybris.platform.commons.model.translator.JaloTranslatorConfigurationModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type JaloTranslatorConfiguration first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = JaloTranslatorConfigurationModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "jalotranslatorconfiguration")
public class JaloTranslatorConfigurationDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>JaloTranslatorConfiguration.parserProperties</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.commons.dto.translator.ParserPropertyDTO> _parserProperties;
	/** <i>Generated variable</i> - Variable of <code>JaloTranslatorConfiguration.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>JaloTranslatorConfiguration.renderersProperties</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.commons.dto.translator.RenderersPropertyDTO> _renderersProperties;
	/** <i>Generated variable</i> - Variable of <code>JaloTranslatorConfiguration.renderers</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.commons.dto.translator.JaloVelocityRendererDTO> _renderers;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JaloTranslatorConfigurationDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "parserProperties")
	@XmlElement(name = "parserProperty")
	public List<ParserPropertyDTO> getParserProperties()
	{
		return this._parserProperties;
	}
	
	@XmlElementWrapper(name = "renderers")
	@XmlElement(name = "jaloVelocityRenderer")
	public List<JaloVelocityRendererDTO> getRenderers()
	{
		return this._renderers;
	}
	
	@XmlElementWrapper(name = "renderersProperties")
	@XmlElement(name = "renderersProperty")
	public List<RenderersPropertyDTO> getRenderersProperties()
	{
		return this._renderersProperties;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setParserProperties(final List<ParserPropertyDTO> value)
	{
		this.modifiedPropsSet.add("parserProperties");
		this._parserProperties = value;
	}
	
	public void setRenderers(final List<JaloVelocityRendererDTO> value)
	{
		this.modifiedPropsSet.add("renderers");
		this._renderers = value;
	}
	
	public void setRenderersProperties(final List<RenderersPropertyDTO> value)
	{
		this.modifiedPropsSet.add("renderersProperties");
		this._renderersProperties = value;
	}
	
}
