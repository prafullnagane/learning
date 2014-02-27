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
package de.hybris.platform.core.dto.security;

import de.hybris.platform.core.dto.security.PrincipalGroupDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PrincipalGroup first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "principalgroups")
public class PrincipalGroupsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PrincipalGroupDTO*/
	private List<PrincipalGroupDTO>  principalgroupsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PrincipalGroupsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PrincipalGroupsDTO(final List<PrincipalGroupDTO> principalgroupsList)
	{
		super();
		this.principalgroupsList=principalgroupsList;
	}
	
	
	/**
	 * @return the principalgroups
	 */
	@XmlElement(name = "principalgroup")
	public List<PrincipalGroupDTO> getPrincipalGroups()
	{
		return	principalgroupsList;
	}
	
	/**
	 * @param principalgroupsList 
	 *  the principalgroupsList to set   
	 */
	public void setPrincipalGroups(final List<PrincipalGroupDTO> principalgroupsList)
	{
		this.principalgroupsList=principalgroupsList;
	}
	
}
