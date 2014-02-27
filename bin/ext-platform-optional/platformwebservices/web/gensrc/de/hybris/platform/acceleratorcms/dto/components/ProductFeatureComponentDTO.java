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

import de.hybris.platform.acceleratorcms.model.components.ProductFeatureComponentModel;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ProductFeatureComponent first defined at extension acceleratorcms
 */
@SuppressWarnings("all")
@GraphNode(target = ProductFeatureComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "productfeaturecomponent")
public class ProductFeatureComponentDTO extends SimpleCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>ProductFeatureComponent.media</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _media;
	/** <i>Generated variable</i> - Variable of <code>ProductFeatureComponent.product</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _product;
	/** <i>Generated variable</i> - Variable of <code>ProductFeatureComponent.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>ProductFeatureComponent.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ProductFeatureComponentDTO()
	{
		super();
	}
	
	
	public String getDescription()
	{
		return this._description;
	}
	
	public MediaDTO getMedia()
	{
		return this._media;
	}
	
	public ProductDTO getProduct()
	{
		return this._product;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setMedia(final MediaDTO value)
	{
		this.modifiedPropsSet.add("media");
		this._media = value;
	}
	
	public void setProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("product");
		this._product = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
