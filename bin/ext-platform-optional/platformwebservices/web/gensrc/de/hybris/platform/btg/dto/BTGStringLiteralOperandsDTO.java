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

import de.hybris.platform.btg.dto.BTGStringLiteralOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGStringLiteralOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgstringliteraloperands")
public class BTGStringLiteralOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGStringLiteralOperandDTO*/
	private List<BTGStringLiteralOperandDTO>  btgstringliteraloperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGStringLiteralOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGStringLiteralOperandsDTO(final List<BTGStringLiteralOperandDTO> btgstringliteraloperandsList)
	{
		super();
		this.btgstringliteraloperandsList=btgstringliteraloperandsList;
	}
	
	
	/**
	 * @return the btgstringliteraloperands
	 */
	@XmlElement(name = "btgstringliteraloperand")
	public List<BTGStringLiteralOperandDTO> getBTGStringLiteralOperands()
	{
		return	btgstringliteraloperandsList;
	}
	
	/**
	 * @param btgstringliteraloperandsList 
	 *  the btgstringliteraloperandsList to set   
	 */
	public void setBTGStringLiteralOperands(final List<BTGStringLiteralOperandDTO> btgstringliteraloperandsList)
	{
		this.btgstringliteraloperandsList=btgstringliteraloperandsList;
	}
	
}
