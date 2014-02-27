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
package de.hybris.platform.impex.dto.cronjob;

import de.hybris.platform.impex.dto.cronjob.ImpExImportCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ImpExImportCronJob first defined at extension impex
 */
@SuppressWarnings("all")
@XmlRootElement(name = "impeximportcronjobs")
public class ImpExImportCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ImpExImportCronJobDTO*/
	private List<ImpExImportCronJobDTO>  impeximportcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExImportCronJobsDTO(final List<ImpExImportCronJobDTO> impeximportcronjobsList)
	{
		super();
		this.impeximportcronjobsList=impeximportcronjobsList;
	}
	
	
	/**
	 * @return the impeximportcronjobs
	 */
	@XmlElement(name = "impeximportcronjob")
	public List<ImpExImportCronJobDTO> getImpExImportCronJobs()
	{
		return	impeximportcronjobsList;
	}
	
	/**
	 * @param impeximportcronjobsList 
	 *  the impeximportcronjobsList to set   
	 */
	public void setImpExImportCronJobs(final List<ImpExImportCronJobDTO> impeximportcronjobsList)
	{
		this.impeximportcronjobsList=impeximportcronjobsList;
	}
	
}
