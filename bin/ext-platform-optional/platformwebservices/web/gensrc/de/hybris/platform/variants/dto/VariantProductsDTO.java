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
package de.hybris.platform.variants.dto;

import de.hybris.platform.variants.dto.VariantProductDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type VariantProduct first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "variantproducts")
public class VariantProductsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>VariantProductDTO*/
	private List<VariantProductDTO>  variantproductsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantProductsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VariantProductsDTO(final List<VariantProductDTO> variantproductsList)
	{
		super();
		this.variantproductsList=variantproductsList;
	}
	
	
	/**
	 * @return the variantproducts
	 */
	@XmlElement(name = "variantproduct")
	public List<VariantProductDTO> getVariantProducts()
	{
		return	variantproductsList;
	}
	
	/**
	 * @param variantproductsList 
	 *  the variantproductsList to set   
	 */
	public void setVariantProducts(final List<VariantProductDTO> variantproductsList)
	{
		this.variantproductsList=variantproductsList;
	}
	
}
