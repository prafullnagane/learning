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
package de.hybris.platform.cms2.dto.relations;

import de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotDTO;
import de.hybris.platform.cms2.dto.pages.AbstractPageDTO;
import de.hybris.platform.cms2.dto.relations.CMSRelationDTO;
import de.hybris.platform.cms2.model.relations.ContentSlotForPageModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ContentSlotForPage first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ContentSlotForPageModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "contentslotforpage")
public class ContentSlotForPageDTO extends CMSRelationDTO
{
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForPage.page</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.AbstractPageDTO _page;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForPage.position</code> attribute defined at extension <code> */
	private java.lang.String _position;
	/** <i>Generated variable</i> - Variable of <code>ContentSlotForPage.contentSlot</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotDTO _contentSlot;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotForPageDTO()
	{
		super();
	}
	
	
	public ContentSlotDTO getContentSlot()
	{
		return this._contentSlot;
	}
	
	public AbstractPageDTO getPage()
	{
		return this._page;
	}
	
	public String getPosition()
	{
		return this._position;
	}
	
	public void setContentSlot(final ContentSlotDTO value)
	{
		this.modifiedPropsSet.add("contentSlot");
		this._contentSlot = value;
	}
	
	public void setPage(final AbstractPageDTO value)
	{
		this.modifiedPropsSet.add("page");
		this._page = value;
	}
	
	public void setPosition(final String value)
	{
		this.modifiedPropsSet.add("position");
		this._position = value;
	}
	
}
