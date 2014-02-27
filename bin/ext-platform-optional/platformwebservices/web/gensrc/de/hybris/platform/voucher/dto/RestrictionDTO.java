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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.voucher.dto.VoucherDTO;
import de.hybris.platform.voucher.model.RestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Restriction first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = RestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "restriction")
public class RestrictionDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Restriction.voucher</code> attribute defined at extension <code> */
	private de.hybris.platform.voucher.dto.VoucherDTO _voucher;
	/** <i>Generated variable</i> - Variable of <code>Restriction.restrictionType</code> attribute defined at extension <code> */
	private java.lang.String _restrictionType;
	/** <i>Generated variable</i> - Variable of <code>Restriction.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>Restriction.violationMessage</code> attribute defined at extension <code> */
	private java.lang.String _violationMessage;
	/** <i>Generated variable</i> - Variable of <code>Restriction.positive</code> attribute defined at extension <code> */
	private java.lang.Boolean _positive;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RestrictionDTO()
	{
		super();
	}
	
	
	public String getDescription()
	{
		return this._description;
	}
	
	public Boolean getPositive()
	{
		return this._positive;
	}
	
	public String getRestrictionType()
	{
		return this._restrictionType;
	}
	
	public String getViolationMessage()
	{
		return this._violationMessage;
	}
	
	public VoucherDTO getVoucher()
	{
		return this._voucher;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setPositive(final Boolean value)
	{
		this.modifiedPropsSet.add("positive");
		this._positive = value;
	}
	
	public void setRestrictionType(final String value)
	{
		this.modifiedPropsSet.add("restrictionType");
		this._restrictionType = value;
	}
	
	public void setViolationMessage(final String value)
	{
		this.modifiedPropsSet.add("violationMessage");
		this._violationMessage = value;
	}
	
	public void setVoucher(final VoucherDTO value)
	{
		this.modifiedPropsSet.add("voucher");
		this._voucher = value;
	}
	
}
