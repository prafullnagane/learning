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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGOutputActionDefinitionDTO;
import de.hybris.platform.btg.dto.restrictions.BtgSegmentRestrictionDTO;
import de.hybris.platform.btg.model.CmsRestrictionActionDefinitionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CmsRestrictionActionDefinition first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = CmsRestrictionActionDefinitionModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cmsrestrictionactiondefinition")
public class CmsRestrictionActionDefinitionDTO extends BTGOutputActionDefinitionDTO
{
	/** <i>Generated variable</i> - Variable of <code>CmsRestrictionActionDefinition.segmentRestrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.restrictions.BtgSegmentRestrictionDTO> _segmentRestrictions;
	/** <i>Generated variable</i> - Variable of <code>CmsRestrictionActionDefinition.inverted</code> attribute defined at extension <code> */
	private java.lang.Boolean _inverted;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CmsRestrictionActionDefinitionDTO()
	{
		super();
	}
	
	
	public Boolean getInverted()
	{
		return this._inverted;
	}
	
	@XmlElementWrapper(name = "segmentRestrictions")
	@XmlElement(name = "btgSegmentRestriction")
	public Collection<BtgSegmentRestrictionDTO> getSegmentRestrictions()
	{
		return this._segmentRestrictions;
	}
	
	public void setInverted(final Boolean value)
	{
		this.modifiedPropsSet.add("inverted");
		this._inverted = value;
	}
	
	public void setSegmentRestrictions(final Collection<BtgSegmentRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("segmentRestrictions");
		this._segmentRestrictions = value;
	}
	
}
