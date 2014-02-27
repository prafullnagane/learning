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

import de.hybris.platform.commons.dto.FormatDTO;
import de.hybris.platform.commons.dto.FormatterDTO;
import de.hybris.platform.commons.model.MediaFormatterModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MediaFormatter first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = MediaFormatterModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "mediaformatter")
public class MediaFormatterDTO extends FormatterDTO
{
	/** <i>Generated variable</i> - Variable of <code>MediaFormatter.inputMimeType</code> attribute defined at extension <code> */
	private java.lang.String _inputMimeType;
	/** <i>Generated variable</i> - Variable of <code>MediaFormatter.formats</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.commons.dto.FormatDTO> _formats;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFormatterDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "formats")
	@XmlElement(name = "format")
	public Collection<FormatDTO> getFormats()
	{
		return this._formats;
	}
	
	public String getInputMimeType()
	{
		return this._inputMimeType;
	}
	
	public void setFormats(final Collection<FormatDTO> value)
	{
		this.modifiedPropsSet.add("formats");
		this._formats = value;
	}
	
	public void setInputMimeType(final String value)
	{
		this.modifiedPropsSet.add("inputMimeType");
		this._inputMimeType = value;
	}
	
}
