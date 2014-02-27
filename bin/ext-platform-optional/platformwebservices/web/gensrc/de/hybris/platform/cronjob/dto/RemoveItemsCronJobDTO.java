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
package de.hybris.platform.cronjob.dto;

import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.model.RemoveItemsCronJobModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type RemoveItemsCronJob first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = RemoveItemsCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "removeitemscronjob")
public class RemoveItemsCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>RemoveItemsCronJob.itemsFound</code> attribute defined at extension <code> */
	private java.lang.Integer _itemsFound;
	/** <i>Generated variable</i> - Variable of <code>RemoveItemsCronJob.itemsDeleted</code> attribute defined at extension <code> */
	private java.lang.Integer _itemsDeleted;
	/** <i>Generated variable</i> - Variable of <code>RemoveItemsCronJob.createSavedValues</code> attribute defined at extension <code> */
	private java.lang.Boolean _createSavedValues;
	/** <i>Generated variable</i> - Variable of <code>RemoveItemsCronJob.itemsRefused</code> attribute defined at extension <code> */
	private java.lang.Integer _itemsRefused;
	/** <i>Generated variable</i> - Variable of <code>RemoveItemsCronJob.itemPKs</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _itemPKs;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public RemoveItemsCronJobDTO()
	{
		super();
	}
	
	
	public Boolean getCreateSavedValues()
	{
		return this._createSavedValues;
	}
	
	public MediaDTO getItemPKs()
	{
		return this._itemPKs;
	}
	
	public Integer getItemsDeleted()
	{
		return this._itemsDeleted;
	}
	
	public Integer getItemsFound()
	{
		return this._itemsFound;
	}
	
	public Integer getItemsRefused()
	{
		return this._itemsRefused;
	}
	
	public void setCreateSavedValues(final Boolean value)
	{
		this.modifiedPropsSet.add("createSavedValues");
		this._createSavedValues = value;
	}
	
	public void setItemPKs(final MediaDTO value)
	{
		this.modifiedPropsSet.add("itemPKs");
		this._itemPKs = value;
	}
	
	public void setItemsDeleted(final Integer value)
	{
		this.modifiedPropsSet.add("itemsDeleted");
		this._itemsDeleted = value;
	}
	
	public void setItemsFound(final Integer value)
	{
		this.modifiedPropsSet.add("itemsFound");
		this._itemsFound = value;
	}
	
	public void setItemsRefused(final Integer value)
	{
		this.modifiedPropsSet.add("itemsRefused");
		this._itemsRefused = value;
	}
	
}
