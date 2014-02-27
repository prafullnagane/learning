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
package de.hybris.platform.commons.dto;

import de.hybris.platform.commons.dto.CustomOrder2XMLDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CustomOrder2XML first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "customorder2xmls")
public class CustomOrder2XMLsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CustomOrder2XMLDTO*/
	private List<CustomOrder2XMLDTO>  customorder2xmlsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomOrder2XMLsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomOrder2XMLsDTO(final List<CustomOrder2XMLDTO> customorder2xmlsList)
	{
		super();
		this.customorder2xmlsList=customorder2xmlsList;
	}
	
	
	/**
	 * @return the customorder2xmls
	 */
	@XmlElement(name = "customorder2xml")
	public List<CustomOrder2XMLDTO> getCustomOrder2XMLs()
	{
		return	customorder2xmlsList;
	}
	
	/**
	 * @param customorder2xmlsList 
	 *  the customorder2xmlsList to set   
	 */
	public void setCustomOrder2XMLs(final List<CustomOrder2XMLDTO> customorder2xmlsList)
	{
		this.customorder2xmlsList=customorder2xmlsList;
	}
	
}
