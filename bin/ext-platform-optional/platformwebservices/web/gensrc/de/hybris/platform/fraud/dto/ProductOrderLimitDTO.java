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
package de.hybris.platform.fraud.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.fraud.model.ProductOrderLimitModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductOrderLimit first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ProductOrderLimitModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productorderlimit")
public class ProductOrderLimitDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.intervalValue</code> attribute defined at extension <code> */
	private java.lang.Integer _intervalValue;
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.intervalMaxOrdersNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _intervalMaxOrdersNumber;
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.products</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.product.ProductDTO> _products;
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.intervalResolution</code> attribute defined at extension <code> */
	private java.lang.String _intervalResolution;
	/** <i>Generated variable</i> - Variable of <code>ProductOrderLimit.maxNumberPerOrder</code> attribute defined at extension <code> */
	private java.lang.Integer _maxNumberPerOrder;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductOrderLimitDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public Integer getIntervalMaxOrdersNumber()
	{
		return this._intervalMaxOrdersNumber;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getIntervalResolution()
	{
		return this._intervalResolution;
	}
	
	public Integer getIntervalValue()
	{
		return this._intervalValue;
	}
	
	public Integer getMaxNumberPerOrder()
	{
		return this._maxNumberPerOrder;
	}
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public Set<ProductDTO> getProducts()
	{
		return this._products;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setIntervalMaxOrdersNumber(final Integer value)
	{
		this.modifiedPropsSet.add("intervalMaxOrdersNumber");
		this._intervalMaxOrdersNumber = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setIntervalResolution(final String value)
	{
		this.modifiedPropsSet.add("intervalResolution");
		this._intervalResolution = value;
	}
	
	public void setIntervalValue(final Integer value)
	{
		this.modifiedPropsSet.add("intervalValue");
		this._intervalValue = value;
	}
	
	public void setMaxNumberPerOrder(final Integer value)
	{
		this.modifiedPropsSet.add("maxNumberPerOrder");
		this._maxNumberPerOrder = value;
	}
	
	public void setProducts(final Set<ProductDTO> value)
	{
		this.modifiedPropsSet.add("products");
		this._products = value;
	}
	
}
