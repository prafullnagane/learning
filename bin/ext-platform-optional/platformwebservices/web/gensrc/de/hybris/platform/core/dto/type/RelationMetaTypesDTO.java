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
package de.hybris.platform.core.dto.type;

import de.hybris.platform.core.dto.type.RelationMetaTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type RelationMetaType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "relationmetatypes")
public class RelationMetaTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>RelationMetaTypeDTO*/
	private List<RelationMetaTypeDTO>  relationmetatypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationMetaTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RelationMetaTypesDTO(final List<RelationMetaTypeDTO> relationmetatypesList)
	{
		super();
		this.relationmetatypesList=relationmetatypesList;
	}
	
	
	/**
	 * @return the relationmetatypes
	 */
	@XmlElement(name = "relationmetatype")
	public List<RelationMetaTypeDTO> getRelationMetaTypes()
	{
		return	relationmetatypesList;
	}
	
	/**
	 * @param relationmetatypesList 
	 *  the relationmetatypesList to set   
	 */
	public void setRelationMetaTypes(final List<RelationMetaTypeDTO> relationmetatypesList)
	{
		this.relationmetatypesList=relationmetatypesList;
	}
	
}
