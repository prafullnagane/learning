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
package de.hybris.platform.core.dto.enumeration;

import de.hybris.platform.core.dto.enumeration.EnumerationValueDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type EnumerationValue first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "enumerationvalues")
public class EnumerationValuesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>EnumerationValueDTO*/
	private List<EnumerationValueDTO>  enumerationvaluesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EnumerationValuesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public EnumerationValuesDTO(final List<EnumerationValueDTO> enumerationvaluesList)
	{
		super();
		this.enumerationvaluesList=enumerationvaluesList;
	}
	
	
	/**
	 * @return the enumerationvalues
	 */
	@XmlElement(name = "enumerationvalue")
	public List<EnumerationValueDTO> getEnumerationValues()
	{
		return	enumerationvaluesList;
	}
	
	/**
	 * @param enumerationvaluesList 
	 *  the enumerationvaluesList to set   
	 */
	public void setEnumerationValues(final List<EnumerationValueDTO> enumerationvaluesList)
	{
		this.enumerationvaluesList=enumerationvaluesList;
	}
	
}
