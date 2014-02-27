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
package de.hybris.platform.servicelayer.internal.dto.order;

import de.hybris.platform.servicelayer.internal.dto.order.InMemoryCartDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type InMemoryCart first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "inmemorycarts")
public class InMemoryCartsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>InMemoryCartDTO*/
	private List<InMemoryCartDTO>  inmemorycartsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InMemoryCartsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public InMemoryCartsDTO(final List<InMemoryCartDTO> inmemorycartsList)
	{
		super();
		this.inmemorycartsList=inmemorycartsList;
	}
	
	
	/**
	 * @return the inmemorycarts
	 */
	@XmlElement(name = "inmemorycart")
	public List<InMemoryCartDTO> getInMemoryCarts()
	{
		return	inmemorycartsList;
	}
	
	/**
	 * @param inmemorycartsList 
	 *  the inmemorycartsList to set   
	 */
	public void setInMemoryCarts(final List<InMemoryCartDTO> inmemorycartsList)
	{
		this.inmemorycartsList=inmemorycartsList;
	}
	
}
