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

import de.hybris.platform.cms2.dto.contents.containers.ABTestCMSComponentContainerDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ABTestCMSComponentContainer first defined at extension cms2
 */
@SuppressWarnings("all")
@XmlRootElement(name = "abtestcmscomponentcontainers")
public class ABTestCMSComponentContainersDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ABTestCMSComponentContainerDTO*/
	private List<ABTestCMSComponentContainerDTO>  abtestcmscomponentcontainersList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ABTestCMSComponentContainersDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ABTestCMSComponentContainersDTO(final List<ABTestCMSComponentContainerDTO> abtestcmscomponentcontainersList)
	{
		super();
		this.abtestcmscomponentcontainersList=abtestcmscomponentcontainersList;
	}
	
	
	/**
	 * @return the abtestcmscomponentcontainers
	 */
	@XmlElement(name = "abtestcmscomponentcontainer")
	public List<ABTestCMSComponentContainerDTO> getABTestCMSComponentContainers()
	{
		return	abtestcmscomponentcontainersList;
	}
	
	/**
	 * @param abtestcmscomponentcontainersList 
	 *  the abtestcmscomponentcontainersList to set   
	 */
	public void setABTestCMSComponentContainers(final List<ABTestCMSComponentContainerDTO> abtestcmscomponentcontainersList)
	{
		this.abtestcmscomponentcontainersList=abtestcmscomponentcontainersList;
	}
	
}
