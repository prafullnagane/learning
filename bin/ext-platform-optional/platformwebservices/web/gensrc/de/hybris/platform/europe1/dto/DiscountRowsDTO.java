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
package de.hybris.platform.europe1.dto;

import de.hybris.platform.europe1.dto.DiscountRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DiscountRow first defined at extension europe1
 */
@SuppressWarnings("all")
@XmlRootElement(name = "discountrows")
public class DiscountRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DiscountRowDTO*/
	private List<DiscountRowDTO>  discountrowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DiscountRowsDTO(final List<DiscountRowDTO> discountrowsList)
	{
		super();
		this.discountrowsList=discountrowsList;
	}
	
	
	/**
	 * @return the discountrows
	 */
	@XmlElement(name = "discountrow")
	public List<DiscountRowDTO> getDiscountRows()
	{
		return	discountrowsList;
	}
	
	/**
	 * @param discountrowsList 
	 *  the discountrowsList to set   
	 */
	public void setDiscountRows(final List<DiscountRowDTO> discountrowsList)
	{
		this.discountrowsList=discountrowsList;
	}
	
}
