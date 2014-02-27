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

import de.hybris.platform.voucher.dto.ProductQuantityRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductQuantityRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productquantityrestrictions")
public class ProductQuantityRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductQuantityRestrictionDTO*/
	private List<ProductQuantityRestrictionDTO>  productquantityrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductQuantityRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductQuantityRestrictionsDTO(final List<ProductQuantityRestrictionDTO> productquantityrestrictionsList)
	{
		super();
		this.productquantityrestrictionsList=productquantityrestrictionsList;
	}
	
	
	/**
	 * @return the productquantityrestrictions
	 */
	@XmlElement(name = "productquantityrestriction")
	public List<ProductQuantityRestrictionDTO> getProductQuantityRestrictions()
	{
		return	productquantityrestrictionsList;
	}
	
	/**
	 * @param productquantityrestrictionsList 
	 *  the productquantityrestrictionsList to set   
	 */
	public void setProductQuantityRestrictions(final List<ProductQuantityRestrictionDTO> productquantityrestrictionsList)
	{
		this.productquantityrestrictionsList=productquantityrestrictionsList;
	}
	
}
