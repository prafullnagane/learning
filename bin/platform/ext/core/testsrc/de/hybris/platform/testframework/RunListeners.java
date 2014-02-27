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
package de.hybris.platform.testframework;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.runner.notification.RunListener;


/**
 * The RunListener annotation defines class-level metadata for configuring which {@link RunListener} should be
 * registered for test execution. List of configured RunListsner's will only be registered if the
 * {@link HybrisJUnit4ClassRunner} is used (can be set using {@link org.junit.runner.RunWith} annotation).
 * 
 * 
 * @since 3.0-u3
 * @see RunListener
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface RunListeners
{
	/**
	 * The {@link RunListener}s to register for test execution.
	 */
	Class<? extends RunListener>[] value();
}
