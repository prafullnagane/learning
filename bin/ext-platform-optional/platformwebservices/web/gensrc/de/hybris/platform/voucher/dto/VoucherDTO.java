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

import de.hybris.platform.core.dto.order.AbstractOrderDTO;
import de.hybris.platform.core.dto.order.price.DiscountDTO;
import de.hybris.platform.voucher.dto.RestrictionDTO;
import de.hybris.platform.voucher.dto.VoucherInvalidationDTO;
import de.hybris.platform.voucher.model.VoucherModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Voucher first defined at extension voucher
 */
@SuppressWarnings("all")
@GraphNode(target = VoucherModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "voucher")
public class VoucherDTO extends DiscountDTO
{
	/** <i>Generated variable</i> - Variable of <code>Voucher.restrictions</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.voucher.dto.RestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>Voucher.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>Voucher.valueString</code> attribute defined at extension <code> */
	private java.lang.String _valueString;
	/** <i>Generated variable</i> - Variable of <code>Voucher.freeShipping</code> attribute defined at extension <code> */
	private java.lang.Boolean _freeShipping;
	/** <i>Generated variable</i> - Variable of <code>Voucher.invalidations</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.voucher.dto.VoucherInvalidationDTO> _invalidations;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public VoucherDTO()
	{
		super();
	}
	
	
	public String getDescription()
	{
		return this._description;
	}
	
	public Boolean getFreeShipping()
	{
		return this._freeShipping;
	}
	
	@XmlElementWrapper(name = "invalidations")
	@XmlElement(name = "voucherInvalidation")
	public Collection<VoucherInvalidationDTO> getInvalidations()
	{
		return this._invalidations;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "restriction")
	public Set<RestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	public String getValueString()
	{
		return this._valueString;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setFreeShipping(final Boolean value)
	{
		this.modifiedPropsSet.add("freeShipping");
		this._freeShipping = value;
	}
	
	public void setInvalidations(final Collection<VoucherInvalidationDTO> value)
	{
		this.modifiedPropsSet.add("invalidations");
		this._invalidations = value;
	}
	
	public void setRestrictions(final Set<RestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setValueString(final String value)
	{
		this.modifiedPropsSet.add("valueString");
		this._valueString = value;
	}
	
}
