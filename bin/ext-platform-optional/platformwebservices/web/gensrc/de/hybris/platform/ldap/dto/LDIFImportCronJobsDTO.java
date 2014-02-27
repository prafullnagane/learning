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

import de.hybris.platform.ldap.dto.LDIFImportCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type LDIFImportCronJob first defined at extension ldap
 */
@SuppressWarnings("all")
@XmlRootElement(name = "ldifimportcronjobs")
public class LDIFImportCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>LDIFImportCronJobDTO*/
	private List<LDIFImportCronJobDTO>  ldifimportcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFImportCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public LDIFImportCronJobsDTO(final List<LDIFImportCronJobDTO> ldifimportcronjobsList)
	{
		super();
		this.ldifimportcronjobsList=ldifimportcronjobsList;
	}
	
	
	/**
	 * @return the ldifimportcronjobs
	 */
	@XmlElement(name = "ldifimportcronjob")
	public List<LDIFImportCronJobDTO> getLDIFImportCronJobs()
	{
		return	ldifimportcronjobsList;
	}
	
	/**
	 * @param ldifimportcronjobsList 
	 *  the ldifimportcronjobsList to set   
	 */
	public void setLDIFImportCronJobs(final List<LDIFImportCronJobDTO> ldifimportcronjobsList)
	{
		this.ldifimportcronjobsList=ldifimportcronjobsList;
	}
	
}
