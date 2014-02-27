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
package de.hybris.platform.core.dto.security;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.SyncItemJobDTO;
import de.hybris.platform.category.dto.CategoryDTO;
import de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO;
import de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO;
import de.hybris.platform.cockpit.dto.CockpitUIComponentAccessRightDTO;
import de.hybris.platform.cockpit.dto.CockpitUIComponentConfigurationDTO;
import de.hybris.platform.comments.dto.CommentDTO;
import de.hybris.platform.core.dto.ItemDTO;
import de.hybris.platform.core.dto.media.MediaDTO;
import de.hybris.platform.core.dto.security.PrincipalGroupDTO;
import de.hybris.platform.core.dto.type.SearchRestrictionDTO;
import de.hybris.platform.core.model.security.PrincipalModel;
import de.hybris.platform.mcc.dto.AbstractLinkEntryDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import de.hybris.platform.workflow.dto.WorkflowTemplateDTO;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type Principal first defined at extension core
 */
@SuppressWarnings("all")
@GraphNode(target = PrincipalModel.class, factory = GenericNodeFactory.class, uidProperties="uid")
@XmlRootElement(name = "principal")
public class PrincipalDTO extends ItemDTO
{
	/** <i>Generated variable</i> - Variable of <code>Principal.visibleTemplates</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.workflow.dto.WorkflowTemplateDTO> _visibleTemplates;
	/** <i>Generated variable</i> - Variable of <code>Principal.readAbstractLinkEntry</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.mcc.dto.AbstractLinkEntryDTO> _readAbstractLinkEntry;
	/** <i>Generated variable</i> - Variable of <code>Principal.writableCatalogVersions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.CatalogVersionDTO> _writableCatalogVersions;
	/** <i>Generated variable</i> - Variable of <code>Principal.uid</code> attribute defined at extension <code> */
	private java.lang.String _uid;
	/** <i>Generated variable</i> - Variable of <code>Principal.allGroups</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.security.PrincipalGroupDTO> _allGroups;
	/** <i>Generated variable</i> - Variable of <code>Principal.groups</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.security.PrincipalGroupDTO> _groups;
	/** <i>Generated variable</i> - Variable of <code>Principal.writeCollections</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO> _writeCollections;
	/** <i>Generated variable</i> - Variable of <code>Principal.allSearchRestrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.SearchRestrictionDTO> _allSearchRestrictions;
	/** <i>Generated variable</i> - Variable of <code>Principal.DN</code> attribute defined at extension <code> */
	private java.lang.String _DN;
	/** <i>Generated variable</i> - Variable of <code>Principal.readableCatalogVersions</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.catalog.dto.CatalogVersionDTO> _readableCatalogVersions;
	/** <i>Generated variable</i> - Variable of <code>Principal.readCollections</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitObjectAbstractCollectionDTO> _readCollections;
	/** <i>Generated variable</i> - Variable of <code>Principal.syncJobs</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.SyncItemJobDTO> _syncJobs;
	/** <i>Generated variable</i> - Variable of <code>Principal.readSavedQueries</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitSavedQueryDTO> _readSavedQueries;
	/** <i>Generated variable</i> - Variable of <code>Principal.cockpitUIConfigurations</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitUIComponentConfigurationDTO> _cockpitUIConfigurations;
	/** <i>Generated variable</i> - Variable of <code>Principal.searchRestrictions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.type.SearchRestrictionDTO> _searchRestrictions;
	/** <i>Generated variable</i> - Variable of <code>Principal.watchedComments</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.comments.dto.CommentDTO> _watchedComments;
	/** <i>Generated variable</i> - Variable of <code>Principal.profilePicture</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.media.MediaDTO _profilePicture;
	/** <i>Generated variable</i> - Variable of <code>Principal.readableCockpitUIComponents</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitUIComponentAccessRightDTO> _readableCockpitUIComponents;
	/** <i>Generated variable</i> - Variable of <code>Principal.ldapsearchbase</code> attribute defined at extension <code> */
	private java.lang.String _ldapsearchbase;
	/** <i>Generated variable</i> - Variable of <code>Principal.description</code> attribute defined at extension <code> */
	private java.lang.String _description;
	/** <i>Generated variable</i> - Variable of <code>Principal.displayName</code> attribute defined at extension <code> */
	private java.lang.String _displayName;
	/** <i>Generated variable</i> - Variable of <code>Principal.name</code> attribute defined at extension <code> */
	private java.lang.String _name;
	/** <i>Generated variable</i> - Variable of <code>Principal.accessibleCategories</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.category.dto.CategoryDTO> _accessibleCategories;
	/** <i>Generated variable</i> - Variable of <code>Principal.CN</code> attribute defined at extension <code> */
	private java.lang.String _CN;
	/** <i>Generated variable</i> - Variable of <code>Principal.writableCockpitUIComponents</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.cockpit.dto.CockpitUIComponentAccessRightDTO> _writableCockpitUIComponents;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public PrincipalDTO()
	{
		super();
	}
	
	
	@XmlElementWrapper(name = "accessibleCategories")
	@XmlElement(name = "category")
	public Collection<CategoryDTO> getAccessibleCategories()
	{
		return this._accessibleCategories;
	}
	
	@XmlElementWrapper(name = "allGroups")
	@XmlElement(name = "principalGroup")
	public Set<PrincipalGroupDTO> getAllGroups()
	{
		return this._allGroups;
	}
	
	@XmlElementWrapper(name = "allSearchRestrictions")
	@XmlElement(name = "searchRestriction")
	public Collection<SearchRestrictionDTO> getAllSearchRestrictions()
	{
		return this._allSearchRestrictions;
	}
	
	public String getCN()
	{
		return this._CN;
	}
	
	@XmlElementWrapper(name = "cockpitUIConfigurations")
	@XmlElement(name = "cockpitUIComponentConfiguration")
	public Collection<CockpitUIComponentConfigurationDTO> getCockpitUIConfigurations()
	{
		return this._cockpitUIConfigurations;
	}
	
	public String getDescription()
	{
		return this._description;
	}
	
	public String getDisplayName()
	{
		return this._displayName;
	}
	
	public String getDN()
	{
		return this._DN;
	}
	
	@XmlElementWrapper(name = "groups")
	@XmlElement(name = "principalGroup")
	public Set<PrincipalGroupDTO> getGroups()
	{
		return this._groups;
	}
	
	public String getLdapsearchbase()
	{
		return this._ldapsearchbase;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public MediaDTO getProfilePicture()
	{
		return this._profilePicture;
	}
	
	@XmlElementWrapper(name = "readableCatalogVersions")
	@XmlElement(name = "catalogVersion")
	public List<CatalogVersionDTO> getReadableCatalogVersions()
	{
		return this._readableCatalogVersions;
	}
	
	@XmlElementWrapper(name = "readableCockpitUIComponents")
	@XmlElement(name = "cockpitUIComponentAccessRight")
	public Collection<CockpitUIComponentAccessRightDTO> getReadableCockpitUIComponents()
	{
		return this._readableCockpitUIComponents;
	}
	
	@XmlElementWrapper(name = "readAbstractLinkEntry")
	@XmlElement(name = "abstractLinkEntry")
	public List<AbstractLinkEntryDTO> getReadAbstractLinkEntry()
	{
		return this._readAbstractLinkEntry;
	}
	
	@XmlElementWrapper(name = "readCollections")
	@XmlElement(name = "cockpitObjectAbstractCollection")
	public Collection<CockpitObjectAbstractCollectionDTO> getReadCollections()
	{
		return this._readCollections;
	}
	
	@XmlElementWrapper(name = "readSavedQueries")
	@XmlElement(name = "cockpitSavedQuery")
	public Collection<CockpitSavedQueryDTO> getReadSavedQueries()
	{
		return this._readSavedQueries;
	}
	
	@XmlElementWrapper(name = "searchRestrictions")
	@XmlElement(name = "searchRestriction")
	public Collection<SearchRestrictionDTO> getSearchRestrictions()
	{
		return this._searchRestrictions;
	}
	
	@XmlElementWrapper(name = "syncJobs")
	@XmlElement(name = "syncItemJob")
	public Collection<SyncItemJobDTO> getSyncJobs()
	{
		return this._syncJobs;
	}
	
	@XmlAttribute
	public String getUid()
	{
		return this._uid;
	}
	
	@XmlElementWrapper(name = "visibleTemplates")
	@XmlElement(name = "workflowTemplate")
	public Collection<WorkflowTemplateDTO> getVisibleTemplates()
	{
		return this._visibleTemplates;
	}
	
	@XmlElementWrapper(name = "watchedComments")
	@XmlElement(name = "comment")
	public List<CommentDTO> getWatchedComments()
	{
		return this._watchedComments;
	}
	
	@XmlElementWrapper(name = "writableCatalogVersions")
	@XmlElement(name = "catalogVersion")
	public List<CatalogVersionDTO> getWritableCatalogVersions()
	{
		return this._writableCatalogVersions;
	}
	
	@XmlElementWrapper(name = "writableCockpitUIComponents")
	@XmlElement(name = "cockpitUIComponentAccessRight")
	public Collection<CockpitUIComponentAccessRightDTO> getWritableCockpitUIComponents()
	{
		return this._writableCockpitUIComponents;
	}
	
	@XmlElementWrapper(name = "writeCollections")
	@XmlElement(name = "cockpitObjectAbstractCollection")
	public Collection<CockpitObjectAbstractCollectionDTO> getWriteCollections()
	{
		return this._writeCollections;
	}
	
	public void setAccessibleCategories(final Collection<CategoryDTO> value)
	{
		this.modifiedPropsSet.add("accessibleCategories");
		this._accessibleCategories = value;
	}
	
	public void setAllGroups(final Set<PrincipalGroupDTO> value)
	{
		this.modifiedPropsSet.add("allGroups");
		this._allGroups = value;
	}
	
	public void setAllSearchRestrictions(final Collection<SearchRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("allSearchRestrictions");
		this._allSearchRestrictions = value;
	}
	
	public void setCN(final String value)
	{
		this.modifiedPropsSet.add("CN");
		this._CN = value;
	}
	
	public void setCockpitUIConfigurations(final Collection<CockpitUIComponentConfigurationDTO> value)
	{
		this.modifiedPropsSet.add("cockpitUIConfigurations");
		this._cockpitUIConfigurations = value;
	}
	
	public void setDescription(final String value)
	{
		this.modifiedPropsSet.add("description");
		this._description = value;
	}
	
	public void setDisplayName(final String value)
	{
		this.modifiedPropsSet.add("displayName");
		this._displayName = value;
	}
	
	public void setDN(final String value)
	{
		this.modifiedPropsSet.add("DN");
		this._DN = value;
	}
	
	public void setGroups(final Set<PrincipalGroupDTO> value)
	{
		this.modifiedPropsSet.add("groups");
		this._groups = value;
	}
	
	public void setLdapsearchbase(final String value)
	{
		this.modifiedPropsSet.add("ldapsearchbase");
		this._ldapsearchbase = value;
	}
	
	public void setName(final String value)
	{
		this.modifiedPropsSet.add("name");
		this._name = value;
	}
	
	public void setProfilePicture(final MediaDTO value)
	{
		this.modifiedPropsSet.add("profilePicture");
		this._profilePicture = value;
	}
	
	public void setReadableCatalogVersions(final List<CatalogVersionDTO> value)
	{
		this.modifiedPropsSet.add("readableCatalogVersions");
		this._readableCatalogVersions = value;
	}
	
	public void setReadableCockpitUIComponents(final Collection<CockpitUIComponentAccessRightDTO> value)
	{
		this.modifiedPropsSet.add("readableCockpitUIComponents");
		this._readableCockpitUIComponents = value;
	}
	
	public void setReadAbstractLinkEntry(final List<AbstractLinkEntryDTO> value)
	{
		this.modifiedPropsSet.add("readAbstractLinkEntry");
		this._readAbstractLinkEntry = value;
	}
	
	public void setReadCollections(final Collection<CockpitObjectAbstractCollectionDTO> value)
	{
		this.modifiedPropsSet.add("readCollections");
		this._readCollections = value;
	}
	
	public void setReadSavedQueries(final Collection<CockpitSavedQueryDTO> value)
	{
		this.modifiedPropsSet.add("readSavedQueries");
		this._readSavedQueries = value;
	}
	
	public void setSearchRestrictions(final Collection<SearchRestrictionDTO> value)
	{
		this.modifiedPropsSet.add("searchRestrictions");
		this._searchRestrictions = value;
	}
	
	public void setSyncJobs(final Collection<SyncItemJobDTO> value)
	{
		this.modifiedPropsSet.add("syncJobs");
		this._syncJobs = value;
	}
	
	public void setUid(final String value)
	{
		this.modifiedPropsSet.add("uid");
		this._uid = value;
	}
	
	public void setVisibleTemplates(final Collection<WorkflowTemplateDTO> value)
	{
		this.modifiedPropsSet.add("visibleTemplates");
		this._visibleTemplates = value;
	}
	
	public void setWatchedComments(final List<CommentDTO> value)
	{
		this.modifiedPropsSet.add("watchedComments");
		this._watchedComments = value;
	}
	
	public void setWritableCatalogVersions(final List<CatalogVersionDTO> value)
	{
		this.modifiedPropsSet.add("writableCatalogVersions");
		this._writableCatalogVersions = value;
	}
	
	public void setWritableCockpitUIComponents(final Collection<CockpitUIComponentAccessRightDTO> value)
	{
		this.modifiedPropsSet.add("writableCockpitUIComponents");
		this._writableCockpitUIComponents = value;
	}
	
	public void setWriteCollections(final Collection<CockpitObjectAbstractCollectionDTO> value)
	{
		this.modifiedPropsSet.add("writeCollections");
		this._writeCollections = value;
	}
	
}
