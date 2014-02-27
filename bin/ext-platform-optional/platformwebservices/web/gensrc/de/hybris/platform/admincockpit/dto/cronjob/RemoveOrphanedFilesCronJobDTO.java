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
package de.hybris.platform.admincockpit.dto.cronjob;

import de.hybris.platform.admincockpit.model.cronjob.RemoveOrphanedFilesCronJobModel;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RemoveOrphanedFilesCronJob first defined at extension admincockpit
 */
@SuppressWarnings("all")
@GraphNode(target = RemoveOrphanedFilesCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "removeorphanedfilescronjob")
public class RemoveOrphanedFilesCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>RemoveOrphanedFilesCronJob.paging</code> attribute defined at extension <code> */
	private java.lang.Integer _paging;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveOrphanedFilesCronJobDTO()
	{
		super();
	}
	
	
	public Integer getPaging()
	{
		return this._paging;
	}
	
	public void setPaging(final Integer value)
	{
		this.modifiedPropsSet.add("paging");
		this._paging = value;
	}
	
}
