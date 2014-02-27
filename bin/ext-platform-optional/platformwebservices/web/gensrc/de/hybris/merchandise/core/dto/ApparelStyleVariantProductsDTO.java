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

import de.hybris.merchandise.core.dto.ApparelStyleVariantProductDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ApparelStyleVariantProduct first defined at extension merchandisecore
 */
@SuppressWarnings("all")
@XmlRootElement(name = "apparelstylevariantproducts")
public class ApparelStyleVariantProductsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ApparelStyleVariantProductDTO*/
	private List<ApparelStyleVariantProductDTO>  apparelstylevariantproductsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelStyleVariantProductsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelStyleVariantProductsDTO(final List<ApparelStyleVariantProductDTO> apparelstylevariantproductsList)
	{
		super();
		this.apparelstylevariantproductsList=apparelstylevariantproductsList;
	}
	
	
	/**
	 * @return the apparelstylevariantproducts
	 */
	@XmlElement(name = "apparelstylevariantproduct")
	public List<ApparelStyleVariantProductDTO> getApparelStyleVariantProducts()
	{
		return	apparelstylevariantproductsList;
	}
	
	/**
	 * @param apparelstylevariantproductsList 
	 *  the apparelstylevariantproductsList to set   
	 */
	public void setApparelStyleVariantProducts(final List<ApparelStyleVariantProductDTO> apparelstylevariantproductsList)
	{
		this.apparelstylevariantproductsList=apparelstylevariantproductsList;
	}
	
}
