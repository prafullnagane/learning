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

import de.hybris.platform.voucher.dto.ProductRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productrestrictions")
public class ProductRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductRestrictionDTO*/
	private List<ProductRestrictionDTO>  productrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductRestrictionsDTO(final List<ProductRestrictionDTO> productrestrictionsList)
	{
		super();
		this.productrestrictionsList=productrestrictionsList;
	}
	
	
	/**
	 * @return the productrestrictions
	 */
	@XmlElement(name = "productrestriction")
	public List<ProductRestrictionDTO> getProductRestrictions()
	{
		return	productrestrictionsList;
	}
	
	/**
	 * @param productrestrictionsList 
	 *  the productrestrictionsList to set   
	 */
	public void setProductRestrictions(final List<ProductRestrictionDTO> productrestrictionsList)
	{
		this.productrestrictionsList=productrestrictionsList;
	}
	
}
