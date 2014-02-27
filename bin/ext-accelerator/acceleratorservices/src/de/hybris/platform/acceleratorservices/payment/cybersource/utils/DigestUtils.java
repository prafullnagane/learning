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
package de.hybris.platform.acceleratorservices.payment.cybersource.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;


public class DigestUtils
{
	/**
	 * Utility method used for encrypting data used to secure communication with the CyberSource Hosted Order Page
	 * server.
	 * 
	 * @param customValues
	 *           - a String representation of all the data that requires securing.
	 * @param key
	 *           - a security key provided by CyberSource used to ensure each transaction is protected during it's
	 *           transmission across the Internet.
	 * @return - an encrypted String that is deemed secure for communication with CyberSource
	 * @throws java.security.InvalidKeyException
	 *            if the given key is inappropriate for initializing this MAC.
	 * @throws java.security.NoSuchAlgorithmException
	 *            when attempting to get a Message Authentication Code algorithm.
	 */
	public static String getPublicDigest(final String customValues, final String key) throws NoSuchAlgorithmException,
			InvalidKeyException
	{
		final Base64 encoder = new Base64();
		final Mac sha1Mac = Mac.getInstance("HmacSHA1");
		final SecretKeySpec publicKeySpec = new SecretKeySpec(key.getBytes(), "HmacSHA1");
		sha1Mac.init(publicKeySpec);

		final byte[] publicBytes = sha1Mac.doFinal(customValues.getBytes());
		final String publicDigest = new String(encoder.encode(publicBytes));

		return publicDigest.replaceAll("\n", "");
	}
}
