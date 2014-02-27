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
package de.hybris.platform.commerceservices.util;

import de.hybris.platform.core.Registry;
import de.hybris.platform.processengine.enums.ProcessState;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.util.Utilities;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.mockito.MockitoAnnotations;
import org.springframework.context.support.GenericApplicationContext;


@Ignore
public class AcceleratorBaseTest extends ServicelayerTest
{
	private static final Logger LOG = Logger.getLogger(AcceleratorBaseTest.class);

	@Resource
	protected FlexibleSearchService flexibleSearchService;

	public AcceleratorBaseTest()
	{
		MockitoAnnotations.initMocks(this);
		// disable spring integration polling.
		try
		{
			new SpringCustomContextLoader(this.getClass()).loadApplicationContexts((GenericApplicationContext) Registry
					.getGlobalApplicationContext());
		}
		catch (final Exception e)
		{
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	protected List<BusinessProcessModel> getProcesses(final String processDefinitionName, final List<ProcessState> processStates)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery("select {" + BusinessProcessModel.PK + "} from {"
				+ BusinessProcessModel._TYPECODE + "} where {" + BusinessProcessModel.STATE + "} in (?state) AND {"
				+ BusinessProcessModel.PROCESSDEFINITIONNAME + "} = ?processDefinitionName");
		query.addQueryParameter(BusinessProcessModel.PROCESSDEFINITIONNAME, processDefinitionName);
		query.addQueryParameter(BusinessProcessModel.STATE, processStates);
		final SearchResult<BusinessProcessModel> result = flexibleSearchService.search(query);
		return result.getResult();
	}

	protected boolean waitForProcessToEnd(final String processDefinitionName, final long maxWait) throws InterruptedException
	{
		final long start = System.currentTimeMillis();
		while (true)
		{
			final List<BusinessProcessModel> processes = getProcesses(processDefinitionName, Arrays.asList(new ProcessState[]
			{ ProcessState.RUNNING, ProcessState.CREATED, ProcessState.WAITING }));

			if (CollectionUtils.isEmpty(processes))
			{
				return true;
			}
			if (System.currentTimeMillis() - start > maxWait)
			{
				LOG.warn(String.format("BusinessProcesses with processDefinitionName %s are still in running! Waited for %s",
						processDefinitionName, Utilities.formatTime(System.currentTimeMillis() - start)));
				for (final BusinessProcessModel process : processes)
				{
					LOG.warn(String.format("Process %s has state: %s", process.getCode(), process.getState()));
				}
				return false;
			}
			else
			{
				Thread.sleep(1000);
			}
		}
	}
}
