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

import de.hybris.platform.cockpit.model.CockpitUIComponentConfigurationModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitUIComponentConfiguration first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitUIComponentConfigurationModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpituicomponentconfiguration")
public class CockpitUIComponentConfigurationDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentConfiguration.principal</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.security.PrincipalDTO _principal;
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentConfiguration.objectTemplateCode</code> attribute defined at extension <code> */
	private java.lang.String _objectTemplateCode;
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentConfiguration.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentConfiguration.media</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _media;
	/** <i>Generated variable</i> - Variable of <code>CockpitUIComponentConfiguration.factoryBean</code> attribute defined at extension <code> */
	private java.lang.String _factoryBean;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitUIComponentConfigurationDTO()
	{
		super();
	}
	
	
	public String getCode()
	{
		return this._code;
	}
	
	public String getFactoryBean()
	{
		return this._factoryBean;
	}
	
	public MediaDTO getMedia()
	{
		return this._media;
	}
	
	public String getObjectTemplateCode()
	{
		return this._objectTemplateCode;
	}
	
	public PrincipalDTO getPrincipal()
	{
		return this._principal;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setFactoryBean(final String value)
	{
		this.modifiedPropsSet.add("factoryBean");
		this._factoryBean = value;
	}
	
	public void setMedia(final MediaDTO value)
	{
		this.modifiedPropsSet.add("media");
		this._media = value;
	}
	
	public void setObjectTemplateCode(final String value)
	{
		this.modifiedPropsSet.add("objectTemplateCode");
		this._objectTemplateCode = value;
	}
	
	public void setPrincipal(final PrincipalDTO value)
	{
		this.modifiedPropsSet.add("principal");
		this._principal = value;
	}
	
}
