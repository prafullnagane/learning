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
package de.hybris.platform.cms2.dto.contents.components;

import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotDTO;
import de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractCMSComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractCMSComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "abstractcmscomponent")
public class AbstractCMSComponentDTO extends CMSItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.typeCode</code> attribute defined at extension <code> */
	private java.lang.String _typeCode;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.container</code> attribute defined at extension <code> */
	private boolean _container;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.visible</code> attribute defined at extension <code> */
	private java.lang.Boolean _visible;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.restricted</code> attribute defined at extension <code> */
	private boolean _restricted;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.restrictions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.onlyOneRestrictionMustApply</code> attribute defined at extension <code> */
	private boolean _onlyOneRestrictionMustApply;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponent.slots</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.contents.contentslot.ContentSlotDTO> _slots;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCMSComponentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "abstractRestriction")
	public List<AbstractRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	@XmlElementWrapper(name = "slots")
	@XmlElement(name = "contentSlot")
	public Collection<ContentSlotDTO> getSlots()
	{
		return this._slots;
	}
	
	public String getType()
	{
		return this._type;
	}
	
	public String getTypeCode()
	{
		return this._typeCode;
	}
	
	public Boolean getVisible()
	{
		return this._visible;
	}
	
	public boolean isContainer()
	{
		return this._container;
	}
	
	public boolean isOnlyOneRestrictionMustApply()
	{
		return this._onlyOneRestrictionMustApply;
	}
	
	public boolean isRestricted()
	{
		return this._restricted;
	}
	
	public void setContainer(final boolean value)
	{
		this.modifiedPropsSet.add("container");
		this._container = value;
	}
	
	public void setOnlyOneRestrictionMustApply(final boolean value)
	{
		this.modifiedPropsSet.add("onlyOneRestrictionMustApply");
		this._onlyOneRestrictionMustApply = value;
	}
	
	public void setRestricted(final boolean value)
	{
		this.modifiedPropsSet.add("restricted");
		this._restricted = value;
	}
	
	public void setRestrictions(final List<AbstractRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setSlots(final Collection<ContentSlotDTO> value)
	{
		this.modifiedPropsSet.add("slots");
		this._slots = value;
	}
	
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setTypeCode(final String value)
	{
		this.modifiedPropsSet.add("typeCode");
		this._typeCode = value;
	}
	
	public void setVisible(final Boolean value)
	{
		this.modifiedPropsSet.add("visible");
		this._visible = value;
	}
	
}
