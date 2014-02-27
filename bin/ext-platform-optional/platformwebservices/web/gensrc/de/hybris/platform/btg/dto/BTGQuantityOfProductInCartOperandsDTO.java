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

import de.hybris.platform.btg.dto.BTGQuantityOfProductInCartOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGQuantityOfProductInCartOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgquantityofproductincartoperands")
public class BTGQuantityOfProductInCartOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGQuantityOfProductInCartOperandDTO*/
	private List<BTGQuantityOfProductInCartOperandDTO>  btgquantityofproductincartoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGQuantityOfProductInCartOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGQuantityOfProductInCartOperandsDTO(final List<BTGQuantityOfProductInCartOperandDTO> btgquantityofproductincartoperandsList)
	{
		super();
		this.btgquantityofproductincartoperandsList=btgquantityofproductincartoperandsList;
	}
	
	
	/**
	 * @return the btgquantityofproductincartoperands
	 */
	@XmlElement(name = "btgquantityofproductincartoperand")
	public List<BTGQuantityOfProductInCartOperandDTO> getBTGQuantityOfProductInCartOperands()
	{
		return	btgquantityofproductincartoperandsList;
	}
	
	/**
	 * @param btgquantityofproductincartoperandsList 
	 *  the btgquantityofproductincartoperandsList to set   
	 */
	public void setBTGQuantityOfProductInCartOperands(final List<BTGQuantityOfProductInCartOperandDTO> btgquantityofproductincartoperandsList)
	{
		this.btgquantityofproductincartoperandsList=btgquantityofproductincartoperandsList;
	}
	
}
