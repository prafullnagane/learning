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
package de.hybris.platform.deeplink.dto.rules;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.deeplink.dto.media.BarcodeMediaDTO;
import de.hybris.platform.deeplink.model.rules.DeeplinkUrlModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DeeplinkUrl first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = DeeplinkUrlModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "deeplinkurl")
public class DeeplinkUrlDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.baseUrl</code> attribute defined at extension <code> */
	private java.lang.String _baseUrl;
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrl.barcodeMedias</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.deeplink.dto.media.BarcodeMediaDTO> _barcodeMedias;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeeplinkUrlDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "barcodeMedias")
	@XmlElement(name = "barcodeMedia")
	public Collection<BarcodeMediaDTO> getBarcodeMedias()
	{
		return this._barcodeMedias;
	}
	
	public String getBaseUrl()
	{
		return this._baseUrl;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public void setBarcodeMedias(final Collection<BarcodeMediaDTO> value)
	{
		this.modifiedPropsSet.add("barcodeMedias");
		this._barcodeMedias = value;
	}
	
	public void setBaseUrl(final String value)
	{
		this.modifiedPropsSet.add("baseUrl");
		this._baseUrl = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
}
