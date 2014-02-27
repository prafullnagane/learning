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

import de.hybris.platform.btg.dto.BTGConditionResultDTO;
import de.hybris.platform.btg.dto.BTGRuleResultDTO;
import de.hybris.platform.btg.dto.BTGSegmentResultDTO;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.cms2.dto.pages.AbstractPageDTO;
import de.hybris.platform.cms2.dto.restrictions.CMSUserRestrictionDTO;
import de.hybris.platform.cockpit.dto.CockpitFavoriteCategoryDTO;
import de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO;
import de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO;
import de.hybris.platform.cockpit.dto.WidgetPreferencesDTO;
import de.hybris.platform.comments.dto.AbstractCommentDTO;
import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.order.CartDTO;
import de.hybris.platform.core.dto.order.OrderDTO;
import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.customerreview.dto.CustomerReviewDTO;
import de.hybris.platform.europe1.dto.GlobalDiscountRowDTO;
import de.hybris.platform.hmc.dto.UserProfileDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type User first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = UserModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "user")
public class UserDTO extends PrincipalDTO
{
	/** <i>Generated variable</i> - Variable of <code>User.allWriteableCatalogVersions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.CatalogVersionDTO> _allWriteableCatalogVersions;
	/** <i>Generated variable</i> - Variable of <code>User.domain</code> attribute defined at extension <code> */
	private java.lang.String _domain;
	/** <i>Generated variable</i> - Variable of <code>User.lastLogin</code> attribute defined at extension <code> */
	private java.util.Date _lastLogin;
	/** <i>Generated variable</i> - Variable of <code>User.collections</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO> _collections;
	/** <i>Generated variable</i> - Variable of <code>User.defaultPaymentAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _defaultPaymentAddress;
	/** <i>Generated variable</i> - Variable of <code>User.ldaplogin</code> attribute defined at extension <code> */
	private java.lang.String _ldaplogin;
	/** <i>Generated variable</i> - Variable of <code>User.conditionResults</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGConditionResultDTO> _conditionResults;
	/** <i>Generated variable</i> - Variable of <code>User.currentTime</code> attribute defined at extension <code> */
	private java.util.Date _currentTime;
	/** <i>Generated variable</i> - Variable of <code>User.currentDate</code> attribute defined at extension <code> */
	private java.util.Date _currentDate;
	/** <i>Generated variable</i> - Variable of <code>User.customerReviews</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.customerreview.dto.CustomerReviewDTO> _customerReviews;
	/** <i>Generated variable</i> - Variable of <code>User.cockpitFavoriteCategories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitFavoriteCategoryDTO> _cockpitFavoriteCategories;
	/** <i>Generated variable</i> - Variable of <code>User.passwordQuestion</code> attribute defined at extension <code> */
	private java.lang.String _passwordQuestion;
	/** <i>Generated variable</i> - Variable of <code>User.sessionCurrency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _sessionCurrency;
	/** <i>Generated variable</i> - Variable of <code>User.defaultShipmentAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _defaultShipmentAddress;
	/** <i>Generated variable</i> - Variable of <code>User.ldapaccount</code> attribute defined at extension <code> */
	private java.lang.Boolean _ldapaccount;
	/** <i>Generated variable</i> - Variable of <code>User.widgetPreferences</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.WidgetPreferencesDTO> _widgetPreferences;
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code> */
	private java.lang.String _Europe1PriceFactory_UPG;
	/** <i>Generated variable</i> - Variable of <code>User.authorizedToUnlockPages</code> attribute defined at extension <code> */
	private boolean _authorizedToUnlockPages;
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code> */
	private java.lang.String _Europe1PriceFactory_UTG;
	/** <i>Generated variable</i> - Variable of <code>User.europe1Discounts</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.europe1.dto.GlobalDiscountRowDTO> _europe1Discounts;
	/** <i>Generated variable</i> - Variable of <code>User.passwordAnswer</code> attribute defined at extension <code> */
	private java.lang.String _passwordAnswer;
	/** <i>Generated variable</i> - Variable of <code>User.assignedComments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.comments.dto.CommentDTO> _assignedComments;
	/** <i>Generated variable</i> - Variable of <code>User.hmcLoginDisabled</code> attribute defined at extension <code> */
	private java.lang.Boolean _hmcLoginDisabled;
	/** <i>Generated variable</i> - Variable of <code>User.addresses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.user.AddressDTO> _addresses;
	/** <i>Generated variable</i> - Variable of <code>User.sessionLanguage</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _sessionLanguage;
	/** <i>Generated variable</i> - Variable of <code>User.carts</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.order.CartDTO> _carts;
	/** <i>Generated variable</i> - Variable of <code>User.createdComments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.comments.dto.AbstractCommentDTO> _createdComments;
	/** <i>Generated variable</i> - Variable of <code>User.passwordEncoding</code> attribute defined at extension <code> */
	private java.lang.String _passwordEncoding;
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code> */
	private java.lang.String _Europe1PriceFactory_UDG;
	/** <i>Generated variable</i> - Variable of <code>User.loginDisabled</code> attribute defined at extension <code> */
	private boolean _loginDisabled;
	/** <i>Generated variable</i> - Variable of <code>User.ruleResults</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGRuleResultDTO> _ruleResults;
	/** <i>Generated variable</i> - Variable of <code>User.restrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.restrictions.CMSUserRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>User.orders</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.order.OrderDTO> _orders;
	/** <i>Generated variable</i> - Variable of <code>User.lockedPages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.pages.AbstractPageDTO> _lockedPages;
	/** <i>Generated variable</i> - Variable of <code>User.segmentResults</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGSegmentResultDTO> _segmentResults;
	/** <i>Generated variable</i> - Variable of <code>User.userprofile</code> attribute defined at extension <code> */
	private de.hybris.platform.hmc.dto.UserProfileDTO _userprofile;
	/** <i>Generated variable</i> - Variable of <code>User.cockpitSavedQueries</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO> _cockpitSavedQueries;
	/** <i>Generated variable</i> - Variable of <code>User.paymentInfos</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.order.payment.PaymentInfoDTO> _paymentInfos;
	/** <i>Generated variable</i> - Variable of <code>User.encodedPassword</code> attribute defined at extension <code> */
	private java.lang.String _encodedPassword;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "addresses")
	@XmlElement(name = "address")
	public Collection<AddressDTO> getAddresses()
	{
		return this._addresses;
	}
	
	@XmlElementWrapper(name = "allWriteableCatalogVersions")
	@XmlElement(name = "catalogVersion")
	public Collection<CatalogVersionDTO> getAllWriteableCatalogVersions()
	{
		return this._allWriteableCatalogVersions;
	}
	
	@XmlElementWrapper(name = "assignedComments")
	@XmlElement(name = "comment")
	public List<CommentDTO> getAssignedComments()
	{
		return this._assignedComments;
	}
	
	@XmlElementWrapper(name = "carts")
	@XmlElement(name = "cart")
	public Collection<CartDTO> getCarts()
	{
		return this._carts;
	}
	
	@XmlElementWrapper(name = "cockpitFavoriteCategories")
	@XmlElement(name = "cockpitFavoriteCategory")
	public Collection<CockpitFavoriteCategoryDTO> getCockpitFavoriteCategories()
	{
		return this._cockpitFavoriteCategories;
	}
	
	@XmlElementWrapper(name = "cockpitSavedQueries")
	@XmlElement(name = "cockpitSavedQuery")
	public Collection<CockpitSavedQueryDTO> getCockpitSavedQueries()
	{
		return this._cockpitSavedQueries;
	}
	
	@XmlElementWrapper(name = "collections")
	@XmlElement(name = "cockpitObjectAbstractCollection")
	public Collection<CockpitObjectAbstractCollectionDTO> getCollections()
	{
		return this._collections;
	}
	
	@XmlElementWrapper(name = "conditionResults")
	@XmlElement(name = "bTGConditionResult")
	public Collection<BTGConditionResultDTO> getConditionResults()
	{
		return this._conditionResults;
	}
	
	@XmlElementWrapper(name = "createdComments")
	@XmlElement(name = "abstractComment")
	public List<AbstractCommentDTO> getCreatedComments()
	{
		return this._createdComments;
	}
	
	public Date getCurrentDate()
	{
		return this._currentDate;
	}
	
	public Date getCurrentTime()
	{
		return this._currentTime;
	}
	
	@XmlElementWrapper(name = "customerReviews")
	@XmlElement(name = "customerReview")
	public Collection<CustomerReviewDTO> getCustomerReviews()
	{
		return this._customerReviews;
	}
	
	public AddressDTO getDefaultPaymentAddress()
	{
		return this._defaultPaymentAddress;
	}
	
	public AddressDTO getDefaultShipmentAddress()
	{
		return this._defaultShipmentAddress;
	}
	
	public String getDomain()
	{
		return this._domain;
	}
	
	public String getEncodedPassword()
	{
		return this._encodedPassword;
	}
	
	@XmlElementWrapper(name = "europe1Discounts")
	@XmlElement(name = "globalDiscountRow")
	public Collection<GlobalDiscountRowDTO> getEurope1Discounts()
	{
		return this._europe1Discounts;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEurope1PriceFactory_UDG()
	{
		return this._Europe1PriceFactory_UDG;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEurope1PriceFactory_UPG()
	{
		return this._Europe1PriceFactory_UPG;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getEurope1PriceFactory_UTG()
	{
		return this._Europe1PriceFactory_UTG;
	}
	
	public Boolean getHmcLoginDisabled()
	{
		return this._hmcLoginDisabled;
	}
	
	public Date getLastLogin()
	{
		return this._lastLogin;
	}
	
	public Boolean getLdapaccount()
	{
		return this._ldapaccount;
	}
	
	public String getLdaplogin()
	{
		return this._ldaplogin;
	}
	
	@XmlElementWrapper(name = "lockedPages")
	@XmlElement(name = "abstractPage")
	public Collection<AbstractPageDTO> getLockedPages()
	{
		return this._lockedPages;
	}
	
	@XmlElementWrapper(name = "orders")
	@XmlElement(name = "order")
	public Collection<OrderDTO> getOrders()
	{
		return this._orders;
	}
	
	public String getPasswordAnswer()
	{
		return this._passwordAnswer;
	}
	
	public String getPasswordEncoding()
	{
		return this._passwordEncoding;
	}
	
	public String getPasswordQuestion()
	{
		return this._passwordQuestion;
	}
	
	@XmlElementWrapper(name = "paymentInfos")
	@XmlElement(name = "paymentInfo")
	public Collection<PaymentInfoDTO> getPaymentInfos()
	{
		return this._paymentInfos;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "cMSUserRestriction")
	public Collection<CMSUserRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	@XmlElementWrapper(name = "ruleResults")
	@XmlElement(name = "bTGRuleResult")
	public Collection<BTGRuleResultDTO> getRuleResults()
	{
		return this._ruleResults;
	}
	
	@XmlElementWrapper(name = "segmentResults")
	@XmlElement(name = "bTGSegmentResult")
	public Collection<BTGSegmentResultDTO> getSegmentResults()
	{
		return this._segmentResults;
	}
	
	public CurrencyDTO getSessionCurrency()
	{
		return this._sessionCurrency;
	}
	
	public LanguageDTO getSessionLanguage()
	{
		return this._sessionLanguage;
	}
	
	public UserProfileDTO getUserprofile()
	{
		return this._userprofile;
	}
	
	@XmlElementWrapper(name = "widgetPreferences")
	@XmlElement(name = "widgetPreferences")
	public Collection<WidgetPreferencesDTO> getWidgetPreferences()
	{
		return this._widgetPreferences;
	}
	
	public boolean isAuthorizedToUnlockPages()
	{
		return this._authorizedToUnlockPages;
	}
	
	public boolean isLoginDisabled()
	{
		return this._loginDisabled;
	}
	
	public void setAddresses(final Collection<AddressDTO> value)
	{
		this.modifiedPropsSet.add("addresses");
		this._addresses = value;
	}
	
	public void setAllWriteableCatalogVersions(final Collection<CatalogVersionDTO> value)
	{
		this.modifiedPropsSet.add("allWriteableCatalogVersions");
		this._allWriteableCatalogVersions = value;
	}
	
	public void setAssignedComments(final List<CommentDTO> value)
	{
		this.modifiedPropsSet.add("assignedComments");
		this._assignedComments = value;
	}
	
	public void setAuthorizedToUnlockPages(final boolean value)
	{
		this.modifiedPropsSet.add("authorizedToUnlockPages");
		this._authorizedToUnlockPages = value;
	}
	
	public void setCarts(final Collection<CartDTO> value)
	{
		this.modifiedPropsSet.add("carts");
		this._carts = value;
	}
	
	public void setCockpitFavoriteCategories(final Collection<CockpitFavoriteCategoryDTO> value)
	{
		this.modifiedPropsSet.add("cockpitFavoriteCategories");
		this._cockpitFavoriteCategories = value;
	}
	
	public void setCockpitSavedQueries(final Collection<CockpitSavedQueryDTO> value)
	{
		this.modifiedPropsSet.add("cockpitSavedQueries");
		this._cockpitSavedQueries = value;
	}
	
	public void setCollections(final Collection<CockpitObjectAbstractCollectionDTO> value)
	{
		this.modifiedPropsSet.add("collections");
		this._collections = value;
	}
	
	public void setConditionResults(final Collection<BTGConditionResultDTO> value)
	{
		this.modifiedPropsSet.add("conditionResults");
		this._conditionResults = value;
	}
	
	public void setCreatedComments(final List<AbstractCommentDTO> value)
	{
		this.modifiedPropsSet.add("createdComments");
		this._createdComments = value;
	}
	
	public void setCurrentDate(final Date value)
	{
		this.modifiedPropsSet.add("currentDate");
		this._currentDate = value;
	}
	
	public void setCurrentTime(final Date value)
	{
		this.modifiedPropsSet.add("currentTime");
		this._currentTime = value;
	}
	
	public void setCustomerReviews(final Collection<CustomerReviewDTO> value)
	{
		this.modifiedPropsSet.add("customerReviews");
		this._customerReviews = value;
	}
	
	public void setDefaultPaymentAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("defaultPaymentAddress");
		this._defaultPaymentAddress = value;
	}
	
	public void setDefaultShipmentAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("defaultShipmentAddress");
		this._defaultShipmentAddress = value;
	}
	
	public void setDomain(final String value)
	{
		this.modifiedPropsSet.add("domain");
		this._domain = value;
	}
	
	public void setEncodedPassword(final String value)
	{
		this.modifiedPropsSet.add("encodedPassword");
		this._encodedPassword = value;
	}
	
	public void setEurope1Discounts(final Collection<GlobalDiscountRowDTO> value)
	{
		this.modifiedPropsSet.add("europe1Discounts");
		this._europe1Discounts = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEurope1PriceFactory_UDG(final String value)
	{
		this.modifiedPropsSet.add("Europe1PriceFactory_UDG");
		this._Europe1PriceFactory_UDG = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEurope1PriceFactory_UPG(final String value)
	{
		this.modifiedPropsSet.add("Europe1PriceFactory_UPG");
		this._Europe1PriceFactory_UPG = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setEurope1PriceFactory_UTG(final String value)
	{
		this.modifiedPropsSet.add("Europe1PriceFactory_UTG");
		this._Europe1PriceFactory_UTG = value;
	}
	
	public void setHmcLoginDisabled(final Boolean value)
	{
		this.modifiedPropsSet.add("hmcLoginDisabled");
		this._hmcLoginDisabled = value;
	}
	
	public void setLastLogin(final Date value)
	{
		this.modifiedPropsSet.add("lastLogin");
		this._lastLogin = value;
	}
	
	public void setLdapaccount(final Boolean value)
	{
		this.modifiedPropsSet.add("ldapaccount");
		this._ldapaccount = value;
	}
	
	public void setLdaplogin(final String value)
	{
		this.modifiedPropsSet.add("ldaplogin");
		this._ldaplogin = value;
	}
	
	public void setLockedPages(final Collection<AbstractPageDTO> value)
	{
		this.modifiedPropsSet.add("lockedPages");
		this._lockedPages = value;
	}
	
	public void setLoginDisabled(final boolean value)
	{
		this.modifiedPropsSet.add("loginDisabled");
		this._loginDisabled = value;
	}
	
	public void setOrders(final Collection<OrderDTO> value)
	{
		this.modifiedPropsSet.add("orders");
		this._orders = value;
	}
	
	public void setPasswordAnswer(final String value)
	{
		this.modifiedPropsSet.add("passwordAnswer");
		this._passwordAnswer = value;
	}
	
	public void setPasswordEncoding(final String value)
	{
		this.modifiedPropsSet.add("passwordEncoding");
		this._passwordEncoding = value;
	}
	
	public void setPasswordQuestion(final String value)
	{
		this.modifiedPropsSet.add("passwordQuestion");
		this._passwordQuestion = value;
	}
	
	public void setPaymentInfos(final Collection<PaymentInfoDTO> value)
	{
		this.modifiedPropsSet.add("paymentInfos");
		this._paymentInfos = value;
	}
	
	public void setRestrictions(final Collection<CMSUserRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setRuleResults(final Collection<BTGRuleResultDTO> value)
	{
		this.modifiedPropsSet.add("ruleResults");
		this._ruleResults = value;
	}
	
	public void setSegmentResults(final Collection<BTGSegmentResultDTO> value)
	{
		this.modifiedPropsSet.add("segmentResults");
		this._segmentResults = value;
	}
	
	public void setSessionCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("sessionCurrency");
		this._sessionCurrency = value;
	}
	
	public void setSessionLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("sessionLanguage");
		this._sessionLanguage = value;
	}
	
	public void setUserprofile(final UserProfileDTO value)
	{
		this.modifiedPropsSet.add("userprofile");
		this._userprofile = value;
	}
	
	public void setWidgetPreferences(final Collection<WidgetPreferencesDTO> value)
	{
		this.modifiedPropsSet.add("widgetPreferences");
		this._widgetPreferences = value;
	}
	
}
