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
package de.hybris.platform.mcc.dto;

import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.mcc.dto.AbstractLinkEntryDTO;
import de.hybris.platform.mcc.dto.StaticLinkDTO;
import de.hybris.platform.mcc.model.StaticLinkModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type StaticLink first defined at extension mcc
 */
@SuppressWarnings("all")
@GraphNode(target = StaticLinkModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "staticlink")
public class StaticLinkDTO extends AbstractLinkEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>StaticLink.parentLink</code> attribute defined at extension <code> */
	private de.hybris.platform.mcc.dto.StaticLinkDTO _parentLink;
	/** <i>Generated variable</i> - Variable of <code>StaticLink.sublinks</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.mcc.dto.StaticLinkDTO> _sublinks;
	/** <i>Generated variable</i> - Variable of <code>StaticLink.descriptionIcon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _descriptionIcon;
	/** <i>Generated variable</i> - Variable of <code>StaticLink.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>StaticLink.url</code> attribute defined at extension <code> */
	private java.lang.String _url;
	/** <i>Generated variable</i> - Variable of <code>StaticLink.extensionName</code> attribute defined at extension <code> */
	private java.lang.String _extensionName;
	/** <i>Generated variable</i> - Variable of <code>StaticLink.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public StaticLinkDTO()
	{
		super();
	}
	
	
	public String getDescription()
	{
		return this._description;
	}
	
	public MediaDTO getDescriptionIcon()
	{
		return this._descriptionIcon;
	}
	
	public String getExtensionName()
	{
		return this._extensionName;
	}
	
	public StaticLinkDTO getParentLink()
	{
		return this._parentLink;
	}
	
	@XmlElementWrapper(name = "sublinks")
	@XmlElement(name = "staticLink")
	public List<StaticLinkDTO> getSublinks()
	{
		return this._sublinks;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public String getUrl()
	{
		return this._url;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDescriptionIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("descriptionIcon");
		this._descriptionIcon = value;
	}
	
	public void setExtensionName(final String value)
	{
		this.modifiedPropsSet.add("extensionName");
		this._extensionName = value;
	}
	
	public void setParentLink(final StaticLinkDTO value)
	{
		this.modifiedPropsSet.add("parentLink");
		this._parentLink = value;
	}
	
	public void setSublinks(final List<StaticLinkDTO> value)
	{
		this.modifiedPropsSet.add("sublinks");
		this._sublinks = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
	public void setUrl(final String value)
	{
		this.modifiedPropsSet.add("url");
		this._url = value;
	}
	
}
