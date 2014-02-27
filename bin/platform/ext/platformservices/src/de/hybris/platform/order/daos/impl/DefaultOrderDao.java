/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.order.daos.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.order.daos.OrderDao;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DefaultOrderDao extends AbstractItemDao implements OrderDao
{

	@Override
	public List<AbstractOrderEntryModel> findEntriesByNumber(final String entryTypeCode, final AbstractOrderModel order,
			final int number)
	{
		return findEntriesFormNumberRange(entryTypeCode, order, number, number);
	}

	@Override
	public List<AbstractOrderEntryModel> findEntriesByNumber(final String entryTypeCode, final AbstractOrderModel order,
			final int start, final int end)
	{
		return findEntriesFormNumberRange(entryTypeCode, order, start, end);
	}

	private List<AbstractOrderEntryModel> findEntriesFormNumberRange(final String entryTypeCode, final AbstractOrderModel order,
			final int start, final int end)
	{
		validateParameterNotNull(entryTypeCode, "entryTypeCode must not be null!");
		validateParameterNotNull(order, "order must not be null!");
		final Map values = new HashMap();
		values.put("o", order);
		values.put("start", Integer.valueOf(start));

		final StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT {").append(AbstractOrderEntryModel.PK).append("} FROM {").append(entryTypeCode)
				.append("} WHERE {").append(AbstractOrderEntryModel.ORDER).append("} = ?o ");

		if (start == end)
		{
			queryString.append("AND {").append(AbstractOrderEntryModel.ENTRYNUMBER).append("} = ?start");
		}
		else
		{
			queryString.append("AND {").append(AbstractOrderEntryModel.ENTRYNUMBER).append("} >= ?start AND {")
					.append(AbstractOrderEntryModel.ENTRYNUMBER).append("} <= ?end");
			values.put("end", Integer.valueOf(end));
		}

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString.toString(), values);
		query.setResultClassList(Collections.singletonList(AbstractOrderEntryModel.class));
		final SearchResult<AbstractOrderEntryModel> res = getFlexibleSearchService().search(query);
		final List<AbstractOrderEntryModel> result = res.getResult();
		return result == null ? Collections.EMPTY_LIST : result;
	}

	@Override
	public List<AbstractOrderEntryModel> findEntriesByProduct(final String entryTypeCode, final AbstractOrderModel order,
			final ProductModel product)
	{
		validateParameterNotNull(entryTypeCode, "entryTypeCode must not be null!");
		validateParameterNotNull(order, "order must not be null!");
		validateParameterNotNull(product, "product must not be null!");
		final Map values = new HashMap();
		values.put("o", order);
		values.put("product", product);

		final StringBuilder queryString = new StringBuilder();
		queryString.append("SELECT {").append(AbstractOrderEntryModel.PK).append("} FROM {").append(entryTypeCode)
				.append("} WHERE {").append(AbstractOrderEntryModel.ORDER).append("} = ?o AND {")
				.append(AbstractOrderEntryModel.PRODUCT).append("} = ?product");
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString.toString(), values);
		query.setResultClassList(Collections.singletonList(AbstractOrderEntryModel.class));
		final SearchResult<AbstractOrderEntryModel> res = getFlexibleSearchService().search(query);
		final List<AbstractOrderEntryModel> result = res.getResult();
		return result == null ? Collections.EMPTY_LIST : result;
	}

	@Override
	public List<AbstractOrderModel> findOrdersByCurrency(final CurrencyModel currency)
	{
		validateParameterNotNull(currency, "currency must not be null!");
		//return findOrdersByModelAttribute(orderTypeCode, currency, AbstractOrderModel.CURRENCY);
		final AbstractOrderModel order = new AbstractOrderModel();
		order.setCurrency(currency);
		return getFlexibleSearchService().getModelsByExample(order);

	}

	@Override
	public List<AbstractOrderModel> findOrdersByDelivereMode(final DeliveryModeModel deliveryMode)
	{
		validateParameterNotNull(deliveryMode, "deliveryMode must not be null!");
		//return findOrdersByModelAttribute(null, deliveryMode, AbstractOrderModel.DELIVERYMODE);
		final AbstractOrderModel order = new AbstractOrderModel();
		order.setDeliveryMode(deliveryMode);
		return getFlexibleSearchService().getModelsByExample(order);
	}

	@Override
	public List<AbstractOrderModel> findOrdersByPaymentMode(final PaymentModeModel paymentMode)
	{
		validateParameterNotNull(paymentMode, "paymentMode must not be null!");
		//return findOrdersByModelAttribute(null, paymentMode, AbstractOrderModel.PAYMENTMODE);
		final AbstractOrderModel order = new AbstractOrderModel();
		order.setPaymentMode(paymentMode);
		return getFlexibleSearchService().getModelsByExample(order);
	}
}
