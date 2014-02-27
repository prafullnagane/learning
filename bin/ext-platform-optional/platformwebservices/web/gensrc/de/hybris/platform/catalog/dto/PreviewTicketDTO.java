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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.model.PreviewTicketModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PreviewTicket first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = PreviewTicketModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "previewticket")
public class PreviewTicketDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PreviewTicket.validTo</code> attribute defined at extension <code> */
	private java.util.Date _validTo;
	/** <i>Generated variable</i> - Variable of <code>PreviewTicket.previewCatalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _previewCatalogVersion;
	/** <i>Generated variable</i> - Variable of <code>PreviewTicket.createdBy</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _createdBy;
	/** <i>Generated variable</i> - Variable of <code>PreviewTicket.ticketCode</code> attribute defined at extension <code> */
	private java.lang.String _ticketCode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PreviewTicketDTO()
	{
		super();
	}
	
	
	public UserDTO getCreatedBy()
	{
		return this._createdBy;
	}
	
	public CatalogVersionDTO getPreviewCatalogVersion()
	{
		return this._previewCatalogVersion;
	}
	
	public String getTicketCode()
	{
		return this._ticketCode;
	}
	
	public Date getValidTo()
	{
		return this._validTo;
	}
	
	public void setCreatedBy(final UserDTO value)
	{
		this.modifiedPropsSet.add("createdBy");
		this._createdBy = value;
	}
	
	public void setPreviewCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("previewCatalogVersion");
		this._previewCatalogVersion = value;
	}
	
	public void setTicketCode(final String value)
	{
		this.modifiedPropsSet.add("ticketCode");
		this._ticketCode = value;
	}
	
	public void setValidTo(final Date value)
	{
		this.modifiedPropsSet.add("validTo");
		this._validTo = value;
	}
	
}
