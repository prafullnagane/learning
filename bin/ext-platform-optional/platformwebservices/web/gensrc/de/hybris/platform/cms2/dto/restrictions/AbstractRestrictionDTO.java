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
package de.hybris.platform.cms2.dto.restrictions;

import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.cms2.dto.contents.components.AbstractCMSComponentDTO;
import de.hybris.platform.cms2.dto.pages.AbstractPageDTO;
import de.hybris.platform.cms2.dto.restrictions.CMSInverseRestrictionDTO;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractRestriction first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractRestrictionModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "abstractrestriction")
public class AbstractRestrictionDTO extends CMSItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.components</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.contents.components.AbstractCMSComponentDTO> _components;
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.inverseRestrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.restrictions.CMSInverseRestrictionDTO> _inverseRestrictions;
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.pages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.pages.AbstractPageDTO> _pages;
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>AbstractRestriction.typeCode</code> attribute defined at extension <code> */
	private java.lang.String _typeCode;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractRestrictionDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "components")
	@XmlElement(name = "abstractCMSComponent")
	public Collection<AbstractCMSComponentDTO> getComponents()
	{
		return this._components;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	@XmlElementWrapper(name = "inverseRestrictions")
	@XmlElement(name = "cMSInverseRestriction")
	public Collection<CMSInverseRestrictionDTO> getInverseRestrictions()
	{
		return this._inverseRestrictions;
	}
	
	@XmlElementWrapper(name = "pages")
	@XmlElement(name = "abstractPage")
	public Collection<AbstractPageDTO> getPages()
	{
		return this._pages;
	}
	
	public String getType()
	{
		return this._type;
	}
	
	public String getTypeCode()
	{
		return this._typeCode;
	}
	
	public void setComponents(final Collection<AbstractCMSComponentDTO> value)
	{
		this.modifiedPropsSet.add("components");
		this._components = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setInverseRestrictions(final Collection<CMSInverseRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("inverseRestrictions");
		this._inverseRestrictions = value;
	}
	
	public void setPages(final Collection<AbstractPageDTO> value)
	{
		this.modifiedPropsSet.add("pages");
		this._pages = value;
	}
	
	public void setType(final String value)
	{
		this.modifiedPropsSet.add("type");
		this._type = value;
	}
	
	public void setTypeCode(final String value)
	{
		this.modifiedPropsSet.add("typeCode");
		this._typeCode = value;
	}
	
}
