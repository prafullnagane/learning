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

import de.hybris.platform.btg.dto.BTGNumberOfOrdersRelativeDateOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGNumberOfOrdersRelativeDateOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgnumberofordersrelativedateoperands")
public class BTGNumberOfOrdersRelativeDateOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGNumberOfOrdersRelativeDateOperandDTO*/
	private List<BTGNumberOfOrdersRelativeDateOperandDTO>  btgnumberofordersrelativedateoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGNumberOfOrdersRelativeDateOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGNumberOfOrdersRelativeDateOperandsDTO(final List<BTGNumberOfOrdersRelativeDateOperandDTO> btgnumberofordersrelativedateoperandsList)
	{
		super();
		this.btgnumberofordersrelativedateoperandsList=btgnumberofordersrelativedateoperandsList;
	}
	
	
	/**
	 * @return the btgnumberofordersrelativedateoperands
	 */
	@XmlElement(name = "btgnumberofordersrelativedateoperand")
	public List<BTGNumberOfOrdersRelativeDateOperandDTO> getBTGNumberOfOrdersRelativeDateOperands()
	{
		return	btgnumberofordersrelativedateoperandsList;
	}
	
	/**
	 * @param btgnumberofordersrelativedateoperandsList 
	 *  the btgnumberofordersrelativedateoperandsList to set   
	 */
	public void setBTGNumberOfOrdersRelativeDateOperands(final List<BTGNumberOfOrdersRelativeDateOperandDTO> btgnumberofordersrelativedateoperandsList)
	{
		this.btgnumberofordersrelativedateoperandsList=btgnumberofordersrelativedateoperandsList;
	}
	
}
