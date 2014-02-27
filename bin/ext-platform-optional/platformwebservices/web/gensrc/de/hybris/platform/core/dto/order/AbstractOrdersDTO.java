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

import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractOrder first defined at extension core
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractorders")
public class AbstractOrdersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractOrderDTO*/
	private List<AbstractOrderDTO>  abstractordersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractOrdersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractOrdersDTO(final List<AbstractOrderDTO> abstractordersList)
	{
		super();
		this.abstractordersList=abstractordersList;
	}
	
	
	/**
	 * @return the abstractorders
	 */
	@XmlElement(name = "abstractorder")
	public List<AbstractOrderDTO> getAbstractOrders()
	{
		return	abstractordersList;
	}
	
	/**
	 * @param abstractordersList 
	 *  the abstractordersList to set   
	 */
	public void setAbstractOrders(final List<AbstractOrderDTO> abstractordersList)
	{
		this.abstractordersList=abstractordersList;
	}
	
}
