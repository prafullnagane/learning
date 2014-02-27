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

import de.hybris.platform.commons.dto.FormatterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type Formatter first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "formatters")
public class FormattersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>FormatterDTO*/
	private List<FormatterDTO>  formattersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FormattersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FormattersDTO(final List<FormatterDTO> formattersList)
	{
		super();
		this.formattersList=formattersList;
	}
	
	
	/**
	 * @return the formatters
	 */
	@XmlElement(name = "formatter")
	public List<FormatterDTO> getFormatters()
	{
		return	formattersList;
	}
	
	/**
	 * @param formattersList 
	 *  the formattersList to set   
	 */
	public void setFormatters(final List<FormatterDTO> formattersList)
	{
		this.formattersList=formattersList;
	}
	
}
