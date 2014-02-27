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

import de.hybris.platform.returns.dto.RefundEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RefundEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "refundentries")
public class RefundEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RefundEntryDTO*/
	private List<RefundEntryDTO>  refundentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RefundEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RefundEntriesDTO(final List<RefundEntryDTO> refundentriesList)
	{
		super();
		this.refundentriesList=refundentriesList;
	}
	
	
	/**
	 * @return the refundentries
	 */
	@XmlElement(name = "refundentry")
	public List<RefundEntryDTO> getRefundEntries()
	{
		return	refundentriesList;
	}
	
	/**
	 * @param refundentriesList 
	 *  the refundentriesList to set   
	 */
	public void setRefundEntries(final List<RefundEntryDTO> refundentriesList)
	{
		this.refundentriesList=refundentriesList;
	}
	
}
