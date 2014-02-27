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
package de.hybris.platform.cms2.dto.contents.components;

import de.hybris.platform.cms2.dto.contents.components.AbstractCMSComponentDTO;
import de.hybris.platform.cms2.dto.contents.containers.AbstractCMSComponentContainerDTO;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SimpleCMSComponent first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = SimpleCMSComponentModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "simplecmscomponent")
public class SimpleCMSComponentDTO extends AbstractCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>SimpleCMSComponent.containers</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.contents.containers.AbstractCMSComponentContainerDTO> _containers;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SimpleCMSComponentDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "containers")
	@XmlElement(name = "abstractCMSComponentContainer")
	public Collection<AbstractCMSComponentContainerDTO> getContainers()
	{
		return this._containers;
	}
	
	public void setContainers(final Collection<AbstractCMSComponentContainerDTO> value)
	{
		this.modifiedPropsSet.add("containers");
		this._containers = value;
	}
	
}
