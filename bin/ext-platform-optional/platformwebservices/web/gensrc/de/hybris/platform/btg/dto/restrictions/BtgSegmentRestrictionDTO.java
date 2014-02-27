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
package de.hybris.platform.btg.dto.restrictions;

import de.hybris.platform.btg.dto.CmsRestrictionActionDefinitionDTO;
import de.hybris.platform.btg.model.restrictions.BtgSegmentRestrictionModel;
import de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BtgSegmentRestriction first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BtgSegmentRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "btgsegmentrestriction")
public class BtgSegmentRestrictionDTO extends AbstractRestrictionDTO
{
	/** <i>Generated variable</i> - Variable of <code>BtgSegmentRestriction.outputActionDefinition</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.CmsRestrictionActionDefinitionDTO _outputActionDefinition;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BtgSegmentRestrictionDTO()
	{
		super();
	}
	
	
	public CmsRestrictionActionDefinitionDTO getOutputActionDefinition()
	{
		return this._outputActionDefinition;
	}
	
	public void setOutputActionDefinition(final CmsRestrictionActionDefinitionDTO value)
	{
		this.modifiedPropsSet.add("outputActionDefinition");
		this._outputActionDefinition = value;
	}
	
}
