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
package de.hybris.platform.basecommerce.dto.site;

import de.hybris.platform.basecommerce.dto.site.BaseSiteDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BaseSite first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "basesites")
public class BaseSitesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BaseSiteDTO*/
	private List<BaseSiteDTO>  basesitesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseSitesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseSitesDTO(final List<BaseSiteDTO> basesitesList)
	{
		super();
		this.basesitesList=basesitesList;
	}
	
	
	/**
	 * @return the basesites
	 */
	@XmlElement(name = "basesite")
	public List<BaseSiteDTO> getBaseSites()
	{
		return	basesitesList;
	}
	
	/**
	 * @param basesitesList 
	 *  the basesitesList to set   
	 */
	public void setBaseSites(final List<BaseSiteDTO> basesitesList)
	{
		this.basesitesList=basesitesList;
	}
	
}
