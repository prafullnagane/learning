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

import de.hybris.platform.btg.dto.BtgJasperWidgetPreferencesDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BtgJasperWidgetPreferences first defined at extension btgcockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgjasperwidgetpreferenceses")
public class BtgJasperWidgetPreferencesesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BtgJasperWidgetPreferencesDTO*/
	private List<BtgJasperWidgetPreferencesDTO>  btgjasperwidgetpreferencesesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BtgJasperWidgetPreferencesesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BtgJasperWidgetPreferencesesDTO(final List<BtgJasperWidgetPreferencesDTO> btgjasperwidgetpreferencesesList)
	{
		super();
		this.btgjasperwidgetpreferencesesList=btgjasperwidgetpreferencesesList;
	}
	
	
	/**
	 * @return the btgjasperwidgetpreferenceses
	 */
	@XmlElement(name = "btgjasperwidgetpreferences")
	public List<BtgJasperWidgetPreferencesDTO> getBtgJasperWidgetPreferenceses()
	{
		return	btgjasperwidgetpreferencesesList;
	}
	
	/**
	 * @param btgjasperwidgetpreferencesesList 
	 *  the btgjasperwidgetpreferencesesList to set   
	 */
	public void setBtgJasperWidgetPreferenceses(final List<BtgJasperWidgetPreferencesDTO> btgjasperwidgetpreferencesesList)
	{
		this.btgjasperwidgetpreferencesesList=btgjasperwidgetpreferencesesList;
	}
	
}
