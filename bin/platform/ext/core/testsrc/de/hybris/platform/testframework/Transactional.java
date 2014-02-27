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

import de.hybris.platform.testframework.runlistener.TransactionRunListener;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks a test method or class as transactional. If {@link TransactionRunListener} is activated, the test will be runed
 * within a scope of a transaction and in default rollbacked at end.
 * 
 * @see TransactionRunListener
 * @since 3.0-u3
 * 
 */
@Target(
{ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Transactional
{
	/**
	 * The "delayed store" feature enables you to delay all item modifications until the end of the transaction.
	 * 
	 * @return will the delayed store be enabled?
	 */
	boolean enableDelayedStore() default false;

	/**
	 * If set, no rollback will be done at the end of the test. Instead a commit will be performed.
	 * 
	 * @return will a commit be performed at end of test?
	 */
	boolean noRollback() default false;
}
