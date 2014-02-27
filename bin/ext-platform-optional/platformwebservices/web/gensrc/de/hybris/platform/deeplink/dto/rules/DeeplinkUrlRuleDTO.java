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
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.deeplink.model.rules.DeeplinkUrlRuleModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type DeeplinkUrlRule first defined at extension basecommerce
 */
@SuppressWarnings("all")
@GraphNode(target = DeeplinkUrlRuleModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "deeplinkurlrule")
public class DeeplinkUrlRuleDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.priority</code> attribute defined at extension <code> */
	private java.lang.Integer _priority;
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.baseUrlPattern</code> attribute defined at extension <code> */
	private java.lang.String _baseUrlPattern;
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.applicableType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _applicableType;
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.destUrlTemplate</code> attribute defined at extension <code> */
	private java.lang.String _destUrlTemplate;
	/** <i>Generated variable</i> - Variable of <code>DeeplinkUrlRule.useForward</code> attribute defined at extension <code> */
	private java.lang.Boolean _useForward;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public DeeplinkUrlRuleDTO()
	{
		super();
	}
	
	
	public ComposedTypeDTO getApplicableType()
	{
		return this._applicableType;
	}
	
	public String getBaseUrlPattern()
	{
		return this._baseUrlPattern;
	}
	
	public String getDestUrlTemplate()
	{
		return this._destUrlTemplate;
	}
	
	public Integer getPriority()
	{
		return this._priority;
	}
	
	public Boolean getUseForward()
	{
		return this._useForward;
	}
	
	public void setApplicableType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("applicableType");
		this._applicableType = value;
	}
	
	public void setBaseUrlPattern(final String value)
	{
		this.modifiedPropsSet.add("baseUrlPattern");
		this._baseUrlPattern = value;
	}
	
	public void setDestUrlTemplate(final String value)
	{
		this.modifiedPropsSet.add("destUrlTemplate");
		this._destUrlTemplate = value;
	}
	
	public void setPriority(final Integer value)
	{
		this.modifiedPropsSet.add("priority");
		this._priority = value;
	}
	
	public void setUseForward(final Boolean value)
	{
		this.modifiedPropsSet.add("useForward");
		this._useForward = value;
	}
	
}
