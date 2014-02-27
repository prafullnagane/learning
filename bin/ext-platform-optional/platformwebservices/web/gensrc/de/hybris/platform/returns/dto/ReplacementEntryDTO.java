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
package de.hybris.platform.returns.dto;

import de.hybris.platform.returns.dto.ReturnEntryDTO;
import de.hybris.platform.returns.model.ReplacementEntryModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ReplacementEntry first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = ReplacementEntryModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "replacemententry")
public class ReplacementEntryDTO extends ReturnEntryDTO
{
	/** <i>Generated variable</i> - Variable of <code>ReplacementEntry.reason</code> attribute defined at extension <code> */
	private java.lang.String _reason;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ReplacementEntryDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getReason()
	{
		return this._reason;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setReason(final String value)
	{
		this.modifiedPropsSet.add("reason");
		this._reason = value;
	}
	
}
