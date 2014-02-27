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
package de.hybris.platform.lucenesearch.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.lucenesearch.dto.AbstractLuceneItemDTO;
import de.hybris.platform.lucenesearch.dto.IndexConfigurationDTO;
import de.hybris.platform.lucenesearch.model.IndexUpdateModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.PkToLongConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type IndexUpdate first defined at extension lucenesearch
 */
@SuppressWarnings("all")
@GraphNode(target = IndexUpdateModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "indexupdate")
public class IndexUpdateDTO extends AbstractLuceneItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.itemPK</code> attribute defined at extension <code> */
	private java.lang.Long _itemPK;
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.item</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _item;
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code> */
	private de.hybris.platform.lucenesearch.dto.IndexConfigurationDTO _indexConfiguration;
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.inProgress</code> attribute defined at extension <code> */
	private java.lang.Boolean _inProgress;
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.remove</code> attribute defined at extension <code> */
	private java.lang.Boolean _remove;
	/** <i>Generated variable</i> - Variable of <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.CronJobDTO _updateIndexCronJob;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public IndexUpdateDTO()
	{
		super();
	}
	
	
	public IndexConfigurationDTO getIndexConfiguration()
	{
		return this._indexConfiguration;
	}
	
	public Boolean getInProgress()
	{
		return this._inProgress;
	}
	
	public ItemDTO getItem()
	{
		return this._item;
	}
	
	public Long getItemPK()
	{
		return this._itemPK;
	}
	
	public Boolean getRemove()
	{
		return this._remove;
	}
	
	public CronJobDTO getUpdateIndexCronJob()
	{
		return this._updateIndexCronJob;
	}
	
	public void setIndexConfiguration(final IndexConfigurationDTO value)
	{
		this.modifiedPropsSet.add("indexConfiguration");
		this._indexConfiguration = value;
	}
	
	public void setInProgress(final Boolean value)
	{
		this.modifiedPropsSet.add("inProgress");
		this._inProgress = value;
	}
	
	public void setItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("item");
		this._item = value;
	}
	
	@GraphProperty(interceptor = PkToLongConverter.class)
	public void setItemPK(final Long value)
	{
		this.modifiedPropsSet.add("itemPK");
		this._itemPK = value;
	}
	
	public void setRemove(final Boolean value)
	{
		this.modifiedPropsSet.add("remove");
		this._remove = value;
	}
	
	public void setUpdateIndexCronJob(final CronJobDTO value)
	{
		this.modifiedPropsSet.add("updateIndexCronJob");
		this._updateIndexCronJob = value;
	}
	
}
