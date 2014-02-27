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

import de.hybris.platform.cockpit.dto.CockpitSavedFacetValueDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CockpitSavedFacetValue first defined at extension cockpit
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cockpitsavedfacetvalues")
public class CockpitSavedFacetValuesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CockpitSavedFacetValueDTO*/
	private List<CockpitSavedFacetValueDTO>  cockpitsavedfacetvaluesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedFacetValuesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitSavedFacetValuesDTO(final List<CockpitSavedFacetValueDTO> cockpitsavedfacetvaluesList)
	{
		super();
		this.cockpitsavedfacetvaluesList=cockpitsavedfacetvaluesList;
	}
	
	
	/**
	 * @return the cockpitsavedfacetvalues
	 */
	@XmlElement(name = "cockpitsavedfacetvalue")
	public List<CockpitSavedFacetValueDTO> getCockpitSavedFacetValues()
	{
		return	cockpitsavedfacetvaluesList;
	}
	
	/**
	 * @param cockpitsavedfacetvaluesList 
	 *  the cockpitsavedfacetvaluesList to set   
	 */
	public void setCockpitSavedFacetValues(final List<CockpitSavedFacetValueDTO> cockpitsavedfacetvaluesList)
	{
		this.cockpitsavedfacetvaluesList=cockpitsavedfacetvaluesList;
	}
	
}
