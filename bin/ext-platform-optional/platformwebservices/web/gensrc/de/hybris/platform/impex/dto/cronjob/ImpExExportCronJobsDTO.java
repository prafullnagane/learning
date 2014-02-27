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

import de.hybris.platform.impex.dto.cronjob.ImpExExportCronJobDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type ImpExExportCronJob first defined at extension impex
 */
@SuppressWarnings("all")
@XmlRootElement(name = "impexexportcronjobs")
public class ImpExExportCronJobsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>ImpExExportCronJobDTO*/
	private List<ImpExExportCronJobDTO>  impexexportcronjobsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportCronJobsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ImpExExportCronJobsDTO(final List<ImpExExportCronJobDTO> impexexportcronjobsList)
	{
		super();
		this.impexexportcronjobsList=impexexportcronjobsList;
	}
	
	
	/**
	 * @return the impexexportcronjobs
	 */
	@XmlElement(name = "impexexportcronjob")
	public List<ImpExExportCronJobDTO> getImpExExportCronJobs()
	{
		return	impexexportcronjobsList;
	}
	
	/**
	 * @param impexexportcronjobsList 
	 *  the impexexportcronjobsList to set   
	 */
	public void setImpExExportCronJobs(final List<ImpExExportCronJobDTO> impexexportcronjobsList)
	{
		this.impexexportcronjobsList=impexexportcronjobsList;
	}
	
}
