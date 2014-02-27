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

import de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO;
import de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO;
import de.hybris.platform.catalog.model.classification.ClassificationClassModel;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cockpit.dto.template.CockpitItemTemplateDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ClassificationClass first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = ClassificationClassModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "classificationclass")
public class ClassificationClassDTO extends CategoryDTO
{
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.showEmptyAttributes</code> attribute defined at extension <code> */
	private java.lang.Boolean _showEmptyAttributes;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.revision</code> attribute defined at extension <code> */
	private java.lang.String _revision;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.hmcXML</code> attribute defined at extension <code> */
	private java.lang.String _hmcXML;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.externalID</code> attribute defined at extension <code> */
	private java.lang.String _externalID;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.classificationAttributes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO> _classificationAttributes;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.inheritedClassificationAttributes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO> _inheritedClassificationAttributes;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.cockpitItemTemplates</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.cockpit.dto.template.CockpitItemTemplateDTO> _cockpitItemTemplates;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.declaredClassificationAttributes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassificationAttributeDTO> _declaredClassificationAttributes;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.declaredClassificationAttributeAssignments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO> _declaredClassificationAttributeAssignments;
	/** <i>Generated variable</i> - Variable of <code>ClassificationClass.allClassificationAttributeAssignments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.classification.ClassAttributeAssignmentDTO> _allClassificationAttributeAssignments;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ClassificationClassDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "allClassificationAttributeAssignments")
	@XmlElement(name = "classAttributeAssignment")
	public List<ClassAttributeAssignmentDTO> getAllClassificationAttributeAssignments()
	{
		return this._allClassificationAttributeAssignments;
	}
	
	@Override
	public ClassificationSystemVersionDTO getCatalogVersion()
	{
		return (de.hybris.platform.catalog.dto.classification.ClassificationSystemVersionDTO) super.getCatalogVersion();
	}
	
	@XmlElementWrapper(name = "classificationAttributes")
	@XmlElement(name = "classificationAttribute")
	public List<ClassificationAttributeDTO> getClassificationAttributes()
	{
		return this._classificationAttributes;
	}
	
	@XmlElementWrapper(name = "cockpitItemTemplates")
	@XmlElement(name = "cockpitItemTemplate")
	public Set<CockpitItemTemplateDTO> getCockpitItemTemplates()
	{
		return this._cockpitItemTemplates;
	}
	
	@XmlElementWrapper(name = "declaredClassificationAttributeAssignments")
	@XmlElement(name = "classAttributeAssignment")
	public List<ClassAttributeAssignmentDTO> getDeclaredClassificationAttributeAssignments()
	{
		return this._declaredClassificationAttributeAssignments;
	}
	
	@XmlElementWrapper(name = "declaredClassificationAttributes")
	@XmlElement(name = "classificationAttribute")
	public List<ClassificationAttributeDTO> getDeclaredClassificationAttributes()
	{
		return this._declaredClassificationAttributes;
	}
	
	public String getExternalID()
	{
		return this._externalID;
	}
	
	public String getHmcXML()
	{
		return this._hmcXML;
	}
	
	@XmlElementWrapper(name = "inheritedClassificationAttributes")
	@XmlElement(name = "classificationAttribute")
	public List<ClassificationAttributeDTO> getInheritedClassificationAttributes()
	{
		return this._inheritedClassificationAttributes;
	}
	
	public String getRevision()
	{
		return this._revision;
	}
	
	public Boolean getShowEmptyAttributes()
	{
		return this._showEmptyAttributes;
	}
	
	public void setAllClassificationAttributeAssignments(final List<ClassAttributeAssignmentDTO> value)
	{
		this.modifiedPropsSet.add("allClassificationAttributeAssignments");
		this._allClassificationAttributeAssignments = value;
	}
	
	public void setClassificationAttributes(final List<ClassificationAttributeDTO> value)
	{
		this.modifiedPropsSet.add("classificationAttributes");
		this._classificationAttributes = value;
	}
	
	public void setCockpitItemTemplates(final Set<CockpitItemTemplateDTO> value)
	{
		this.modifiedPropsSet.add("cockpitItemTemplates");
		this._cockpitItemTemplates = value;
	}
	
	public void setDeclaredClassificationAttributeAssignments(final List<ClassAttributeAssignmentDTO> value)
	{
		this.modifiedPropsSet.add("declaredClassificationAttributeAssignments");
		this._declaredClassificationAttributeAssignments = value;
	}
	
	public void setDeclaredClassificationAttributes(final List<ClassificationAttributeDTO> value)
	{
		this.modifiedPropsSet.add("declaredClassificationAttributes");
		this._declaredClassificationAttributes = value;
	}
	
	public void setExternalID(final String value)
	{
		this.modifiedPropsSet.add("externalID");
		this._externalID = value;
	}
	
	public void setHmcXML(final String value)
	{
		this.modifiedPropsSet.add("hmcXML");
		this._hmcXML = value;
	}
	
	public void setInheritedClassificationAttributes(final List<ClassificationAttributeDTO> value)
	{
		this.modifiedPropsSet.add("inheritedClassificationAttributes");
		this._inheritedClassificationAttributes = value;
	}
	
	public void setRevision(final String value)
	{
		this.modifiedPropsSet.add("revision");
		this._revision = value;
	}
	
	public void setShowEmptyAttributes(final Boolean value)
	{
		this.modifiedPropsSet.add("showEmptyAttributes");
		this._showEmptyAttributes = value;
	}
	
}
