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

import de.hybris.platform.btg.dto.BTGAssignToGroupDefinitionDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGAssignToGroupDefinition first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgassigntogroupdefinitions")
public class BTGAssignToGroupDefinitionsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGAssignToGroupDefinitionDTO*/
	private List<BTGAssignToGroupDefinitionDTO>  btgassigntogroupdefinitionsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAssignToGroupDefinitionsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAssignToGroupDefinitionsDTO(final List<BTGAssignToGroupDefinitionDTO> btgassigntogroupdefinitionsList)
	{
		super();
		this.btgassigntogroupdefinitionsList=btgassigntogroupdefinitionsList;
	}
	
	
	/**
	 * @return the btgassigntogroupdefinitions
	 */
	@XmlElement(name = "btgassigntogroupdefinition")
	public List<BTGAssignToGroupDefinitionDTO> getBTGAssignToGroupDefinitions()
	{
		return	btgassigntogroupdefinitionsList;
	}
	
	/**
	 * @param btgassigntogroupdefinitionsList 
	 *  the btgassigntogroupdefinitionsList to set   
	 */
	public void setBTGAssignToGroupDefinitions(final List<BTGAssignToGroupDefinitionDTO> btgassigntogroupdefinitionsList)
	{
		this.btgassigntogroupdefinitionsList=btgassigntogroupdefinitionsList;
	}
	
}
