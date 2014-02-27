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

import de.hybris.platform.hmc.dto.HMCHistoryEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type HMCHistoryEntry first defined at extension hmc
 */
@SuppressWarnings("all")
@XmlRootElement(name = "hmchistoryentries")
public class HMCHistoryEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>HMCHistoryEntryDTO*/
	private List<HMCHistoryEntryDTO>  hmchistoryentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HMCHistoryEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public HMCHistoryEntriesDTO(final List<HMCHistoryEntryDTO> hmchistoryentriesList)
	{
		super();
		this.hmchistoryentriesList=hmchistoryentriesList;
	}
	
	
	/**
	 * @return the hmchistoryentries
	 */
	@XmlElement(name = "hmchistoryentry")
	public List<HMCHistoryEntryDTO> getHMCHistoryEntries()
	{
		return	hmchistoryentriesList;
	}
	
	/**
	 * @param hmchistoryentriesList 
	 *  the hmchistoryentriesList to set   
	 */
	public void setHMCHistoryEntries(final List<HMCHistoryEntryDTO> hmchistoryentriesList)
	{
		this.hmchistoryentriesList=hmchistoryentriesList;
	}
	
}
