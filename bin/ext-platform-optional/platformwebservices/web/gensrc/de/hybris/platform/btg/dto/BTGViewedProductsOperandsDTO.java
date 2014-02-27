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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGViewedProductsOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGViewedProductsOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgviewedproductsoperands")
public class BTGViewedProductsOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGViewedProductsOperandDTO*/
	private List<BTGViewedProductsOperandDTO>  btgviewedproductsoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGViewedProductsOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGViewedProductsOperandsDTO(final List<BTGViewedProductsOperandDTO> btgviewedproductsoperandsList)
	{
		super();
		this.btgviewedproductsoperandsList=btgviewedproductsoperandsList;
	}
	
	
	/**
	 * @return the btgviewedproductsoperands
	 */
	@XmlElement(name = "btgviewedproductsoperand")
	public List<BTGViewedProductsOperandDTO> getBTGViewedProductsOperands()
	{
		return	btgviewedproductsoperandsList;
	}
	
	/**
	 * @param btgviewedproductsoperandsList 
	 *  the btgviewedproductsoperandsList to set   
	 */
	public void setBTGViewedProductsOperands(final List<BTGViewedProductsOperandDTO> btgviewedproductsoperandsList)
	{
		this.btgviewedproductsoperandsList=btgviewedproductsoperandsList;
	}
	
}
