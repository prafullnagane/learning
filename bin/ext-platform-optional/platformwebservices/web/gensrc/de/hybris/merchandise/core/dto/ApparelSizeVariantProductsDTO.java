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
package de.hybris.merchandise.core.dto;

import de.hybris.merchandise.core.dto.ApparelSizeVariantProductDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ApparelSizeVariantProduct first defined at extension merchandisecore
 */
@SuppressWarnings("all")
@XmlRootElement(name = "apparelsizevariantproducts")
public class ApparelSizeVariantProductsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ApparelSizeVariantProductDTO*/
	private List<ApparelSizeVariantProductDTO>  apparelsizevariantproductsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelSizeVariantProductsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelSizeVariantProductsDTO(final List<ApparelSizeVariantProductDTO> apparelsizevariantproductsList)
	{
		super();
		this.apparelsizevariantproductsList=apparelsizevariantproductsList;
	}
	
	
	/**
	 * @return the apparelsizevariantproducts
	 */
	@XmlElement(name = "apparelsizevariantproduct")
	public List<ApparelSizeVariantProductDTO> getApparelSizeVariantProducts()
	{
		return	apparelsizevariantproductsList;
	}
	
	/**
	 * @param apparelsizevariantproductsList 
	 *  the apparelsizevariantproductsList to set   
	 */
	public void setApparelSizeVariantProducts(final List<ApparelSizeVariantProductDTO> apparelsizevariantproductsList)
	{
		this.apparelsizevariantproductsList=apparelsizevariantproductsList;
	}
	
}
