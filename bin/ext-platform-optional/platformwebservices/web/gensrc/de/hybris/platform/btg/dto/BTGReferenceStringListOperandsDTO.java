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

import de.hybris.platform.btg.dto.BTGReferenceStringListOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceStringListOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferencestringlistoperands")
public class BTGReferenceStringListOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceStringListOperandDTO*/
	private List<BTGReferenceStringListOperandDTO>  btgreferencestringlistoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceStringListOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceStringListOperandsDTO(final List<BTGReferenceStringListOperandDTO> btgreferencestringlistoperandsList)
	{
		super();
		this.btgreferencestringlistoperandsList=btgreferencestringlistoperandsList;
	}
	
	
	/**
	 * @return the btgreferencestringlistoperands
	 */
	@XmlElement(name = "btgreferencestringlistoperand")
	public List<BTGReferenceStringListOperandDTO> getBTGReferenceStringListOperands()
	{
		return	btgreferencestringlistoperandsList;
	}
	
	/**
	 * @param btgreferencestringlistoperandsList 
	 *  the btgreferencestringlistoperandsList to set   
	 */
	public void setBTGReferenceStringListOperands(final List<BTGReferenceStringListOperandDTO> btgreferencestringlistoperandsList)
	{
		this.btgreferencestringlistoperandsList=btgreferencestringlistoperandsList;
	}
	
}
