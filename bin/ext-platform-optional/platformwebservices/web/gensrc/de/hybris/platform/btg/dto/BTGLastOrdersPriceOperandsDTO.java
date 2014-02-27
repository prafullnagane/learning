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

import de.hybris.platform.btg.dto.BTGLastOrdersPriceOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGLastOrdersPriceOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btglastorderspriceoperands")
public class BTGLastOrdersPriceOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGLastOrdersPriceOperandDTO*/
	private List<BTGLastOrdersPriceOperandDTO>  btglastorderspriceoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrdersPriceOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrdersPriceOperandsDTO(final List<BTGLastOrdersPriceOperandDTO> btglastorderspriceoperandsList)
	{
		super();
		this.btglastorderspriceoperandsList=btglastorderspriceoperandsList;
	}
	
	
	/**
	 * @return the btglastorderspriceoperands
	 */
	@XmlElement(name = "btglastorderspriceoperand")
	public List<BTGLastOrdersPriceOperandDTO> getBTGLastOrdersPriceOperands()
	{
		return	btglastorderspriceoperandsList;
	}
	
	/**
	 * @param btglastorderspriceoperandsList 
	 *  the btglastorderspriceoperandsList to set   
	 */
	public void setBTGLastOrdersPriceOperands(final List<BTGLastOrdersPriceOperandDTO> btglastorderspriceoperandsList)
	{
		this.btglastorderspriceoperandsList=btglastorderspriceoperandsList;
	}
	
}
