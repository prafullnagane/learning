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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CountryDTO;
import de.hybris.platform.core.dto.c2l.RegionDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.core.dto.user.TitleDTO;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.orderscheduling.dto.CartToOrderCronJobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Address first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = AddressModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "address")
public class AddressDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Address.url</code> attribute defined at extension <code> */
	private java.lang.String _url;
	/** <i>Generated variable</i> - Variable of <code>Address.remarks</code> attribute defined at extension <code> */
	private java.lang.String _remarks;
	/** <i>Generated variable</i> - Variable of <code>Address.contactAddress</code> attribute defined at extension <code> */
	private java.lang.Boolean _contactAddress;
	/** <i>Generated variable</i> - Variable of <code>Address.paymentAddresss2CartToOrderCronJob</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.orderscheduling.dto.CartToOrderCronJobDTO> _paymentAddresss2CartToOrderCronJob;
	/** <i>Generated variable</i> - Variable of <code>Address.company</code> attribute defined at extension <code> */
	private java.lang.String _company;
	/** <i>Generated variable</i> - Variable of <code>Address.billingAddress</code> attribute defined at extension <code> */
	private java.lang.Boolean _billingAddress;
	/** <i>Generated variable</i> - Variable of <code>Address.line1</code> attribute defined at extension <code> */
	private java.lang.String _line1;
	/** <i>Generated variable</i> - Variable of <code>Address.postalcode</code> attribute defined at extension <code> */
	private java.lang.String _postalcode;
	/** <i>Generated variable</i> - Variable of <code>Address.typeQualifier</code> attribute defined at extension <code> */
	private java.lang.String _typeQualifier;
	/** <i>Generated variable</i> - Variable of <code>Address.region</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.RegionDTO _region;
	/** <i>Generated variable</i> - Variable of <code>Address.shippingAddress</code> attribute defined at extension <code> */
	private java.lang.Boolean _shippingAddress;
	/** <i>Generated variable</i> - Variable of <code>Address.line2</code> attribute defined at extension <code> */
	private java.lang.String _line2;
	/** <i>Generated variable</i> - Variable of <code>Address.unloadingAddress</code> attribute defined at extension <code> */
	private java.lang.Boolean _unloadingAddress;
	/** <i>Generated variable</i> - Variable of <code>Address.town</code> attribute defined at extension <code> */
	private java.lang.String _town;
	/** <i>Generated variable</i> - Variable of <code>Address.department</code> attribute defined at extension <code> */
	private java.lang.String _department;
	/** <i>Generated variable</i> - Variable of <code>Address.streetnumber</code> attribute defined at extension <code> */
	private java.lang.String _streetnumber;
	/** <i>Generated variable</i> - Variable of <code>Address.building</code> attribute defined at extension <code> */
	private java.lang.String _building;
	/** <i>Generated variable</i> - Variable of <code>Address.cellphone</code> attribute defined at extension <code> */
	private java.lang.String _cellphone;
	/** <i>Generated variable</i> - Variable of <code>Address.pobox</code> attribute defined at extension <code> */
	private java.lang.String _pobox;
	/** <i>Generated variable</i> - Variable of <code>Address.gender</code> attribute defined at extension <code> */
	private java.lang.String _gender;
	/** <i>Generated variable</i> - Variable of <code>Address.deliveryAddresss2CartToOrderCronJob</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.orderscheduling.dto.CartToOrderCronJobDTO> _deliveryAddresss2CartToOrderCronJob;
	/** <i>Generated variable</i> - Variable of <code>Address.streetname</code> attribute defined at extension <code> */
	private java.lang.String _streetname;
	/** <i>Generated variable</i> - Variable of <code>Address.phone2</code> attribute defined at extension <code> */
	private java.lang.String _phone2;
	/** <i>Generated variable</i> - Variable of <code>Address.lastname</code> attribute defined at extension <code> */
	private java.lang.String _lastname;
	/** <i>Generated variable</i> - Variable of <code>Address.middlename2</code> attribute defined at extension <code> */
	private java.lang.String _middlename2;
	/** <i>Generated variable</i> - Variable of <code>Address.original</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _original;
	/** <i>Generated variable</i> - Variable of <code>Address.duplicate</code> attribute defined at extension <code> */
	private java.lang.Boolean _duplicate;
	/** <i>Generated variable</i> - Variable of <code>Address.title</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.TitleDTO _title;
	/** <i>Generated variable</i> - Variable of <code>Address.publicKey</code> attribute defined at extension <code> */
	private java.lang.String _publicKey;
	/** <i>Generated variable</i> - Variable of <code>Address.firstname</code> attribute defined at extension <code> */
	private java.lang.String _firstname;
	/** <i>Generated variable</i> - Variable of <code>Address.country</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CountryDTO _country;
	/** <i>Generated variable</i> - Variable of <code>Address.fax</code> attribute defined at extension <code> */
	private java.lang.String _fax;
	/** <i>Generated variable</i> - Variable of <code>Address.district</code> attribute defined at extension <code> */
	private java.lang.String _district;
	/** <i>Generated variable</i> - Variable of <code>Address.middlename</code> attribute defined at extension <code> */
	private java.lang.String _middlename;
	/** <i>Generated variable</i> - Variable of <code>Address.email</code> attribute defined at extension <code> */
	private java.lang.String _email;
	/** <i>Generated variable</i> - Variable of <code>Address.phone1</code> attribute defined at extension <code> */
	private java.lang.String _phone1;
	/** <i>Generated variable</i> - Variable of <code>Address.appartment</code> attribute defined at extension <code> */
	private java.lang.String _appartment;
	/** <i>Generated variable</i> - Variable of <code>Address.visibleInAddressBook</code> attribute defined at extension <code> */
	private java.lang.Boolean _visibleInAddressBook;
	/** <i>Generated variable</i> - Variable of <code>Address.dateOfBirth</code> attribute defined at extension <code> */
	private java.util.Date _dateOfBirth;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AddressDTO()
	{
		super();
	}
	
	
	public String getAppartment()
	{
		return this._appartment;
	}
	
	public Boolean getBillingAddress()
	{
		return this._billingAddress;
	}
	
	public String getBuilding()
	{
		return this._building;
	}
	
	public String getCellphone()
	{
		return this._cellphone;
	}
	
	public String getCompany()
	{
		return this._company;
	}
	
	public Boolean getContactAddress()
	{
		return this._contactAddress;
	}
	
	public CountryDTO getCountry()
	{
		return this._country;
	}
	
	public Date getDateOfBirth()
	{
		return this._dateOfBirth;
	}
	
	@XmlElementWrapper(name = "deliveryAddresss2CartToOrderCronJob")
	@XmlElement(name = "cartToOrderCronJob")
	public Collection<CartToOrderCronJobDTO> getDeliveryAddresss2CartToOrderCronJob()
	{
		return this._deliveryAddresss2CartToOrderCronJob;
	}
	
	public String getDepartment()
	{
		return this._department;
	}
	
	public String getDistrict()
	{
		return this._district;
	}
	
	public Boolean getDuplicate()
	{
		return this._duplicate;
	}
	
	public String getEmail()
	{
		return this._email;
	}
	
	public String getFax()
	{
		return this._fax;
	}
	
	public String getFirstname()
	{
		return this._firstname;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getGender()
	{
		return this._gender;
	}
	
	public String getLastname()
	{
		return this._lastname;
	}
	
	public String getLine1()
	{
		return this._line1;
	}
	
	public String getLine2()
	{
		return this._line2;
	}
	
	public String getMiddlename()
	{
		return this._middlename;
	}
	
	public String getMiddlename2()
	{
		return this._middlename2;
	}
	
	public AddressDTO getOriginal()
	{
		return this._original;
	}
	
	@XmlElementWrapper(name = "paymentAddresss2CartToOrderCronJob")
	@XmlElement(name = "cartToOrderCronJob")
	public Collection<CartToOrderCronJobDTO> getPaymentAddresss2CartToOrderCronJob()
	{
		return this._paymentAddresss2CartToOrderCronJob;
	}
	
	public String getPhone1()
	{
		return this._phone1;
	}
	
	public String getPhone2()
	{
		return this._phone2;
	}
	
	public String getPobox()
	{
		return this._pobox;
	}
	
	public String getPostalcode()
	{
		return this._postalcode;
	}
	
	public String getPublicKey()
	{
		return this._publicKey;
	}
	
	public RegionDTO getRegion()
	{
		return this._region;
	}
	
	public String getRemarks()
	{
		return this._remarks;
	}
	
	public Boolean getShippingAddress()
	{
		return this._shippingAddress;
	}
	
	public String getStreetname()
	{
		return this._streetname;
	}
	
	public String getStreetnumber()
	{
		return this._streetnumber;
	}
	
	public TitleDTO getTitle()
	{
		return this._title;
	}
	
	public String getTown()
	{
		return this._town;
	}
	
	public String getTypeQualifier()
	{
		return this._typeQualifier;
	}
	
	public Boolean getUnloadingAddress()
	{
		return this._unloadingAddress;
	}
	
	public String getUrl()
	{
		return this._url;
	}
	
	public Boolean getVisibleInAddressBook()
	{
		return this._visibleInAddressBook;
	}
	
	public void setAppartment(final String value)
	{
		this.modifiedPropsSet.add("appartment");
		this._appartment = value;
	}
	
	public void setBillingAddress(final Boolean value)
	{
		this.modifiedPropsSet.add("billingAddress");
		this._billingAddress = value;
	}
	
	public void setBuilding(final String value)
	{
		this.modifiedPropsSet.add("building");
		this._building = value;
	}
	
	public void setCellphone(final String value)
	{
		this.modifiedPropsSet.add("cellphone");
		this._cellphone = value;
	}
	
	public void setCompany(final String value)
	{
		this.modifiedPropsSet.add("company");
		this._company = value;
	}
	
	public void setContactAddress(final Boolean value)
	{
		this.modifiedPropsSet.add("contactAddress");
		this._contactAddress = value;
	}
	
	public void setCountry(final CountryDTO value)
	{
		this.modifiedPropsSet.add("country");
		this._country = value;
	}
	
	public void setDateOfBirth(final Date value)
	{
		this.modifiedPropsSet.add("dateOfBirth");
		this._dateOfBirth = value;
	}
	
	public void setDeliveryAddresss2CartToOrderCronJob(final Collection<CartToOrderCronJobDTO> value)
	{
		this.modifiedPropsSet.add("deliveryAddresss2CartToOrderCronJob");
		this._deliveryAddresss2CartToOrderCronJob = value;
	}
	
	public void setDepartment(final String value)
	{
		this.modifiedPropsSet.add("department");
		this._department = value;
	}
	
	public void setDistrict(final String value)
	{
		this.modifiedPropsSet.add("district");
		this._district = value;
	}
	
	public void setDuplicate(final Boolean value)
	{
		this.modifiedPropsSet.add("duplicate");
		this._duplicate = value;
	}
	
	public void setEmail(final String value)
	{
		this.modifiedPropsSet.add("email");
		this._email = value;
	}
	
	public void setFax(final String value)
	{
		this.modifiedPropsSet.add("fax");
		this._fax = value;
	}
	
	public void setFirstname(final String value)
	{
		this.modifiedPropsSet.add("firstname");
		this._firstname = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setGender(final String value)
	{
		this.modifiedPropsSet.add("gender");
		this._gender = value;
	}
	
	public void setLastname(final String value)
	{
		this.modifiedPropsSet.add("lastname");
		this._lastname = value;
	}
	
	public void setLine1(final String value)
	{
		this.modifiedPropsSet.add("line1");
		this._line1 = value;
	}
	
	public void setLine2(final String value)
	{
		this.modifiedPropsSet.add("line2");
		this._line2 = value;
	}
	
	public void setMiddlename(final String value)
	{
		this.modifiedPropsSet.add("middlename");
		this._middlename = value;
	}
	
	public void setMiddlename2(final String value)
	{
		this.modifiedPropsSet.add("middlename2");
		this._middlename2 = value;
	}
	
	public void setOriginal(final AddressDTO value)
	{
		this.modifiedPropsSet.add("original");
		this._original = value;
	}
	
	public void setPaymentAddresss2CartToOrderCronJob(final Collection<CartToOrderCronJobDTO> value)
	{
		this.modifiedPropsSet.add("paymentAddresss2CartToOrderCronJob");
		this._paymentAddresss2CartToOrderCronJob = value;
	}
	
	public void setPhone1(final String value)
	{
		this.modifiedPropsSet.add("phone1");
		this._phone1 = value;
	}
	
	public void setPhone2(final String value)
	{
		this.modifiedPropsSet.add("phone2");
		this._phone2 = value;
	}
	
	public void setPobox(final String value)
	{
		this.modifiedPropsSet.add("pobox");
		this._pobox = value;
	}
	
	public void setPostalcode(final String value)
	{
		this.modifiedPropsSet.add("postalcode");
		this._postalcode = value;
	}
	
	public void setPublicKey(final String value)
	{
		this.modifiedPropsSet.add("publicKey");
		this._publicKey = value;
	}
	
	public void setRegion(final RegionDTO value)
	{
		this.modifiedPropsSet.add("region");
		this._region = value;
	}
	
	public void setRemarks(final String value)
	{
		this.modifiedPropsSet.add("remarks");
		this._remarks = value;
	}
	
	public void setShippingAddress(final Boolean value)
	{
		this.modifiedPropsSet.add("shippingAddress");
		this._shippingAddress = value;
	}
	
	public void setStreetname(final String value)
	{
		this.modifiedPropsSet.add("streetname");
		this._streetname = value;
	}
	
	public void setStreetnumber(final String value)
	{
		this.modifiedPropsSet.add("streetnumber");
		this._streetnumber = value;
	}
	
	public void setTitle(final TitleDTO value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
	public void setTown(final String value)
	{
		this.modifiedPropsSet.add("town");
		this._town = value;
	}
	
	public void setTypeQualifier(final String value)
	{
		this.modifiedPropsSet.add("typeQualifier");
		this._typeQualifier = value;
	}
	
	public void setUnloadingAddress(final Boolean value)
	{
		this.modifiedPropsSet.add("unloadingAddress");
		this._unloadingAddress = value;
	}
	
	public void setUrl(final String value)
	{
		this.modifiedPropsSet.add("url");
		this._url = value;
	}
	
	public void setVisibleInAddressBook(final Boolean value)
	{
		this.modifiedPropsSet.add("visibleInAddressBook");
		this._visibleInAddressBook = value;
	}
	
}
