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

import de.hybris.platform.commons.dto.XMLTransformFormatterDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type XMLTransformFormatter first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "xmltransformformatters")
public class XMLTransformFormattersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>XMLTransformFormatterDTO*/
	private List<XMLTransformFormatterDTO>  xmltransformformattersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public XMLTransformFormattersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public XMLTransformFormattersDTO(final List<XMLTransformFormatterDTO> xmltransformformattersList)
	{
		super();
		this.xmltransformformattersList=xmltransformformattersList;
	}
	
	
	/**
	 * @return the xmltransformformatters
	 */
	@XmlElement(name = "xmltransformformatter")
	public List<XMLTransformFormatterDTO> getXMLTransformFormatters()
	{
		return	xmltransformformattersList;
	}
	
	/**
	 * @param xmltransformformattersList 
	 *  the xmltransformformattersList to set   
	 */
	public void setXMLTransformFormatters(final List<XMLTransformFormatterDTO> xmltransformformattersList)
	{
		this.xmltransformformattersList=xmltransformformattersList;
	}
	
}
