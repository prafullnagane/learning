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
package de.hybris.platform.deeplink.dto.media;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.deeplink.dto.rules.DeeplinkUrlDTO;
import de.hybris.platform.deeplink.model.media.BarcodeMediaModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BarcodeMedia first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = BarcodeMediaModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "barcodemedia")
public class BarcodeMediaDTO extends MediaDTO
{
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.contextItem</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.ItemDTO _contextItem;
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.barcodeType</code> attribute defined at extension <code> */
	private java.lang.String _barcodeType;
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.barcodeText</code> attribute defined at extension <code> */
	private java.lang.String _barcodeText;
	/** <i>Generated variable</i> - Variable of <code>BarcodeMedia.deeplinkUrl</code> attribute defined at extension <code> */
	private de.hybris.platform.deeplink.dto.rules.DeeplinkUrlDTO _deeplinkUrl;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BarcodeMediaDTO()
	{
		super();
	}
	
	
	public String getBarcodeText()
	{
		return this._barcodeText;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getBarcodeType()
	{
		return this._barcodeType;
	}
	
	public ItemDTO getContextItem()
	{
		return this._contextItem;
	}
	
	public DeeplinkUrlDTO getDeeplinkUrl()
	{
		return this._deeplinkUrl;
	}
	
	public void setBarcodeText(final String value)
	{
		this.modifiedPropsSet.add("barcodeText");
		this._barcodeText = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setBarcodeType(final String value)
	{
		this.modifiedPropsSet.add("barcodeType");
		this._barcodeType = value;
	}
	
	public void setContextItem(final ItemDTO value)
	{
		this.modifiedPropsSet.add("contextItem");
		this._contextItem = value;
	}
	
	public void setDeeplinkUrl(final DeeplinkUrlDTO value)
	{
		this.modifiedPropsSet.add("deeplinkUrl");
		this._deeplinkUrl = value;
	}
	
}
