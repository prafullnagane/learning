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
package de.hybris.platform.basecommerce.dto;

import de.hybris.platform.basecommerce.dto.MultiAddressInMemoryCartDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type MultiAddressInMemoryCart first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "multiaddressinmemorycarts")
public class MultiAddressInMemoryCartsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>MultiAddressInMemoryCartDTO*/
	private List<MultiAddressInMemoryCartDTO>  multiaddressinmemorycartsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MultiAddressInMemoryCartsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public MultiAddressInMemoryCartsDTO(final List<MultiAddressInMemoryCartDTO> multiaddressinmemorycartsList)
	{
		super();
		this.multiaddressinmemorycartsList=multiaddressinmemorycartsList;
	}
	
	
	/**
	 * @return the multiaddressinmemorycarts
	 */
	@XmlElement(name = "multiaddressinmemorycart")
	public List<MultiAddressInMemoryCartDTO> getMultiAddressInMemoryCarts()
	{
		return	multiaddressinmemorycartsList;
	}
	
	/**
	 * @param multiaddressinmemorycartsList 
	 *  the multiaddressinmemorycartsList to set   
	 */
	public void setMultiAddressInMemoryCarts(final List<MultiAddressInMemoryCartDTO> multiaddressinmemorycartsList)
	{
		this.multiaddressinmemorycartsList=multiaddressinmemorycartsList;
	}
	
}
