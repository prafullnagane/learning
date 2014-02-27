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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGConfigDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BTGConfig first defined at extension btg
 */
@SuppressWarnings("all")
@XmlRootElement(name = "btgconfigs")
public class BTGConfigsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BTGConfigDTO*/
	private List<BTGConfigDTO>  btgconfigsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConfigsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGConfigsDTO(final List<BTGConfigDTO> btgconfigsList)
	{
		super();
		this.btgconfigsList=btgconfigsList;
	}
	
	
	/**
	 * @return the btgconfigs
	 */
	@XmlElement(name = "btgconfig")
	public List<BTGConfigDTO> getBTGConfigs()
	{
		return	btgconfigsList;
	}
	
	/**
	 * @param btgconfigsList 
	 *  the btgconfigsList to set   
	 */
	public void setBTGConfigs(final List<BTGConfigDTO> btgconfigsList)
	{
		this.btgconfigsList=btgconfigsList;
	}
	
}
