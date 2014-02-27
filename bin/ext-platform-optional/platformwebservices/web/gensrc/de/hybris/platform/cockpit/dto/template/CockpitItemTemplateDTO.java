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
package de.hybris.platform.cockpit.dto.template;

import de.hybris.platform.catalog.dto.classification.ClassificationClassDTO;
import de.hybris.platform.cockpit.model.template.CockpitItemTemplateModel;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type CockpitItemTemplate first defined at extension cockpit
 */
@SuppressWarnings("all")
@GraphNode(target = CockpitItemTemplateModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "cockpititemtemplate")
public class CockpitItemTemplateDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>CockpitItemTemplate.relatedType</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.type.ComposedTypeDTO _relatedType;
	/** <i>Generated variable</i> - Variable of <code>CockpitItemTemplate.code</code> attribute defined at extension <code> */
	private java.lang.String _code;
	/** <i>Generated variable</i> - Variable of <code>CockpitItemTemplate.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>CockpitItemTemplate.classificationClasses</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.classification.ClassificationClassDTO> _classificationClasses;
	/** <i>Generated variable</i> - Variable of <code>CockpitItemTemplate.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CockpitItemTemplateDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "classificationClasses")
	@XmlElement(name = "classificationClass")
	public Collection<ClassificationClassDTO> getClassificationClasses()
	{
		return this._classificationClasses;
	}
	
	public String getCode()
	{
		return this._code;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public ComposedTypeDTO getRelatedType()
	{
		return this._relatedType;
	}
	
	public void setClassificationClasses(final Collection<ClassificationClassDTO> value)
	{
		this.modifiedPropsSet.add("classificationClasses");
		this._classificationClasses = value;
	}
	
	public void setCode(final String value)
	{
		this.modifiedPropsSet.add("code");
		this._code = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setRelatedType(final ComposedTypeDTO value)
	{
		this.modifiedPropsSet.add("relatedType");
		this._relatedType = value;
	}
	
}
