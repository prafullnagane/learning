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

import de.hybris.platform.cms2.dto.contents.components.AbstractCMSComponentDTO;
import de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO;
import de.hybris.platform.cms2.model.contents.containers.AbstractCMSComponentContainerModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractCMSComponentContainer first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractCMSComponentContainerModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "abstractcmscomponentcontainer")
public class AbstractCMSComponentContainerDTO extends AbstractCMSComponentDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponentContainer.currentCMSComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO> _currentCMSComponents;
	/** <i>Generated variable</i> - Variable of <code>AbstractCMSComponentContainer.simpleCMSComponents</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.contents.components.SimpleCMSComponentDTO> _simpleCMSComponents;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractCMSComponentContainerDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "currentCMSComponents")
	@XmlElement(name = "simpleCMSComponent")
	public List<SimpleCMSComponentDTO> getCurrentCMSComponents()
	{
		return this._currentCMSComponents;
	}
	
	@XmlElementWrapper(name = "simpleCMSComponents")
	@XmlElement(name = "simpleCMSComponent")
	public List<SimpleCMSComponentDTO> getSimpleCMSComponents()
	{
		return this._simpleCMSComponents;
	}
	
	public void setCurrentCMSComponents(final List<SimpleCMSComponentDTO> value)
	{
		this.modifiedPropsSet.add("currentCMSComponents");
		this._currentCMSComponents = value;
	}
	
	public void setSimpleCMSComponents(final List<SimpleCMSComponentDTO> value)
	{
		this.modifiedPropsSet.add("simpleCMSComponents");
		this._simpleCMSComponents = value;
	}
	
}
