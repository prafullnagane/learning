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

import de.hybris.platform.btg.dto.BTGOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgoperands")
public class BTGOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGOperandDTO*/
	private List<BTGOperandDTO>  btgoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOperandsDTO(final List<BTGOperandDTO> btgoperandsList)
	{
		super();
		this.btgoperandsList=btgoperandsList;
	}
	
	
	/**
	 * @return the btgoperands
	 */
	@XmlElement(name = "btgoperand")
	public List<BTGOperandDTO> getBTGOperands()
	{
		return	btgoperandsList;
	}
	
	/**
	 * @param btgoperandsList 
	 *  the btgoperandsList to set   
	 */
	public void setBTGOperands(final List<BTGOperandDTO> btgoperandsList)
	{
		this.btgoperandsList=btgoperandsList;
	}
	
}
