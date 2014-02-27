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

import de.hybris.platform.btg.dto.BTGAbstractScriptOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAbstractScriptOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgabstractscriptoperands")
public class BTGAbstractScriptOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAbstractScriptOperandDTO*/
	private List<BTGAbstractScriptOperandDTO>  btgabstractscriptoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractScriptOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractScriptOperandsDTO(final List<BTGAbstractScriptOperandDTO> btgabstractscriptoperandsList)
	{
		super();
		this.btgabstractscriptoperandsList=btgabstractscriptoperandsList;
	}
	
	
	/**
	 * @return the btgabstractscriptoperands
	 */
	@XmlElement(name = "btgabstractscriptoperand")
	public List<BTGAbstractScriptOperandDTO> getBTGAbstractScriptOperands()
	{
		return	btgabstractscriptoperandsList;
	}
	
	/**
	 * @param btgabstractscriptoperandsList 
	 *  the btgabstractscriptoperandsList to set   
	 */
	public void setBTGAbstractScriptOperands(final List<BTGAbstractScriptOperandDTO> btgabstractscriptoperandsList)
	{
		this.btgabstractscriptoperandsList=btgabstractscriptoperandsList;
	}
	
}