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

import de.hybris.platform.btg.dto.BTGLastOrderDateOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGLastOrderDateOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btglastorderdateoperands")
public class BTGLastOrderDateOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGLastOrderDateOperandDTO*/
	private List<BTGLastOrderDateOperandDTO>  btglastorderdateoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrderDateOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGLastOrderDateOperandsDTO(final List<BTGLastOrderDateOperandDTO> btglastorderdateoperandsList)
	{
		super();
		this.btglastorderdateoperandsList=btglastorderdateoperandsList;
	}
	
	
	/**
	 * @return the btglastorderdateoperands
	 */
	@XmlElement(name = "btglastorderdateoperand")
	public List<BTGLastOrderDateOperandDTO> getBTGLastOrderDateOperands()
	{
		return	btglastorderdateoperandsList;
	}
	
	/**
	 * @param btglastorderdateoperandsList 
	 *  the btglastorderdateoperandsList to set   
	 */
	public void setBTGLastOrderDateOperands(final List<BTGLastOrderDateOperandDTO> btglastorderdateoperandsList)
	{
		this.btglastorderdateoperandsList=btglastorderdateoperandsList;
	}
	
}
