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
import de.hybris.platform.cms2.model.restrictions.CMSInverseRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CMSInverseRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = CMSInverseRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "cmsinverserestriction")
public class CMSInverseRestrictionDTO extends AbstractRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CMSInverseRestriction.originalRestriction</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO _originalRestriction;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CMSInverseRestrictionDTO()
	{
		super();
	}
	
	
	public AbstractRestrictionDTO getOriginalRestriction()
	{
		return this._originalRestriction;
	}
	
	public void setOriginalRestriction(final AbstractRestrictionDTO value)
	{
		this.modifiedPropsSet.add("originalRestriction");
		this._originalRestriction = value;
	}
	
}
