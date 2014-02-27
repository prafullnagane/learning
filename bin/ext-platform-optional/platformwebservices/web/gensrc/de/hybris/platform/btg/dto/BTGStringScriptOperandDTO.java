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
import de.hybris.platform.btg.model.BTGStringScriptOperandModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGStringScriptOperand first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGStringScriptOperandModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "btgstringscriptoperand")
public class BTGStringScriptOperandDTO extends BTGAbstractScriptOperandDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGStringScriptOperand.collection</code> attribute defined at extension <code> */
	private boolean _collection;
	/** <i>Generated variable</i> - Variable of <code>BTGStringScriptOperand.scriptLanguage</code> attribute defined at extension <code> */
	private java.lang.String _scriptLanguage;
	/** <i>Generated variable</i> - Variable of <code>BTGStringScriptOperand.returnType</code> attribute defined at extension <code> */
	private java.lang.Class _returnType;
	/** <i>Generated variable</i> - Variable of <code>BTGStringScriptOperand.script</code> attribute defined at extension <code> */
	private java.lang.String _script;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGStringScriptOperandDTO()
	{
		super();
	}
	
	
	public Class getReturnType()
	{
		return this._returnType;
	}
	
	public String getScript()
	{
		return this._script;
	}
	
	public String getScriptLanguage()
	{
		return this._scriptLanguage;
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
	
	public void setScript(final String value)
	{
		this.modifiedPropsSet.add("script");
		this._script = value;
	}
	
	public void setScriptLanguage(final String value)
	{
		this.modifiedPropsSet.add("scriptLanguage");
		this._scriptLanguage = value;
	}
	
}
