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

import de.hybris.platform.europe1.dto.PriceRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PriceRow first defined at extension europe1
 */
@SuppressWarnings("all")
@XmlRootElement(name = "pricerows")
public class PriceRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PriceRowDTO*/
	private List<PriceRowDTO>  pricerowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PriceRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PriceRowsDTO(final List<PriceRowDTO> pricerowsList)
	{
		super();
		this.pricerowsList=pricerowsList;
	}
	
	
	/**
	 * @return the pricerows
	 */
	@XmlElement(name = "pricerow")
	public List<PriceRowDTO> getPriceRows()
	{
		return	pricerowsList;
	}
	
	/**
	 * @param pricerowsList 
	 *  the pricerowsList to set   
	 */
	public void setPriceRows(final List<PriceRowDTO> pricerowsList)
	{
		this.pricerowsList=pricerowsList;
	}
	
}
