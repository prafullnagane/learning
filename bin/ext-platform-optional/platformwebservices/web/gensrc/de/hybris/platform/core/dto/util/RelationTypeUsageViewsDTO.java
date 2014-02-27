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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.util.RelationTypeUsageViewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RelationTypeUsageView first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "relationtypeusageviews")
public class RelationTypeUsageViewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RelationTypeUsageViewDTO*/
	private List<RelationTypeUsageViewDTO>  relationtypeusageviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationTypeUsageViewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationTypeUsageViewsDTO(final List<RelationTypeUsageViewDTO> relationtypeusageviewsList)
	{
		super();
		this.relationtypeusageviewsList=relationtypeusageviewsList;
	}
	
	
	/**
	 * @return the relationtypeusageviews
	 */
	@XmlElement(name = "relationtypeusageview")
	public List<RelationTypeUsageViewDTO> getRelationTypeUsageViews()
	{
		return	relationtypeusageviewsList;
	}
	
	/**
	 * @param relationtypeusageviewsList 
	 *  the relationtypeusageviewsList to set   
	 */
	public void setRelationTypeUsageViews(final List<RelationTypeUsageViewDTO> relationtypeusageviewsList)
	{
		this.relationtypeusageviewsList=relationtypeusageviewsList;
	}
	
}
