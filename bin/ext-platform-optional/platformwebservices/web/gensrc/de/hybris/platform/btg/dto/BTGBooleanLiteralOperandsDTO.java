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

import de.hybris.platform.btg.dto.BTGBooleanLiteralOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGBooleanLiteralOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgbooleanliteraloperands")
public class BTGBooleanLiteralOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGBooleanLiteralOperandDTO*/
	private List<BTGBooleanLiteralOperandDTO>  btgbooleanliteraloperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGBooleanLiteralOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGBooleanLiteralOperandsDTO(final List<BTGBooleanLiteralOperandDTO> btgbooleanliteraloperandsList)
	{
		super();
		this.btgbooleanliteraloperandsList=btgbooleanliteraloperandsList;
	}
	
	
	/**
	 * @return the btgbooleanliteraloperands
	 */
	@XmlElement(name = "btgbooleanliteraloperand")
	public List<BTGBooleanLiteralOperandDTO> getBTGBooleanLiteralOperands()
	{
		return	btgbooleanliteraloperandsList;
	}
	
	/**
	 * @param btgbooleanliteraloperandsList 
	 *  the btgbooleanliteraloperandsList to set   
	 */
	public void setBTGBooleanLiteralOperands(final List<BTGBooleanLiteralOperandDTO> btgbooleanliteraloperandsList)
	{
		this.btgbooleanliteraloperandsList=btgbooleanliteraloperandsList;
	}
	
}
