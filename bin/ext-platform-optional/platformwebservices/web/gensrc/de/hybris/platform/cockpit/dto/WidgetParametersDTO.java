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

import de.hybris.platform.cockpit.dto.WidgetParameterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type WidgetParameter first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "widgetparameters")
public class WidgetParametersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>WidgetParameterDTO*/
	private List<WidgetParameterDTO>  widgetparametersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetParametersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WidgetParametersDTO(final List<WidgetParameterDTO> widgetparametersList)
	{
		super();
		this.widgetparametersList=widgetparametersList;
	}
	
	
	/**
	 * @return the widgetparameters
	 */
	@XmlElement(name = "widgetparameter")
	public List<WidgetParameterDTO> getWidgetParameters()
	{
		return	widgetparametersList;
	}
	
	/**
	 * @param widgetparametersList 
	 *  the widgetparametersList to set   
	 */
	public void setWidgetParameters(final List<WidgetParameterDTO> widgetparametersList)
	{
		this.widgetparametersList=widgetparametersList;
	}
	
}
