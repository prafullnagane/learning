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
package de.hybris.platform.core.dto.c2l;

import de.hybris.platform.core.dto.c2l.C2LItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type C2LItem first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "c2litems")
public class C2LItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>C2LItemDTO*/
	private List<C2LItemDTO>  c2litemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public C2LItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public C2LItemsDTO(final List<C2LItemDTO> c2litemsList)
	{
		super();
		this.c2litemsList=c2litemsList;
	}
	
	
	/**
	 * @return the c2litems
	 */
	@XmlElement(name = "c2litem")
	public List<C2LItemDTO> getC2LItems()
	{
		return	c2litemsList;
	}
	
	/**
	 * @param c2litemsList 
	 *  the c2litemsList to set   
	 */
	public void setC2LItems(final List<C2LItemDTO> c2litemsList)
	{
		this.c2litemsList=c2litemsList;
	}
	
}
