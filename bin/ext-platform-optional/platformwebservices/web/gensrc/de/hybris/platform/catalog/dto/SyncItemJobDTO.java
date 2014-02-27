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
package de.hybris.platform.catalog.dto;

import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.dto.SyncAttributeDescriptorConfigDTO;
import de.hybris.platform.catalog.dto.SyncItemCronJobDTO;
import de.hybris.platform.catalog.model.SyncItemJobModel;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.security.PrincipalDTO;
import de.hybris.platform.core.dto.type.ComposedTypeDTO;
import de.hybris.platform.cronjob.dto.JobDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type SyncItemJob first defined at extension catalog
 */
@SuppressWarnings("all")
@GraphNode(target = SyncItemJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "syncitemjob")
public class SyncItemJobDTO extends JobDTO
{
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.syncAttributeConfigurations</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.SyncAttributeDescriptorConfigDTO> _syncAttributeConfigurations;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.exclusiveMode</code> attribute defined at extension <code> */
	private java.lang.Boolean _exclusiveMode;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.targetVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _targetVersion;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.removeMissingItems</code> attribute defined at extension <code> */
	private java.lang.Boolean _removeMissingItems;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.effectiveSyncLanguages</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.core.dto.c2l.LanguageDTO> _effectiveSyncLanguages;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.createNewItems</code> attribute defined at extension <code> */
	private java.lang.Boolean _createNewItems;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.syncPrincipals</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.security.PrincipalDTO> _syncPrincipals;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.syncLanguages</code> attribute defined at extension <code> */
	private java.util.Set<de.hybris.platform.core.dto.c2l.LanguageDTO> _syncLanguages;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.executions</code> attribute defined at extension <code> */
	private java.util.Collection<de.hybris.platform.catalog.dto.SyncItemCronJobDTO> _executions;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.syncPrincipalsOnly</code> attribute defined at extension <code> */
	private java.lang.Boolean _syncPrincipalsOnly;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.sourceVersion</code> attribute defined at extension <code> */
	private de.hybris.platform.catalog.dto.CatalogVersionDTO _sourceVersion;
	/** <i>Generated variable</i> - Variable of <code>SyncItemJob.rootTypes</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.core.dto.type.ComposedTypeDTO> _rootTypes;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SyncItemJobDTO()
	{
		super();
	}
	
	
	public Boolean getCreateNewItems()
	{
		return this._createNewItems;
	}
	
	@XmlElementWrapper(name = "effectiveSyncLanguages")
	@XmlElement(name = "language")
	public Collection<LanguageDTO> getEffectiveSyncLanguages()
	{
		return this._effectiveSyncLanguages;
	}
	
	public Boolean getExclusiveMode()
	{
		return this._exclusiveMode;
	}
	
	@XmlElementWrapper(name = "executions")
	@XmlElement(name = "syncItemCronJob")
	public Collection<SyncItemCronJobDTO> getExecutions()
	{
		return this._executions;
	}
	
	public Boolean getRemoveMissingItems()
	{
		return this._removeMissingItems;
	}
	
	@XmlElementWrapper(name = "rootTypes")
	@XmlElement(name = "composedType")
	public List<ComposedTypeDTO> getRootTypes()
	{
		return this._rootTypes;
	}
	
	public CatalogVersionDTO getSourceVersion()
	{
		return this._sourceVersion;
	}
	
	@XmlElementWrapper(name = "syncAttributeConfigurations")
	@XmlElement(name = "syncAttributeDescriptorConfig")
	public Collection<SyncAttributeDescriptorConfigDTO> getSyncAttributeConfigurations()
	{
		return this._syncAttributeConfigurations;
	}
	
	@XmlElementWrapper(name = "syncLanguages")
	@XmlElement(name = "language")
	public Set<LanguageDTO> getSyncLanguages()
	{
		return this._syncLanguages;
	}
	
	@XmlElementWrapper(name = "syncPrincipals")
	@XmlElement(name = "principal")
	public List<PrincipalDTO> getSyncPrincipals()
	{
		return this._syncPrincipals;
	}
	
	public Boolean getSyncPrincipalsOnly()
	{
		return this._syncPrincipalsOnly;
	}
	
	public CatalogVersionDTO getTargetVersion()
	{
		return this._targetVersion;
	}
	
	public void setCreateNewItems(final Boolean value)
	{
		this.modifiedPropsSet.add("createNewItems");
		this._createNewItems = value;
	}
	
	public void setEffectiveSyncLanguages(final Collection<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("effectiveSyncLanguages");
		this._effectiveSyncLanguages = value;
	}
	
	public void setExclusiveMode(final Boolean value)
	{
		this.modifiedPropsSet.add("exclusiveMode");
		this._exclusiveMode = value;
	}
	
	public void setExecutions(final Collection<SyncItemCronJobDTO> value)
	{
		this.modifiedPropsSet.add("executions");
		this._executions = value;
	}
	
	public void setRemoveMissingItems(final Boolean value)
	{
		this.modifiedPropsSet.add("removeMissingItems");
		this._removeMissingItems = value;
	}
	
	public void setRootTypes(final List<ComposedTypeDTO> value)
	{
		this.modifiedPropsSet.add("rootTypes");
		this._rootTypes = value;
	}
	
	public void setSourceVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("sourceVersion");
		this._sourceVersion = value;
	}
	
	public void setSyncAttributeConfigurations(final Collection<SyncAttributeDescriptorConfigDTO> value)
	{
		this.modifiedPropsSet.add("syncAttributeConfigurations");
		this._syncAttributeConfigurations = value;
	}
	
	public void setSyncLanguages(final Set<LanguageDTO> value)
	{
		this.modifiedPropsSet.add("syncLanguages");
		this._syncLanguages = value;
	}
	
	public void setSyncPrincipals(final List<PrincipalDTO> value)
	{
		this.modifiedPropsSet.add("syncPrincipals");
		this._syncPrincipals = value;
	}
	
	public void setSyncPrincipalsOnly(final Boolean value)
	{
		this.modifiedPropsSet.add("syncPrincipalsOnly");
		this._syncPrincipalsOnly = value;
	}
	
	public void setTargetVersion(final CatalogVersionDTO value)
	{
		this.modifiedPropsSet.add("targetVersion");
		this._targetVersion = value;
	}
	
}
