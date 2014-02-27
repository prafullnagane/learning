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
package de.hybris.platform.core.model.order;

import de.hybris.platform.basecommerce.enums.OrderEntryStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.ordersplitting.model.ConsignmentEntryModel;
import de.hybris.platform.ordersplitting.model.VendorModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import de.hybris.platform.util.DiscountValue;
import de.hybris.platform.util.TaxValue;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type AbstractOrderEntry first defined at extension core.
 */
@SuppressWarnings("all")
public class AbstractOrderEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractOrderEntry";
	
	/**<i>Generated relation code constant for relation <code>ConsignmentEntryOrderEntryRelation</code> defining source attribute <code>consignmentEntries</code> in extension <code>basecommerce</code>.</i>*/
	public final static String _CONSIGNMENTENTRYORDERENTRYRELATION = "ConsignmentEntryOrderEntryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code>core</code>. */
	public static final String TOTALPRICE = "totalPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code>core</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DELIVERYMODE = "deliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.info</code> attribute defined at extension <code>core</code>. */
	public static final String INFO = "info";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String QUANTITYSTATUS = "quantityStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code>core</code>. */
	public static final String CALCULATED = "calculated";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CHOSENVENDOR = "chosenVendor";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAMEDDELIVERYDATE = "namedDeliveryDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.taxValues</code> attribute defined at extension <code>core</code>. */
	public static final String TAXVALUES = "taxValues";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code>core</code>. */
	public static final String GIVEAWAY = "giveAway";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code>core</code>. */
	public static final String BASEPRICE = "basePrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.product</code> attribute defined at extension <code>core</code>. */
	public static final String PRODUCT = "product";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.unit</code> attribute defined at extension <code>core</code>. */
	public static final String UNIT = "unit";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code>core</code>. */
	public static final String REJECTED = "rejected";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DELIVERYPOINTOFSERVICE = "deliveryPointOfService";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DELIVERYADDRESS = "deliveryAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENTENTRIES = "consignmentEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.discountValues</code> attribute defined at extension <code>core</code>. */
	public static final String DISCOUNTVALUES = "discountValues";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code>core</code>. */
	public static final String ENTRYNUMBER = "entryNumber";
	
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code>core</code>. */
	private Double _totalPrice;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code>core</code>. */
	private Long _quantity;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. */
	private DeliveryModeModel _deliveryMode;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.info</code> attribute defined at extension <code>core</code>. */
	private String _info;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code>basecommerce</code>. */
	private OrderEntryStatus _quantityStatus;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code>core</code>. */
	private Boolean _calculated;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code>basecommerce</code>. */
	private VendorModel _chosenVendor;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. */
	private Date _namedDeliveryDate;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.taxValues</code> attribute defined at extension <code>core</code>. */
	private Collection<TaxValue> _taxValues;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code>core</code>. */
	private Boolean _giveAway;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code>core</code>. */
	private Double _basePrice;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.product</code> attribute defined at extension <code>core</code>. */
	private ProductModel _product;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.unit</code> attribute defined at extension <code>core</code>. */
	private UnitModel _unit;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code>. */
	private AbstractOrderModel _order;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code>core</code>. */
	private Boolean _rejected;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. */
	private PointOfServiceModel _deliveryPointOfService;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code>basecommerce</code>. */
	private AddressModel _deliveryAddress;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. */
	private Set<ConsignmentEntryModel> _consignmentEntries;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.discountValues</code> attribute defined at extension <code>core</code>. */
	private List<DiscountValue> _discountValues;
	
	/** <i>Generated variable</i> - Variable of <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code>core</code>. */
	private Integer _entryNumber;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractOrderEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractOrderEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _product initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _quantity initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _unit initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractOrderEntryModel(final AbstractOrderModel _order, final ProductModel _product, final Long _quantity, final UnitModel _unit)
	{
		super();
		setOrder(_order);
		setProduct(_product);
		setQuantity(_quantity);
		setUnit(_unit);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _product initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _quantity initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _unit initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 */
	@Deprecated
	public AbstractOrderEntryModel(final AbstractOrderModel _order, final ItemModel _owner, final ProductModel _product, final Long _quantity, final UnitModel _unit)
	{
		super();
		setOrder(_order);
		setOwner(_owner);
		setProduct(_product);
		setQuantity(_quantity);
		setUnit(_unit);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code>core</code>. 
	 * @return the basePrice
	 */
	public Double getBasePrice()
	{
		return _basePrice = getPersistenceContext().getValue(BASEPRICE, _basePrice);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code>core</code>. 
	 * @return the calculated
	 */
	public Boolean getCalculated()
	{
		return _calculated = getPersistenceContext().getValue(CALCULATED, _calculated);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the chosenVendor
	 */
	public VendorModel getChosenVendor()
	{
		return _chosenVendor = getPersistenceContext().getValue(CHOSENVENDOR, _chosenVendor);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignmentEntries
	 */
	public Set<ConsignmentEntryModel> getConsignmentEntries()
	{
		return _consignmentEntries = getPersistenceContext().getValue(CONSIGNMENTENTRIES, _consignmentEntries);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the deliveryAddress
	 */
	public AddressModel getDeliveryAddress()
	{
		return _deliveryAddress = getPersistenceContext().getValue(DELIVERYADDRESS, _deliveryAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the deliveryMode
	 */
	public DeliveryModeModel getDeliveryMode()
	{
		return _deliveryMode = getPersistenceContext().getValue(DELIVERYMODE, _deliveryMode);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the deliveryPointOfService - The point of service to deliver to/collect from.
	 */
	public PointOfServiceModel getDeliveryPointOfService()
	{
		return _deliveryPointOfService = getPersistenceContext().getValue(DELIVERYPOINTOFSERVICE, _deliveryPointOfService);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.discountValues</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the discountValues
	 */
	public List<DiscountValue> getDiscountValues()
	{
		return _discountValues = getPersistenceContext().getValue(DISCOUNTVALUES, _discountValues);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code>core</code>. 
	 * @return the entryNumber
	 */
	public Integer getEntryNumber()
	{
		return _entryNumber = getPersistenceContext().getValue(ENTRYNUMBER, _entryNumber);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code>core</code>. 
	 * @return the giveAway
	 */
	public Boolean getGiveAway()
	{
		return _giveAway = getPersistenceContext().getValue(GIVEAWAY, _giveAway);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.info</code> attribute defined at extension <code>core</code>. 
	 * @return the info
	 */
	public String getInfo()
	{
		return _info = getPersistenceContext().getValue(INFO, _info);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the namedDeliveryDate
	 */
	public Date getNamedDeliveryDate()
	{
		return _namedDeliveryDate = getPersistenceContext().getValue(NAMEDDELIVERYDATE, _namedDeliveryDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code>. 
	 * @return the order
	 */
	public AbstractOrderModel getOrder()
	{
		return _order = getPersistenceContext().getValue(ORDER, _order);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.product</code> attribute defined at extension <code>core</code>. 
	 * @return the product
	 */
	public ProductModel getProduct()
	{
		return _product = getPersistenceContext().getValue(PRODUCT, _product);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code>core</code>. 
	 * @return the quantity
	 */
	public Long getQuantity()
	{
		return _quantity = getPersistenceContext().getValue(QUANTITY, _quantity);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the quantityStatus
	 */
	public OrderEntryStatus getQuantityStatus()
	{
		return _quantityStatus = getPersistenceContext().getValue(QUANTITYSTATUS, _quantityStatus);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code>core</code>. 
	 * @return the rejected
	 */
	public Boolean getRejected()
	{
		return _rejected = getPersistenceContext().getValue(REJECTED, _rejected);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.taxValues</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the taxValues
	 */
	public Collection<TaxValue> getTaxValues()
	{
		return _taxValues = getPersistenceContext().getValue(TAXVALUES, _taxValues);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code>core</code>. 
	 * @return the totalPrice
	 */
	public Double getTotalPrice()
	{
		return _totalPrice = getPersistenceContext().getValue(TOTALPRICE, _totalPrice);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.unit</code> attribute defined at extension <code>core</code>. 
	 * @return the unit
	 */
	public UnitModel getUnit()
	{
		return _unit = getPersistenceContext().getValue(UNIT, _unit);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the basePrice
	 */
	public void setBasePrice(final Double value)
	{
		_basePrice = getPersistenceContext().setValue(BASEPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the calculated
	 */
	public void setCalculated(final Boolean value)
	{
		_calculated = getPersistenceContext().setValue(CALCULATED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the chosenVendor
	 */
	public void setChosenVendor(final VendorModel value)
	{
		_chosenVendor = getPersistenceContext().setValue(CHOSENVENDOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignmentEntries
	 */
	public void setConsignmentEntries(final Set<ConsignmentEntryModel> value)
	{
		_consignmentEntries = getPersistenceContext().setValue(CONSIGNMENTENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the deliveryAddress
	 */
	public void setDeliveryAddress(final AddressModel value)
	{
		_deliveryAddress = getPersistenceContext().setValue(DELIVERYADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the deliveryMode
	 */
	public void setDeliveryMode(final DeliveryModeModel value)
	{
		_deliveryMode = getPersistenceContext().setValue(DELIVERYMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the deliveryPointOfService - The point of service to deliver to/collect from.
	 */
	public void setDeliveryPointOfService(final PointOfServiceModel value)
	{
		_deliveryPointOfService = getPersistenceContext().setValue(DELIVERYPOINTOFSERVICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.discountValues</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the discountValues
	 */
	public void setDiscountValues(final List<DiscountValue> value)
	{
		_discountValues = getPersistenceContext().setValue(DISCOUNTVALUES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the entryNumber
	 */
	public void setEntryNumber(final Integer value)
	{
		_entryNumber = getPersistenceContext().setValue(ENTRYNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the giveAway
	 */
	public void setGiveAway(final Boolean value)
	{
		_giveAway = getPersistenceContext().setValue(GIVEAWAY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.info</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the info
	 */
	public void setInfo(final String value)
	{
		_info = getPersistenceContext().setValue(INFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the namedDeliveryDate
	 */
	public void setNamedDeliveryDate(final Date value)
	{
		_namedDeliveryDate = getPersistenceContext().setValue(NAMEDDELIVERYDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the order
	 */
	public void setOrder(final AbstractOrderModel value)
	{
		_order = getPersistenceContext().setValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.product</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the product
	 */
	public void setProduct(final ProductModel value)
	{
		_product = getPersistenceContext().setValue(PRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the quantity
	 */
	public void setQuantity(final Long value)
	{
		_quantity = getPersistenceContext().setValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the quantityStatus
	 */
	public void setQuantityStatus(final OrderEntryStatus value)
	{
		_quantityStatus = getPersistenceContext().setValue(QUANTITYSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the rejected
	 */
	public void setRejected(final Boolean value)
	{
		_rejected = getPersistenceContext().setValue(REJECTED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.taxValues</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the taxValues
	 */
	public void setTaxValues(final Collection<TaxValue> value)
	{
		_taxValues = getPersistenceContext().setValue(TAXVALUES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the totalPrice
	 */
	public void setTotalPrice(final Double value)
	{
		_totalPrice = getPersistenceContext().setValue(TOTALPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.unit</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the unit
	 */
	public void setUnit(final UnitModel value)
	{
		_unit = getPersistenceContext().setValue(UNIT, value);
	}
	
}
