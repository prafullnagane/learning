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

import de.hybris.platform.btg.dto.BTGUserCountryOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGUserCountryOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgusercountryoperands")
public class BTGUserCountryOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGUserCountryOperandDTO*/
	private List<BTGUserCountryOperandDTO>  btgusercountryoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGUserCountryOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGUserCountryOperandsDTO(final List<BTGUserCountryOperandDTO> btgusercountryoperandsList)
	{
		super();
		this.btgusercountryoperandsList=btgusercountryoperandsList;
	}
	
	
	/**
	 * @return the btgusercountryoperands
	 */
	@XmlElement(name = "btgusercountryoperand")
	public List<BTGUserCountryOperandDTO> getBTGUserCountryOperands()
	{
		return	btgusercountryoperandsList;
	}
	
	/**
	 * @param btgusercountryoperandsList 
	 *  the btgusercountryoperandsList to set   
	 */
	public void setBTGUserCountryOperands(final List<BTGUserCountryOperandDTO> btgusercountryoperandsList)
	{
		this.btgusercountryoperandsList=btgusercountryoperandsList;
	}
	
}