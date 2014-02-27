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

import de.hybris.platform.ldap.dto.LDIFGroupImportJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LDIFGroupImportJob first defined at extension ldap
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ldifgroupimportjobs")
public class LDIFGroupImportJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LDIFGroupImportJobDTO*/
	private List<LDIFGroupImportJobDTO>  ldifgroupimportjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFGroupImportJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFGroupImportJobsDTO(final List<LDIFGroupImportJobDTO> ldifgroupimportjobsList)
	{
		super();
		this.ldifgroupimportjobsList=ldifgroupimportjobsList;
	}
	
	
	/**
	 * @return the ldifgroupimportjobs
	 */
	@XmlElement(name = "ldifgroupimportjob")
	public List<LDIFGroupImportJobDTO> getLDIFGroupImportJobs()
	{
		return	ldifgroupimportjobsList;
	}
	
	/**
	 * @param ldifgroupimportjobsList 
	 *  the ldifgroupimportjobsList to set   
	 */
	public void setLDIFGroupImportJobs(final List<LDIFGroupImportJobDTO> ldifgroupimportjobsList)
	{
		this.ldifgroupimportjobsList=ldifgroupimportjobsList;
	}
	
}
