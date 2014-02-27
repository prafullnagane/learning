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

import de.hybris.merchandise.core.model.ApparelProductModel;
import de.hybris.platform.core.dto.product.ProductDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumListToStringValuesConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringListToHybrisEnumValuesConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ApparelProduct first defined at extension merchandisecore
 */
@SuppressWarnings("all")
@GraphNode(target = ApparelProductModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "apparelproduct")
public class ApparelProductDTO extends ProductDTO
{
	/** <i>Generated variable</i> - Variable of <code>ApparelProduct.genders</code> attribute defined at extension <code> */
	private java.util.List<java.lang.String> _genders;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ApparelProductDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringListToHybrisEnumValuesConverter.class)
	@XmlElementWrapper(name = "genders")
	@XmlElement(name = "gender")
	public List<String> getGenders()
	{
		return this._genders;
	}
	
	@GraphProperty(interceptor = HybrisEnumListToStringValuesConverter.class)
	public void setGenders(final List<String> value)
	{
		this.modifiedPropsSet.add("genders");
		this._genders = value;
	}
	
}
