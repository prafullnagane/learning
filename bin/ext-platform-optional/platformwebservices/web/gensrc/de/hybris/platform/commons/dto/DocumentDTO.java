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
import de.hybris.platform.commons.model.DocumentModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Document first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = DocumentModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "document")
public class DocumentDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>Document.sourceItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _sourceItem;
	/** <i>Generated variable</i> - Variable of <code>Document.format</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.FormatDTO _format;
	/** <i>Generated variable</i> - Variable of <code>Document.itemTimestamp</code> attribute defined at extension <code> */
	private java.util.Date _itemTimestamp;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DocumentDTO()
	{
		super();
	}
	
	
	public FormatDTO getFormat()
	{
		return this._format;
	}
	
	public Date getItemTimestamp()
	{
		return this._itemTimestamp;
	}
	
	public ItemDTO getSourceItem()
	{
		return this._sourceItem;
	}
	
	public void setFormat(final FormatDTO value)
	{
		this.modifiedPropsSet.add("format");
		this._format = value;
	}
	
	public void setItemTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("itemTimestamp");
		this._itemTimestamp = value;
	}
	
	public void setSourceItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("sourceItem");
		this._sourceItem = value;
	}
	
}
