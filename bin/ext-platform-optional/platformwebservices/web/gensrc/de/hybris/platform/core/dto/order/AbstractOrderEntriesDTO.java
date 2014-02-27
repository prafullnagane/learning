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
package de.hybris.platform.core.dto.order;

import de.hybris.platform.core.dto.order.AbstractOrderEntryDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractOrderEntry first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractorderentries")
public class AbstractOrderEntriesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractOrderEntryDTO*/
	private List<AbstractOrderEntryDTO>  abstractorderentriesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractOrderEntriesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractOrderEntriesDTO(final List<AbstractOrderEntryDTO> abstractorderentriesList)
	{
		super();
		this.abstractorderentriesList=abstractorderentriesList;
	}
	
	
	/**
	 * @return the abstractorderentries
	 */
	@XmlElement(name = "abstractorderentry")
	public List<AbstractOrderEntryDTO> getAbstractOrderEntries()
	{
		return	abstractorderentriesList;
	}
	
	/**
	 * @param abstractorderentriesList 
	 *  the abstractorderentriesList to set   
	 */
	public void setAbstractOrderEntries(final List<AbstractOrderEntryDTO> abstractorderentriesList)
	{
		this.abstractorderentriesList=abstractorderentriesList;
	}
	
}
