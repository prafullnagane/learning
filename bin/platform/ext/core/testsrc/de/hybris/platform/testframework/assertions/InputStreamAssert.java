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
package de.hybris.platform.testframework.assertions;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.fest.assertions.Assertions;
import org.fest.assertions.GenericAssert;

import com.google.common.io.CountingInputStream;


/**
 * Assertion for checking input streams.
 */
public final class InputStreamAssert extends GenericAssert<InputStreamAssert, InputStream>
{

	private InputStreamAssert(final InputStream actual)
	{
		super(InputStreamAssert.class, actual);
	}

	public static InputStreamAssert assertThat(final InputStream actual)
	{
		return new InputStreamAssert(actual);
	}

	public InputStreamAssert hasSize(final long size)
	{
		CountingInputStream cis = null;
		try
		{
			cis = new CountingInputStream(actual);
			Assertions.assertThat(cis.getCount()).isEqualTo(size);
		}
		finally
		{
			if (cis != null)
			{
				IOUtils.closeQuietly(cis);
			}
		}
		return this;
	}

	public InputStreamAssert hasSameDataAs(final byte[] expected)
	{
		try
		{
			final byte[] byteArray = IOUtils.toByteArray(actual);
			Assertions.assertThat(byteArray).isEqualTo(expected);
		}
		catch (final IOException e)
		{
			fail(e.getMessage(), e);
		}
		finally
		{
			if (actual != null)
			{
				IOUtils.closeQuietly(actual);
			}
		}
		return this;
	}

	public InputStreamAssert hasSameDataAs(final InputStream expected)
	{
		try
		{
			Assertions.assertThat(IOUtils.contentEquals(actual, expected)).isTrue();
		}
		catch (final IOException e)
		{
			fail(e.getMessage(), e);
		}
		finally
		{
			if (actual != null)
			{
				IOUtils.closeQuietly(actual);
			}
		}
		return this;
	}

	public InputStreamAssert hasSameSizeAs(final InputStream other)
	{
		try
		{
			Assertions.assertThat(getStreamNumBytesForStream(actual)).isEqualTo(getStreamNumBytesForStream(other));
		}
		catch (final IOException e)
		{
			fail(e.getMessage(), e);
		}
		return this;
	}

	private long getStreamNumBytesForStream(final InputStream stream) throws IOException
	{
		CountingInputStream cis = null;
		try
		{
			cis = new CountingInputStream(stream);
			return cis.getCount();
		}
		finally
		{
			if (cis != null)
			{
				cis.close();
			}
		}
	}

}
