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
package de.hybris.platform.commons.dto.translator;

import de.hybris.platform.commons.dto.translator.ParserPropertyDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ParserProperty first defined at extension commons
 */
@SuppressWarnings("all")
@XmlRootElement(name = "parserproperties")
public class ParserPropertiesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ParserPropertyDTO*/
	private List<ParserPropertyDTO>  parserpropertiesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ParserPropertiesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ParserPropertiesDTO(final List<ParserPropertyDTO> parserpropertiesList)
	{
		super();
		this.parserpropertiesList=parserpropertiesList;
	}
	
	
	/**
	 * @return the parserproperties
	 */
	@XmlElement(name = "parserproperty")
	public List<ParserPropertyDTO> getParserProperties()
	{
		return	parserpropertiesList;
	}
	
	/**
	 * @param parserpropertiesList 
	 *  the parserpropertiesList to set   
	 */
	public void setParserProperties(final List<ParserPropertyDTO> parserpropertiesList)
	{
		this.parserpropertiesList=parserpropertiesList;
	}
	
}
