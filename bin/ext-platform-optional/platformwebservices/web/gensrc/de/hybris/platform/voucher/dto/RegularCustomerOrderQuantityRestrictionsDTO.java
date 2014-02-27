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

import de.hybris.platform.voucher.dto.RegularCustomerOrderQuantityRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RegularCustomerOrderQuantityRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "regularcustomerorderquantityrestrictions")
public class RegularCustomerOrderQuantityRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RegularCustomerOrderQuantityRestrictionDTO*/
	private List<RegularCustomerOrderQuantityRestrictionDTO>  regularcustomerorderquantityrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegularCustomerOrderQuantityRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RegularCustomerOrderQuantityRestrictionsDTO(final List<RegularCustomerOrderQuantityRestrictionDTO> regularcustomerorderquantityrestrictionsList)
	{
		super();
		this.regularcustomerorderquantityrestrictionsList=regularcustomerorderquantityrestrictionsList;
	}
	
	
	/**
	 * @return the regularcustomerorderquantityrestrictions
	 */
	@XmlElement(name = "regularcustomerorderquantityrestriction")
	public List<RegularCustomerOrderQuantityRestrictionDTO> getRegularCustomerOrderQuantityRestrictions()
	{
		return	regularcustomerorderquantityrestrictionsList;
	}
	
	/**
	 * @param regularcustomerorderquantityrestrictionsList 
	 *  the regularcustomerorderquantityrestrictionsList to set   
	 */
	public void setRegularCustomerOrderQuantityRestrictions(final List<RegularCustomerOrderQuantityRestrictionDTO> regularcustomerorderquantityrestrictionsList)
	{
		this.regularcustomerorderquantityrestrictionsList=regularcustomerorderquantityrestrictionsList;
	}
	
}
