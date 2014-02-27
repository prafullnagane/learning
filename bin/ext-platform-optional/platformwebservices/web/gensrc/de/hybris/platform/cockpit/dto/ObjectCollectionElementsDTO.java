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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.ObjectCollectionElementDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ObjectCollectionElement first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "objectcollectionelements")
public class ObjectCollectionElementsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ObjectCollectionElementDTO*/
	private List<ObjectCollectionElementDTO>  objectcollectionelementsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ObjectCollectionElementsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ObjectCollectionElementsDTO(final List<ObjectCollectionElementDTO> objectcollectionelementsList)
	{
		super();
		this.objectcollectionelementsList=objectcollectionelementsList;
	}
	
	
	/**
	 * @return the objectcollectionelements
	 */
	@XmlElement(name = "objectcollectionelement")
	public List<ObjectCollectionElementDTO> getObjectCollectionElements()
	{
		return	objectcollectionelementsList;
	}
	
	/**
	 * @param objectcollectionelementsList 
	 *  the objectcollectionelementsList to set   
	 */
	public void setObjectCollectionElements(final List<ObjectCollectionElementDTO> objectcollectionelementsList)
	{
		this.objectcollectionelementsList=objectcollectionelementsList;
	}
	
}
