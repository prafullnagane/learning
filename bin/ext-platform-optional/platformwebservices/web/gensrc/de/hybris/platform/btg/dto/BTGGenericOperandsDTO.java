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

import de.hybris.platform.btg.dto.BTGGenericOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGGenericOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btggenericoperands")
public class BTGGenericOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGGenericOperandDTO*/
	private List<BTGGenericOperandDTO>  btggenericoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGGenericOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGGenericOperandsDTO(final List<BTGGenericOperandDTO> btggenericoperandsList)
	{
		super();
		this.btggenericoperandsList=btggenericoperandsList;
	}
	
	
	/**
	 * @return the btggenericoperands
	 */
	@XmlElement(name = "btggenericoperand")
	public List<BTGGenericOperandDTO> getBTGGenericOperands()
	{
		return	btggenericoperandsList;
	}
	
	/**
	 * @param btggenericoperandsList 
	 *  the btggenericoperandsList to set   
	 */
	public void setBTGGenericOperands(final List<BTGGenericOperandDTO> btggenericoperandsList)
	{
		this.btggenericoperandsList=btggenericoperandsList;
	}
	
}
