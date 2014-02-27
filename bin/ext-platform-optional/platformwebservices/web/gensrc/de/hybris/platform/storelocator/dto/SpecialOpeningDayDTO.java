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
import de.hybris.platform.storelocator.model.SpecialOpeningDayModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SpecialOpeningDay first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = SpecialOpeningDayModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "specialopeningday")
public class SpecialOpeningDayDTO extends OpeningDayDTO
{
	/** <i>Generated variable</i> - Variable of <code>SpecialOpeningDay.date</code> attribute defined at extension <code> */
	private java.util.Date _date;
	/** <i>Generated variable</i> - Variable of <code>SpecialOpeningDay.closed</code> attribute defined at extension <code> */
	private boolean _closed;
	/** <i>Generated variable</i> - Variable of <code>SpecialOpeningDay.message</code> attribute defined at extension <code> */
	private java.lang.String _message;
	/** <i>Generated variable</i> - Variable of <code>SpecialOpeningDay.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SpecialOpeningDayDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public Date getDate()
	{
		return this._date;
	}
	
	public String getMessage()
	{
		return this._message;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public boolean isClosed()
	{
		return this._closed;
	}
	
	public void setClosed(final boolean value)
	{
		this.modifiedPropsSet.add("closed");
		this._closed = value;
	}
	
	public void setDate(final Date value)
	{
		this.modifiedPropsSet.add("date");
		this._date = value;
	}
	
	public void setMessage(final String value)
	{
		this.modifiedPropsSet.add("message");
		this._message = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
}
