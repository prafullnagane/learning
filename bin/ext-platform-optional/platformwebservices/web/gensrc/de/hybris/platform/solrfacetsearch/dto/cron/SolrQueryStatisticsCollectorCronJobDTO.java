/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.solrfacetsearch.dto.cron;

import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.solrfacetsearch.model.cron.SolrQueryStatisticsCollectorCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SolrQueryStatisticsCollectorCronJob first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@GraphNode(target = SolrQueryStatisticsCollectorCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "solrquerystatisticscollectorcronjob")
public class SolrQueryStatisticsCollectorCronJobDTO extends CronJobDTO
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrQueryStatisticsCollectorCronJobDTO()
	{
		super();
	}
	
	
}
