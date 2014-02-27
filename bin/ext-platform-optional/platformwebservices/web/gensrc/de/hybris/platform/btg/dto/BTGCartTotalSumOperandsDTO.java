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

import de.hybris.platform.btg.dto.BTGCartTotalSumOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGCartTotalSumOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgcarttotalsumoperands")
public class BTGCartTotalSumOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGCartTotalSumOperandDTO*/
	private List<BTGCartTotalSumOperandDTO>  btgcarttotalsumoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCartTotalSumOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGCartTotalSumOperandsDTO(final List<BTGCartTotalSumOperandDTO> btgcarttotalsumoperandsList)
	{
		super();
		this.btgcarttotalsumoperandsList=btgcarttotalsumoperandsList;
	}
	
	
	/**
	 * @return the btgcarttotalsumoperands
	 */
	@XmlElement(name = "btgcarttotalsumoperand")
	public List<BTGCartTotalSumOperandDTO> getBTGCartTotalSumOperands()
	{
		return	btgcarttotalsumoperandsList;
	}
	
	/**
	 * @param btgcarttotalsumoperandsList 
	 *  the btgcarttotalsumoperandsList to set   
	 */
	public void setBTGCartTotalSumOperands(final List<BTGCartTotalSumOperandDTO> btgcarttotalsumoperandsList)
	{
		this.btgcarttotalsumoperandsList=btgcarttotalsumoperandsList;
	}
	
}
