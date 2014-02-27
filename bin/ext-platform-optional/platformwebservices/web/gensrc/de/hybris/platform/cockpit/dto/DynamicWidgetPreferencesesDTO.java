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

import de.hybris.platform.cockpit.dto.DynamicWidgetPreferencesDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DynamicWidgetPreferences first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "dynamicwidgetpreferenceses")
public class DynamicWidgetPreferencesesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DynamicWidgetPreferencesDTO*/
	private List<DynamicWidgetPreferencesDTO>  dynamicwidgetpreferencesesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicWidgetPreferencesesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DynamicWidgetPreferencesesDTO(final List<DynamicWidgetPreferencesDTO> dynamicwidgetpreferencesesList)
	{
		super();
		this.dynamicwidgetpreferencesesList=dynamicwidgetpreferencesesList;
	}
	
	
	/**
	 * @return the dynamicwidgetpreferenceses
	 */
	@XmlElement(name = "dynamicwidgetpreferences")
	public List<DynamicWidgetPreferencesDTO> getDynamicWidgetPreferenceses()
	{
		return	dynamicwidgetpreferencesesList;
	}
	
	/**
	 * @param dynamicwidgetpreferencesesList 
	 *  the dynamicwidgetpreferencesesList to set   
	 */
	public void setDynamicWidgetPreferenceses(final List<DynamicWidgetPreferencesDTO> dynamicwidgetpreferencesesList)
	{
		this.dynamicwidgetpreferencesesList=dynamicwidgetpreferencesesList;
	}
	
}
