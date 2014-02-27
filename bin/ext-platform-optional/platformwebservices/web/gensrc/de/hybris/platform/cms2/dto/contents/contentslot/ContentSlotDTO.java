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
package de.hybris.platform.cms2.dto.contents.contentslot;

import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.cms2.dto.contents.components.AbstractCMSComponentDTO;
import de.hybris.platform.cms2.model.contents.contentslot.ContentSlotModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ContentSlot first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ContentSlotModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "contentslot")
public class ContentSlotDTO extends CMSItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.cmsComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.components.AbstractCMSComponentDTO> _cmsComponents;
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.activeFrom</code> attribute defined at extension <code> */
	private java.util.Date _activeFrom;
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.active</code> attribute defined at extension <code> */
	private java.lang.Boolean _active;
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.currentPosition</code> attribute defined at extension <code> */
	private java.lang.String _currentPosition;
	/** <i>Generated variable</i> - Variable of <code>ContentSlot.activeUntil</code> attribute defined at extension <code> */
	private java.util.Date _activeUntil;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ContentSlotDTO()
	{
		super();
	}
	
	
	public Boolean getActive()
	{
		return this._active;
	}
	
	public Date getActiveFrom()
	{
		return this._activeFrom;
	}
	
	public Date getActiveUntil()
	{
		return this._activeUntil;
	}
	
	@XmlElementWrapper(name = "cmsComponents")
	@XmlElement(name = "abstractCMSComponent")
	public List<AbstractCMSComponentDTO> getCmsComponents()
	{
		return this._cmsComponents;
	}
	
	public String getCurrentPosition()
	{
		return this._currentPosition;
	}
	
	public void setActive(final Boolean value)
	{
		this.modifiedPropsSet.add("active");
		this._active = value;
	}
	
	public void setActiveFrom(final Date value)
	{
		this.modifiedPropsSet.add("activeFrom");
		this._activeFrom = value;
	}
	
	public void setActiveUntil(final Date value)
	{
		this.modifiedPropsSet.add("activeUntil");
		this._activeUntil = value;
	}
	
	public void setCmsComponents(final List<AbstractCMSComponentDTO> value)
	{
		this.modifiedPropsSet.add("cmsComponents");
		this._cmsComponents = value;
	}
	
	public void setCurrentPosition(final String value)
	{
		this.modifiedPropsSet.add("currentPosition");
		this._currentPosition = value;
	}
	
}
