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
package de.hybris.platform.customerreview.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CustomerReview first defined at extension customerreview
 */
@SuppressWarnings("all")
@GraphNode(target = CustomerReviewModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "customerreview")
public class CustomerReviewDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.blocked</code> attribute defined at extension <code> */
	private java.lang.Boolean _blocked;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.approvalStatus</code> attribute defined at extension <code> */
	private java.lang.String _approvalStatus;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.headline</code> attribute defined at extension <code> */
	private java.lang.String _headline;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.product</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.product.ProductDTO _product;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.comment</code> attribute defined at extension <code> */
	private java.lang.String _comment;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.rating</code> attribute defined at extension <code> */
	private java.lang.Double _rating;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	/** <i>Generated variable</i> - Variable of <code>CustomerReview.alias</code> attribute defined at extension <code> */
	private java.lang.String _alias;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerReviewDTO()
	{
		super();
	}
	
	
	public String getAlias()
	{
		return this._alias;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getApprovalStatus()
	{
		return this._approvalStatus;
	}
	
	public Boolean getBlocked()
	{
		return this._blocked;
	}
	
	public String getComment()
	{
		return this._comment;
	}
	
	public String getHeadline()
	{
		return this._headline;
	}
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public ProductDTO getProduct()
	{
		return this._product;
	}
	
	public Double getRating()
	{
		return this._rating;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setAlias(final String value)
	{
		this.modifiedPropsSet.add("alias");
		this._alias = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setApprovalStatus(final String value)
	{
		this.modifiedPropsSet.add("approvalStatus");
		this._approvalStatus = value;
	}
	
	public void setBlocked(final Boolean value)
	{
		this.modifiedPropsSet.add("blocked");
		this._blocked = value;
	}
	
	public void setComment(final String value)
	{
		this.modifiedPropsSet.add("comment");
		this._comment = value;
	}
	
	public void setHeadline(final String value)
	{
		this.modifiedPropsSet.add("headline");
		this._headline = value;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setProduct(final ProductDTO value)
	{
		this.modifiedPropsSet.add("product");
		this._product = value;
	}
	
	public void setRating(final Double value)
	{
		this.modifiedPropsSet.add("rating");
		this._rating = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
