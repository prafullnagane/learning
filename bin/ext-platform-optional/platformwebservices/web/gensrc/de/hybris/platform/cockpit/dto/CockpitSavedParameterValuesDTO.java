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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.CockpitSavedParameterValueDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitSavedParameterValue first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitsavedparametervalues")
public class CockpitSavedParameterValuesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitSavedParameterValueDTO*/
	private List<CockpitSavedParameterValueDTO>  cockpitsavedparametervaluesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedParameterValuesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedParameterValuesDTO(final List<CockpitSavedParameterValueDTO> cockpitsavedparametervaluesList)
	{
		super();
		this.cockpitsavedparametervaluesList=cockpitsavedparametervaluesList;
	}
	
	
	/**
	 * @return the cockpitsavedparametervalues
	 */
	@XmlElement(name = "cockpitsavedparametervalue")
	public List<CockpitSavedParameterValueDTO> getCockpitSavedParameterValues()
	{
		return	cockpitsavedparametervaluesList;
	}
	
	/**
	 * @param cockpitsavedparametervaluesList 
	 *  the cockpitsavedparametervaluesList to set   
	 */
	public void setCockpitSavedParameterValues(final List<CockpitSavedParameterValueDTO> cockpitsavedparametervaluesList)
	{
		this.cockpitsavedparametervaluesList=cockpitsavedparametervaluesList;
	}
	
}
