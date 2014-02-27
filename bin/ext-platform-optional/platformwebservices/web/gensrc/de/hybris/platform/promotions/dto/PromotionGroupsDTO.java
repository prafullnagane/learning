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
package de.hybris.platform.promotions.dto;

import de.hybris.platform.promotions.dto.PromotionGroupDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type PromotionGroup first defined at extension promotions
 */
@SuppressWarnings("all")
@XmlRootElement(name = "promotiongroups")
public class PromotionGroupsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>PromotionGroupDTO*/
	private List<PromotionGroupDTO>  promotiongroupsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionGroupsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PromotionGroupsDTO(final List<PromotionGroupDTO> promotiongroupsList)
	{
		super();
		this.promotiongroupsList=promotiongroupsList;
	}
	
	
	/**
	 * @return the promotiongroups
	 */
	@XmlElement(name = "promotiongroup")
	public List<PromotionGroupDTO> getPromotionGroups()
	{
		return	promotiongroupsList;
	}
	
	/**
	 * @param promotiongroupsList 
	 *  the promotiongroupsList to set   
	 */
	public void setPromotionGroups(final List<PromotionGroupDTO> promotiongroupsList)
	{
		this.promotiongroupsList=promotiongroupsList;
	}
	
}
