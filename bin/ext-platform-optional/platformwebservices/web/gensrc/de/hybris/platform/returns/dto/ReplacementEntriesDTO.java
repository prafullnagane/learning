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

import de.hybris.platform.returns.dto.ReplacementEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ReplacementEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "replacemententries")
public class ReplacementEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ReplacementEntryDTO*/
	private List<ReplacementEntryDTO>  replacemententriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReplacementEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReplacementEntriesDTO(final List<ReplacementEntryDTO> replacemententriesList)
	{
		super();
		this.replacemententriesList=replacemententriesList;
	}
	
	
	/**
	 * @return the replacemententries
	 */
	@XmlElement(name = "replacemententry")
	public List<ReplacementEntryDTO> getReplacementEntries()
	{
		return	replacemententriesList;
	}
	
	/**
	 * @param replacemententriesList 
	 *  the replacemententriesList to set   
	 */
	public void setReplacementEntries(final List<ReplacementEntryDTO> replacemententriesList)
	{
		this.replacemententriesList=replacemententriesList;
	}
	
}
