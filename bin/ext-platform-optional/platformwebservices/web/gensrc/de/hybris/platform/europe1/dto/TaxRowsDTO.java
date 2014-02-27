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

import de.hybris.platform.europe1.dto.TaxRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type TaxRow first defined at extension europe1
 */
@SuppressWarnings("all")
@XmlRootElement(name = "taxrows")
public class TaxRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TaxRowDTO*/
	private List<TaxRowDTO>  taxrowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxRowsDTO(final List<TaxRowDTO> taxrowsList)
	{
		super();
		this.taxrowsList=taxrowsList;
	}
	
	
	/**
	 * @return the taxrows
	 */
	@XmlElement(name = "taxrow")
	public List<TaxRowDTO> getTaxRows()
	{
		return	taxrowsList;
	}
	
	/**
	 * @param taxrowsList 
	 *  the taxrowsList to set   
	 */
	public void setTaxRows(final List<TaxRowDTO> taxrowsList)
	{
		this.taxrowsList=taxrowsList;
	}
	
}
