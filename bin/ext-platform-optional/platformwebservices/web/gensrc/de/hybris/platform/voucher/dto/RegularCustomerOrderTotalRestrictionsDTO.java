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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.voucher.dto.RegularCustomerOrderTotalRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RegularCustomerOrderTotalRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "regularcustomerordertotalrestrictions")
public class RegularCustomerOrderTotalRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RegularCustomerOrderTotalRestrictionDTO*/
	private List<RegularCustomerOrderTotalRestrictionDTO>  regularcustomerordertotalrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegularCustomerOrderTotalRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegularCustomerOrderTotalRestrictionsDTO(final List<RegularCustomerOrderTotalRestrictionDTO> regularcustomerordertotalrestrictionsList)
	{
		super();
		this.regularcustomerordertotalrestrictionsList=regularcustomerordertotalrestrictionsList;
	}
	
	
	/**
	 * @return the regularcustomerordertotalrestrictions
	 */
	@XmlElement(name = "regularcustomerordertotalrestriction")
	public List<RegularCustomerOrderTotalRestrictionDTO> getRegularCustomerOrderTotalRestrictions()
	{
		return	regularcustomerordertotalrestrictionsList;
	}
	
	/**
	 * @param regularcustomerordertotalrestrictionsList 
	 *  the regularcustomerordertotalrestrictionsList to set   
	 */
	public void setRegularCustomerOrderTotalRestrictions(final List<RegularCustomerOrderTotalRestrictionDTO> regularcustomerordertotalrestrictionsList)
	{
		this.regularcustomerordertotalrestrictionsList=regularcustomerordertotalrestrictionsList;
	}
	
}
