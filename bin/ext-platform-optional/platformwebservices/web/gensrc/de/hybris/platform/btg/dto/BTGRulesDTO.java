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

import de.hybris.platform.btg.dto.BTGRuleDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGRule first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgrules")
public class BTGRulesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGRuleDTO*/
	private List<BTGRuleDTO>  btgrulesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGRulesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGRulesDTO(final List<BTGRuleDTO> btgrulesList)
	{
		super();
		this.btgrulesList=btgrulesList;
	}
	
	
	/**
	 * @return the btgrules
	 */
	@XmlElement(name = "btgrule")
	public List<BTGRuleDTO> getBTGRules()
	{
		return	btgrulesList;
	}
	
	/**
	 * @param btgrulesList 
	 *  the btgrulesList to set   
	 */
	public void setBTGRules(final List<BTGRuleDTO> btgrulesList)
	{
		this.btgrulesList=btgrulesList;
	}
	
}
