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
package de.hybris.platform.returns.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.returns.dto.ReplacementOrderDTO;
import de.hybris.platform.returns.dto.ReturnEntryDTO;
import de.hybris.platform.returns.model.ReturnRequestModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ReturnRequest first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ReturnRequestModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "returnrequest")
public class ReturnRequestDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.returnEntries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.returns.dto.ReturnEntryDTO> _returnEntries;
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.replacementOrder</code> attribute defined at extension <code> */
	private de.hybris.platform.returns.dto.ReplacementOrderDTO _replacementOrder;
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.order</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.OrderDTO _order;
	/** <i>Generated variable</i> - Variable of <code>ReturnRequest.RMA</code> attribute defined at extension <code> */
	private java.lang.String _RMA;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReturnRequestDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public OrderDTO getOrder()
	{
		return this._order;
	}
	
	public ReplacementOrderDTO getReplacementOrder()
	{
		return this._replacementOrder;
	}
	
	@XmlElementWrapper(name = "returnEntries")
	@XmlElement(name = "returnEntry")
	public List<ReturnEntryDTO> getReturnEntries()
	{
		return this._returnEntries;
	}
	
	public String getRMA()
	{
		return this._RMA;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setOrder(final OrderDTO value)
	{
		this.modifiedPropsSet.add("order");
		this._order = value;
	}
	
	public void setReplacementOrder(final ReplacementOrderDTO value)
	{
		this.modifiedPropsSet.add("replacementOrder");
		this._replacementOrder = value;
	}
	
	public void setReturnEntries(final List<ReturnEntryDTO> value)
	{
		this.modifiedPropsSet.add("returnEntries");
		this._returnEntries = value;
	}
	
	public void setRMA(final String value)
	{
		this.modifiedPropsSet.add("RMA");
		this._RMA = value;
	}
	
}
