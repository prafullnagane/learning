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

import de.hybris.platform.btg.dto.BTGReferenceContentpagesOperandDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGReferenceContentpagesOperand first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgreferencecontentpagesoperands")
public class BTGReferenceContentpagesOperandsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGReferenceContentpagesOperandDTO*/
	private List<BTGReferenceContentpagesOperandDTO>  btgreferencecontentpagesoperandsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceContentpagesOperandsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGReferenceContentpagesOperandsDTO(final List<BTGReferenceContentpagesOperandDTO> btgreferencecontentpagesoperandsList)
	{
		super();
		this.btgreferencecontentpagesoperandsList=btgreferencecontentpagesoperandsList;
	}
	
	
	/**
	 * @return the btgreferencecontentpagesoperands
	 */
	@XmlElement(name = "btgreferencecontentpagesoperand")
	public List<BTGReferenceContentpagesOperandDTO> getBTGReferenceContentpagesOperands()
	{
		return	btgreferencecontentpagesoperandsList;
	}
	
	/**
	 * @param btgreferencecontentpagesoperandsList 
	 *  the btgreferencecontentpagesoperandsList to set   
	 */
	public void setBTGReferenceContentpagesOperands(final List<BTGReferenceContentpagesOperandDTO> btgreferencecontentpagesoperandsList)
	{
		this.btgreferencecontentpagesoperandsList=btgreferencecontentpagesoperandsList;
	}
	
}
