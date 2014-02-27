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

import de.hybris.platform.btg.dto.BTGReferenceDateOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceDateOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferencedateoperands")
public class BTGReferenceDateOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceDateOperandDTO*/
	private List<BTGReferenceDateOperandDTO>  btgreferencedateoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceDateOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceDateOperandsDTO(final List<BTGReferenceDateOperandDTO> btgreferencedateoperandsList)
	{
		super();
		this.btgreferencedateoperandsList=btgreferencedateoperandsList;
	}
	
	
	/**
	 * @return the btgreferencedateoperands
	 */
	@XmlElement(name = "btgreferencedateoperand")
	public List<BTGReferenceDateOperandDTO> getBTGReferenceDateOperands()
	{
		return	btgreferencedateoperandsList;
	}
	
	/**
	 * @param btgreferencedateoperandsList 
	 *  the btgreferencedateoperandsList to set   
	 */
	public void setBTGReferenceDateOperands(final List<BTGReferenceDateOperandDTO> btgreferencedateoperandsList)
	{
		this.btgreferencedateoperandsList=btgreferencedateoperandsList;
	}
	
}
