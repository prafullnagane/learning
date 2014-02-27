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
package de.hybris.platform.impex.dto.exp;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.impex.dto.ImpExMediaDTO;
import de.hybris.platform.impex.dto.exp.ImpExExportMediaDTO;
import de.hybris.platform.impex.model.exp.ExportModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Export first defined at extension impex
 */
@SuppressWarnings("all")
@GraphNode(target = ExportModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "export")
public class ExportDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Export.exportScript</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.ImpExMediaDTO _exportScript;
	/** <i>Generated variable</i> - Variable of <code>Export.exportedMedias</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.exp.ImpExExportMediaDTO _exportedMedias;
	/** <i>Generated variable</i> - Variable of <code>Export.exportedData</code> attribute defined at extension <code> */
	private de.hybris.platform.impex.dto.exp.ImpExExportMediaDTO _exportedData;
	/** <i>Generated variable</i> - Variable of <code>Export.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>Export.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public ImpExExportMediaDTO getExportedData()
	{
		return this._exportedData;
	}
	
	public ImpExExportMediaDTO getExportedMedias()
	{
		return this._exportedMedias;
	}
	
	public ImpExMediaDTO getExportScript()
	{
		return this._exportScript;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setExportedData(final ImpExExportMediaDTO value)
	{
		this.modifiedPropsSet.add("exportedData");
		this._exportedData = value;
	}
	
	public void setExportedMedias(final ImpExExportMediaDTO value)
	{
		this.modifiedPropsSet.add("exportedMedias");
		this._exportedMedias = value;
	}
	
	public void setExportScript(final ImpExMediaDTO value)
	{
		this.modifiedPropsSet.add("exportScript");
		this._exportScript = value;
	}
	
}
