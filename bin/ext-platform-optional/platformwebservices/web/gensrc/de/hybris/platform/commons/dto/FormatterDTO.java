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
package de.hybris.platform.commons.dto;

import de.hybris.platform.commons.model.FormatterModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Formatter first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = FormatterModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "formatter")
public class FormatterDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>Formatter.outputMimeType</code> attribute defined at extension <code> */
	private java.lang.String _outputMimeType;
	/** <i>Generated variable</i> - Variable of <code>Formatter.script</code> attribute defined at extension <code> */
	private java.lang.String _script;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FormatterDTO()
	{
		super();
	}
	
	
	public String getOutputMimeType()
	{
		return this._outputMimeType;
	}
	
	public String getScript()
	{
		return this._script;
	}
	
	public void setOutputMimeType(final String value)
	{
		this.modifiedPropsSet.add("outputMimeType");
		this._outputMimeType = value;
	}
	
	public void setScript(final String value)
	{
		this.modifiedPropsSet.add("script");
		this._script = value;
	}
	
}
