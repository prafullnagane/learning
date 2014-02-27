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

import de.hybris.platform.btg.dto.BTGProductsInOrdersOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGProductsInOrdersOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgproductsinordersoperands")
public class BTGProductsInOrdersOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGProductsInOrdersOperandDTO*/
	private List<BTGProductsInOrdersOperandDTO>  btgproductsinordersoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGProductsInOrdersOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGProductsInOrdersOperandsDTO(final List<BTGProductsInOrdersOperandDTO> btgproductsinordersoperandsList)
	{
		super();
		this.btgproductsinordersoperandsList=btgproductsinordersoperandsList;
	}
	
	
	/**
	 * @return the btgproductsinordersoperands
	 */
	@XmlElement(name = "btgproductsinordersoperand")
	public List<BTGProductsInOrdersOperandDTO> getBTGProductsInOrdersOperands()
	{
		return	btgproductsinordersoperandsList;
	}
	
	/**
	 * @param btgproductsinordersoperandsList 
	 *  the btgproductsinordersoperandsList to set   
	 */
	public void setBTGProductsInOrdersOperands(final List<BTGProductsInOrdersOperandDTO> btgproductsinordersoperandsList)
	{
		this.btgproductsinordersoperandsList=btgproductsinordersoperandsList;
	}
	
}
