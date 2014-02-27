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

import de.hybris.platform.btg.dto.BTGDoubleLiteralOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGDoubleLiteralOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgdoubleliteraloperands")
public class BTGDoubleLiteralOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGDoubleLiteralOperandDTO*/
	private List<BTGDoubleLiteralOperandDTO>  btgdoubleliteraloperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGDoubleLiteralOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGDoubleLiteralOperandsDTO(final List<BTGDoubleLiteralOperandDTO> btgdoubleliteraloperandsList)
	{
		super();
		this.btgdoubleliteraloperandsList=btgdoubleliteraloperandsList;
	}
	
	
	/**
	 * @return the btgdoubleliteraloperands
	 */
	@XmlElement(name = "btgdoubleliteraloperand")
	public List<BTGDoubleLiteralOperandDTO> getBTGDoubleLiteralOperands()
	{
		return	btgdoubleliteraloperandsList;
	}
	
	/**
	 * @param btgdoubleliteraloperandsList 
	 *  the btgdoubleliteraloperandsList to set   
	 */
	public void setBTGDoubleLiteralOperands(final List<BTGDoubleLiteralOperandDTO> btgdoubleliteraloperandsList)
	{
		this.btgdoubleliteraloperandsList=btgdoubleliteraloperandsList;
	}
	
}
