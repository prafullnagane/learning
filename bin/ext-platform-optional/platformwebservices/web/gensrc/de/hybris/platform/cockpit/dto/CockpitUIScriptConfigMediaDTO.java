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
package de.hybris.platform.cockpit.dto;

import de.hybris.platform.cockpit.dto.CockpitUIConfigurationMediaDTO;
import de.hybris.platform.cockpit.model.CockpitUIScriptConfigMediaModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitUIScriptConfigMedia first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitUIScriptConfigMediaModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "cockpituiscriptconfigmedia")
public class CockpitUIScriptConfigMediaDTO extends CockpitUIConfigurationMediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitUIScriptConfigMedia.allowScriptEvaluation</code> attribute defined at extension <code> */
	private java.lang.Boolean _allowScriptEvaluation;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIScriptConfigMediaDTO()
	{
		super();
	}
	
	
	public Boolean getAllowScriptEvaluation()
	{
		return this._allowScriptEvaluation;
	}
	
	public void setAllowScriptEvaluation(final Boolean value)
	{
		this.modifiedPropsSet.add("allowScriptEvaluation");
		this._allowScriptEvaluation = value;
	}
	
}
