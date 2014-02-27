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
package de.hybris.platform.acceleratorservices.dto.export;

import de.hybris.platform.acceleratorservices.dto.export.ExportDataHistoryEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ExportDataHistoryEntry first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@XmlRootElement(name = "exportdatahistoryentries")
public class ExportDataHistoryEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ExportDataHistoryEntryDTO*/
	private List<ExportDataHistoryEntryDTO>  exportdatahistoryentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataHistoryEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataHistoryEntriesDTO(final List<ExportDataHistoryEntryDTO> exportdatahistoryentriesList)
	{
		super();
		this.exportdatahistoryentriesList=exportdatahistoryentriesList;
	}
	
	
	/**
	 * @return the exportdatahistoryentries
	 */
	@XmlElement(name = "exportdatahistoryentry")
	public List<ExportDataHistoryEntryDTO> getExportDataHistoryEntries()
	{
		return	exportdatahistoryentriesList;
	}
	
	/**
	 * @param exportdatahistoryentriesList 
	 *  the exportdatahistoryentriesList to set   
	 */
	public void setExportDataHistoryEntries(final List<ExportDataHistoryEntryDTO> exportdatahistoryentriesList)
	{
		this.exportdatahistoryentriesList=exportdatahistoryentriesList;
	}
	
}
