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

import de.hybris.platform.mcc.dto.AbstractLinkEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractLinkEntry first defined at extension mcc
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractlinkentries")
public class AbstractLinkEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractLinkEntryDTO*/
	private List<AbstractLinkEntryDTO>  abstractlinkentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractLinkEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractLinkEntriesDTO(final List<AbstractLinkEntryDTO> abstractlinkentriesList)
	{
		super();
		this.abstractlinkentriesList=abstractlinkentriesList;
	}
	
	
	/**
	 * @return the abstractlinkentries
	 */
	@XmlElement(name = "abstractlinkentry")
	public List<AbstractLinkEntryDTO> getAbstractLinkEntries()
	{
		return	abstractlinkentriesList;
	}
	
	/**
	 * @param abstractlinkentriesList 
	 *  the abstractlinkentriesList to set   
	 */
	public void setAbstractLinkEntries(final List<AbstractLinkEntryDTO> abstractlinkentriesList)
	{
		this.abstractlinkentriesList=abstractlinkentriesList;
	}
	
}
