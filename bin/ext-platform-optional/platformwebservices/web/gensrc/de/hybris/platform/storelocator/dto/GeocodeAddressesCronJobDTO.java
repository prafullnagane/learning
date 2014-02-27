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
package de.hybris.platform.storelocator.dto;

import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.storelocator.model.GeocodeAddressesCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type GeocodeAddressesCronJob first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = GeocodeAddressesCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "geocodeaddressescronjob")
public class GeocodeAddressesCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>GeocodeAddressesCronJob.batchSize</code> attribute defined at extension <code> */
	private int _batchSize;
	/** <i>Generated variable</i> - Variable of <code>GeocodeAddressesCronJob.internalDelay</code> attribute defined at extension <code> */
	private int _internalDelay;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public GeocodeAddressesCronJobDTO()
	{
		super();
	}
	
	
	public int getBatchSize()
	{
		return this._batchSize;
	}
	
	public int getInternalDelay()
	{
		return this._internalDelay;
	}
	
	public void setBatchSize(final int value)
	{
		this.modifiedPropsSet.add("batchSize");
		this._batchSize = value;
	}
	
	public void setInternalDelay(final int value)
	{
		this.modifiedPropsSet.add("internalDelay");
		this._internalDelay = value;
	}
	
}
