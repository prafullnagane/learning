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
package de.hybris.platform.ordersplitting.dto;

import de.hybris.platform.ordersplitting.dto.VendorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Vendor first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "vendors")
public class VendorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>VendorDTO*/
	private List<VendorDTO>  vendorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VendorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VendorsDTO(final List<VendorDTO> vendorsList)
	{
		super();
		this.vendorsList=vendorsList;
	}
	
	
	/**
	 * @return the vendors
	 */
	@XmlElement(name = "vendor")
	public List<VendorDTO> getVendors()
	{
		return	vendorsList;
	}
	
	/**
	 * @param vendorsList 
	 *  the vendorsList to set   
	 */
	public void setVendors(final List<VendorDTO> vendorsList)
	{
		this.vendorsList=vendorsList;
	}
	
}
