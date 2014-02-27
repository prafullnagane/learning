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

import de.hybris.platform.btg.dto.BTGLastOrdersOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGLastOrdersOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btglastordersoperands")
public class BTGLastOrdersOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGLastOrdersOperandDTO*/
	private List<BTGLastOrdersOperandDTO>  btglastordersoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrdersOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrdersOperandsDTO(final List<BTGLastOrdersOperandDTO> btglastordersoperandsList)
	{
		super();
		this.btglastordersoperandsList=btglastordersoperandsList;
	}
	
	
	/**
	 * @return the btglastordersoperands
	 */
	@XmlElement(name = "btglastordersoperand")
	public List<BTGLastOrdersOperandDTO> getBTGLastOrdersOperands()
	{
		return	btglastordersoperandsList;
	}
	
	/**
	 * @param btglastordersoperandsList 
	 *  the btglastordersoperandsList to set   
	 */
	public void setBTGLastOrdersOperands(final List<BTGLastOrdersOperandDTO> btglastordersoperandsList)
	{
		this.btglastordersoperandsList=btglastordersoperandsList;
	}
	
}
