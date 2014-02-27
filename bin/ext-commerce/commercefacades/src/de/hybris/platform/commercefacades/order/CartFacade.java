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
package de.hybris.platform.commercefacades.order;

import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.data.CartRestorationData;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.CommerceCartRestorationException;

import java.util.List;


/**
 * Cart facade interface. Service is responsible for getting all necessary information for cart, including delivery
 * details.
 */
public interface CartFacade
{
	/**
	 * Method gets cart from session, if any exist.
	 * 
	 * @return the cart data
	 */
	CartData getSessionCart();

	/**
	 * Method gets cart sorted by recently added entries from session, if param is set to true
	 * 
	 * @param recentlyAddedFirst
	 *           boolean value to determine whether to return sorted cart data
	 * @return the cart data sorted by recently added entries
	 */
	CartData getSessionCartWithEntryOrdering(boolean recentlyAddedFirst);

	/**
	 * Check if session has a cart.
	 * 
	 * @return <tt>true</tt> if the session has a cart
	 */
	boolean hasSessionCart();

	/**
	 * Method gets smaller version of cart, with data necessary for showing mini cart.
	 * 
	 * @return the mini card data
	 */
	CartData getMiniCart();

	/**
	 * Method for adding a product to cart.
	 * 
	 * @param code
	 *           code of product to add
	 * @param quantity
	 *           the quantity of the product
	 * @return the cart modification data that includes a statusCode and the actual quantity added to the cart
	 * @throws CommerceCartModificationException
	 *            if the cart cannot be modified
	 */
	CartModificationData addToCart(String code, long quantity) throws CommerceCartModificationException;

	/**
	 * Method for adding a product to cart.
	 * 
	 * @param code
	 *           code of product to add
	 * @param storeId
	 *           The identifier for the store. If null {@see CartFacade#addToCart(String, long)} is used.
	 * @param quantity
	 *           the quantity of the product
	 * @return the cart modification data that includes a statusCode and the actual quantity added to the cart
	 * @throws CommerceCartModificationException
	 *            if the cart cannot be modified
	 */
	CartModificationData addToCart(String code, long quantity, String storeId) throws CommerceCartModificationException;

	/**
	 * Method for validating every entry in the cart
	 * 
	 * @return a list of cart modifications that includes a statusCode and the actual quantity that the entry was updated
	 *         to
	 * @throws CommerceCartModificationException
	 *            if the cart cannot be modified
	 */
	List<CartModificationData> validateCartData() throws CommerceCartModificationException;

	/**
	 * Method for updating the number of products.
	 * 
	 * @param entryNumber
	 *           the entry number
	 * @param quantity
	 *           new value of quantity for product
	 * @return the cart modification data that includes a statusCode and the actual quantity that the entry was updated
	 *         to
	 * @throws CommerceCartModificationException
	 *            if the cart cannot be modified
	 */
	CartModificationData updateCartEntry(long entryNumber, long quantity) throws CommerceCartModificationException;

	/**
	 * Method for updating the number of products.
	 * 
	 * @param entryNumber
	 *           The entry number
	 * @param storeId
	 *           The identifier for the store. Can be null.
	 * @return the cart modification data that includes a statusCode and the actual quantity that the entry was updated
	 *         to
	 * @throws CommerceCartModificationException
	 *            if the cart cannot be modified
	 */
	CartModificationData updateCartEntry(long entryNumber, String storeId) throws CommerceCartModificationException;

	/**
	 * Restores the user's saved cart to the session. For non-anonymous users, the cart restored will be for the current
	 * user and site.
	 * 
	 * @param code
	 *           the cart code to restore for Anonymous user.
	 * @return the cart restoration data that includes details of any items that could not be restored in part or in
	 *         full.
	 */
	CartRestorationData restoreSavedCart(String code) throws CommerceCartRestorationException;

	/**
	 * Clean last saved cart for current user and current basesite
	 */
	void cleanSavedCart();

}