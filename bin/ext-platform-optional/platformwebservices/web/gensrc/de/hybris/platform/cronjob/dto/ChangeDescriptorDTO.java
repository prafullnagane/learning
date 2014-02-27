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

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.cronjob.dto.StepDTO;
import de.hybris.platform.cronjob.model.ChangeDescriptorModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ChangeDescriptor first defined at extension processing
 */
@SuppressWarnings("all")
@GraphNode(target = ChangeDescriptorModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "changedescriptor")
public class ChangeDescriptorDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.changeType</code> attribute defined at extension <code> */
	private java.lang.String _changeType;
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.changedItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _changedItem;
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.step</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.StepDTO _step;
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.cronJob</code> attribute defined at extension <code> */
	private de.hybris.platform.cronjob.dto.CronJobDTO _cronJob;
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.sequenceNumber</code> attribute defined at extension <code> */
	private java.lang.Integer _sequenceNumber;
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.saveTimestamp</code> attribute defined at extension <code> */
	private java.util.Date _saveTimestamp;
	/** <i>Generated variable</i> - Variable of <code>ChangeDescriptor.previousItemState</code> attribute defined at extension <code> */
	private java.util.Map _previousItemState;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ChangeDescriptorDTO()
	{
		super();
	}
	
	
	public ItemDTO getChangedItem()
	{
		return this._changedItem;
	}
	
	public String getChangeType()
	{
		return this._changeType;
	}
	
	public CronJobDTO getCronJob()
	{
		return this._cronJob;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public Map getPreviousItemState()
	{
		return this._previousItemState;
	}
	
	public Date getSaveTimestamp()
	{
		return this._saveTimestamp;
	}
	
	@XmlAttribute
	public Integer getSequenceNumber()
	{
		return this._sequenceNumber;
	}
	
	public StepDTO getStep()
	{
		return this._step;
	}
	
	public void setChangedItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("changedItem");
		this._changedItem = value;
	}
	
	public void setChangeType(final String value)
	{
		this.modifiedPropsSet.add("changeType");
		this._changeType = value;
	}
	
	public void setCronJob(final CronJobDTO value)
	{
		this.modifiedPropsSet.add("cronJob");
		this._cronJob = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setPreviousItemState(final Map value)
	{
		this.modifiedPropsSet.add("previousItemState");
		this._previousItemState = value;
	}
	
	public void setSaveTimestamp(final Date value)
	{
		this.modifiedPropsSet.add("saveTimestamp");
		this._saveTimestamp = value;
	}
	
	public void setSequenceNumber(final Integer value)
	{
		this.modifiedPropsSet.add("sequenceNumber");
		this._sequenceNumber = value;
	}
	
	public void setStep(final StepDTO value)
	{
		this.modifiedPropsSet.add("step");
		this._step = value;
	}
	
}
