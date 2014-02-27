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
package de.hybris.platform.mcc.dto;

import de.hybris.platform.mcc.dto.AbstractLinkEntryDTO;
import de.hybris.platform.mcc.model.DividerModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Divider first defined at extension mcc
 */
@SuppressWarnings("all")
@GraphNode(target = DividerModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "divider")
public class DividerDTO extends AbstractLinkEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>Divider.spacer</code> attribute defined at extension <code> */
	private boolean _spacer;
	/** <i>Generated variable</i> - Variable of <code>Divider.height</code> attribute defined at extension <code> */
	private java.lang.Integer _height;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DividerDTO()
	{
		super();
	}
	
	
	public Integer getHeight()
	{
		return this._height;
	}
	
	public boolean isSpacer()
	{
		return this._spacer;
	}
	
	public void setHeight(final Integer value)
	{
		this.modifiedPropsSet.add("height");
		this._height = value;
	}
	
	public void setSpacer(final boolean value)
	{
		this.modifiedPropsSet.add("spacer");
		this._spacer = value;
	}
	
}
