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

import de.hybris.platform.btg.dto.BTGGenderEnumLiteralOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGGenderEnumLiteralOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btggenderenumliteraloperands")
public class BTGGenderEnumLiteralOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGGenderEnumLiteralOperandDTO*/
	private List<BTGGenderEnumLiteralOperandDTO>  btggenderenumliteraloperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGGenderEnumLiteralOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGGenderEnumLiteralOperandsDTO(final List<BTGGenderEnumLiteralOperandDTO> btggenderenumliteraloperandsList)
	{
		super();
		this.btggenderenumliteraloperandsList=btggenderenumliteraloperandsList;
	}
	
	
	/**
	 * @return the btggenderenumliteraloperands
	 */
	@XmlElement(name = "btggenderenumliteraloperand")
	public List<BTGGenderEnumLiteralOperandDTO> getBTGGenderEnumLiteralOperands()
	{
		return	btggenderenumliteraloperandsList;
	}
	
	/**
	 * @param btggenderenumliteraloperandsList 
	 *  the btggenderenumliteraloperandsList to set   
	 */
	public void setBTGGenderEnumLiteralOperands(final List<BTGGenderEnumLiteralOperandDTO> btggenderenumliteraloperandsList)
	{
		this.btggenderenumliteraloperandsList=btggenderenumliteraloperandsList;
	}
	
}