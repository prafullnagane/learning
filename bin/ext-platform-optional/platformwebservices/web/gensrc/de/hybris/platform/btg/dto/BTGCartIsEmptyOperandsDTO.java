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

import de.hybris.platform.btg.dto.BTGCartIsEmptyOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGCartIsEmptyOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgcartisemptyoperands")
public class BTGCartIsEmptyOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGCartIsEmptyOperandDTO*/
	private List<BTGCartIsEmptyOperandDTO>  btgcartisemptyoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCartIsEmptyOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCartIsEmptyOperandsDTO(final List<BTGCartIsEmptyOperandDTO> btgcartisemptyoperandsList)
	{
		super();
		this.btgcartisemptyoperandsList=btgcartisemptyoperandsList;
	}
	
	
	/**
	 * @return the btgcartisemptyoperands
	 */
	@XmlElement(name = "btgcartisemptyoperand")
	public List<BTGCartIsEmptyOperandDTO> getBTGCartIsEmptyOperands()
	{
		return	btgcartisemptyoperandsList;
	}
	
	/**
	 * @param btgcartisemptyoperandsList 
	 *  the btgcartisemptyoperandsList to set   
	 */
	public void setBTGCartIsEmptyOperands(final List<BTGCartIsEmptyOperandDTO> btgcartisemptyoperandsList)
	{
		this.btgcartisemptyoperandsList=btgcartisemptyoperandsList;
	}
	
}
