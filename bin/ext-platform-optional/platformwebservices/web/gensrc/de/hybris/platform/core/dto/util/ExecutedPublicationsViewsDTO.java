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
package de.hybris.platform.core.dto.util;

import de.hybris.platform.core.dto.util.ExecutedPublicationsViewDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ExecutedPublicationsView first defined at extension catalog
 */
@SuppressWarnings("all")
@XmlRootElement(name = "executedpublicationsviews")
public class ExecutedPublicationsViewsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ExecutedPublicationsViewDTO*/
	private List<ExecutedPublicationsViewDTO>  executedpublicationsviewsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExecutedPublicationsViewsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExecutedPublicationsViewsDTO(final List<ExecutedPublicationsViewDTO> executedpublicationsviewsList)
	{
		super();
		this.executedpublicationsviewsList=executedpublicationsviewsList;
	}
	
	
	/**
	 * @return the executedpublicationsviews
	 */
	@XmlElement(name = "executedpublicationsview")
	public List<ExecutedPublicationsViewDTO> getExecutedPublicationsViews()
	{
		return	executedpublicationsviewsList;
	}
	
	/**
	 * @param executedpublicationsviewsList 
	 *  the executedpublicationsviewsList to set   
	 */
	public void setExecutedPublicationsViews(final List<ExecutedPublicationsViewDTO> executedpublicationsviewsList)
	{
		this.executedpublicationsviewsList=executedpublicationsviewsList;
	}
	
}
