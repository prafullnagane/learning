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

import de.hybris.platform.voucher.dto.ProductCategoryRestrictionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ProductCategoryRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@XmlRootElement(name = "productcategoryrestrictions")
public class ProductCategoryRestrictionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductCategoryRestrictionDTO*/
	private List<ProductCategoryRestrictionDTO>  productcategoryrestrictionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCategoryRestrictionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductCategoryRestrictionsDTO(final List<ProductCategoryRestrictionDTO> productcategoryrestrictionsList)
	{
		super();
		this.productcategoryrestrictionsList=productcategoryrestrictionsList;
	}
	
	
	/**
	 * @return the productcategoryrestrictions
	 */
	@XmlElement(name = "productcategoryrestriction")
	public List<ProductCategoryRestrictionDTO> getProductCategoryRestrictions()
	{
		return	productcategoryrestrictionsList;
	}
	
	/**
	 * @param productcategoryrestrictionsList 
	 *  the productcategoryrestrictionsList to set   
	 */
	public void setProductCategoryRestrictions(final List<ProductCategoryRestrictionDTO> productcategoryrestrictionsList)
	{
		this.productcategoryrestrictionsList=productcategoryrestrictionsList;
	}
	
}
