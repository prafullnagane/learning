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

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.CompanyDTO;
import de.hybris.platform.catalog.model.AgreementModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Agreement first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = AgreementModel.class, factory = GenericNodeFactory.class, uidProperties="id")
@XmlRootElement(name = "agreement")
public class AgreementDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Agreement.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>Agreement.buyer</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CompanyDTO _buyer;
	/** <i>Generated variable</i> - Variable of <code>Agreement.enddate</code> attribute defined at extension <code> */
	private java.util.Date _enddate;
	/** <i>Generated variable</i> - Variable of <code>Agreement.buyerContact</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _buyerContact;
	/** <i>Generated variable</i> - Variable of <code>Agreement.startdate</code> attribute defined at extension <code> */
	private java.util.Date _startdate;
	/** <i>Generated variable</i> - Variable of <code>Agreement.CatalogVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _CatalogVersion;
	/** <i>Generated variable</i> - Variable of <code>Agreement.supplierContact</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _supplierContact;
	/** <i>Generated variable</i> - Variable of <code>Agreement.id</code> attribute defined at extension <code> */
	private java.lang.String _id;
	/** <i>Generated variable</i> - Variable of <code>Agreement.supplier</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CompanyDTO _supplier;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AgreementDTO()
	{
		super();
	}
	
	
	public CompanyDTO getBuyer()
	{
		return this._buyer;
	}
	
	public UserDTO getBuyerContact()
	{
		return this._buyerContact;
	}
	
	public CatalogVersionDTO getCatalogVersion()
	{
		return this._CatalogVersion;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public Date getEnddate()
	{
		return this._enddate;
	}
	
	@XmlAttribute
	public String getId()
	{
		return this._id;
	}
	
	public Date getStartdate()
	{
		return this._startdate;
	}
	
	public CompanyDTO getSupplier()
	{
		return this._supplier;
	}
	
	public UserDTO getSupplierContact()
	{
		return this._supplierContact;
	}
	
	public void setBuyer(final CompanyDTO value)
	{
		this.modifiedPropsSet.add("buyer");
		this._buyer = value;
	}
	
	public void setBuyerContact(final UserDTO value)
	{
		this.modifiedPropsSet.add("buyerContact");
		this._buyerContact = value;
	}
	
	public void setCatalogVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("CatalogVersion");
		this._CatalogVersion = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setEnddate(final Date value)
	{
		this.modifiedPropsSet.add("enddate");
		this._enddate = value;
	}
	
	public void setId(final String value)
	{
		this.modifiedPropsSet.add("id");
		this._id = value;
	}
	
	public void setStartdate(final Date value)
	{
		this.modifiedPropsSet.add("startdate");
		this._startdate = value;
	}
	
	public void setSupplier(final CompanyDTO value)
	{
		this.modifiedPropsSet.add("supplier");
		this._supplier = value;
	}
	
	public void setSupplierContact(final UserDTO value)
	{
		this.modifiedPropsSet.add("supplierContact");
		this._supplierContact = value;
	}
	
}
