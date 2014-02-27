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

import de.hybris.platform.btg.dto.BTGMediaScriptOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGMediaScriptOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgmediascriptoperands")
public class BTGMediaScriptOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGMediaScriptOperandDTO*/
	private List<BTGMediaScriptOperandDTO>  btgmediascriptoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGMediaScriptOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGMediaScriptOperandsDTO(final List<BTGMediaScriptOperandDTO> btgmediascriptoperandsList)
	{
		super();
		this.btgmediascriptoperandsList=btgmediascriptoperandsList;
	}
	
	
	/**
	 * @return the btgmediascriptoperands
	 */
	@XmlElement(name = "btgmediascriptoperand")
	public List<BTGMediaScriptOperandDTO> getBTGMediaScriptOperands()
	{
		return	btgmediascriptoperandsList;
	}
	
	/**
	 * @param btgmediascriptoperandsList 
	 *  the btgmediascriptoperandsList to set   
	 */
	public void setBTGMediaScriptOperands(final List<BTGMediaScriptOperandDTO> btgmediascriptoperandsList)
	{
		this.btgmediascriptoperandsList=btgmediascriptoperandsList;
	}
	
}
