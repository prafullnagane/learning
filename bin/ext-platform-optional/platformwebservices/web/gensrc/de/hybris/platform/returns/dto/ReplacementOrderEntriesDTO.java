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
package de.hybris.platform.returns.dto;

import de.hybris.platform.returns.dto.ReplacementOrderEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ReplacementOrderEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "replacementorderentries")
public class ReplacementOrderEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ReplacementOrderEntryDTO*/
	private List<ReplacementOrderEntryDTO>  replacementorderentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReplacementOrderEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReplacementOrderEntriesDTO(final List<ReplacementOrderEntryDTO> replacementorderentriesList)
	{
		super();
		this.replacementorderentriesList=replacementorderentriesList;
	}
	
	
	/**
	 * @return the replacementorderentries
	 */
	@XmlElement(name = "replacementorderentry")
	public List<ReplacementOrderEntryDTO> getReplacementOrderEntries()
	{
		return	replacementorderentriesList;
	}
	
	/**
	 * @param replacementorderentriesList 
	 *  the replacementorderentriesList to set   
	 */
	public void setReplacementOrderEntries(final List<ReplacementOrderEntryDTO> replacementorderentriesList)
	{
		this.replacementorderentriesList=replacementorderentriesList;
	}
	
}
