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
package de.hybris.platform.servicelayer.internal.dto;

import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.servicelayer.internal.model.ServicelayerJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ServicelayerJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = ServicelayerJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "servicelayerjob")
public class ServicelayerJobDTO extends JobDTO
{
	/** <i>Generated variable</i> - Variable of <code>ServicelayerJob.springId</code> attribute defined at extension <code> */
	private java.lang.String _springId;
	/** <i>Generated variable</i> - Variable of <code>ServicelayerJob.springIdCronJobFactory</code> attribute defined at extension <code> */
	private java.lang.String _springIdCronJobFactory;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ServicelayerJobDTO()
	{
		super();
	}
	
	
	public String getSpringId()
	{
		return this._springId;
	}
	
	public String getSpringIdCronJobFactory()
	{
		return this._springIdCronJobFactory;
	}
	
	public void setSpringId(final String value)
	{
		this.modifiedPropsSet.add("springId");
		this._springId = value;
	}
	
	public void setSpringIdCronJobFactory(final String value)
	{
		this.modifiedPropsSet.add("springIdCronJobFactory");
		this._springIdCronJobFactory = value;
	}
	
}
