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
package de.hybris.platform.cockpit.reports.dto;

import de.hybris.platform.cockpit.reports.dto.JasperWidgetPreferencesDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type JasperWidgetPreferences first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "jasperwidgetpreferenceses")
public class JasperWidgetPreferencesesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>JasperWidgetPreferencesDTO*/
	private List<JasperWidgetPreferencesDTO>  jasperwidgetpreferencesesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperWidgetPreferencesesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperWidgetPreferencesesDTO(final List<JasperWidgetPreferencesDTO> jasperwidgetpreferencesesList)
	{
		super();
		this.jasperwidgetpreferencesesList=jasperwidgetpreferencesesList;
	}
	
	
	/**
	 * @return the jasperwidgetpreferenceses
	 */
	@XmlElement(name = "jasperwidgetpreferences")
	public List<JasperWidgetPreferencesDTO> getJasperWidgetPreferenceses()
	{
		return	jasperwidgetpreferencesesList;
	}
	
	/**
	 * @param jasperwidgetpreferencesesList 
	 *  the jasperwidgetpreferencesesList to set   
	 */
	public void setJasperWidgetPreferenceses(final List<JasperWidgetPreferencesDTO> jasperwidgetpreferencesesList)
	{
		this.jasperwidgetpreferencesesList=jasperwidgetpreferencesesList;
	}
	
}
