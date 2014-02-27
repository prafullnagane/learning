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

import de.hybris.platform.btg.dto.BTGReferenceRegExpListOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceRegExpListOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferenceregexplistoperands")
public class BTGReferenceRegExpListOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceRegExpListOperandDTO*/
	private List<BTGReferenceRegExpListOperandDTO>  btgreferenceregexplistoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceRegExpListOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceRegExpListOperandsDTO(final List<BTGReferenceRegExpListOperandDTO> btgreferenceregexplistoperandsList)
	{
		super();
		this.btgreferenceregexplistoperandsList=btgreferenceregexplistoperandsList;
	}
	
	
	/**
	 * @return the btgreferenceregexplistoperands
	 */
	@XmlElement(name = "btgreferenceregexplistoperand")
	public List<BTGReferenceRegExpListOperandDTO> getBTGReferenceRegExpListOperands()
	{
		return	btgreferenceregexplistoperandsList;
	}
	
	/**
	 * @param btgreferenceregexplistoperandsList 
	 *  the btgreferenceregexplistoperandsList to set   
	 */
	public void setBTGReferenceRegExpListOperands(final List<BTGReferenceRegExpListOperandDTO> btgreferenceregexplistoperandsList)
	{
		this.btgreferenceregexplistoperandsList=btgreferenceregexplistoperandsList;
	}
	
}
