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

import de.hybris.platform.btg.dto.BTGOutputActionDefinitionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGOutputActionDefinition first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgoutputactiondefinitions")
public class BTGOutputActionDefinitionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGOutputActionDefinitionDTO*/
	private List<BTGOutputActionDefinitionDTO>  btgoutputactiondefinitionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOutputActionDefinitionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGOutputActionDefinitionsDTO(final List<BTGOutputActionDefinitionDTO> btgoutputactiondefinitionsList)
	{
		super();
		this.btgoutputactiondefinitionsList=btgoutputactiondefinitionsList;
	}
	
	
	/**
	 * @return the btgoutputactiondefinitions
	 */
	@XmlElement(name = "btgoutputactiondefinition")
	public List<BTGOutputActionDefinitionDTO> getBTGOutputActionDefinitions()
	{
		return	btgoutputactiondefinitionsList;
	}
	
	/**
	 * @param btgoutputactiondefinitionsList 
	 *  the btgoutputactiondefinitionsList to set   
	 */
	public void setBTGOutputActionDefinitions(final List<BTGOutputActionDefinitionDTO> btgoutputactiondefinitionsList)
	{
		this.btgoutputactiondefinitionsList=btgoutputactiondefinitionsList;
	}
	
}
