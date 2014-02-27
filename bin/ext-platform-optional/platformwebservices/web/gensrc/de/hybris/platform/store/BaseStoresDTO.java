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
package de.hybris.platform.store;

import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BaseStore first defined at extension basecommerce
 */
@SuppressWarnings("all")
@XmlRootElement(name = "basestores")
public class BaseStoresDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BaseStoreDTO*/
	private List<BaseStoreDTO>  basestoresList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseStoresDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BaseStoresDTO(final List<BaseStoreDTO> basestoresList)
	{
		super();
		this.basestoresList=basestoresList;
	}
	
	
	/**
	 * @return the basestores
	 */
	@XmlElement(name = "basestore")
	public List<BaseStoreDTO> getBaseStores()
	{
		return	basestoresList;
	}
	
	/**
	 * @param basestoresList 
	 *  the basestoresList to set   
	 */
	public void setBaseStores(final List<BaseStoreDTO> basestoresList)
	{
		this.basestoresList=basestoresList;
	}
	
}
