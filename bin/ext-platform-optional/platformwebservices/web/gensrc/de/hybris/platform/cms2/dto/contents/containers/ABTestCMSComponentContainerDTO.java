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
package de.hybris.platform.cms2.dto.contents.containers;

import de.hybris.platform.cms2.dto.contents.containers.AbstractCMSComponentContainerDTO;
import de.hybris.platform.cms2.model.contents.containers.ABTestCMSComponentContainerModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ABTestCMSComponentContainer first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = ABTestCMSComponentContainerModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "abtestcmscomponentcontainer")
public class ABTestCMSComponentContainerDTO extends AbstractCMSComponentContainerDTO
{
	/** <i>Generated variable</i> - Variable of <code>ABTestCMSComponentContainer.scope</code> attribute defined at extension <code> */
	private java.lang.String _scope;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ABTestCMSComponentContainerDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getScope()
	{
		return this._scope;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setScope(final String value)
	{
		this.modifiedPropsSet.add("scope");
		this._scope = value;
	}
	
}
