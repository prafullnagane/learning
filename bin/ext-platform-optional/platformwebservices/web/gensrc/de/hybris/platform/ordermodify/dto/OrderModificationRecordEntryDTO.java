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
package de.hybris.platform.ordermodify.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.orderhistory.dto.OrderHistoryEntryDTO;
import de.hybris.platform.ordermodify.dto.OrderEntryModificationRecordEntryDTO;
import de.hybris.platform.ordermodify.dto.OrderModificationRecordDTO;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OrderModificationRecordEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OrderModificationRecordEntryModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "ordermodificationrecordentry")
public class OrderModificationRecordEntryDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.originalVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.orderhistory.dto.OrderHistoryEntryDTO _originalVersion;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.failedMessage</code> attribute defined at extension <code> */
	private java.lang.String _failedMessage;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.orderEntriesModificationEntries</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.ordermodify.dto.OrderEntryModificationRecordEntryDTO> _orderEntriesModificationEntries;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.notes</code> attribute defined at extension <code> */
	private java.lang.String _notes;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.timestamp</code> attribute defined at extension <code> */
	private java.util.Date _timestamp;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.principal</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.security.PrincipalDTO _principal;
	/** <i>Generated variable</i> - Variable of <code>OrderModificationRecordEntry.modificationRecord</code> attribute defined at extension <code> */
	private de.hybris.platform.ordermodify.dto.OrderModificationRecordDTO _modificationRecord;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OrderModificationRecordEntryDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getFailedMessage()
	{
		return this._failedMessage;
	}
	
	public OrderModificationRecordDTO getModificationRecord()
	{
		return this._modificationRecord;
	}
	
	public String getNotes()
	{
		return this._notes;
	}
	
	@XmlElementWrapper(name = "orderEntriesModificationEntries")
	@XmlElement(name = "orderEntryModificationRecordEntry")
	public Collection<OrderEntryModificationRecordEntryDTO> getOrderEntriesModificationEntries()
	{
		return this._orderEntriesModificationEntries;
	}
	
	public OrderHistoryEntryDTO getOriginalVersion()
	{
		return this._originalVersion;
	}
	
	public PrincipalDTO getPrincipal()
	{
		return this._principal;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	public Date getTimestamp()
	{
		return this._timestamp;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setFailedMessage(final String value)
	{
		this.modifiedPropsSet.add("failedMessage");
		this._failedMessage = value;
	}
	
	public void setModificationRecord(final OrderModificationRecordDTO value)
	{
		this.modifiedPropsSet.add("modificationRecord");
		this._modificationRecord = value;
	}
	
	public void setNotes(final String value)
	{
		this.modifiedPropsSet.add("notes");
		this._notes = value;
	}
	
	public void setOrderEntriesModificationEntries(final Collection<OrderEntryModificationRecordEntryDTO> value)
	{
		this.modifiedPropsSet.add("orderEntriesModificationEntries");
		this._orderEntriesModificationEntries = value;
	}
	
	public void setOriginalVersion(final OrderHistoryEntryDTO value)
	{
		this.modifiedPropsSet.add("originalVersion");
		this._originalVersion = value;
	}
	
	public void setPrincipal(final PrincipalDTO value)
	{
		this.modifiedPropsSet.add("principal");
		this._principal = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("timestamp");
		this._timestamp = value;
	}
	
}
