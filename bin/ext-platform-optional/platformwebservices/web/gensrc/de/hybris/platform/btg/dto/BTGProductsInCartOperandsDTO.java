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

import de.hybris.platform.btg.dto.BTGProductsInCartOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGProductsInCartOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgproductsincartoperands")
public class BTGProductsInCartOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGProductsInCartOperandDTO*/
	private List<BTGProductsInCartOperandDTO>  btgproductsincartoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGProductsInCartOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGProductsInCartOperandsDTO(final List<BTGProductsInCartOperandDTO> btgproductsincartoperandsList)
	{
		super();
		this.btgproductsincartoperandsList=btgproductsincartoperandsList;
	}
	
	
	/**
	 * @return the btgproductsincartoperands
	 */
	@XmlElement(name = "btgproductsincartoperand")
	public List<BTGProductsInCartOperandDTO> getBTGProductsInCartOperands()
	{
		return	btgproductsincartoperandsList;
	}
	
	/**
	 * @param btgproductsincartoperandsList 
	 *  the btgproductsincartoperandsList to set   
	 */
	public void setBTGProductsInCartOperands(final List<BTGProductsInCartOperandDTO> btgproductsincartoperandsList)
	{
		this.btgproductsincartoperandsList=btgproductsincartoperandsList;
	}
	
}
