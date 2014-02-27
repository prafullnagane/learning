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
package de.hybris.platform.europe1.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.enumeration.EnumerationValueDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.europe1.model.PDTRowModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type PDTRow first defined at extension europe1
 */
@SuppressWarnings("all")
@GraphNode(target = PDTRowModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "pdtrow")
public class PDTRowDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>PDTRow.pg</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.enumeration.EnumerationValueDTO _pg;
	/** <i>Generated variable</i> - Variable of <code>PDTRow.endTime</code> attribute defined at extension <code> */
	private java.util.Date _endTime;
	/** <i>Generated variable</i> - Variable of <code>PDTRow.startTime</code> attribute defined at extension <code> */
	private java.util.Date _startTime;
	/** <i>Generated variable</i> - Variable of <code>PDTRow.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>PDTRow.ug</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.enumeration.EnumerationValueDTO _ug;
	/** <i>Generated variable</i> - Variable of <code>PDTRow.product</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _product;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PDTRowDTO()
	{
		super();
	}
	
	
	public Date getEndTime()
	{
		return this._endTime;
	}
	
	public EnumerationValueDTO getPg()
	{
		return this._pg;
	}
	
	public ProductDTO getProduct()
	{
		return this._product;
	}
	
	public Date getStartTime()
	{
		return this._startTime;
	}
	
	public EnumerationValueDTO getUg()
	{
		return this._ug;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setEndTime(final Date value)
	{
		this.modifiedPropsSet.add("endTime");
		this._endTime = value;
	}
	
	public void setPg(final EnumerationValueDTO value)
	{
		this.modifiedPropsSet.add("pg");
		this._pg = value;
	}
	
	public void setProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("product");
		this._product = value;
	}
	
	public void setStartTime(final Date value)
	{
		this.modifiedPropsSet.add("startTime");
		this._startTime = value;
	}
	
	public void setUg(final EnumerationValueDTO value)
	{
		this.modifiedPropsSet.add("ug");
		this._ug = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
