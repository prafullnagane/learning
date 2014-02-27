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
package de.hybris.platform.core.dto.user;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.core.dto.user.TitleDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Customer first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = CustomerModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "customer")
public class CustomerDTO extends UserDTO
{
	/** <i>Generated variable</i> - Variable of <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.payment.PaymentInfoDTO _defaultPaymentInfo;
	/** <i>Generated variable</i> - Variable of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.CatalogVersionDTO> _previewCatalogVersions;
	/** <i>Generated variable</i> - Variable of <code>Customer.isInternal</code> attribute defined at extension <code> */
	private java.lang.Boolean _isInternal;
	/** <i>Generated variable</i> - Variable of <code>Customer.title</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.TitleDTO _title;
	/** <i>Generated variable</i> - Variable of <code>Customer.customerID</code> attribute defined at extension <code> */
	private java.lang.String _customerID;
	/** <i>Generated variable</i> - Variable of <code>Customer.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>Customer.token</code> attribute defined at extension <code> */
	private java.lang.String _token;
	/** <i>Generated variable</i> - Variable of <code>Customer.contactEmail</code> attribute defined at extension <code> */
	private java.lang.String _contactEmail;
	/** <i>Generated variable</i> - Variable of <code>Customer.originalUid</code> attribute defined at extension <code> */
	private java.lang.String _originalUid;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CustomerDTO()
	{
		super();
	}
	
	
	public String getContactEmail()
	{
		return this._contactEmail;
	}
	
	public String getCustomerID()
	{
		return this._customerID;
	}
	
	public PaymentInfoDTO getDefaultPaymentInfo()
	{
		return this._defaultPaymentInfo;
	}
	
	public Boolean getIsInternal()
	{
		return this._isInternal;
	}
	
	public String getOriginalUid()
	{
		return this._originalUid;
	}
	
	@XmlElementWrapper(name = "previewCatalogVersions")
	@XmlElement(name = "catalogVersion")
	public Collection<CatalogVersionDTO> getPreviewCatalogVersions()
	{
		return this._previewCatalogVersions;
	}
	
	public TitleDTO getTitle()
	{
		return this._title;
	}
	
	public String getToken()
	{
		return this._token;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getType()
	{
		return this._type;
	}
	
	public void setContactEmail(final String value)
	{
		this.modifiedPropsSet.add("contactEmail");
		this._contactEmail = value;
	}
	
	public void setCustomerID(final String value)
	{
		this.modifiedPropsSet.add("customerID");
		this._customerID = value;
	}
	
	public void setDefaultPaymentInfo(final PaymentInfoDTO value)
	{
		this.modifiedPropsSet.add("defaultPaymentInfo");
		this._defaultPaymentInfo = value;
	}
	
	public void setIsInternal(final Boolean value)
	{
		this.modifiedPropsSet.add("isInternal");
		this._isInternal = value;
	}
	
	public void setOriginalUid(final String value)
	{
		this.modifiedPropsSet.add("originalUid");
		this._originalUid = value;
	}
	
	public void setPreviewCatalogVersions(final Collection<CatalogVersionDTO> value)
	{
		this.modifiedPropsSet.add("previewCatalogVersions");
		this._previewCatalogVersions = value;
	}
	
	public void setTitle(final TitleDTO value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
	public void setToken(final String value)
	{
		this.modifiedPropsSet.add("token");
		this._token = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
}
