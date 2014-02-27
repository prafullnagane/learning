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

import de.hybris.platform.core.dto.type.ViewTypeDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ViewType first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "viewtypes")
public class ViewTypesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ViewTypeDTO*/
	private List<ViewTypeDTO>  viewtypesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ViewTypesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ViewTypesDTO(final List<ViewTypeDTO> viewtypesList)
	{
		super();
		this.viewtypesList=viewtypesList;
	}
	
	
	/**
	 * @return the viewtypes
	 */
	@XmlElement(name = "viewtype")
	public List<ViewTypeDTO> getViewTypes()
	{
		return	viewtypesList;
	}
	
	/**
	 * @param viewtypesList 
	 *  the viewtypesList to set   
	 */
	public void setViewTypes(final List<ViewTypeDTO> viewtypesList)
	{
		this.viewtypesList=viewtypesList;
	}
	
}
