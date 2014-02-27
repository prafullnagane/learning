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
package de.hybris.platform.acceleratorcms.dto.components;

import de.hybris.platform.acceleratorcms.model.components.ProductReferencesComponentModel;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumListToStringValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringListToHybrisEnumValuesConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductReferencesComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = ProductReferencesComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "productreferencescomponent")
public class ProductReferencesComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductReferencesComponent.displayProductPrices</code> attribute defined at extension <code> */
	private boolean _displayProductPrices;
	/** <i>Generated variable</i> - Variable of <code>ProductReferencesComponent.productReferenceTypes</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _productReferenceTypes;
	/** <i>Generated variable</i> - Variable of <code>ProductReferencesComponent.maximumNumberProducts</code> attribute defined at extension <code> */
	private java.lang.Integer _maximumNumberProducts;
	/** <i>Generated variable</i> - Variable of <code>ProductReferencesComponent.displayProductTitles</code> attribute defined at extension <code> */
	private boolean _displayProductTitles;
	/** <i>Generated variable</i> - Variable of <code>ProductReferencesComponent.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductReferencesComponentDTO()
	{
		super();
	}
	
	
	public Integer getMaximumNumberProducts()
	{
		return this._maximumNumberProducts;
	}
	
	@GraphProperty(interceptor = StringListToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "productReferenceTypes")
	@XmlElement(name = "productReferenceTypeEnum")
	public List<String> getProductReferenceTypes()
	{
		return this._productReferenceTypes;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public boolean isDisplayProductPrices()
	{
		return this._displayProductPrices;
	}
	
	public boolean isDisplayProductTitles()
	{
		return this._displayProductTitles;
	}
	
	public void setDisplayProductPrices(final boolean value)
	{
		this.modifiedPropsSet.add("displayProductPrices");
		this._displayProductPrices = value;
	}
	
	public void setDisplayProductTitles(final boolean value)
	{
		this.modifiedPropsSet.add("displayProductTitles");
		this._displayProductTitles = value;
	}
	
	public void setMaximumNumberProducts(final Integer value)
	{
		this.modifiedPropsSet.add("maximumNumberProducts");
		this._maximumNumberProducts = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumListToStringValuesConverter.class)
	public void setProductReferenceTypes(final List<String> value)
	{
		this.modifiedPropsSet.add("productReferenceTypes");
		this._productReferenceTypes = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
