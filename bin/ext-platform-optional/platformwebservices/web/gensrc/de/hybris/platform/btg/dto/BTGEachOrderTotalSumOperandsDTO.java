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

import de.hybris.platform.btg.dto.BTGEachOrderTotalSumOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGEachOrderTotalSumOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgeachordertotalsumoperands")
public class BTGEachOrderTotalSumOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGEachOrderTotalSumOperandDTO*/
	private List<BTGEachOrderTotalSumOperandDTO>  btgeachordertotalsumoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGEachOrderTotalSumOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGEachOrderTotalSumOperandsDTO(final List<BTGEachOrderTotalSumOperandDTO> btgeachordertotalsumoperandsList)
	{
		super();
		this.btgeachordertotalsumoperandsList=btgeachordertotalsumoperandsList;
	}
	
	
	/**
	 * @return the btgeachordertotalsumoperands
	 */
	@XmlElement(name = "btgeachordertotalsumoperand")
	public List<BTGEachOrderTotalSumOperandDTO> getBTGEachOrderTotalSumOperands()
	{
		return	btgeachordertotalsumoperandsList;
	}
	
	/**
	 * @param btgeachordertotalsumoperandsList 
	 *  the btgeachordertotalsumoperandsList to set   
	 */
	public void setBTGEachOrderTotalSumOperands(final List<BTGEachOrderTotalSumOperandDTO> btgeachordertotalsumoperandsList)
	{
		this.btgeachordertotalsumoperandsList=btgeachordertotalsumoperandsList;
	}
	
}
