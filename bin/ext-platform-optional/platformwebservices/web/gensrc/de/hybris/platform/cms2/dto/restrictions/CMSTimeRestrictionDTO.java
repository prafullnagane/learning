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
package de.hybris.platform.cms2.dto.restrictions;

import de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO;
import de.hybris.platform.cms2.model.restrictions.CMSTimeRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSTimeRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSTimeRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmstimerestriction")
public class CMSTimeRestrictionDTO extends AbstractRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSTimeRestriction.activeFrom</code> attribute defined at extension <code> */
	private java.util.Date _activeFrom;
	/** <i>Generated variable</i> - Variable of <code>CMSTimeRestriction.activeUntil</code> attribute defined at extension <code> */
	private java.util.Date _activeUntil;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSTimeRestrictionDTO()
	{
		super();
	}
	
	
	public Date getActiveFrom()
	{
		return this._activeFrom;
	}
	
	public Date getActiveUntil()
	{
		return this._activeUntil;
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
	
}
