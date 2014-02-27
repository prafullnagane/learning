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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.model.ProductReferenceModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductReference first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ProductReferenceModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "productreference")
public class ProductReferenceDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductReference.icon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _icon;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.qualifier</code> attribute defined at extension <code> */
	private java.lang.String _qualifier;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.referenceType</code> attribute defined at extension <code> */
	private java.lang.String _referenceType;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.source</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _source;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.target</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _target;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.quantity</code> attribute defined at extension <code> */
	private java.lang.Integer _quantity;
	/** <i>Generated variable</i> - Variable of <code>ProductReference.preselected</code> attribute defined at extension <code> */
	private java.lang.Boolean _preselected;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductReferenceDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public MediaDTO getIcon()
	{
		return this._icon;
	}
	
	public Boolean getPreselected()
	{
		return this._preselected;
	}
	
	public String getQualifier()
	{
		return this._qualifier;
	}
	
	public Integer getQuantity()
	{
		return this._quantity;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getReferenceType()
	{
		return this._referenceType;
	}
	
	public ProductDTO getSource()
	{
		return this._source;
	}
	
	public ProductDTO getTarget()
	{
		return this._target;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("icon");
		this._icon = value;
	}
	
	public void setPreselected(final Boolean value)
	{
		this.modifiedPropsSet.add("preselected");
		this._preselected = value;
	}
	
	public void setQualifier(final String value)
	{
		this.modifiedPropsSet.add("qualifier");
		this._qualifier = value;
	}
	
	public void setQuantity(final Integer value)
	{
		this.modifiedPropsSet.add("quantity");
		this._quantity = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setReferenceType(final String value)
	{
		this.modifiedPropsSet.add("referenceType");
		this._referenceType = value;
	}
	
	public void setSource(final ProductDTO value)
	{
		this.modifiedPropsSet.add("source");
		this._source = value;
	}
	
	public void setTarget(final ProductDTO value)
	{
		this.modifiedPropsSet.add("target");
		this._target = value;
	}
	
}
