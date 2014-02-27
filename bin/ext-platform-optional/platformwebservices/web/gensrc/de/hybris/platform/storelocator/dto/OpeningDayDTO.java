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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.storelocator.dto.OpeningScheduleDTO;
import de.hybris.platform.storelocator.model.OpeningDayModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OpeningDay first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OpeningDayModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "openingday")
public class OpeningDayDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>OpeningDay.closingTime</code> attribute defined at extension <code> */
	private java.util.Date _closingTime;
	/** <i>Generated variable</i> - Variable of <code>OpeningDay.openingSchedule</code> attribute defined at extension <code> */
	private de.hybris.platform.storelocator.dto.OpeningScheduleDTO _openingSchedule;
	/** <i>Generated variable</i> - Variable of <code>OpeningDay.openingTime</code> attribute defined at extension <code> */
	private java.util.Date _openingTime;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningDayDTO()
	{
		super();
	}
	
	
	public Date getClosingTime()
	{
		return this._closingTime;
	}
	
	public OpeningScheduleDTO getOpeningSchedule()
	{
		return this._openingSchedule;
	}
	
	public Date getOpeningTime()
	{
		return this._openingTime;
	}
	
	public void setClosingTime(final Date value)
	{
		this.modifiedPropsSet.add("closingTime");
		this._closingTime = value;
	}
	
	public void setOpeningSchedule(final OpeningScheduleDTO value)
	{
		this.modifiedPropsSet.add("openingSchedule");
		this._openingSchedule = value;
	}
	
	public void setOpeningTime(final Date value)
	{
		this.modifiedPropsSet.add("openingTime");
		this._openingTime = value;
	}
	
}
