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
package de.hybris.platform.deeplink.dto.rules;

import de.hybris.platform.deeplink.dto.rules.DeeplinkUrlRuleDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type DeeplinkUrlRule first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "deeplinkurlrules")
public class DeeplinkUrlRulesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>DeeplinkUrlRuleDTO*/
	private List<DeeplinkUrlRuleDTO>  deeplinkurlrulesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeeplinkUrlRulesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeeplinkUrlRulesDTO(final List<DeeplinkUrlRuleDTO> deeplinkurlrulesList)
	{
		super();
		this.deeplinkurlrulesList=deeplinkurlrulesList;
	}
	
	
	/**
	 * @return the deeplinkurlrules
	 */
	@XmlElement(name = "deeplinkurlrule")
	public List<DeeplinkUrlRuleDTO> getDeeplinkUrlRules()
	{
		return	deeplinkurlrulesList;
	}
	
	/**
	 * @param deeplinkurlrulesList 
	 *  the deeplinkurlrulesList to set   
	 */
	public void setDeeplinkUrlRules(final List<DeeplinkUrlRuleDTO> deeplinkurlrulesList)
	{
		this.deeplinkurlrulesList=deeplinkurlrulesList;
	}
	
}
