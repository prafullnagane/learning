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
package de.hybris.platform.core.dto.media;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.model.media.MediaFormatModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type MediaFormat first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = MediaFormatModel.class, factory = GenericNodeFactory.class, uidProperties="qualifier")
@XmlRootElement(name = "mediaformat")
public class MediaFormatDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>MediaFormat.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>MediaFormat.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	/** <i>Generated variable</i> - Variable of <code>MediaFormat.externalID</code> attribute defined at extension <code> */
	private java.lang.String _externalID;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MediaFormatDTO()
	{
		super();
	}
	
	
	public String getExternalID()
	{
		return this._externalID;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlAttribute
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	public void setExternalID(final String value)
	{
		this.modifiedPropsSet.add("externalID");
		this._externalID = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
}
