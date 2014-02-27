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
package de.hybris.platform.commons.dto;

import de.hybris.platform.commons.dto.ItemFormatterDTO;
import de.hybris.platform.commons.dto.MediaFormatterDTO;
import de.hybris.platform.commons.model.FormatModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Format first defined at extension commons
 */
@SuppressWarnings("all")
@GraphNode(target = FormatModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "format")
public class FormatDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Format.chained</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.commons.dto.MediaFormatterDTO> _chained;
	/** <i>Generated variable</i> - Variable of <code>Format.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Format.initial</code> attribute defined at extension <code> */
	private de.hybris.platform.commons.dto.ItemFormatterDTO _initial;
	/** <i>Generated variable</i> - Variable of <code>Format.validFor</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.ComposedTypeDTO> _validFor;
	/** <i>Generated variable</i> - Variable of <code>Format.documentType</code> attribute defined at extension <code> */
	private java.lang.String _documentType;
	/** <i>Generated variable</i> - Variable of <code>Format.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public FormatDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "chained")
	@XmlElement(name = "mediaFormatter")
	public Collection<MediaFormatterDTO> getChained()
	{
		return this._chained;
	}
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getDocumentType()
	{
		return this._documentType;
	}
	
	public ItemFormatterDTO getInitial()
	{
		return this._initial;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	@XmlElementWrapper(name = "validFor")
	@XmlElement(name = "composedType")
	public Collection<ComposedTypeDTO> getValidFor()
	{
		return this._validFor;
	}
	
	public void setChained(final Collection<MediaFormatterDTO> value)
	{
		this.modifiedPropsSet.add("chained");
		this._chained = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setDocumentType(final String value)
	{
		this.modifiedPropsSet.add("documentType");
		this._documentType = value;
	}
	
	public void setInitial(final ItemFormatterDTO value)
	{
		this.modifiedPropsSet.add("initial");
		this._initial = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setValidFor(final Collection<ComposedTypeDTO> value)
	{
		this.modifiedPropsSet.add("validFor");
		this._validFor = value;
	}
	
}
