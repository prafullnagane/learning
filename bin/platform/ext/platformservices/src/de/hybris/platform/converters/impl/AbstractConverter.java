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
package de.hybris.platform.converters.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;


/**
 * Abstract implementation of the Converter interface that also supports the Populator interface.
 * Implementations of this base type can either be used as a converter or as a populator.
 * When used as a converter the {@link #createTarget()} method is called to create the target instance
 * and then the {@link #populate(Object, Object)} method is called to populate the target with
 * values from the source instance.
 * The {@link #createTarget()} method can be implemented via a spring <tt>lookup-method</tt> rather than
 * being overridden in code.
 */
public abstract class AbstractConverter<SOURCE, TARGET> implements Converter<SOURCE, TARGET>, Populator<SOURCE, TARGET>
{
	@Override
	public TARGET convert(final SOURCE source) throws ConversionException
	{
		final TARGET target = createTarget();
		populate(source, target);
		return target;
	}

	/**
	 * @deprecated Do not call this method - only call the single argument {@link #convert(Object)} method.
	 */
	@Override
	@Deprecated
	public TARGET convert(final SOURCE source, final TARGET prototype) throws ConversionException
	{
		populate(source, prototype);
		return prototype;
	}

	/**
	 * Override this method to create the instance of target type.
	 * 
	 * @return the new target instance
	 */
	protected abstract TARGET createTarget();

	/**
	 * Override this method to populate the target from the source
	 * 
	 * @param source
	 *           the source instance
	 * @param target
	 *           the target instance to fill
	 */
	@Override
	public abstract void populate(final SOURCE source, final TARGET target);
}
