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
package de.hybris.platform.cms2.dto.preview;

import de.hybris.platform.cms2.dto.preview.PreviewDataDTO;
import de.hybris.platform.cms2.model.preview.CMSPreviewTicketModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSPreviewTicket first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSPreviewTicketModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cmspreviewticket")
public class CMSPreviewTicketDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSPreviewTicket.id</code> attribute defined at extension <code> */
	private java.lang.String _id;
	/** <i>Generated variable</i> - Variable of <code>CMSPreviewTicket.previewData</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.preview.PreviewDataDTO _previewData;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSPreviewTicketDTO()
	{
		super();
	}
	
	
	public String getId()
	{
		return this._id;
	}
	
	public PreviewDataDTO getPreviewData()
	{
		return this._previewData;
	}
	
	public void setId(final String value)
	{
		this.modifiedPropsSet.add("id");
		this._id = value;
	}
	
	public void setPreviewData(final PreviewDataDTO value)
	{
		this.modifiedPropsSet.add("previewData");
		this._previewData = value;
	}
	
}
