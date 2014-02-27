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
package de.hybris.platform.core.dto.order.price;

import de.hybris.platform.core.dto.order.price.TaxDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Tax first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "taxs")
public class TaxsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>TaxDTO*/
	private List<TaxDTO>  taxsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public TaxsDTO(final List<TaxDTO> taxsList)
	{
		super();
		this.taxsList=taxsList;
	}
	
	
	/**
	 * @return the taxs
	 */
	@XmlElement(name = "tax")
	public List<TaxDTO> getTaxs()
	{
		return	taxsList;
	}
	
	/**
	 * @param taxsList 
	 *  the taxsList to set   
	 */
	public void setTaxs(final List<TaxDTO> taxsList)
	{
		this.taxsList=taxsList;
	}
	
}
