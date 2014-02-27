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

import de.hybris.platform.cockpit.dto.WidgetPreferencesDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WidgetPreferences first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "widgetpreferenceses")
public class WidgetPreferencesesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WidgetPreferencesDTO*/
	private List<WidgetPreferencesDTO>  widgetpreferencesesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetPreferencesesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetPreferencesesDTO(final List<WidgetPreferencesDTO> widgetpreferencesesList)
	{
		super();
		this.widgetpreferencesesList=widgetpreferencesesList;
	}
	
	
	/**
	 * @return the widgetpreferenceses
	 */
	@XmlElement(name = "widgetpreferences")
	public List<WidgetPreferencesDTO> getWidgetPreferenceses()
	{
		return	widgetpreferencesesList;
	}
	
	/**
	 * @param widgetpreferencesesList 
	 *  the widgetpreferencesesList to set   
	 */
	public void setWidgetPreferenceses(final List<WidgetPreferencesDTO> widgetpreferencesesList)
	{
		this.widgetpreferencesesList=widgetpreferencesesList;
	}
	
}
