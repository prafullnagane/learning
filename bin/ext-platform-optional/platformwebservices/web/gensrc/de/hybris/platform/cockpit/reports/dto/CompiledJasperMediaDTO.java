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

import de.hybris.platform.cockpit.reports.dto.JasperMediaDTO;
import de.hybris.platform.cockpit.reports.model.CompiledJasperMediaModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CompiledJasperMedia first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CompiledJasperMediaModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "compiledjaspermedia")
public class CompiledJasperMediaDTO extends JasperMediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>CompiledJasperMedia.compiledReport</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _compiledReport;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CompiledJasperMediaDTO()
	{
		super();
	}
	
	
	public MediaDTO getCompiledReport()
	{
		return this._compiledReport;
	}
	
	public void setCompiledReport(final MediaDTO value)
	{
		this.modifiedPropsSet.add("compiledReport");
		this._compiledReport = value;
	}
	
}
