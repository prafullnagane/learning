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

import de.hybris.platform.storelocator.dto.OpeningDayDTO;
import de.hybris.platform.storelocator.model.WeekdayOpeningDayModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type WeekdayOpeningDay first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = WeekdayOpeningDayModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "weekdayopeningday")
public class WeekdayOpeningDayDTO extends OpeningDayDTO
{
	/** <i>Generated variable</i> - Variable of <code>WeekdayOpeningDay.dayOfWeek</code> attribute defined at extension <code> */
	private java.lang.String _dayOfWeek;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public WeekdayOpeningDayDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDayOfWeek()
	{
		return this._dayOfWeek;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDayOfWeek(final String value)
	{
		this.modifiedPropsSet.add("dayOfWeek");
		this._dayOfWeek = value;
	}
	
}
