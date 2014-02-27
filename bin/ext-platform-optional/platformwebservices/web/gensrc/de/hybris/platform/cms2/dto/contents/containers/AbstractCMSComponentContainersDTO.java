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
package de.hybris.platform.cms2.dto.contents.containers;

import de.hybris.platform.cms2.dto.contents.containers.AbstractCMSComponentContainerDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type AbstractCMSComponentContainer first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abstractcmscomponentcontainers")
public class AbstractCMSComponentContainersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>AbstractCMSComponentContainerDTO*/
	private List<AbstractCMSComponentContainerDTO>  abstractcmscomponentcontainersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCMSComponentContainersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCMSComponentContainersDTO(final List<AbstractCMSComponentContainerDTO> abstractcmscomponentcontainersList)
	{
		super();
		this.abstractcmscomponentcontainersList=abstractcmscomponentcontainersList;
	}
	
	
	/**
	 * @return the abstractcmscomponentcontainers
	 */
	@XmlElement(name = "abstractcmscomponentcontainer")
	public List<AbstractCMSComponentContainerDTO> getAbstractCMSComponentContainers()
	{
		return	abstractcmscomponentcontainersList;
	}
	
	/**
	 * @param abstractcmscomponentcontainersList 
	 *  the abstractcmscomponentcontainersList to set   
	 */
	public void setAbstractCMSComponentContainers(final List<AbstractCMSComponentContainerDTO> abstractcmscomponentcontainersList)
	{
		this.abstractcmscomponentcontainersList=abstractcmscomponentcontainersList;
	}
	
}
