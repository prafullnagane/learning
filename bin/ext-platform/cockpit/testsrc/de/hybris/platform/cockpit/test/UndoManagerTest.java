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
package de.hybris.platform.cockpit.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.cockpit.jalo.CockpitTest;
import de.hybris.platform.cockpit.model.undo.UndoableOperation;
import de.hybris.platform.cockpit.model.undo.impl.CannotRedoException;
import de.hybris.platform.cockpit.model.undo.impl.CannotUndoException;
import de.hybris.platform.cockpit.services.undo.UndoManager;
import de.hybris.platform.cockpit.services.undo.impl.DefaultUndoManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;


/**
 * Tests the basic functionality of the undo manager.
 */
@IntegrationTest
public class UndoManagerTest extends CockpitTest
{
	private UndoManager undoManager;

	@Before
	public void setUp() throws Exception
	{
		// to do
	}

	@Test
	public void testUndoManager() throws Exception
	{
		assertTrue("Undo manager not set or not instance of DefaultUndoManager", (getUndoManager() instanceof DefaultUndoManager));
		final DefaultUndoManager um = (DefaultUndoManager) getUndoManager();
		assertEquals(um.getMaxSize(), 20);
		final TestUndoableOperation operation1 = new TestUndoableOperation("1", "2");
		final TestUndoableOperation operation2 = new TestUndoableOperation("2", "3");
		final TestUndoableOperation operation3 = new TestUndoableOperation("3", "4");
		um.addOperation(operation1);
		assertEquals(operation1, um.peekUndoOperation());
		um.addOperation(operation2);
		assertEquals(operation2, um.peekUndoOperation());
		um.addOperation(operation3);
		assertEquals(operation3, um.peekUndoOperation());
		assertEquals(Arrays.asList(new UndoableOperation[]
		{ operation3, operation2, operation1 }), um.getUndoOperations());
		assertNull(um.peekRedoOperation());

		um.undo();

		assertEquals(operation2, um.peekUndoOperation());
		assertEquals(Arrays.asList(new UndoableOperation[]
		{ operation2, operation1 }), um.getUndoOperations());
		assertEquals(operation3, um.peekRedoOperation());

		um.redo();

		assertEquals(operation3, um.peekUndoOperation());
		assertEquals(Arrays.asList(new UndoableOperation[]
		{ operation3, operation2, operation1 }), um.getUndoOperations());
		assertNull(um.peekRedoOperation());

		um.undo();
		um.undo();

		assertEquals(operation1, um.peekUndoOperation());
		assertEquals(Arrays.asList(new UndoableOperation[]
		{ operation1 }), um.getUndoOperations());
		assertEquals(operation2, um.peekRedoOperation());
		assertEquals(Arrays.asList(new UndoableOperation[]
		{ operation2, operation3 }), um.getRedoOperations());

		final TestUndoableOperation operation4 = new TestUndoableOperation("4", "5");
		um.addOperation(operation4);

		assertEquals(operation4, um.peekUndoOperation());
		assertEquals(Arrays.asList(new UndoableOperation[]
		{ operation4, operation1 }), um.getUndoOperations());
		assertNull(um.peekRedoOperation());

		um.clear();
		final LinkedList<UndoableOperation> operations = new LinkedList<UndoableOperation>();
		for (int i = 0; i < um.getMaxSize(); i++)
		{
			final TestUndoableOperation operation = new TestUndoableOperation(String.valueOf(i), String.valueOf(i + 1));
			operations.push(operation);
			um.addOperation(operation);
		}

		assertEquals(operations, um.getUndoOperations());
		assertNull(um.peekRedoOperation());

		final TestUndoableOperation operation = new TestUndoableOperation(String.valueOf(um.getMaxSize()), String.valueOf(um
				.getMaxSize() + 1));
		um.addOperation(operation);
		operations.push(operation);
		operations.removeLast();

		assertEquals(operations, um.getUndoOperations());
		assertNull(um.peekRedoOperation());

		for (int i = 0; i < um.getMaxSize(); i++)
		{
			um.undo();
		}

		assertNull(um.peekUndoOperation());
		Collections.reverse(operations);
		assertEquals(operations, um.getRedoOperations());

		boolean failed = false;
		try
		{
			um.undo();
		}
		catch (final CannotUndoException e)
		{
			failed = true;
		}

		if (!failed)
		{
			fail("Should throw CannotUndoException");
		}

		for (int i = 0; i < um.getMaxSize(); i++)
		{
			um.redo();
		}

		Collections.reverse(operations);
		assertEquals(operations, um.getUndoOperations());
		assertNull(um.peekRedoOperation());

		failed = false;
		try
		{
			um.redo();
		}
		catch (final CannotRedoException e)
		{
			failed = true;
		}

		if (!failed)
		{
			fail("Should throw CannotRedoException");
		}
	}

	protected UndoManager getUndoManager()
	{
		if (this.undoManager == null)
		{
			this.undoManager = (UndoManager) applicationContext.getBean("undoManager");
		}
		return this.undoManager;
	}
}
