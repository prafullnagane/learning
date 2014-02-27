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

import de.hybris.platform.catalog.dto.CatalogDTO;
import de.hybris.platform.catalog.dto.CompanyDTO;
import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.core.dto.user.UserGroupDTO;
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
 * Generated dto class for type Company first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = CompanyModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "company")
public class CompanyDTO extends UserGroupDTO
{
	/** <i>Generated variable</i> - Variable of <code>Company.shippingAddresses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.AddressDTO> _shippingAddresses;
	/** <i>Generated variable</i> - Variable of <code>Company.manufacturer</code> attribute defined at extension <code> */
	private java.lang.Boolean _manufacturer;
	/** <i>Generated variable</i> - Variable of <code>Company.contact</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _contact;
	/** <i>Generated variable</i> - Variable of <code>Company.contactAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _contactAddress;
	/** <i>Generated variable</i> - Variable of <code>Company.buyerSpecificID</code> attribute defined at extension <code> */
	private java.lang.String _buyerSpecificID;
	/** <i>Generated variable</i> - Variable of <code>Company.unloadingAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _unloadingAddress;
	/** <i>Generated variable</i> - Variable of <code>Company.providedCatalogs</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.CatalogDTO> _providedCatalogs;
	/** <i>Generated variable</i> - Variable of <code>Company.country</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CountryDTO _country;
	/** <i>Generated variable</i> - Variable of <code>Company.ilnID</code> attribute defined at extension <code> */
	private java.lang.String _ilnID;
	/** <i>Generated variable</i> - Variable of <code>Company.billingAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _billingAddress;
	/** <i>Generated variable</i> - Variable of <code>Company.medias</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.media.MediaDTO> _medias;
	/** <i>Generated variable</i> - Variable of <code>Company.addresses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.AddressDTO> _addresses;
	/** <i>Generated variable</i> - Variable of <code>Company.contactAddresses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.AddressDTO> _contactAddresses;
	/** <i>Generated variable</i> - Variable of <code>Company.Id</code> attribute defined at extension <code> */
	private java.lang.String _Id;
	/** <i>Generated variable</i> - Variable of <code>Company.responsibleCompany</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CompanyDTO _responsibleCompany;
	/** <i>Generated variable</i> - Variable of <code>Company.billingAddresses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.AddressDTO> _billingAddresses;
	/** <i>Generated variable</i> - Variable of <code>Company.purchasedCatalogs</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.CatalogDTO> _purchasedCatalogs;
	/** <i>Generated variable</i> - Variable of <code>Company.supplier</code> attribute defined at extension <code> */
	private java.lang.Boolean _supplier;
	/** <i>Generated variable</i> - Variable of <code>Company.carrier</code> attribute defined at extension <code> */
	private java.lang.Boolean _carrier;
	/** <i>Generated variable</i> - Variable of <code>Company.buyer</code> attribute defined at extension <code> */
	private java.lang.Boolean _buyer;
	/** <i>Generated variable</i> - Variable of <code>Company.lineOfBuisness</code> attribute defined at extension <code> */
	private java.lang.String _lineOfBuisness;
	/** <i>Generated variable</i> - Variable of <code>Company.vatID</code> attribute defined at extension <code> */
	private java.lang.String _vatID;
	/** <i>Generated variable</i> - Variable of <code>Company.dunsID</code> attribute defined at extension <code> */
	private java.lang.String _dunsID;
	/** <i>Generated variable</i> - Variable of <code>Company.unloadingAddresses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.AddressDTO> _unloadingAddresses;
	/** <i>Generated variable</i> - Variable of <code>Company.supplierSpecificID</code> attribute defined at extension <code> */
	private java.lang.String _supplierSpecificID;
	/** <i>Generated variable</i> - Variable of <code>Company.shippingAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _shippingAddress;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompanyDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "addresses")
	@XmlElement(name = "address")
	public Collection<AddressDTO> getAddresses()
	{
		return this._addresses;
	}
	
	public AddressDTO getBillingAddress()
	{
		return this._billingAddress;
	}
	
	@XmlElementWrapper(name = "billingAddresses")
	@XmlElement(name = "address")
	public Collection<AddressDTO> getBillingAddresses()
	{
		return this._billingAddresses;
	}
	
	public Boolean getBuyer()
	{
		return this._buyer;
	}
	
	public String getBuyerSpecificID()
	{
		return this._buyerSpecificID;
	}
	
	public Boolean getCarrier()
	{
		return this._carrier;
	}
	
	public UserDTO getContact()
	{
		return this._contact;
	}
	
	public AddressDTO getContactAddress()
	{
		return this._contactAddress;
	}
	
	@XmlElementWrapper(name = "contactAddresses")
	@XmlElement(name = "address")
	public Collection<AddressDTO> getContactAddresses()
	{
		return this._contactAddresses;
	}
	
	public CountryDTO getCountry()
	{
		return this._country;
	}
	
	public String getDunsID()
	{
		return this._dunsID;
	}
	
	public String getId()
	{
		return this._Id;
	}
	
	public String getIlnID()
	{
		return this._ilnID;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getLineOfBuisness()
	{
		return this._lineOfBuisness;
	}
	
	public Boolean getManufacturer()
	{
		return this._manufacturer;
	}
	
	@XmlElementWrapper(name = "medias")
	@XmlElement(name = "media")
	public Collection<MediaDTO> getMedias()
	{
		return this._medias;
	}
	
	@XmlElementWrapper(name = "providedCatalogs")
	@XmlElement(name = "catalog")
	public Collection<CatalogDTO> getProvidedCatalogs()
	{
		return this._providedCatalogs;
	}
	
	@XmlElementWrapper(name = "purchasedCatalogs")
	@XmlElement(name = "catalog")
	public Collection<CatalogDTO> getPurchasedCatalogs()
	{
		return this._purchasedCatalogs;
	}
	
	public CompanyDTO getResponsibleCompany()
	{
		return this._responsibleCompany;
	}
	
	public AddressDTO getShippingAddress()
	{
		return this._shippingAddress;
	}
	
	@XmlElementWrapper(name = "shippingAddresses")
	@XmlElement(name = "address")
	public Collection<AddressDTO> getShippingAddresses()
	{
		return this._shippingAddresses;
	}
	
	public Boolean getSupplier()
	{
		return this._supplier;
	}
	
	public String getSupplierSpecificID()
	{
		return this._supplierSpecificID;
	}
	
	public AddressDTO getUnloadingAddress()
	{
		return this._unloadingAddress;
	}
	
	@XmlElementWrapper(name = "unloadingAddresses")
	@XmlElement(name = "address")
	public Collection<AddressDTO> getUnloadingAddresses()
	{
		return this._unloadingAddresses;
	}
	
	public String getVatID()
	{
		return this._vatID;
	}
	
	public void setAddresses(final Collection<AddressDTO> value)
	{
		this.modifiedPropsSet.add("addresses");
		this._addresses = value;
	}
	
	public void setBillingAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("billingAddress");
		this._billingAddress = value;
	}
	
	public void setBillingAddresses(final Collection<AddressDTO> value)
	{
		this.modifiedPropsSet.add("billingAddresses");
		this._billingAddresses = value;
	}
	
	public void setBuyer(final Boolean value)
	{
		this.modifiedPropsSet.add("buyer");
		this._buyer = value;
	}
	
	public void setBuyerSpecificID(final String value)
	{
		this.modifiedPropsSet.add("buyerSpecificID");
		this._buyerSpecificID = value;
	}
	
	public void setCarrier(final Boolean value)
	{
		this.modifiedPropsSet.add("carrier");
		this._carrier = value;
	}
	
	public void setContact(final UserDTO value)
	{
		this.modifiedPropsSet.add("contact");
		this._contact = value;
	}
	
	public void setContactAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("contactAddress");
		this._contactAddress = value;
	}
	
	public void setContactAddresses(final Collection<AddressDTO> value)
	{
		this.modifiedPropsSet.add("contactAddresses");
		this._contactAddresses = value;
	}
	
	public void setCountry(final CountryDTO value)
	{
		this.modifiedPropsSet.add("country");
		this._country = value;
	}
	
	public void setDunsID(final String value)
	{
		this.modifiedPropsSet.add("dunsID");
		this._dunsID = value;
	}
	
	public void setId(final String value)
	{
		this.modifiedPropsSet.add("Id");
		this._Id = value;
	}
	
	public void setIlnID(final String value)
	{
		this.modifiedPropsSet.add("ilnID");
		this._ilnID = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setLineOfBuisness(final String value)
	{
		this.modifiedPropsSet.add("lineOfBuisness");
		this._lineOfBuisness = value;
	}
	
	public void setManufacturer(final Boolean value)
	{
		this.modifiedPropsSet.add("manufacturer");
		this._manufacturer = value;
	}
	
	public void setMedias(final Collection<MediaDTO> value)
	{
		this.modifiedPropsSet.add("medias");
		this._medias = value;
	}
	
	public void setProvidedCatalogs(final Collection<CatalogDTO> value)
	{
		this.modifiedPropsSet.add("providedCatalogs");
		this._providedCatalogs = value;
	}
	
	public void setPurchasedCatalogs(final Collection<CatalogDTO> value)
	{
		this.modifiedPropsSet.add("purchasedCatalogs");
		this._purchasedCatalogs = value;
	}
	
	public void setResponsibleCompany(final CompanyDTO value)
	{
		this.modifiedPropsSet.add("responsibleCompany");
		this._responsibleCompany = value;
	}
	
	public void setShippingAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("shippingAddress");
		this._shippingAddress = value;
	}
	
	public void setShippingAddresses(final Collection<AddressDTO> value)
	{
		this.modifiedPropsSet.add("shippingAddresses");
		this._shippingAddresses = value;
	}
	
	public void setSupplier(final Boolean value)
	{
		this.modifiedPropsSet.add("supplier");
		this._supplier = value;
	}
	
	public void setSupplierSpecificID(final String value)
	{
		this.modifiedPropsSet.add("supplierSpecificID");
		this._supplierSpecificID = value;
	}
	
	public void setUnloadingAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("unloadingAddress");
		this._unloadingAddress = value;
	}
	
	public void setUnloadingAddresses(final Collection<AddressDTO> value)
	{
		this.modifiedPropsSet.add("unloadingAddresses");
		this._unloadingAddresses = value;
	}
	
	public void setVatID(final String value)
	{
		this.modifiedPropsSet.add("vatID");
		this._vatID = value;
	}
	
}
