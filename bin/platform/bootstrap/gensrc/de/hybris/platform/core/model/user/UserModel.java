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
package de.hybris.platform.core.model.user;

import de.hybris.platform.btg.model.BTGConditionResultModel;
import de.hybris.platform.btg.model.BTGRuleResultModel;
import de.hybris.platform.btg.model.BTGSegmentResultModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.restrictions.CMSUserRestrictionModel;
import de.hybris.platform.cockpit.model.CockpitFavoriteCategoryModel;
import de.hybris.platform.cockpit.model.CockpitObjectAbstractCollectionModel;
import de.hybris.platform.cockpit.model.CockpitSavedQueryModel;
import de.hybris.platform.cockpit.model.WidgetPreferencesModel;
import de.hybris.platform.comments.model.AbstractCommentModel;
import de.hybris.platform.comments.model.CommentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.europe1.enums.UserDiscountGroup;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.europe1.enums.UserTaxGroup;
import de.hybris.platform.europe1.model.GlobalDiscountRowModel;
import de.hybris.platform.hmc.model.UserProfileModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type User first defined at extension core.
 */
@SuppressWarnings("all")
public class UserModel extends PrincipalModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "User";
	
	/**<i>Generated relation code constant for relation <code>WidgetPreferencesToUserRelation</code> defining source attribute <code>widgetPreferences</code> in extension <code>cockpit</code>.</i>*/
	public final static String _WIDGETPREFERENCESTOUSERRELATION = "WidgetPreferencesToUserRelation";
	
	/**<i>Generated relation code constant for relation <code>CommentAssigneeRelation</code> defining source attribute <code>assignedComments</code> in extension <code>comments</code>.</i>*/
	public final static String _COMMENTASSIGNEERELATION = "CommentAssigneeRelation";
	
	/**<i>Generated relation code constant for relation <code>AbstractCommentAuthorRelation</code> defining source attribute <code>createdComments</code> in extension <code>comments</code>.</i>*/
	public final static String _ABSTRACTCOMMENTAUTHORRELATION = "AbstractCommentAuthorRelation";
	
	/**<i>Generated relation code constant for relation <code>UsersForRestriction</code> defining source attribute <code>restrictions</code> in extension <code>cms2</code>.</i>*/
	public final static String _USERSFORRESTRICTION = "UsersForRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.allWriteableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	public static final String ALLWRITEABLECATALOGVERSIONS = "allWriteableCatalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.domain</code> attribute defined at extension <code>ldap</code>. */
	public static final String DOMAIN = "domain";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.lastLogin</code> attribute defined at extension <code>core</code>. */
	public static final String LASTLOGIN = "lastLogin";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.collections</code> attribute defined at extension <code>cockpit</code>. */
	public static final String COLLECTIONS = "collections";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.ldaplogin</code> attribute defined at extension <code>ldap</code>. */
	public static final String LDAPLOGIN = "ldaplogin";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. */
	public static final String DEFAULTPAYMENTADDRESS = "defaultPaymentAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.conditionResults</code> attribute defined at extension <code>btg</code>. */
	public static final String CONDITIONRESULTS = "conditionResults";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.currentTime</code> attribute defined at extension <code>core</code>. */
	public static final String CURRENTTIME = "currentTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.currentDate</code> attribute defined at extension <code>core</code>. */
	public static final String CURRENTDATE = "currentDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.cockpitFavoriteCategories</code> attribute defined at extension <code>cockpit</code>. */
	public static final String COCKPITFAVORITECATEGORIES = "cockpitFavoriteCategories";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.customerReviews</code> attribute defined at extension <code>customerreview</code>. */
	public static final String CUSTOMERREVIEWS = "customerReviews";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. */
	public static final String PASSWORDQUESTION = "passwordQuestion";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. */
	public static final String SESSIONCURRENCY = "sessionCurrency";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. */
	public static final String DEFAULTSHIPMENTADDRESS = "defaultShipmentAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.ldapaccount</code> attribute defined at extension <code>ldap</code>. */
	public static final String LDAPACCOUNT = "ldapaccount";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.widgetPreferences</code> attribute defined at extension <code>cockpit</code>. */
	public static final String WIDGETPREFERENCES = "widgetPreferences";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_UPG = "Europe1PriceFactory_UPG";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.authorizedToUnlockPages</code> attribute defined at extension <code>cms2</code>. */
	public static final String AUTHORIZEDTOUNLOCKPAGES = "authorizedToUnlockPages";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_UTG = "Europe1PriceFactory_UTG";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1DISCOUNTS = "europe1Discounts";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. */
	public static final String PASSWORDANSWER = "passwordAnswer";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. */
	public static final String ASSIGNEDCOMMENTS = "assignedComments";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. */
	public static final String HMCLOGINDISABLED = "hmcLoginDisabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.addresses</code> attribute defined at extension <code>core</code>. */
	public static final String ADDRESSES = "addresses";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. */
	public static final String SESSIONLANGUAGE = "sessionLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.carts</code> attribute defined at extension <code>core</code>. */
	public static final String CARTS = "carts";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.createdComments</code> attribute defined at extension <code>comments</code>. */
	public static final String CREATEDCOMMENTS = "createdComments";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_UDG = "Europe1PriceFactory_UDG";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. */
	public static final String PASSWORDENCODING = "passwordEncoding";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. */
	public static final String LOGINDISABLED = "loginDisabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.ruleResults</code> attribute defined at extension <code>btg</code>. */
	public static final String RULERESULTS = "ruleResults";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.restrictions</code> attribute defined at extension <code>cms2</code>. */
	public static final String RESTRICTIONS = "restrictions";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.orders</code> attribute defined at extension <code>core</code>. */
	public static final String ORDERS = "orders";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.lockedPages</code> attribute defined at extension <code>cms2</code>. */
	public static final String LOCKEDPAGES = "lockedPages";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.segmentResults</code> attribute defined at extension <code>btg</code>. */
	public static final String SEGMENTRESULTS = "segmentResults";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.userprofile</code> attribute defined at extension <code>core</code>. */
	public static final String USERPROFILE = "userprofile";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.cockpitSavedQueries</code> attribute defined at extension <code>cockpit</code>. */
	public static final String COCKPITSAVEDQUERIES = "cockpitSavedQueries";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. */
	public static final String PAYMENTINFOS = "paymentInfos";
	
	/** <i>Generated constant</i> - Attribute key of <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. */
	public static final String ENCODEDPASSWORD = "encodedPassword";
	
	
	/** <i>Generated variable</i> - Variable of <code>User.allWriteableCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	private Collection<CatalogVersionModel> _allWriteableCatalogVersions;
	
	/** <i>Generated variable</i> - Variable of <code>User.domain</code> attribute defined at extension <code>ldap</code>. */
	private String _domain;
	
	/** <i>Generated variable</i> - Variable of <code>User.lastLogin</code> attribute defined at extension <code>core</code>. */
	private Date _lastLogin;
	
	/** <i>Generated variable</i> - Variable of <code>User.collections</code> attribute defined at extension <code>cockpit</code>. */
	private Collection<CockpitObjectAbstractCollectionModel> _collections;
	
	/** <i>Generated variable</i> - Variable of <code>User.ldaplogin</code> attribute defined at extension <code>ldap</code>. */
	private String _ldaplogin;
	
	/** <i>Generated variable</i> - Variable of <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. */
	private AddressModel _defaultPaymentAddress;
	
	/** <i>Generated variable</i> - Variable of <code>User.conditionResults</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGConditionResultModel> _conditionResults;
	
	/** <i>Generated variable</i> - Variable of <code>User.currentTime</code> attribute defined at extension <code>core</code>. */
	private Date _currentTime;
	
	/** <i>Generated variable</i> - Variable of <code>User.currentDate</code> attribute defined at extension <code>core</code>. */
	private Date _currentDate;
	
	/** <i>Generated variable</i> - Variable of <code>User.cockpitFavoriteCategories</code> attribute defined at extension <code>cockpit</code>. */
	private Collection<CockpitFavoriteCategoryModel> _cockpitFavoriteCategories;
	
	/** <i>Generated variable</i> - Variable of <code>User.customerReviews</code> attribute defined at extension <code>customerreview</code>. */
	private Collection<CustomerReviewModel> _customerReviews;
	
	/** <i>Generated variable</i> - Variable of <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. */
	private String _passwordQuestion;
	
	/** <i>Generated variable</i> - Variable of <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. */
	private CurrencyModel _sessionCurrency;
	
	/** <i>Generated variable</i> - Variable of <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. */
	private AddressModel _defaultShipmentAddress;
	
	/** <i>Generated variable</i> - Variable of <code>User.ldapaccount</code> attribute defined at extension <code>ldap</code>. */
	private Boolean _ldapaccount;
	
	/** <i>Generated variable</i> - Variable of <code>User.widgetPreferences</code> attribute defined at extension <code>cockpit</code>. */
	private Collection<WidgetPreferencesModel> _widgetPreferences;
	
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. */
	private UserPriceGroup _Europe1PriceFactory_UPG;
	
	/** <i>Generated variable</i> - Variable of <code>User.authorizedToUnlockPages</code> attribute defined at extension <code>cms2</code>. */
	private Boolean _authorizedToUnlockPages;
	
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. */
	private UserTaxGroup _Europe1PriceFactory_UTG;
	
	/** <i>Generated variable</i> - Variable of <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. */
	private Collection<GlobalDiscountRowModel> _europe1Discounts;
	
	/** <i>Generated variable</i> - Variable of <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. */
	private String _passwordAnswer;
	
	/** <i>Generated variable</i> - Variable of <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. */
	private List<CommentModel> _assignedComments;
	
	/** <i>Generated variable</i> - Variable of <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. */
	private Boolean _hmcLoginDisabled;
	
	/** <i>Generated variable</i> - Variable of <code>User.addresses</code> attribute defined at extension <code>core</code>. */
	private Collection<AddressModel> _addresses;
	
	/** <i>Generated variable</i> - Variable of <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. */
	private LanguageModel _sessionLanguage;
	
	/** <i>Generated variable</i> - Variable of <code>User.carts</code> attribute defined at extension <code>core</code>. */
	private Collection<CartModel> _carts;
	
	/** <i>Generated variable</i> - Variable of <code>User.createdComments</code> attribute defined at extension <code>comments</code>. */
	private List<AbstractCommentModel> _createdComments;
	
	/** <i>Generated variable</i> - Variable of <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. */
	private UserDiscountGroup _Europe1PriceFactory_UDG;
	
	/** <i>Generated variable</i> - Variable of <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. */
	private String _passwordEncoding;
	
	/** <i>Generated variable</i> - Variable of <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. */
	private Boolean _loginDisabled;
	
	/** <i>Generated variable</i> - Variable of <code>User.ruleResults</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGRuleResultModel> _ruleResults;
	
	/** <i>Generated variable</i> - Variable of <code>User.restrictions</code> attribute defined at extension <code>cms2</code>. */
	private Collection<CMSUserRestrictionModel> _restrictions;
	
	/** <i>Generated variable</i> - Variable of <code>User.orders</code> attribute defined at extension <code>core</code>. */
	private Collection<OrderModel> _orders;
	
	/** <i>Generated variable</i> - Variable of <code>User.lockedPages</code> attribute defined at extension <code>cms2</code>. */
	private Collection<AbstractPageModel> _lockedPages;
	
	/** <i>Generated variable</i> - Variable of <code>User.segmentResults</code> attribute defined at extension <code>btg</code>. */
	private Collection<BTGSegmentResultModel> _segmentResults;
	
	/** <i>Generated variable</i> - Variable of <code>User.userprofile</code> attribute defined at extension <code>core</code>. */
	private UserProfileModel _userprofile;
	
	/** <i>Generated variable</i> - Variable of <code>User.cockpitSavedQueries</code> attribute defined at extension <code>cockpit</code>. */
	private Collection<CockpitSavedQueryModel> _cockpitSavedQueries;
	
	/** <i>Generated variable</i> - Variable of <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. */
	private Collection<PaymentInfoModel> _paymentInfos;
	
	/** <i>Generated variable</i> - Variable of <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. */
	private String _encodedPassword;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public UserModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public UserModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public UserModel(final boolean _loginDisabled, final String _uid)
	{
		super();
		setLoginDisabled(_loginDisabled);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _customerReviews initial attribute declared by type <code>User</code> at extension <code>customerreview</code>
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated
	public UserModel(final Collection<CustomerReviewModel> _customerReviews, final boolean _loginDisabled, final ItemModel _owner, final String _uid)
	{
		super();
		setCustomerReviews(_customerReviews);
		setLoginDisabled(_loginDisabled);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.addresses</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the addresses
	 */
	public Collection<AddressModel> getAddresses()
	{
		return _addresses = getPersistenceContext().getValue(ADDRESSES, _addresses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.allWriteableCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allWriteableCatalogVersions
	 */
	public Collection<CatalogVersionModel> getAllWriteableCatalogVersions()
	{
		return _allWriteableCatalogVersions = getPersistenceContext().getValue(ALLWRITEABLECATALOGVERSIONS, _allWriteableCatalogVersions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the assignedComments
	 */
	public List<CommentModel> getAssignedComments()
	{
		return _assignedComments = getPersistenceContext().getValue(ASSIGNEDCOMMENTS, _assignedComments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.carts</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the carts
	 */
	public Collection<CartModel> getCarts()
	{
		return _carts = getPersistenceContext().getValue(CARTS, _carts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.cockpitFavoriteCategories</code> attribute defined at extension <code>cockpit</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cockpitFavoriteCategories
	 */
	public Collection<CockpitFavoriteCategoryModel> getCockpitFavoriteCategories()
	{
		return _cockpitFavoriteCategories = getPersistenceContext().getValue(COCKPITFAVORITECATEGORIES, _cockpitFavoriteCategories);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.cockpitSavedQueries</code> attribute defined at extension <code>cockpit</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cockpitSavedQueries
	 */
	public Collection<CockpitSavedQueryModel> getCockpitSavedQueries()
	{
		return _cockpitSavedQueries = getPersistenceContext().getValue(COCKPITSAVEDQUERIES, _cockpitSavedQueries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.collections</code> attribute defined at extension <code>cockpit</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the collections
	 */
	public Collection<CockpitObjectAbstractCollectionModel> getCollections()
	{
		return _collections = getPersistenceContext().getValue(COLLECTIONS, _collections);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.conditionResults</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the conditionResults
	 */
	public Collection<BTGConditionResultModel> getConditionResults()
	{
		return _conditionResults = getPersistenceContext().getValue(CONDITIONRESULTS, _conditionResults);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.createdComments</code> attribute defined at extension <code>comments</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the createdComments
	 */
	public List<AbstractCommentModel> getCreatedComments()
	{
		return _createdComments = getPersistenceContext().getValue(CREATEDCOMMENTS, _createdComments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.currentDate</code> attribute defined at extension <code>core</code>. 
	 * @return the currentDate
	 */
	public Date getCurrentDate()
	{
		return _currentDate = getPersistenceContext().getValue(CURRENTDATE, _currentDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.currentTime</code> attribute defined at extension <code>core</code>. 
	 * @return the currentTime
	 */
	public Date getCurrentTime()
	{
		return _currentTime = getPersistenceContext().getValue(CURRENTTIME, _currentTime);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.customerReviews</code> attribute defined at extension <code>customerreview</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the customerReviews
	 */
	public Collection<CustomerReviewModel> getCustomerReviews()
	{
		return _customerReviews = getPersistenceContext().getValue(CUSTOMERREVIEWS, _customerReviews);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. 
	 * @return the defaultPaymentAddress
	 */
	public AddressModel getDefaultPaymentAddress()
	{
		return _defaultPaymentAddress = getPersistenceContext().getValue(DEFAULTPAYMENTADDRESS, _defaultPaymentAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. 
	 * @return the defaultShipmentAddress
	 */
	public AddressModel getDefaultShipmentAddress()
	{
		return _defaultShipmentAddress = getPersistenceContext().getValue(DEFAULTSHIPMENTADDRESS, _defaultShipmentAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.domain</code> attribute defined at extension <code>ldap</code>. 
	 * @return the domain
	 */
	public String getDomain()
	{
		return _domain = getPersistenceContext().getValue(DOMAIN, _domain);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. 
	 * @return the encodedPassword
	 */
	public String getEncodedPassword()
	{
		return _encodedPassword = getPersistenceContext().getValue(ENCODEDPASSWORD, _encodedPassword);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the europe1Discounts
	 */
	public Collection<GlobalDiscountRowModel> getEurope1Discounts()
	{
		return _europe1Discounts = getPersistenceContext().getValue(EUROPE1DISCOUNTS, _europe1Discounts);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_UDG
	 */
	public UserDiscountGroup getEurope1PriceFactory_UDG()
	{
		return _Europe1PriceFactory_UDG = getPersistenceContext().getValue(EUROPE1PRICEFACTORY_UDG, _Europe1PriceFactory_UDG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_UPG
	 */
	public UserPriceGroup getEurope1PriceFactory_UPG()
	{
		return _Europe1PriceFactory_UPG = getPersistenceContext().getValue(EUROPE1PRICEFACTORY_UPG, _Europe1PriceFactory_UPG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_UTG
	 */
	public UserTaxGroup getEurope1PriceFactory_UTG()
	{
		return _Europe1PriceFactory_UTG = getPersistenceContext().getValue(EUROPE1PRICEFACTORY_UTG, _Europe1PriceFactory_UTG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. 
	 * @return the hmcLoginDisabled
	 */
	public Boolean getHmcLoginDisabled()
	{
		return _hmcLoginDisabled = getPersistenceContext().getValue(HMCLOGINDISABLED, _hmcLoginDisabled);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.lastLogin</code> attribute defined at extension <code>core</code>. 
	 * @return the lastLogin
	 */
	public Date getLastLogin()
	{
		return _lastLogin = getPersistenceContext().getValue(LASTLOGIN, _lastLogin);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.ldapaccount</code> attribute defined at extension <code>ldap</code>. 
	 * @return the ldapaccount
	 */
	public Boolean getLdapaccount()
	{
		return _ldapaccount = getPersistenceContext().getValue(LDAPACCOUNT, _ldapaccount);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.ldaplogin</code> attribute defined at extension <code>ldap</code>. 
	 * @return the ldaplogin
	 */
	public String getLdaplogin()
	{
		return _ldaplogin = getPersistenceContext().getValue(LDAPLOGIN, _ldaplogin);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.lockedPages</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the lockedPages
	 */
	public Collection<AbstractPageModel> getLockedPages()
	{
		return _lockedPages = getPersistenceContext().getValue(LOCKEDPAGES, _lockedPages);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.orders</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orders
	 */
	public Collection<OrderModel> getOrders()
	{
		return _orders = getPersistenceContext().getValue(ORDERS, _orders);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. 
	 * @return the passwordAnswer
	 */
	public String getPasswordAnswer()
	{
		return _passwordAnswer = getPersistenceContext().getValue(PASSWORDANSWER, _passwordAnswer);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. 
	 * @return the passwordEncoding
	 */
	public String getPasswordEncoding()
	{
		return _passwordEncoding = getPersistenceContext().getValue(PASSWORDENCODING, _passwordEncoding);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. 
	 * @return the passwordQuestion
	 */
	public String getPasswordQuestion()
	{
		return _passwordQuestion = getPersistenceContext().getValue(PASSWORDQUESTION, _passwordQuestion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the paymentInfos
	 */
	public Collection<PaymentInfoModel> getPaymentInfos()
	{
		return _paymentInfos = getPersistenceContext().getValue(PAYMENTINFOS, _paymentInfos);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.restrictions</code> attribute defined at extension <code>cms2</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the restrictions
	 */
	public Collection<CMSUserRestrictionModel> getRestrictions()
	{
		return _restrictions = getPersistenceContext().getValue(RESTRICTIONS, _restrictions);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.ruleResults</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the ruleResults
	 */
	public Collection<BTGRuleResultModel> getRuleResults()
	{
		return _ruleResults = getPersistenceContext().getValue(RULERESULTS, _ruleResults);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.segmentResults</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the segmentResults
	 */
	public Collection<BTGSegmentResultModel> getSegmentResults()
	{
		return _segmentResults = getPersistenceContext().getValue(SEGMENTRESULTS, _segmentResults);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. 
	 * @return the sessionCurrency
	 */
	public CurrencyModel getSessionCurrency()
	{
		return _sessionCurrency = getPersistenceContext().getValue(SESSIONCURRENCY, _sessionCurrency);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. 
	 * @return the sessionLanguage
	 */
	public LanguageModel getSessionLanguage()
	{
		return _sessionLanguage = getPersistenceContext().getValue(SESSIONLANGUAGE, _sessionLanguage);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.userprofile</code> attribute defined at extension <code>core</code>. 
	 * @return the userprofile
	 */
	public UserProfileModel getUserprofile()
	{
		return _userprofile = getPersistenceContext().getValue(USERPROFILE, _userprofile);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.widgetPreferences</code> attribute defined at extension <code>cockpit</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the widgetPreferences
	 */
	public Collection<WidgetPreferencesModel> getWidgetPreferences()
	{
		return _widgetPreferences = getPersistenceContext().getValue(WIDGETPREFERENCES, _widgetPreferences);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.authorizedToUnlockPages</code> attribute defined at extension <code>cms2</code>. 
	 * @return the authorizedToUnlockPages
	 */
	public boolean isAuthorizedToUnlockPages()
	{
		return toPrimitive( _authorizedToUnlockPages = getPersistenceContext().getValue(AUTHORIZEDTOUNLOCKPAGES, _authorizedToUnlockPages));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. 
	 * @return the loginDisabled - Determines whether user is allowed to login to system.
	 */
	public boolean isLoginDisabled()
	{
		return toPrimitive( _loginDisabled = getPersistenceContext().getValue(LOGINDISABLED, _loginDisabled));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.addresses</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the addresses
	 */
	public void setAddresses(final Collection<AddressModel> value)
	{
		_addresses = getPersistenceContext().setValue(ADDRESSES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.assignedComments</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the assignedComments
	 */
	public void setAssignedComments(final List<CommentModel> value)
	{
		_assignedComments = getPersistenceContext().setValue(ASSIGNEDCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.authorizedToUnlockPages</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the authorizedToUnlockPages
	 */
	public void setAuthorizedToUnlockPages(final boolean value)
	{
		_authorizedToUnlockPages = getPersistenceContext().setValue(AUTHORIZEDTOUNLOCKPAGES, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.carts</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the carts
	 */
	public void setCarts(final Collection<CartModel> value)
	{
		_carts = getPersistenceContext().setValue(CARTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.cockpitFavoriteCategories</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the cockpitFavoriteCategories
	 */
	public void setCockpitFavoriteCategories(final Collection<CockpitFavoriteCategoryModel> value)
	{
		_cockpitFavoriteCategories = getPersistenceContext().setValue(COCKPITFAVORITECATEGORIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.cockpitSavedQueries</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the cockpitSavedQueries
	 */
	public void setCockpitSavedQueries(final Collection<CockpitSavedQueryModel> value)
	{
		_cockpitSavedQueries = getPersistenceContext().setValue(COCKPITSAVEDQUERIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.collections</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the collections
	 */
	public void setCollections(final Collection<CockpitObjectAbstractCollectionModel> value)
	{
		_collections = getPersistenceContext().setValue(COLLECTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.conditionResults</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the conditionResults
	 */
	public void setConditionResults(final Collection<BTGConditionResultModel> value)
	{
		_conditionResults = getPersistenceContext().setValue(CONDITIONRESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.createdComments</code> attribute defined at extension <code>comments</code>. 
	 *  
	 * @param value the createdComments
	 */
	public void setCreatedComments(final List<AbstractCommentModel> value)
	{
		_createdComments = getPersistenceContext().setValue(CREATEDCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>User.customerReviews</code> attribute defined at extension <code>customerreview</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the customerReviews
	 */
	public void setCustomerReviews(final Collection<CustomerReviewModel> value)
	{
		_customerReviews = getPersistenceContext().setValue(CUSTOMERREVIEWS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.defaultPaymentAddress</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the defaultPaymentAddress
	 */
	public void setDefaultPaymentAddress(final AddressModel value)
	{
		_defaultPaymentAddress = getPersistenceContext().setValue(DEFAULTPAYMENTADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.defaultShipmentAddress</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the defaultShipmentAddress
	 */
	public void setDefaultShipmentAddress(final AddressModel value)
	{
		_defaultShipmentAddress = getPersistenceContext().setValue(DEFAULTSHIPMENTADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.domain</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the domain
	 */
	public void setDomain(final String value)
	{
		_domain = getPersistenceContext().setValue(DOMAIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.encodedPassword</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the encodedPassword
	 */
	public void setEncodedPassword(final String value)
	{
		_encodedPassword = getPersistenceContext().setValue(ENCODEDPASSWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.europe1Discounts</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the europe1Discounts
	 */
	public void setEurope1Discounts(final Collection<GlobalDiscountRowModel> value)
	{
		_europe1Discounts = getPersistenceContext().setValue(EUROPE1DISCOUNTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.Europe1PriceFactory_UDG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_UDG
	 */
	public void setEurope1PriceFactory_UDG(final UserDiscountGroup value)
	{
		_Europe1PriceFactory_UDG = getPersistenceContext().setValue(EUROPE1PRICEFACTORY_UDG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.Europe1PriceFactory_UPG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_UPG
	 */
	public void setEurope1PriceFactory_UPG(final UserPriceGroup value)
	{
		_Europe1PriceFactory_UPG = getPersistenceContext().setValue(EUROPE1PRICEFACTORY_UPG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.Europe1PriceFactory_UTG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_UTG
	 */
	public void setEurope1PriceFactory_UTG(final UserTaxGroup value)
	{
		_Europe1PriceFactory_UTG = getPersistenceContext().setValue(EUROPE1PRICEFACTORY_UTG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.hmcLoginDisabled</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the hmcLoginDisabled
	 */
	public void setHmcLoginDisabled(final Boolean value)
	{
		_hmcLoginDisabled = getPersistenceContext().setValue(HMCLOGINDISABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.lastLogin</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the lastLogin
	 */
	public void setLastLogin(final Date value)
	{
		_lastLogin = getPersistenceContext().setValue(LASTLOGIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.ldapaccount</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the ldapaccount
	 */
	public void setLdapaccount(final Boolean value)
	{
		_ldapaccount = getPersistenceContext().setValue(LDAPACCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.ldaplogin</code> attribute defined at extension <code>ldap</code>. 
	 *  
	 * @param value the ldaplogin
	 */
	public void setLdaplogin(final String value)
	{
		_ldaplogin = getPersistenceContext().setValue(LDAPLOGIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.lockedPages</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the lockedPages
	 */
	public void setLockedPages(final Collection<AbstractPageModel> value)
	{
		_lockedPages = getPersistenceContext().setValue(LOCKEDPAGES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.loginDisabled</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the loginDisabled - Determines whether user is allowed to login to system.
	 */
	public void setLoginDisabled(final boolean value)
	{
		_loginDisabled = getPersistenceContext().setValue(LOGINDISABLED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.orders</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the orders
	 */
	public void setOrders(final Collection<OrderModel> value)
	{
		_orders = getPersistenceContext().setValue(ORDERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.passwordAnswer</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the passwordAnswer
	 */
	public void setPasswordAnswer(final String value)
	{
		_passwordAnswer = getPersistenceContext().setValue(PASSWORDANSWER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.passwordEncoding</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the passwordEncoding
	 */
	public void setPasswordEncoding(final String value)
	{
		_passwordEncoding = getPersistenceContext().setValue(PASSWORDENCODING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.passwordQuestion</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the passwordQuestion
	 */
	public void setPasswordQuestion(final String value)
	{
		_passwordQuestion = getPersistenceContext().setValue(PASSWORDQUESTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.paymentInfos</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the paymentInfos
	 */
	public void setPaymentInfos(final Collection<PaymentInfoModel> value)
	{
		_paymentInfos = getPersistenceContext().setValue(PAYMENTINFOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.restrictions</code> attribute defined at extension <code>cms2</code>. 
	 *  
	 * @param value the restrictions
	 */
	public void setRestrictions(final Collection<CMSUserRestrictionModel> value)
	{
		_restrictions = getPersistenceContext().setValue(RESTRICTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.ruleResults</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the ruleResults
	 */
	public void setRuleResults(final Collection<BTGRuleResultModel> value)
	{
		_ruleResults = getPersistenceContext().setValue(RULERESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.segmentResults</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the segmentResults
	 */
	public void setSegmentResults(final Collection<BTGSegmentResultModel> value)
	{
		_segmentResults = getPersistenceContext().setValue(SEGMENTRESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.sessionCurrency</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the sessionCurrency
	 */
	public void setSessionCurrency(final CurrencyModel value)
	{
		_sessionCurrency = getPersistenceContext().setValue(SESSIONCURRENCY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.sessionLanguage</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the sessionLanguage
	 */
	public void setSessionLanguage(final LanguageModel value)
	{
		_sessionLanguage = getPersistenceContext().setValue(SESSIONLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.userprofile</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the userprofile
	 */
	public void setUserprofile(final UserProfileModel value)
	{
		_userprofile = getPersistenceContext().setValue(USERPROFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>User.widgetPreferences</code> attribute defined at extension <code>cockpit</code>. 
	 *  
	 * @param value the widgetPreferences
	 */
	public void setWidgetPreferences(final Collection<WidgetPreferencesModel> value)
	{
		_widgetPreferences = getPersistenceContext().setValue(WIDGETPREFERENCES, value);
	}
	
}
