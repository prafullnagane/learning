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
package de.hybris.platform.core.dto.order;

import de.hybris.platform.basecommerce.dto.site.BaseSiteDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.order.AbstractOrderEntryDTO;
import de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO;
import de.hybris.platform.core.dto.order.payment.PaymentInfoDTO;
import de.hybris.platform.core.dto.order.payment.PaymentModeDTO;
import de.hybris.platform.core.dto.order.price.DiscountDTO;
import de.hybris.platform.core.dto.user.AddressDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.ordersplitting.dto.ConsignmentDTO;
import de.hybris.platform.payment.dto.PaymentTransactionDTO;
import de.hybris.platform.promotions.dto.PromotionResultDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractOrder first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractOrderModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "abstractorder")
public class AbstractOrderDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentCost</code> attribute defined at extension <code> */
	private java.lang.Double _paymentCost;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentTransactions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.payment.dto.PaymentTransactionDTO> _paymentTransactions;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.orderRecalculationHash</code> attribute defined at extension <code> */
	private java.lang.String _orderRecalculationHash;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.consignments</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.ordersplitting.dto.ConsignmentDTO> _consignments;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentMode</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.payment.PaymentModeDTO _paymentMode;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.net</code> attribute defined at extension <code> */
	private java.lang.Boolean _net;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.calculated</code> attribute defined at extension <code> */
	private java.lang.Boolean _calculated;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalTax</code> attribute defined at extension <code> */
	private java.lang.Double _totalTax;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.discounts</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.order.price.DiscountDTO> _discounts;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.guid</code> attribute defined at extension <code> */
	private java.lang.String _guid;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _deliveryAddress;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.store</code> attribute defined at extension <code> */
	private de.hybris.platform.store.BaseStoreDTO _store;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentInfo</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.payment.PaymentInfoDTO _paymentInfo;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.statusInfo</code> attribute defined at extension <code> */
	private java.lang.String _statusInfo;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.discountsIncludeDeliveryCost</code> attribute defined at extension <code> */
	private boolean _discountsIncludeDeliveryCost;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.status</code> attribute defined at extension <code> */
	private java.lang.String _status;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.exportStatus</code> attribute defined at extension <code> */
	private java.lang.String _exportStatus;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.date</code> attribute defined at extension <code> */
	private java.util.Date _date;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryStatus</code> attribute defined at extension <code> */
	private java.lang.String _deliveryStatus;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.subtotal</code> attribute defined at extension <code> */
	private java.lang.Double _subtotal;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.previousDeliveryMode</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO _previousDeliveryMode;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.site</code> attribute defined at extension <code> */
	private de.hybris.platform.basecommerce.dto.site.BaseSiteDTO _site;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.allPromotionResults</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.promotions.dto.PromotionResultDTO> _allPromotionResults;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.discountsIncludePaymentCost</code> attribute defined at extension <code> */
	private boolean _discountsIncludePaymentCost;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentStatus</code> attribute defined at extension <code> */
	private java.lang.String _paymentStatus;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.paymentAddress</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.AddressDTO _paymentAddress;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryMode</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.order.delivery.DeliveryModeDTO _deliveryMode;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.deliveryCost</code> attribute defined at extension <code> */
	private java.lang.Double _deliveryCost;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalPrice</code> attribute defined at extension <code> */
	private java.lang.Double _totalPrice;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.totalDiscounts</code> attribute defined at extension <code> */
	private java.lang.Double _totalDiscounts;
	/** <i>Generated variable</i> - Variable of <code>AbstractOrder.entries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.order.AbstractOrderEntryDTO> _entries;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractOrderDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "allPromotionResults")
	@XmlElement(name = "promotionResult")
	public Set<PromotionResultDTO> getAllPromotionResults()
	{
		return this._allPromotionResults;
	}
	
	public Boolean getCalculated()
	{
		return this._calculated;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@XmlElementWrapper(name = "consignments")
	@XmlElement(name = "consignment")
	public Set<ConsignmentDTO> getConsignments()
	{
		return this._consignments;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public Date getDate()
	{
		return this._date;
	}
	
	public AddressDTO getDeliveryAddress()
	{
		return this._deliveryAddress;
	}
	
	public Double getDeliveryCost()
	{
		return this._deliveryCost;
	}
	
	public DeliveryModeDTO getDeliveryMode()
	{
		return this._deliveryMode;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDeliveryStatus()
	{
		return this._deliveryStatus;
	}
	
	@XmlElementWrapper(name = "discounts")
	@XmlElement(name = "discount")
	public List<DiscountDTO> getDiscounts()
	{
		return this._discounts;
	}
	
	@XmlElementWrapper(name = "entries")
	@XmlElement(name = "abstractOrderEntry")
	public List<AbstractOrderEntryDTO> getEntries()
	{
		return this._entries;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getExportStatus()
	{
		return this._exportStatus;
	}
	
	public String getGuid()
	{
		return this._guid;
	}
	
	public Boolean getNet()
	{
		return this._net;
	}
	
	public String getOrderRecalculationHash()
	{
		return this._orderRecalculationHash;
	}
	
	public AddressDTO getPaymentAddress()
	{
		return this._paymentAddress;
	}
	
	public Double getPaymentCost()
	{
		return this._paymentCost;
	}
	
	public PaymentInfoDTO getPaymentInfo()
	{
		return this._paymentInfo;
	}
	
	public PaymentModeDTO getPaymentMode()
	{
		return this._paymentMode;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getPaymentStatus()
	{
		return this._paymentStatus;
	}
	
	@XmlElementWrapper(name = "paymentTransactions")
	@XmlElement(name = "paymentTransaction")
	public List<PaymentTransactionDTO> getPaymentTransactions()
	{
		return this._paymentTransactions;
	}
	
	public DeliveryModeDTO getPreviousDeliveryMode()
	{
		return this._previousDeliveryMode;
	}
	
	public BaseSiteDTO getSite()
	{
		return this._site;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getStatus()
	{
		return this._status;
	}
	
	public String getStatusInfo()
	{
		return this._statusInfo;
	}
	
	public BaseStoreDTO getStore()
	{
		return this._store;
	}
	
	public Double getSubtotal()
	{
		return this._subtotal;
	}
	
	public Double getTotalDiscounts()
	{
		return this._totalDiscounts;
	}
	
	public Double getTotalPrice()
	{
		return this._totalPrice;
	}
	
	public Double getTotalTax()
	{
		return this._totalTax;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public boolean isDiscountsIncludeDeliveryCost()
	{
		return this._discountsIncludeDeliveryCost;
	}
	
	public boolean isDiscountsIncludePaymentCost()
	{
		return this._discountsIncludePaymentCost;
	}
	
	public void setAllPromotionResults(final Set<PromotionResultDTO> value)
	{
		this.modifiedPropsSet.add("allPromotionResults");
		this._allPromotionResults = value;
	}
	
	public void setCalculated(final Boolean value)
	{
		this.modifiedPropsSet.add("calculated");
		this._calculated = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setConsignments(final Set<ConsignmentDTO> value)
	{
		this.modifiedPropsSet.add("consignments");
		this._consignments = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setDate(final Date value)
	{
		this.modifiedPropsSet.add("date");
		this._date = value;
	}
	
	public void setDeliveryAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("deliveryAddress");
		this._deliveryAddress = value;
	}
	
	public void setDeliveryCost(final Double value)
	{
		this.modifiedPropsSet.add("deliveryCost");
		this._deliveryCost = value;
	}
	
	public void setDeliveryMode(final DeliveryModeDTO value)
	{
		this.modifiedPropsSet.add("deliveryMode");
		this._deliveryMode = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDeliveryStatus(final String value)
	{
		this.modifiedPropsSet.add("deliveryStatus");
		this._deliveryStatus = value;
	}
	
	public void setDiscounts(final List<DiscountDTO> value)
	{
		this.modifiedPropsSet.add("discounts");
		this._discounts = value;
	}
	
	public void setDiscountsIncludeDeliveryCost(final boolean value)
	{
		this.modifiedPropsSet.add("discountsIncludeDeliveryCost");
		this._discountsIncludeDeliveryCost = value;
	}
	
	public void setDiscountsIncludePaymentCost(final boolean value)
	{
		this.modifiedPropsSet.add("discountsIncludePaymentCost");
		this._discountsIncludePaymentCost = value;
	}
	
	public void setEntries(final List<AbstractOrderEntryDTO> value)
	{
		this.modifiedPropsSet.add("entries");
		this._entries = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setExportStatus(final String value)
	{
		this.modifiedPropsSet.add("exportStatus");
		this._exportStatus = value;
	}
	
	public void setGuid(final String value)
	{
		this.modifiedPropsSet.add("guid");
		this._guid = value;
	}
	
	public void setNet(final Boolean value)
	{
		this.modifiedPropsSet.add("net");
		this._net = value;
	}
	
	public void setOrderRecalculationHash(final String value)
	{
		this.modifiedPropsSet.add("orderRecalculationHash");
		this._orderRecalculationHash = value;
	}
	
	public void setPaymentAddress(final AddressDTO value)
	{
		this.modifiedPropsSet.add("paymentAddress");
		this._paymentAddress = value;
	}
	
	public void setPaymentCost(final Double value)
	{
		this.modifiedPropsSet.add("paymentCost");
		this._paymentCost = value;
	}
	
	public void setPaymentInfo(final PaymentInfoDTO value)
	{
		this.modifiedPropsSet.add("paymentInfo");
		this._paymentInfo = value;
	}
	
	public void setPaymentMode(final PaymentModeDTO value)
	{
		this.modifiedPropsSet.add("paymentMode");
		this._paymentMode = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setPaymentStatus(final String value)
	{
		this.modifiedPropsSet.add("paymentStatus");
		this._paymentStatus = value;
	}
	
	public void setPaymentTransactions(final List<PaymentTransactionDTO> value)
	{
		this.modifiedPropsSet.add("paymentTransactions");
		this._paymentTransactions = value;
	}
	
	public void setPreviousDeliveryMode(final DeliveryModeDTO value)
	{
		this.modifiedPropsSet.add("previousDeliveryMode");
		this._previousDeliveryMode = value;
	}
	
	public void setSite(final BaseSiteDTO value)
	{
		this.modifiedPropsSet.add("site");
		this._site = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setStatus(final String value)
	{
		this.modifiedPropsSet.add("status");
		this._status = value;
	}
	
	public void setStatusInfo(final String value)
	{
		this.modifiedPropsSet.add("statusInfo");
		this._statusInfo = value;
	}
	
	public void setStore(final BaseStoreDTO value)
	{
		this.modifiedPropsSet.add("store");
		this._store = value;
	}
	
	public void setSubtotal(final Double value)
	{
		this.modifiedPropsSet.add("subtotal");
		this._subtotal = value;
	}
	
	public void setTotalDiscounts(final Double value)
	{
		this.modifiedPropsSet.add("totalDiscounts");
		this._totalDiscounts = value;
	}
	
	public void setTotalPrice(final Double value)
	{
		this.modifiedPropsSet.add("totalPrice");
		this._totalPrice = value;
	}
	
	public void setTotalTax(final Double value)
	{
		this.modifiedPropsSet.add("totalTax");
		this._totalTax = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
