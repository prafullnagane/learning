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

import de.hybris.merchandise.core.dto.ApparelProductDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ApparelProduct first defined at extension merchandisecore
 */
@SuppressWarnings("all")
@XmlRootElement(name = "apparelproducts")
public class ApparelProductsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ApparelProductDTO*/
	private List<ApparelProductDTO>  apparelproductsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelProductsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelProductsDTO(final List<ApparelProductDTO> apparelproductsList)
	{
		super();
		this.apparelproductsList=apparelproductsList;
	}
	
	
	/**
	 * @return the apparelproducts
	 */
	@XmlElement(name = "apparelproduct")
	public List<ApparelProductDTO> getApparelProducts()
	{
		return	apparelproductsList;
	}
	
	/**
	 * @param apparelproductsList 
	 *  the apparelproductsList to set   
	 */
	public void setApparelProducts(final List<ApparelProductDTO> apparelproductsList)
	{
		this.apparelproductsList=apparelproductsList;
	}
	
}
