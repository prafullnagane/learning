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
package de.hybris.platform.ldap.dto;

import de.hybris.platform.ldap.dto.LDIFImportJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LDIFImportJob first defined at extension ldap
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ldifimportjobs")
public class LDIFImportJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LDIFImportJobDTO*/
	private List<LDIFImportJobDTO>  ldifimportjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFImportJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFImportJobsDTO(final List<LDIFImportJobDTO> ldifimportjobsList)
	{
		super();
		this.ldifimportjobsList=ldifimportjobsList;
	}
	
	
	/**
	 * @return the ldifimportjobs
	 */
	@XmlElement(name = "ldifimportjob")
	public List<LDIFImportJobDTO> getLDIFImportJobs()
	{
		return	ldifimportjobsList;
	}
	
	/**
	 * @param ldifimportjobsList 
	 *  the ldifimportjobsList to set   
	 */
	public void setLDIFImportJobs(final List<LDIFImportJobDTO> ldifimportjobsList)
	{
		this.ldifimportjobsList=ldifimportjobsList;
	}
	
}
