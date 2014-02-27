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

import de.hybris.platform.btg.dto.BTGAbstractLiteralOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractLiteralOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractliteraloperands")
public class BTGAbstractLiteralOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractLiteralOperandDTO*/
	private List<BTGAbstractLiteralOperandDTO>  btgabstractliteraloperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractLiteralOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractLiteralOperandsDTO(final List<BTGAbstractLiteralOperandDTO> btgabstractliteraloperandsList)
	{
		super();
		this.btgabstractliteraloperandsList=btgabstractliteraloperandsList;
	}
	
	
	/**
	 * @return the btgabstractliteraloperands
	 */
	@XmlElement(name = "btgabstractliteraloperand")
	public List<BTGAbstractLiteralOperandDTO> getBTGAbstractLiteralOperands()
	{
		return	btgabstractliteraloperandsList;
	}
	
	/**
	 * @param btgabstractliteraloperandsList 
	 *  the btgabstractliteraloperandsList to set   
	 */
	public void setBTGAbstractLiteralOperands(final List<BTGAbstractLiteralOperandDTO> btgabstractliteraloperandsList)
	{
		this.btgabstractliteraloperandsList=btgabstractliteraloperandsList;
	}
	
}
