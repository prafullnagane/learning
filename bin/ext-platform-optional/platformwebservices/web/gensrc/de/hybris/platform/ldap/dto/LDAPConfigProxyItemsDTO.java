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
package de.hybris.platform.ldap.dto;

import de.hybris.platform.ldap.dto.LDAPConfigProxyItemDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LDAPConfigProxyItem first defined at extension ldap
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ldapconfigproxyitems")
public class LDAPConfigProxyItemsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LDAPConfigProxyItemDTO*/
	private List<LDAPConfigProxyItemDTO>  ldapconfigproxyitemsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDAPConfigProxyItemsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDAPConfigProxyItemsDTO(final List<LDAPConfigProxyItemDTO> ldapconfigproxyitemsList)
	{
		super();
		this.ldapconfigproxyitemsList=ldapconfigproxyitemsList;
	}
	
	
	/**
	 * @return the ldapconfigproxyitems
	 */
	@XmlElement(name = "ldapconfigproxyitem")
	public List<LDAPConfigProxyItemDTO> getLDAPConfigProxyItems()
	{
		return	ldapconfigproxyitemsList;
	}
	
	/**
	 * @param ldapconfigproxyitemsList 
	 *  the ldapconfigproxyitemsList to set   
	 */
	public void setLDAPConfigProxyItems(final List<LDAPConfigProxyItemDTO> ldapconfigproxyitemsList)
	{
		this.ldapconfigproxyitemsList=ldapconfigproxyitemsList;
	}
	
}
