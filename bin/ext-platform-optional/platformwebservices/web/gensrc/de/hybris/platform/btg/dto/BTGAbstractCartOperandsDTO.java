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

import de.hybris.platform.btg.dto.BTGAbstractCartOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractCartOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractcartoperands")
public class BTGAbstractCartOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractCartOperandDTO*/
	private List<BTGAbstractCartOperandDTO>  btgabstractcartoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractCartOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractCartOperandsDTO(final List<BTGAbstractCartOperandDTO> btgabstractcartoperandsList)
	{
		super();
		this.btgabstractcartoperandsList=btgabstractcartoperandsList;
	}
	
	
	/**
	 * @return the btgabstractcartoperands
	 */
	@XmlElement(name = "btgabstractcartoperand")
	public List<BTGAbstractCartOperandDTO> getBTGAbstractCartOperands()
	{
		return	btgabstractcartoperandsList;
	}
	
	/**
	 * @param btgabstractcartoperandsList 
	 *  the btgabstractcartoperandsList to set   
	 */
	public void setBTGAbstractCartOperands(final List<BTGAbstractCartOperandDTO> btgabstractcartoperandsList)
	{
		this.btgabstractcartoperandsList=btgabstractcartoperandsList;
	}
	
}
