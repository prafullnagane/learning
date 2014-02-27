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
package de.hybris.platform.europe1.dto;

import de.hybris.platform.europe1.dto.AbstractDiscountRowDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractDiscountRow first defined at extension europe1
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractdiscountrows")
public class AbstractDiscountRowsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractDiscountRowDTO*/
	private List<AbstractDiscountRowDTO>  abstractdiscountrowsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractDiscountRowsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractDiscountRowsDTO(final List<AbstractDiscountRowDTO> abstractdiscountrowsList)
	{
		super();
		this.abstractdiscountrowsList=abstractdiscountrowsList;
	}
	
	
	/**
	 * @return the abstractdiscountrows
	 */
	@XmlElement(name = "abstractdiscountrow")
	public List<AbstractDiscountRowDTO> getAbstractDiscountRows()
	{
		return	abstractdiscountrowsList;
	}
	
	/**
	 * @param abstractdiscountrowsList 
	 *  the abstractdiscountrowsList to set   
	 */
	public void setAbstractDiscountRows(final List<AbstractDiscountRowDTO> abstractdiscountrowsList)
	{
		this.abstractdiscountrowsList=abstractdiscountrowsList;
	}
	
}
