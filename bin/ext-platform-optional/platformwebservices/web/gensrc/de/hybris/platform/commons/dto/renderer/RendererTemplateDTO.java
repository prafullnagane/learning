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
package de.hybris.platform.commons.dto.renderer;

import de.hybris.platform.commons.model.renderer.RendererTemplateModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RendererTemplate first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = RendererTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "renderertemplate")
public class RendererTemplateDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.rendererType</code> attribute defined at extension <code> */
	private java.lang.String _rendererType;
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.contextClassDescription</code> attribute defined at extension <code> */
	private java.lang.String _contextClassDescription;
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.templateScript</code> attribute defined at extension <code> */
	private java.lang.String _templateScript;
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.content</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _content;
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.outputMimeType</code> attribute defined at extension <code> */
	private java.lang.String _outputMimeType;
	/** <i>Generated variable</i> - Variable of <code>RendererTemplate.contextClass</code> attribute defined at extension <code> */
	private java.lang.String _contextClass;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RendererTemplateDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public MediaDTO getContent()
	{
		return this._content;
	}
	
	public String getContextClass()
	{
		return this._contextClass;
	}
	
	public String getContextClassDescription()
	{
		return this._contextClassDescription;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getOutputMimeType()
	{
		return this._outputMimeType;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getRendererType()
	{
		return this._rendererType;
	}
	
	public String getTemplateScript()
	{
		return this._templateScript;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setContent(final MediaDTO value)
	{
		this.modifiedPropsSet.add("content");
		this._content = value;
	}
	
	public void setContextClass(final String value)
	{
		this.modifiedPropsSet.add("contextClass");
		this._contextClass = value;
	}
	
	public void setContextClassDescription(final String value)
	{
		this.modifiedPropsSet.add("contextClassDescription");
		this._contextClassDescription = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setOutputMimeType(final String value)
	{
		this.modifiedPropsSet.add("outputMimeType");
		this._outputMimeType = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setRendererType(final String value)
	{
		this.modifiedPropsSet.add("rendererType");
		this._rendererType = value;
	}
	
	public void setTemplateScript(final String value)
	{
		this.modifiedPropsSet.add("templateScript");
		this._templateScript = value;
	}
	
}
