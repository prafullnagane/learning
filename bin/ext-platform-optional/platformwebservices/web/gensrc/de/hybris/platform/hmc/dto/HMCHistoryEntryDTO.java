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
package de.hybris.platform.hmc.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.hmc.model.HMCHistoryEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type HMCHistoryEntry first defined at extension hmc
 */
@SuppressWarnings("all")
@GraphNode(target = HMCHistoryEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "hmchistoryentry")
public class HMCHistoryEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>HMCHistoryEntry.actionType</code> attribute defined at extension <code> */
	private java.lang.String _actionType;
	/** <i>Generated variable</i> - Variable of <code>HMCHistoryEntry.timestamp</code> attribute defined at extension <code> */
	private java.util.Date _timestamp;
	/** <i>Generated variable</i> - Variable of <code>HMCHistoryEntry.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>HMCHistoryEntry.comment</code> attribute defined at extension <code> */
	private java.lang.String _comment;
	/** <i>Generated variable</i> - Variable of <code>HMCHistoryEntry.referencedItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _referencedItem;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HMCHistoryEntryDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getActionType()
	{
		return this._actionType;
	}
	
	public String getComment()
	{
		return this._comment;
	}
	
	public ItemDTO getReferencedItem()
	{
		return this._referencedItem;
	}
	
	public Date getTimestamp()
	{
		return this._timestamp;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setActionType(final String value)
	{
		this.modifiedPropsSet.add("actionType");
		this._actionType = value;
	}
	
	public void setComment(final String value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setReferencedItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("referencedItem");
		this._referencedItem = value;
	}
	
	public void setTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("timestamp");
		this._timestamp = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
