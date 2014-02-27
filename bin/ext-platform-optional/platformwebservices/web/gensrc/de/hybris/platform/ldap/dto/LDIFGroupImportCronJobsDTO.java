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

import de.hybris.platform.ldap.dto.LDIFGroupImportCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LDIFGroupImportCronJob first defined at extension ldap
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ldifgroupimportcronjobs")
public class LDIFGroupImportCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LDIFGroupImportCronJobDTO*/
	private List<LDIFGroupImportCronJobDTO>  ldifgroupimportcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFGroupImportCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFGroupImportCronJobsDTO(final List<LDIFGroupImportCronJobDTO> ldifgroupimportcronjobsList)
	{
		super();
		this.ldifgroupimportcronjobsList=ldifgroupimportcronjobsList;
	}
	
	
	/**
	 * @return the ldifgroupimportcronjobs
	 */
	@XmlElement(name = "ldifgroupimportcronjob")
	public List<LDIFGroupImportCronJobDTO> getLDIFGroupImportCronJobs()
	{
		return	ldifgroupimportcronjobsList;
	}
	
	/**
	 * @param ldifgroupimportcronjobsList 
	 *  the ldifgroupimportcronjobsList to set   
	 */
	public void setLDIFGroupImportCronJobs(final List<LDIFGroupImportCronJobDTO> ldifgroupimportcronjobsList)
	{
		this.ldifgroupimportcronjobsList=ldifgroupimportcronjobsList;
	}
	
}
