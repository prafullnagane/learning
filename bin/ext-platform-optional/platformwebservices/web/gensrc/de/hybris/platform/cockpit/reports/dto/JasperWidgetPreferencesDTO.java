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
package de.hybris.platform.cockpit.reports.dto;

import de.hybris.platform.cockpit.dto.DynamicWidgetPreferencesDTO;
import de.hybris.platform.cockpit.reports.dto.JasperMediaDTO;
import de.hybris.platform.cockpit.reports.model.JasperWidgetPreferencesModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type JasperWidgetPreferences first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = JasperWidgetPreferencesModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "jasperwidgetpreferences")
public class JasperWidgetPreferencesDTO extends DynamicWidgetPreferencesDTO
{
	/** <i>Generated variable</i> - Variable of <code>JasperWidgetPreferences.report</code> attribute defined at extension <code> */
	private de.hybris.platform.cockpit.reports.dto.JasperMediaDTO _report;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperWidgetPreferencesDTO()
	{
		super();
	}
	
	
	public JasperMediaDTO getReport()
	{
		return this._report;
	}
	
	public void setReport(final JasperMediaDTO value)
	{
		this.modifiedPropsSet.add("report");
		this._report = value;
	}
	
}
