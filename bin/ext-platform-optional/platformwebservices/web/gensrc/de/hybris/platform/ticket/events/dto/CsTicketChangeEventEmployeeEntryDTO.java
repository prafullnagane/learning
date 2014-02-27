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
package de.hybris.platform.ticket.events.dto;

import de.hybris.platform.core.dto.user.EmployeeDTO;
import de.hybris.platform.ticket.events.dto.CsTicketChangeEventEntryDTO;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventEmployeeEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CsTicketChangeEventEmployeeEntry first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@GraphNode(target = CsTicketChangeEventEmployeeEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "csticketchangeeventemployeeentry")
public class CsTicketChangeEventEmployeeEntryDTO extends CsTicketChangeEventEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEmployeeEntry.newValue</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.EmployeeDTO _newValue;
	/** <i>Generated variable</i> - Variable of <code>CsTicketChangeEventEmployeeEntry.oldValue</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.EmployeeDTO _oldValue;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsTicketChangeEventEmployeeEntryDTO()
	{
		super();
	}
	
	
	public EmployeeDTO getNewValue()
	{
		return this._newValue;
	}
	
	public EmployeeDTO getOldValue()
	{
		return this._oldValue;
	}
	
	public void setNewValue(final EmployeeDTO value)
	{
		this.modifiedPropsSet.add("newValue");
		this._newValue = value;
	}
	
	public void setOldValue(final EmployeeDTO value)
	{
		this.modifiedPropsSet.add("oldValue");
		this._oldValue = value;
	}
	
}
