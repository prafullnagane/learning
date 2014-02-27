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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.cronjob.dto.ChangeDescriptorDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ChangeDescriptor first defined at extension processing
 */
@SuppressWarnings("all")
@XmlRootElement(name = "changedescriptors")
public class ChangeDescriptorsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ChangeDescriptorDTO*/
	private List<ChangeDescriptorDTO>  changedescriptorsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ChangeDescriptorsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ChangeDescriptorsDTO(final List<ChangeDescriptorDTO> changedescriptorsList)
	{
		super();
		this.changedescriptorsList=changedescriptorsList;
	}
	
	
	/**
	 * @return the changedescriptors
	 */
	@XmlElement(name = "changedescriptor")
	public List<ChangeDescriptorDTO> getChangeDescriptors()
	{
		return	changedescriptorsList;
	}
	
	/**
	 * @param changedescriptorsList 
	 *  the changedescriptorsList to set   
	 */
	public void setChangeDescriptors(final List<ChangeDescriptorDTO> changedescriptorsList)
	{
		this.changedescriptorsList=changedescriptorsList;
	}
	
}
