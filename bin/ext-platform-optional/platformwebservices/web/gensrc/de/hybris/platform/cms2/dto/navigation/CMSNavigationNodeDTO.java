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
package de.hybris.platform.cms2.dto.navigation;

import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationEntryDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.cms2.dto.pages.ContentPageDTO;
import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSNavigationNode first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSNavigationNodeModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsnavigationnode")
public class CMSNavigationNodeDTO extends CMSItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.pages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.pages.ContentPageDTO> _pages;
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.children</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO> _children;
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.parent</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO _parent;
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.entries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.navigation.CMSNavigationEntryDTO> _entries;
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.visible</code> attribute defined at extension <code> */
	private boolean _visible;
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.links</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.components.CMSLinkComponentDTO> _links;
	/** <i>Generated variable</i> - Variable of <code>CMSNavigationNode.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSNavigationNodeDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "children")
	@XmlElement(name = "cMSNavigationNode")
	public List<CMSNavigationNodeDTO> getChildren()
	{
		return this._children;
	}
	
	@XmlElementWrapper(name = "entries")
	@XmlElement(name = "cMSNavigationEntry")
	public List<CMSNavigationEntryDTO> getEntries()
	{
		return this._entries;
	}
	
	@XmlElementWrapper(name = "links")
	@XmlElement(name = "cMSLinkComponent")
	public List<CMSLinkComponentDTO> getLinks()
	{
		return this._links;
	}
	
	@XmlElementWrapper(name = "pages")
	@XmlElement(name = "contentPage")
	public List<ContentPageDTO> getPages()
	{
		return this._pages;
	}
	
	public CMSNavigationNodeDTO getParent()
	{
		return this._parent;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public boolean isVisible()
	{
		return this._visible;
	}
	
	public void setChildren(final List<CMSNavigationNodeDTO> value)
	{
		this.modifiedPropsSet.add("children");
		this._children = value;
	}
	
	public void setEntries(final List<CMSNavigationEntryDTO> value)
	{
		this.modifiedPropsSet.add("entries");
		this._entries = value;
	}
	
	public void setLinks(final List<CMSLinkComponentDTO> value)
	{
		this.modifiedPropsSet.add("links");
		this._links = value;
	}
	
	public void setPages(final List<ContentPageDTO> value)
	{
		this.modifiedPropsSet.add("pages");
		this._pages = value;
	}
	
	public void setParent(final CMSNavigationNodeDTO value)
	{
		this.modifiedPropsSet.add("parent");
		this._parent = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
	public void setVisible(final boolean value)
	{
		this.modifiedPropsSet.add("visible");
		this._visible = value;
	}
	
}
