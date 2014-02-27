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
package de.hybris.platform.ticket.dto;

import de.hybris.platform.ticket.dto.CsAgentGroupDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CsAgentGroup first defined at extension ticketsystem
 */
@SuppressWarnings("all")
@XmlRootElement(name = "csagentgroups")
public class CsAgentGroupsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CsAgentGroupDTO*/
	private List<CsAgentGroupDTO>  csagentgroupsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsAgentGroupsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CsAgentGroupsDTO(final List<CsAgentGroupDTO> csagentgroupsList)
	{
		super();
		this.csagentgroupsList=csagentgroupsList;
	}
	
	
	/**
	 * @return the csagentgroups
	 */
	@XmlElement(name = "csagentgroup")
	public List<CsAgentGroupDTO> getCsAgentGroups()
	{
		return	csagentgroupsList;
	}
	
	/**
	 * @param csagentgroupsList 
	 *  the csagentgroupsList to set   
	 */
	public void setCsAgentGroups(final List<CsAgentGroupDTO> csagentgroupsList)
	{
		this.csagentgroupsList=csagentgroupsList;
	}
	
}
