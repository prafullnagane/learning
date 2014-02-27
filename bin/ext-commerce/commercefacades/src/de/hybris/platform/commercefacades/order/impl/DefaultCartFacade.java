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
package de.hybris.platform.commercefacades.order.impl;

import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.data.CartRestorationData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.CommerceCartRestoration;
import de.hybris.platform.commerceservices.order.CommerceCartRestorationException;
import de.hybris.platform.commerceservices.order.CommerceCartService;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import de.hybris.platform.storelocator.pos.PointOfServiceService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;


/**
 * Implementation for {@link CartFacade}. Delivers main functionality for cart.
 */
public class DefaultCartFacade implements CartFacade
{
	private CartService cartService;
	private ProductService productService;
	private CommerceCartService commerceCartService;
	private Converter<CartModel, CartData> miniCartConverter;
	private Converter<CartModel, CartData> cartConverter;
	private Converter<CommerceCartModification, CartModificationData> cartModificationConverter;
	private Converter<CommerceCartRestoration, CartRestorationData> cartRestorationConverter;
	private BaseSiteService baseSiteService;
	private UserService userService;
	private PointOfServiceService pointOfServiceService;

	@Override
	public CartData getSessionCart()
	{
		final CartData cartData;
		if (hasSessionCart())
		{
			final CartModel cart = getCartService().getSessionCart();
			cartData = getCartConverter().convert(cart);
		}
		else
		{
			cartData = createEmptyCart();
		}
		return cartData;
	}

	@Override
	public CartData getMiniCart()
	{
		final CartData cartData;
		if (hasSessionCart())
		{
			final CartModel cart = getCartService().getSessionCart();
			cartData = getMiniCartConverter().convert(cart);
		}
		else
		{
			cartData = createEmptyCart();
		}
		return cartData;
	}

	protected CartData createEmptyCart()
	{
		return getMiniCartConverter().convert(null);
	}

	@Override
	public boolean hasSessionCart()
	{
		return getCartService().hasSessionCart();
	}

	@Override
	public CartModificationData addToCart(final String code, final long quantity) throws CommerceCartModificationException
	{
		final ProductModel product = getProductService().getProductForCode(code);
		final CartModel cartModel = getCartService().getSessionCart();

		final CommerceCartModification modification = getCommerceCartService().addToCart(cartModel, product, quantity,
				product.getUnit(), false);

		return getCartModificationConverter().convert(modification);
	}

	@Override
	public CartModificationData addToCart(final String code, final long quantity, final String storeId)
			throws CommerceCartModificationException
	{
		if (storeId == null)
		{
			return addToCart(code, quantity);
		}
		else
		{
			final ProductModel product = getProductService().getProductForCode(code);
			final CartModel cartModel = getCartService().getSessionCart();

			final PointOfServiceModel pointOfServiceModel = getPointOfServiceService().getPointOfServiceForName(storeId);
			final CommerceCartModification modification = getCommerceCartService().addToCart(cartModel, product,
					pointOfServiceModel, quantity, product.getUnit(), false);

			return getCartModificationConverter().convert(modification);
		}
	}

	@Override
	public List<CartModificationData> validateCartData() throws CommerceCartModificationException
	{
		if (hasSessionCart())
		{
			final CartModel cartModel = getCartService().getSessionCart();
			return Converters.convertAll(getCommerceCartService().validateCart(cartModel), getCartModificationConverter());
		}
		else
		{
			return Collections.emptyList();
		}
	}

	@Override
	public CartModificationData updateCartEntry(final long entryNumber, final long quantity)
			throws CommerceCartModificationException
	{
		final CartModel cartModel = getCartService().getSessionCart();

		final CommerceCartModification modification = getCommerceCartService().updateQuantityForCartEntry(cartModel, entryNumber,
				quantity);

		return getCartModificationConverter().convert(modification);
	}

	@Override
	public CartModificationData updateCartEntry(final long entryNumber, final String storeId)
			throws CommerceCartModificationException
	{
		final CartModel cartModel = getCartService().getSessionCart();
		final PointOfServiceModel pointOfServiceModel = StringUtils.isEmpty(storeId) ? null : getPointOfServiceService()
				.getPointOfServiceForName(storeId);
		if (pointOfServiceModel == null)
		{
			return getCartModificationConverter().convert(
					getCommerceCartService().updateToShippingModeForCartEntry(cartModel, entryNumber));
		}
		else
		{
			return getCartModificationConverter().convert(
					getCommerceCartService().updatePointOfServiceForCartEntry(cartModel, entryNumber, pointOfServiceModel));
		}
	}

	@Override
	public CartRestorationData restoreSavedCart(final String guid) throws CommerceCartRestorationException
	{
		if (hasSessionCart() && getSessionCart().getEntries().isEmpty())
		{
			getCartService().setSessionCart(null);
		}
		return getCartRestorationConverter().convert(
				getCommerceCartService().restoreCart(
						getCommerceCartService().getCartForGuidAndSiteAndUser(guid, getBaseSiteService().getCurrentBaseSite(),
								getUserService().getCurrentUser())));
	}

	@Override
	public void cleanSavedCart()
	{
		final CartModel oldCart = commerceCartService.getCartForGuidAndSiteAndUser(null, baseSiteService.getCurrentBaseSite(),
				getUserService().getCurrentUser());
		if (oldCart != null)
		{
			commerceCartService.removeAllEntries(oldCart);
		}
	}

	@Override
	public CartData getSessionCartWithEntryOrdering(final boolean recentlyAddedFirst)
	{
		if (hasSessionCart())
		{
			final CartData data = getSessionCart();

			if (recentlyAddedFirst)
			{
				final List<OrderEntryData> listEntries = data.getEntries();
				final List<OrderEntryData> recentlyAddedListEntries = new ArrayList<OrderEntryData>();

				for (int index = listEntries.size(); index > 0; index--)
				{
					recentlyAddedListEntries.add(listEntries.get(index - 1));
				}

				data.setEntries(Collections.unmodifiableList(recentlyAddedListEntries));
			}

			return data;
		}
		return createEmptyCart();
	}

	protected CartService getCartService()
	{
		return cartService;
	}

	@Required
	public void setCartService(final CartService cartService)
	{
		this.cartService = cartService;
	}

	protected Converter<CartModel, CartData> getMiniCartConverter()
	{
		return miniCartConverter;
	}

	@Required
	public void setMiniCartConverter(final Converter<CartModel, CartData> miniCartConverter)
	{
		this.miniCartConverter = miniCartConverter;
	}

	protected ProductService getProductService()
	{
		return productService;
	}

	@Required
	public void setProductService(final ProductService productService)
	{
		this.productService = productService;
	}

	protected CommerceCartService getCommerceCartService()
	{
		return commerceCartService;
	}

	@Required
	public void setCommerceCartService(final CommerceCartService commerceCartService)
	{
		this.commerceCartService = commerceCartService;
	}

	protected Converter<CartModel, CartData> getCartConverter()
	{
		return cartConverter;
	}

	@Required
	public void setCartConverter(final Converter<CartModel, CartData> cartConverter)
	{
		this.cartConverter = cartConverter;
	}

	protected Converter<CommerceCartModification, CartModificationData> getCartModificationConverter()
	{
		return cartModificationConverter;
	}

	@Required
	public void setCartModificationConverter(
			final Converter<CommerceCartModification, CartModificationData> cartModificationConverter)
	{
		this.cartModificationConverter = cartModificationConverter;
	}

	protected Converter<CommerceCartRestoration, CartRestorationData> getCartRestorationConverter()
	{
		return cartRestorationConverter;
	}

	@Required
	public void setCartRestorationConverter(final Converter<CommerceCartRestoration, CartRestorationData> cartRestorationConverter)
	{
		this.cartRestorationConverter = cartRestorationConverter;
	}

	protected BaseSiteService getBaseSiteService()
	{
		return baseSiteService;
	}

	@Required
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}

	protected UserService getUserService()
	{
		return userService;
	}

	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	protected PointOfServiceService getPointOfServiceService()
	{
		return pointOfServiceService;
	}

	@Required
	public void setPointOfServiceService(final PointOfServiceService pointOfServiceService)
	{
		this.pointOfServiceService = pointOfServiceService;
	}
}
