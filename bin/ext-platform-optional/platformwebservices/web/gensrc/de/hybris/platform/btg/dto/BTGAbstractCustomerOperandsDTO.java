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

import de.hybris.platform.btg.dto.BTGAbstractCustomerOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractCustomerOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractcustomeroperands")
public class BTGAbstractCustomerOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractCustomerOperandDTO*/
	private List<BTGAbstractCustomerOperandDTO>  btgabstractcustomeroperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractCustomerOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractCustomerOperandsDTO(final List<BTGAbstractCustomerOperandDTO> btgabstractcustomeroperandsList)
	{
		super();
		this.btgabstractcustomeroperandsList=btgabstractcustomeroperandsList;
	}
	
	
	/**
	 * @return the btgabstractcustomeroperands
	 */
	@XmlElement(name = "btgabstractcustomeroperand")
	public List<BTGAbstractCustomerOperandDTO> getBTGAbstractCustomerOperands()
	{
		return	btgabstractcustomeroperandsList;
	}
	
	/**
	 * @param btgabstractcustomeroperandsList 
	 *  the btgabstractcustomeroperandsList to set   
	 */
	public void setBTGAbstractCustomerOperands(final List<BTGAbstractCustomerOperandDTO> btgabstractcustomeroperandsList)
	{
		this.btgabstractcustomeroperandsList=btgabstractcustomeroperandsList;
	}
	
}
