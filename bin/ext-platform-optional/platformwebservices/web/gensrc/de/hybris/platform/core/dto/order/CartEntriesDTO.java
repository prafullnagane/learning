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
package de.hybris.platform.core.dto.order;

import de.hybris.platform.core.dto.order.CartEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CartEntry first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cartentries")
public class CartEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CartEntryDTO*/
	private List<CartEntryDTO>  cartentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartEntriesDTO(final List<CartEntryDTO> cartentriesList)
	{
		super();
		this.cartentriesList=cartentriesList;
	}
	
	
	/**
	 * @return the cartentries
	 */
	@XmlElement(name = "cartentry")
	public List<CartEntryDTO> getCartEntries()
	{
		return	cartentriesList;
	}
	
	/**
	 * @param cartentriesList 
	 *  the cartentriesList to set   
	 */
	public void setCartEntries(final List<CartEntryDTO> cartentriesList)
	{
		this.cartentriesList=cartentriesList;
	}
	
}
