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
package de.hybris.platform.core.dto.product;

import de.hybris.platform.core.dto.product.UnitDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Unit first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "units")
public class UnitsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>UnitDTO*/
	private List<UnitDTO>  unitsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UnitsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UnitsDTO(final List<UnitDTO> unitsList)
	{
		super();
		this.unitsList=unitsList;
	}
	
	
	/**
	 * @return the units
	 */
	@XmlElement(name = "unit")
	public List<UnitDTO> getUnits()
	{
		return	unitsList;
	}
	
	/**
	 * @param unitsList 
	 *  the unitsList to set   
	 */
	public void setUnits(final List<UnitDTO> unitsList)
	{
		this.unitsList=unitsList;
	}
	
}
