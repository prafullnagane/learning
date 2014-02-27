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
package de.hybris.platform.catalog.dto.classification;

import de.hybris.platform.catalog.dto.classification.ClassificationAttributeUnitDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO;
import de.hybris.platform.catalog.model.classification.ClassificationAttributeUnitModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ClassificationAttributeUnit first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ClassificationAttributeUnitModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "classificationattributeunit")
public class ClassificationAttributeUnitDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.convertibleUnits</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.catalog.dto.classification.ClassificationAttributeUnitDTO> _convertibleUnits;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.symbol</code> attribute defined at extension <code> */
	private java.lang.String _symbol;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.unitType</code> attribute defined at extension <code> */
	private java.lang.String _unitType;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.conversionFactor</code> attribute defined at extension <code> */
	private java.lang.Double _conversionFactor;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.externalID</code> attribute defined at extension <code> */
	private java.lang.String _externalID;
	/** <i>Generated variable</i> - Variable of <code>ClassificationAttributeUnit.systemVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO _systemVersion;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationAttributeUnitDTO()
	{
		super();
	}
	
	
	@XmlAttribute
	public String getCode()
	{
		return this._code;
	}
	
	public Double getConversionFactor()
	{
		return this._conversionFactor;
	}
	
	@XmlElementWrapper(name = "convertibleUnits")
	@XmlElement(name = "classificationAttributeUnit")
	public Set<ClassificationAttributeUnitDTO> getConvertibleUnits()
	{
		return this._convertibleUnits;
	}
	
	public String getExternalID()
	{
		return this._externalID;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getSymbol()
	{
		return this._symbol;
	}
	
	public ClassificationSystemVersionDTO getSystemVersion()
	{
		return this._systemVersion;
	}
	
	@XmlAttribute
	public String getUnitType()
	{
		return this._unitType;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setConversionFactor(final Double value)
	{
		this.modifiedPropsSet.add("conversionFactor");
		this._conversionFactor = value;
	}
	
	public void setConvertibleUnits(final Set<ClassificationAttributeUnitDTO> value)
	{
		this.modifiedPropsSet.add("convertibleUnits");
		this._convertibleUnits = value;
	}
	
	public void setExternalID(final String value)
	{
		this.modifiedPropsSet.add("externalID");
		this._externalID = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setSymbol(final String value)
	{
		this.modifiedPropsSet.add("symbol");
		this._symbol = value;
	}
	
	public void setSystemVersion(final ClassificationSystemVersionDTO value)
	{
		this.modifiedPropsSet.add("systemVersion");
		this._systemVersion = value;
	}
	
	public void setUnitType(final String value)
	{
		this.modifiedPropsSet.add("unitType");
		this._unitType = value;
	}
	
}
