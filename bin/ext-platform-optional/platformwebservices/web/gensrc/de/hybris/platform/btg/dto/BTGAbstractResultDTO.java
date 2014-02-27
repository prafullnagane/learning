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

import de.hybris.platform.btg.model.BTGAbstractResultModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type BTGAbstractResult first defined at extension btg
 */
@SuppressWarnings("all")
@GraphNode(target = BTGAbstractResultModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "btgabstractresult")
public class BTGAbstractResultDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.forced</code> attribute defined at extension <code> */
	private boolean _forced;
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code> */
	private java.lang.String _sessionId;
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.sequence</code> attribute defined at extension <code> */
	private java.lang.String _sequence;
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code> */
	private java.lang.String _resultScope;
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code> */
	private boolean _invalidated;
	/** <i>Generated variable</i> - Variable of <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code> */
	private boolean _fulfilled;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BTGAbstractResultDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getResultScope()
	{
		return this._resultScope;
	}
	
	public String getSequence()
	{
		return this._sequence;
	}
	
	public String getSessionId()
	{
		return this._sessionId;
	}
	
	public boolean isForced()
	{
		return this._forced;
	}
	
	public boolean isFulfilled()
	{
		return this._fulfilled;
	}
	
	public boolean isInvalidated()
	{
		return this._invalidated;
	}
	
	public void setForced(final boolean value)
	{
		this.modifiedPropsSet.add("forced");
		this._forced = value;
	}
	
	public void setFulfilled(final boolean value)
	{
		this.modifiedPropsSet.add("fulfilled");
		this._fulfilled = value;
	}
	
	public void setInvalidated(final boolean value)
	{
		this.modifiedPropsSet.add("invalidated");
		this._invalidated = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setResultScope(final String value)
	{
		this.modifiedPropsSet.add("resultScope");
		this._resultScope = value;
	}
	
	public void setSequence(final String value)
	{
		this.modifiedPropsSet.add("sequence");
		this._sequence = value;
	}
	
	public void setSessionId(final String value)
	{
		this.modifiedPropsSet.add("sessionId");
		this._sessionId = value;
	}
	
}
