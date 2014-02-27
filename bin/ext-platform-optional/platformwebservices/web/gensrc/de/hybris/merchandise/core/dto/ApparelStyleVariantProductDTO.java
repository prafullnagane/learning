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
package de.hybris.merchandise.core.dto;

import de.hybris.merchandise.core.model.ApparelStyleVariantProductModel;
import de.hybris.platform.variants.dto.VariantProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumSetToStringValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringSetToHybrisEnumValuesConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ApparelStyleVariantProduct first defined at extension merchandisecore
 */
@SuppressWarnings("all")
@GraphNode(target = ApparelStyleVariantProductModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "apparelstylevariantproduct")
public class ApparelStyleVariantProductDTO extends VariantProductDTO
{
	/** <i>Generated variable</i> - Variable of <code>ApparelStyleVariantProduct.swatchColors</code> attribute defined at extension <code> */
	private java.util.Set<java.lang.String> _swatchColors;
	/** <i>Generated variable</i> - Variable of <code>ApparelStyleVariantProduct.style</code> attribute defined at extension <code> */
	private java.lang.String _style;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelStyleVariantProductDTO()
	{
		super();
	}
	
	
	public String getStyle()
	{
		return this._style;
	}
	
	@GraphProperty(interceptor = StringSetToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "swatchColors")
	@XmlElement(name = "swatchColorEnum")
	public Set<String> getSwatchColors()
	{
		return this._swatchColors;
	}
	
	public void setStyle(final String value)
	{
		this.modifiedPropsSet.add("style");
		this._style = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumSetToStringValuesConverter.class)
	public void setSwatchColors(final Set<String> value)
	{
		this.modifiedPropsSet.add("swatchColors");
		this._swatchColors = value;
	}
	
}
