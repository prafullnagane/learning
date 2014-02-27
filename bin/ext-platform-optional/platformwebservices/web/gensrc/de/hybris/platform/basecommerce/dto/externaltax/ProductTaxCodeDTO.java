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
package de.hybris.platform.basecommerce.dto.externaltax;

import de.hybris.platform.basecommerce.model.externaltax.ProductTaxCodeModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductTaxCode first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ProductTaxCodeModel.class, factory = GenericNodeFactory.class, uidProperties="productCode")
@XmlRootElement(name = "producttaxcode")
public class ProductTaxCodeDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductTaxCode.productCode</code> attribute defined at extension <code> */
	private java.lang.String _productCode;
	/** <i>Generated variable</i> - Variable of <code>ProductTaxCode.taxCode</code> attribute defined at extension <code> */
	private java.lang.String _taxCode;
	/** <i>Generated variable</i> - Variable of <code>ProductTaxCode.taxArea</code> attribute defined at extension <code> */
	private java.lang.String _taxArea;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductTaxCodeDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getProductCode()
	{
		return this._productCode;
	}
	
	@XmlAttribute
	public String getTaxArea()
	{
		return this._taxArea;
	}
	
	public String getTaxCode()
	{
		return this._taxCode;
	}
	
	public void setProductCode(final String value)
	{
		this.modifiedPropsSet.add("productCode");
		this._productCode = value;
	}
	
	public void setTaxArea(final String value)
	{
		this.modifiedPropsSet.add("taxArea");
		this._taxArea = value;
	}
	
	public void setTaxCode(final String value)
	{
		this.modifiedPropsSet.add("taxCode");
		this._taxCode = value;
	}
	
}
