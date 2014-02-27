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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.dto.components.CMSTabParagraphContainerDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type CMSTabParagraphContainer first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@XmlRootElement(name = "cmstabparagraphcontainers")
public class CMSTabParagraphContainersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>CMSTabParagraphContainerDTO*/
	private List<CMSTabParagraphContainerDTO>  cmstabparagraphcontainersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTabParagraphContainersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTabParagraphContainersDTO(final List<CMSTabParagraphContainerDTO> cmstabparagraphcontainersList)
	{
		super();
		this.cmstabparagraphcontainersList=cmstabparagraphcontainersList;
	}
	
	
	/**
	 * @return the cmstabparagraphcontainers
	 */
	@XmlElement(name = "cmstabparagraphcontainer")
	public List<CMSTabParagraphContainerDTO> getCMSTabParagraphContainers()
	{
		return	cmstabparagraphcontainersList;
	}
	
	/**
	 * @param cmstabparagraphcontainersList 
	 *  the cmstabparagraphcontainersList to set   
	 */
	public void setCMSTabParagraphContainers(final List<CMSTabParagraphContainerDTO> cmstabparagraphcontainersList)
	{
		this.cmstabparagraphcontainersList=cmstabparagraphcontainersList;
	}
	
}
