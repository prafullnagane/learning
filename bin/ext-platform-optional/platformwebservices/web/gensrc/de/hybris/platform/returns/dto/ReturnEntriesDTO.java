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

import de.hybris.platform.returns.dto.ReturnEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ReturnEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "returnentries")
public class ReturnEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ReturnEntryDTO*/
	private List<ReturnEntryDTO>  returnentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnEntriesDTO(final List<ReturnEntryDTO> returnentriesList)
	{
		super();
		this.returnentriesList=returnentriesList;
	}
	
	
	/**
	 * @return the returnentries
	 */
	@XmlElement(name = "returnentry")
	public List<ReturnEntryDTO> getReturnEntries()
	{
		return	returnentriesList;
	}
	
	/**
	 * @param returnentriesList 
	 *  the returnentriesList to set   
	 */
	public void setReturnEntries(final List<ReturnEntryDTO> returnentriesList)
	{
		this.returnentriesList=returnentriesList;
	}
	
}
