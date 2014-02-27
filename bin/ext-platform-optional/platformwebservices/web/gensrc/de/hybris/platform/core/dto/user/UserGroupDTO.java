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
package de.hybris.platform.core.dto.user;

import de.hybris.platform.btg.dto.BTGAssignToGroupDefinitionDTO;
import de.hybris.platform.cms2.dto.restrictions.CMSUserGroupRestrictionDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.security.PrincipalGroupDTO;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type UserGroup first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = UserGroupModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "usergroup")
public class UserGroupDTO extends PrincipalGroupDTO
{
	/** <i>Generated variable</i> - Variable of <code>UserGroup.userDiscountGroup</code> attribute defined at extension <code> */
	private java.lang.String _userDiscountGroup;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.userTaxGroup</code> attribute defined at extension <code> */
	private java.lang.String _userTaxGroup;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.readableLanguages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.LanguageDTO> _readableLanguages;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.restrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cms2.dto.restrictions.CMSUserGroupRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.userPriceGroup</code> attribute defined at extension <code> */
	private java.lang.String _userPriceGroup;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.hmcXML</code> attribute defined at extension <code> */
	private java.lang.String _hmcXML;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.writeableLanguages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.LanguageDTO> _writeableLanguages;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.BTGAssignToGroup</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.btg.dto.BTGAssignToGroupDefinitionDTO> _BTGAssignToGroup;
	/** <i>Generated variable</i> - Variable of <code>UserGroup.hmcLoginDisabled</code> attribute defined at extension <code> */
	private java.lang.Boolean _hmcLoginDisabled;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public UserGroupDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "BTGAssignToGroup")
	@XmlElement(name = "bTGAssignToGroupDefinition")
	public Collection<BTGAssignToGroupDefinitionDTO> getBTGAssignToGroup()
	{
		return this._BTGAssignToGroup;
	}
	
	public Boolean getHmcLoginDisabled()
	{
		return this._hmcLoginDisabled;
	}
	
	public String getHmcXML()
	{
		return this._hmcXML;
	}
	
	@XmlElementWrapper(name = "readableLanguages")
	@XmlElement(name = "language")
	public Collection<LanguageDTO> getReadableLanguages()
	{
		return this._readableLanguages;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "cMSUserGroupRestriction")
	public Collection<CMSUserGroupRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getUserDiscountGroup()
	{
		return this._userDiscountGroup;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getUserPriceGroup()
	{
		return this._userPriceGroup;
	}
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getUserTaxGroup()
	{
		return this._userTaxGroup;
	}
	
	@XmlElementWrapper(name = "writeableLanguages")
	@XmlElement(name = "language")
	public Collection<LanguageDTO> getWriteableLanguages()
	{
		return this._writeableLanguages;
	}
	
	public void setBTGAssignToGroup(final Collection<BTGAssignToGroupDefinitionDTO> value)
	{
		this.modifiedPropsSet.add("BTGAssignToGroup");
		this._BTGAssignToGroup = value;
	}
	
	public void setHmcLoginDisabled(final Boolean value)
	{
		this.modifiedPropsSet.add("hmcLoginDisabled");
		this._hmcLoginDisabled = value;
	}
	
	public void setHmcXML(final String value)
	{
		this.modifiedPropsSet.add("hmcXML");
		this._hmcXML = value;
	}
	
	public void setReadableLanguages(final Collection<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("readableLanguages");
		this._readableLanguages = value;
	}
	
	public void setRestrictions(final Collection<CMSUserGroupRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setUserDiscountGroup(final String value)
	{
		this.modifiedPropsSet.add("userDiscountGroup");
		this._userDiscountGroup = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setUserPriceGroup(final String value)
	{
		this.modifiedPropsSet.add("userPriceGroup");
		this._userPriceGroup = value;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setUserTaxGroup(final String value)
	{
		this.modifiedPropsSet.add("userTaxGroup");
		this._userTaxGroup = value;
	}
	
	public void setWriteableLanguages(final Collection<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("writeableLanguages");
		this._writeableLanguages = value;
	}
	
}
