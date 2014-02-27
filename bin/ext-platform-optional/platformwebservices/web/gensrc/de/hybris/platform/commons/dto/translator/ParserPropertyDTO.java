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
package de.hybris.platform.commons.dto.translator;

import de.hybris.platform.commons.dto.translator.JaloTranslatorConfigurationDTO;
import de.hybris.platform.commons.model.translator.ParserPropertyModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ParserProperty first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = ParserPropertyModel.class, factory = GenericNodeFactory.class, uidProperties="name")
@XmlRootElement(name = "parserproperty")
public class ParserPropertyDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ParserProperty.endExp</code> attribute defined at extension <code> */
	private java.lang.String _endExp;
	/** <i>Generated variable</i> - Variable of <code>ParserProperty.parserClass</code> attribute defined at extension <code> */
	private java.lang.String _parserClass;
	/** <i>Generated variable</i> - Variable of <code>ParserProperty.translatorConfiguration</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.translator.JaloTranslatorConfigurationDTO _translatorConfiguration;
	/** <i>Generated variable</i> - Variable of <code>ParserProperty.startExp</code> attribute defined at extension <code> */
	private java.lang.String _startExp;
	/** <i>Generated variable</i> - Variable of <code>ParserProperty.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ParserPropertyDTO()
	{
		super();
	}
	
	
	public String getEndExp()
	{
		return this._endExp;
	}
	
	@XmlAttribute
	public String getName()
	{
		return this._name;
	}
	
	public String getParserClass()
	{
		return this._parserClass;
	}
	
	@XmlAttribute
	public String getStartExp()
	{
		return this._startExp;
	}
	
	public JaloTranslatorConfigurationDTO getTranslatorConfiguration()
	{
		return this._translatorConfiguration;
	}
	
	public void setEndExp(final String value)
	{
		this.modifiedPropsSet.add("endExp");
		this._endExp = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setParserClass(final String value)
	{
		this.modifiedPropsSet.add("parserClass");
		this._parserClass = value;
	}
	
	public void setStartExp(final String value)
	{
		this.modifiedPropsSet.add("startExp");
		this._startExp = value;
	}
	
	public void setTranslatorConfiguration(final JaloTranslatorConfigurationDTO value)
	{
		this.modifiedPropsSet.add("translatorConfiguration");
		this._translatorConfiguration = value;
	}
	
}
