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
package de.hybris.platform.voucher.dto;

import de.hybris.platform.voucher.dto.RestrictionDTO;
import de.hybris.platform.voucher.model.DateRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DateRestriction first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = DateRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "daterestriction")
public class DateRestrictionDTO extends RestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>DateRestriction.endDate</code> attribute defined at extension <code> */
	private java.util.Date _endDate;
	/** <i>Generated variable</i> - Variable of <code>DateRestriction.startDate</code> attribute defined at extension <code> */
	private java.util.Date _startDate;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DateRestrictionDTO()
	{
		super();
	}
	
	
	public Date getEndDate()
	{
		return this._endDate;
	}
	
	public Date getStartDate()
	{
		return this._startDate;
	}
	
	public void setEndDate(final Date value)
	{
		this.modifiedPropsSet.add("endDate");
		this._endDate = value;
	}
	
	public void setStartDate(final Date value)
	{
		this.modifiedPropsSet.add("startDate");
		this._startDate = value;
	}
	
}
