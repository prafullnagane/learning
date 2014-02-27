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

import de.hybris.platform.btg.dto.BTGSegmentDTO;
import de.hybris.platform.btg.model.BtgJasperWidgetPreferencesModel;
import de.hybris.platform.cockpit.reports.dto.JasperWidgetPreferencesDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BtgJasperWidgetPreferences first defined at extension btgcockpit
 */
@SuppressWarnings("all")
@GraphNode(target = BtgJasperWidgetPreferencesModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "btgjasperwidgetpreferences")
public class BtgJasperWidgetPreferencesDTO extends JasperWidgetPreferencesDTO
{
	/** <i>Generated variable</i> - Variable of <code>BtgJasperWidgetPreferences.segment</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.BTGSegmentDTO _segment;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BtgJasperWidgetPreferencesDTO()
	{
		super();
	}
	
	
	public BTGSegmentDTO getSegment()
	{
		return this._segment;
	}
	
	public void setSegment(final BTGSegmentDTO value)
	{
		this.modifiedPropsSet.add("segment");
		this._segment = value;
	}
	
}
