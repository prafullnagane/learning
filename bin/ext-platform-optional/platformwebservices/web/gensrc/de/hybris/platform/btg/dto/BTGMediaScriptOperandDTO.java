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
package de.hybris.platform.btg.dto;

import de.hybris.platform.btg.dto.BTGAbstractScriptOperandDTO;
import de.hybris.platform.btg.dto.ScriptMediaDTO;
import de.hybris.platform.btg.model.BTGMediaScriptOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGMediaScriptOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGMediaScriptOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgmediascriptoperand")
public class BTGMediaScriptOperandDTO extends BTGAbstractScriptOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code> */
	private de.hybris.platform.btg.dto.ScriptMediaDTO _scriptMedia;
	/** <i>Generated variable</i> - Variable of <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code> */
	private boolean _collection;
	/** <i>Generated variable</i> - Variable of <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code> */
	private java.lang.Class _returnType;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGMediaScriptOperandDTO()
	{
		super();
	}
	
	
	public Class getReturnType()
	{
		return this._returnType;
	}
	
	public ScriptMediaDTO getScriptMedia()
	{
		return this._scriptMedia;
	}
	
	public boolean isCollection()
	{
		return this._collection;
	}
	
	public void setCollection(final boolean value)
	{
		this.modifiedPropsSet.add("collection");
		this._collection = value;
	}
	
	public void setReturnType(final Class value)
	{
		this.modifiedPropsSet.add("returnType");
		this._returnType = value;
	}
	
	public void setScriptMedia(final ScriptMediaDTO value)
	{
		this.modifiedPropsSet.add("scriptMedia");
		this._scriptMedia = value;
	}
	
}
