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
package de.hybris.platform.cms2.dto.pages;

import de.hybris.platform.cms2.dto.contents.CMSItemDTO;
import de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO;
import de.hybris.platform.cms2.dto.pages.PageTemplateDTO;
import de.hybris.platform.cms2.dto.relations.ContentSlotForPageDTO;
import de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.objectgraphtransformer.HybrisEnumValueToStringConverter;
import de.hybris.platform.webservices.objectgraphtransformer.StringToHybrisEnumValueConverter;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type AbstractPage first defined at extension cms2
 */
@SuppressWarnings("all")
@GraphNode(target = AbstractPageModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "abstractpage")
public class AbstractPageDTO extends CMSItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.missingContentSlots</code> attribute defined at extension <code> */
	private java.lang.String _missingContentSlots;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.typeCode</code> attribute defined at extension <code> */
	private java.lang.String _typeCode;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.title</code> attribute defined at extension <code> */
	private java.lang.String _title;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.previewImage</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _previewImage;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.restrictions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.restrictions.AbstractRestrictionDTO> _restrictions;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.approvalStatus</code> attribute defined at extension <code> */
	private java.lang.String _approvalStatus;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.type</code> attribute defined at extension <code> */
	private java.lang.String _type;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.masterTemplate</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.pages.PageTemplateDTO _masterTemplate;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.availableContentSlots</code> attribute defined at extension <code> */
	private java.lang.String _availableContentSlots;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.navigationNodeList</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.navigation.CMSNavigationNodeDTO> _navigationNodeList;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.defaultPage</code> attribute defined at extension <code> */
	private java.lang.Boolean _defaultPage;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.onlyOneRestrictionMustApply</code> attribute defined at extension <code> */
	private boolean _onlyOneRestrictionMustApply;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.lockedBy</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _lockedBy;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.view</code> attribute defined at extension <code> */
	private java.lang.String _view;
	/** <i>Generated variable</i> - Variable of <code>AbstractPage.contentSlots</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.cms2.dto.relations.ContentSlotForPageDTO> _contentSlots;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public AbstractPageDTO()
	{
		super();
	}
	
	
	@GraphProperty(interceptor = StringToHybrisEnumValueConverter.class)
	public String getApprovalStatus()
	{
		return this._approvalStatus;
	}
	
	public String getAvailableContentSlots()
	{
		return this._availableContentSlots;
	}
	
	@XmlElementWrapper(name = "contentSlots")
	@XmlElement(name = "contentSlotForPage")
	public List<ContentSlotForPageDTO> getContentSlots()
	{
		return this._contentSlots;
	}
	
	public Boolean getDefaultPage()
	{
		return this._defaultPage;
	}
	
	public UserDTO getLockedBy()
	{
		return this._lockedBy;
	}
	
	public PageTemplateDTO getMasterTemplate()
	{
		return this._masterTemplate;
	}
	
	public String getMissingContentSlots()
	{
		return this._missingContentSlots;
	}
	
	@XmlElementWrapper(name = "navigationNodeList")
	@XmlElement(name = "cMSNavigationNode")
	public List<CMSNavigationNodeDTO> getNavigationNodeList()
	{
		return this._navigationNodeList;
	}
	
	public MediaDTO getPreviewImage()
	{
		return this._previewImage;
	}
	
	@XmlElementWrapper(name = "restrictions")
	@XmlElement(name = "abstractRestriction")
	public List<AbstractRestrictionDTO> getRestrictions()
	{
		return this._restrictions;
	}
	
	public String getTitle()
	{
		return this._title;
	}
	
	public String getType()
	{
		return this._type;
	}
	
	public String getTypeCode()
	{
		return this._typeCode;
	}
	
	public String getView()
	{
		return this._view;
	}
	
	public boolean isOnlyOneRestrictionMustApply()
	{
		return this._onlyOneRestrictionMustApply;
	}
	
	@GraphProperty(interceptor = HybrisEnumValueToStringConverter.class)
	public void setApprovalStatus(final String value)
	{
		this.modifiedPropsSet.add("approvalStatus");
		this._approvalStatus = value;
	}
	
	public void setAvailableContentSlots(final String value)
	{
		this.modifiedPropsSet.add("availableContentSlots");
		this._availableContentSlots = value;
	}
	
	public void setContentSlots(final List<ContentSlotForPageDTO> value)
	{
		this.modifiedPropsSet.add("contentSlots");
		this._contentSlots = value;
	}
	
	public void setDefaultPage(final Boolean value)
	{
		this.modifiedPropsSet.add("defaultPage");
		this._defaultPage = value;
	}
	
	public void setLockedBy(final UserDTO value)
	{
		this.modifiedPropsSet.add("lockedBy");
		this._lockedBy = value;
	}
	
	public void setMasterTemplate(final PageTemplateDTO value)
	{
		this.modifiedPropsSet.add("masterTemplate");
		this._masterTemplate = value;
	}
	
	public void setMissingContentSlots(final String value)
	{
		this.modifiedPropsSet.add("missingContentSlots");
		this._missingContentSlots = value;
	}
	
	public void setNavigationNodeList(final List<CMSNavigationNodeDTO> value)
	{
		this.modifiedPropsSet.add("navigationNodeList");
		this._navigationNodeList = value;
	}
	
	public void setOnlyOneRestrictionMustApply(final boolean value)
	{
		this.modifiedPropsSet.add("onlyOneRestrictionMustApply");
		this._onlyOneRestrictionMustApply = value;
	}
	
	public void setPreviewImage(final MediaDTO value)
	{
		this.modifiedPropsSet.add("previewImage");
		this._previewImage = value;
	}
	
	public void setRestrictions(final List<AbstractRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("restrictions");
		this._restrictions = value;
	}
	
	public void setTitle(final String value)
	{
		this.modifiedPropsSet.add("title");
		this._title = value;
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
	
	public void setView(final String value)
	{
		this.modifiedPropsSet.add("view");
		this._view = value;
	}
	
}
