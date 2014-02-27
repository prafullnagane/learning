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
import de.hybris.platform.storelocator.dto.OpeningDayDTO;
import de.hybris.platform.storelocator.model.OpeningScheduleModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type OpeningSchedule first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = OpeningScheduleModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "openingschedule")
public class OpeningScheduleDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>OpeningSchedule.openingDays</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.storelocator.dto.OpeningDayDTO> _openingDays;
	/** <i>Generated variable</i> - Variable of <code>OpeningSchedule.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>OpeningSchedule.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public OpeningScheduleDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "openingDays")
	@XmlElement(name = "openingDay")
	public Collection<OpeningDayDTO> getOpeningDays()
	{
		return this._openingDays;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setOpeningDays(final Collection<OpeningDayDTO> value)
	{
		this.modifiedPropsSet.add("openingDays");
		this._openingDays = value;
	}
	
}
