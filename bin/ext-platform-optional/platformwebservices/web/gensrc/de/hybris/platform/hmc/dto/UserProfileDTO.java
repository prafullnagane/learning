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
package de.hybris.platform.hmc.dto;

import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.hmc.model.UserProfileModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type UserProfile first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = UserProfileModel.class, factory = GenericNodeFactory.class, uidProperties="pk")
@XmlRootElement(name = "userprofile")
public class UserProfileDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>UserProfile.writableLanguages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.c2l.LanguageDTO> _writableLanguages;
	/** <i>Generated variable</i> - Variable of <code>UserProfile.allReadableLanguages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.LanguageDTO> _allReadableLanguages;
	/** <i>Generated variable</i> - Variable of <code>UserProfile.readableLanguages</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.c2l.LanguageDTO> _readableLanguages;
	/** <i>Generated variable</i> - Variable of <code>UserProfile.allWritableLanguages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.LanguageDTO> _allWritableLanguages;
	/** <i>Generated variable</i> - Variable of <code>UserProfile.expandInitial</code> attribute defined at extension <code> */
	private java.lang.Boolean _expandInitial;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserProfileDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "allReadableLanguages")
	@XmlElement(name = "language")
	public Collection<LanguageDTO> getAllReadableLanguages()
	{
		return this._allReadableLanguages;
	}
	
	@XmlElementWrapper(name = "allWritableLanguages")
	@XmlElement(name = "language")
	public Collection<LanguageDTO> getAllWritableLanguages()
	{
		return this._allWritableLanguages;
	}
	
	public Boolean getExpandInitial()
	{
		return this._expandInitial;
	}
	
	@Override
	public PrincipalDTO getOwner()
	{
		return (de.hybris.platform.core.dto.security.PrincipalDTO) super.getOwner();
	}
	
	@XmlElementWrapper(name = "readableLanguages")
	@XmlElement(name = "language")
	public List<LanguageDTO> getReadableLanguages()
	{
		return this._readableLanguages;
	}
	
	@XmlElementWrapper(name = "writableLanguages")
	@XmlElement(name = "language")
	public List<LanguageDTO> getWritableLanguages()
	{
		return this._writableLanguages;
	}
	
	public void setAllReadableLanguages(final Collection<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("allReadableLanguages");
		this._allReadableLanguages = value;
	}
	
	public void setAllWritableLanguages(final Collection<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("allWritableLanguages");
		this._allWritableLanguages = value;
	}
	
	public void setExpandInitial(final Boolean value)
	{
		this.modifiedPropsSet.add("expandInitial");
		this._expandInitial = value;
	}
	
	public void setReadableLanguages(final List<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("readableLanguages");
		this._readableLanguages = value;
	}
	
	public void setWritableLanguages(final List<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("writableLanguages");
		this._writableLanguages = value;
	}
	
}
