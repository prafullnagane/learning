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
package de.hybris.platform.commons.dto;

import de.hybris.platform.commons.dto.ItemFormatterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ItemFormatter first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "itemformatters")
public class ItemFormattersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ItemFormatterDTO*/
	private List<ItemFormatterDTO>  itemformattersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemFormattersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ItemFormattersDTO(final List<ItemFormatterDTO> itemformattersList)
	{
		super();
		this.itemformattersList=itemformattersList;
	}
	
	
	/**
	 * @return the itemformatters
	 */
	@XmlElement(name = "itemformatter")
	public List<ItemFormatterDTO> getItemFormatters()
	{
		return	itemformattersList;
	}
	
	/**
	 * @param itemformattersList 
	 *  the itemformattersList to set   
	 */
	public void setItemFormatters(final List<ItemFormatterDTO> itemformattersList)
	{
		this.itemformattersList=itemformattersList;
	}
	
}
