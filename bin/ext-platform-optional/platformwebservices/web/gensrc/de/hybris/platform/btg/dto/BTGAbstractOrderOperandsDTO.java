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

import de.hybris.platform.btg.dto.BTGAbstractOrderOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractOrderOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractorderoperands")
public class BTGAbstractOrderOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractOrderOperandDTO*/
	private List<BTGAbstractOrderOperandDTO>  btgabstractorderoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractOrderOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractOrderOperandsDTO(final List<BTGAbstractOrderOperandDTO> btgabstractorderoperandsList)
	{
		super();
		this.btgabstractorderoperandsList=btgabstractorderoperandsList;
	}
	
	
	/**
	 * @return the btgabstractorderoperands
	 */
	@XmlElement(name = "btgabstractorderoperand")
	public List<BTGAbstractOrderOperandDTO> getBTGAbstractOrderOperands()
	{
		return	btgabstractorderoperandsList;
	}
	
	/**
	 * @param btgabstractorderoperandsList 
	 *  the btgabstractorderoperandsList to set   
	 */
	public void setBTGAbstractOrderOperands(final List<BTGAbstractOrderOperandDTO> btgabstractorderoperandsList)
	{
		this.btgabstractorderoperandsList=btgabstractorderoperandsList;
	}
	
}
