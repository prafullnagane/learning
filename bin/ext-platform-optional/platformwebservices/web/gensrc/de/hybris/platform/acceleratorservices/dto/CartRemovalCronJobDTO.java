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
package de.hybris.platform.acceleratorservices.dto;

import de.hybris.platform.acceleratorservices.model.CartRemovalCronJobModel;
import de.hybris.platform.basecommerce.dto.site.BaseSiteDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CartRemovalCronJob first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = CartRemovalCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cartremovalcronjob")
public class CartRemovalCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>CartRemovalCronJob.sites</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.basecommerce.dto.site.BaseSiteDTO> _sites;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CartRemovalCronJobDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "sites")
	@XmlElement(name = "baseSite")
	public Collection<BaseSiteDTO> getSites()
	{
		return this._sites;
	}
	
	public void setSites(final Collection<BaseSiteDTO> value)
	{
		this.modifiedPropsSet.add("sites");
		this._sites = value;
	}
	
}
