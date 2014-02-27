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

import de.hybris.platform.btg.dto.BTGIntegerLiteralOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGIntegerLiteralOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgintegerliteraloperands")
public class BTGIntegerLiteralOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGIntegerLiteralOperandDTO*/
	private List<BTGIntegerLiteralOperandDTO>  btgintegerliteraloperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGIntegerLiteralOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGIntegerLiteralOperandsDTO(final List<BTGIntegerLiteralOperandDTO> btgintegerliteraloperandsList)
	{
		super();
		this.btgintegerliteraloperandsList=btgintegerliteraloperandsList;
	}
	
	
	/**
	 * @return the btgintegerliteraloperands
	 */
	@XmlElement(name = "btgintegerliteraloperand")
	public List<BTGIntegerLiteralOperandDTO> getBTGIntegerLiteralOperands()
	{
		return	btgintegerliteraloperandsList;
	}
	
	/**
	 * @param btgintegerliteraloperandsList 
	 *  the btgintegerliteraloperandsList to set   
	 */
	public void setBTGIntegerLiteralOperands(final List<BTGIntegerLiteralOperandDTO> btgintegerliteraloperandsList)
	{
		this.btgintegerliteraloperandsList=btgintegerliteraloperandsList;
	}
	
}
