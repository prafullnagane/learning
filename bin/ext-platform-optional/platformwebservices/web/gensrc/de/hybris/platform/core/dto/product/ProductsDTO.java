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
package de.hybris.platform.core.dto.product;

import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Product first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "products")
public class ProductsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ProductDTO*/
	private List<ProductDTO>  productsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductsDTO(final List<ProductDTO> productsList)
	{
		super();
		this.productsList=productsList;
	}
	
	
	/**
	 * @return the products
	 */
	@XmlElement(name = "product")
	public List<ProductDTO> getProducts()
	{
		return	productsList;
	}
	
	/**
	 * @param productsList 
	 *  the productsList to set   
	 */
	public void setProducts(final List<ProductDTO> productsList)
	{
		this.productsList=productsList;
	}
	
}