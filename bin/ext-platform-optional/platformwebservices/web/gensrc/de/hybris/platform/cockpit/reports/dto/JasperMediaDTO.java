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

import de.hybris.platform.cockpit.reports.model.JasperMediaModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type JasperMedia first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = JasperMediaModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "jaspermedia")
public class JasperMediaDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>JasperMedia.icon</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _icon;
	/** <i>Generated variable</i> - Variable of <code>JasperMedia.reportDescription</code> attribute defined at extension <code> */
	private java.lang.String _reportDescription;
	/** <i>Generated variable</i> - Variable of <code>JasperMedia.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public JasperMediaDTO()
	{
		super();
	}
	
	
	public MediaDTO getIcon()
	{
		return this._icon;
	}
	
	public String getReportDescription()
	{
		return this._reportDescription;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public void setIcon(final MediaDTO value)
	{
		this.modifiedPropsSet.add("icon");
		this._icon = value;
	}
	
	public void setReportDescription(final String value)
	{
		this.modifiedPropsSet.add("reportDescription");
		this._reportDescription = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
	}
	
}
