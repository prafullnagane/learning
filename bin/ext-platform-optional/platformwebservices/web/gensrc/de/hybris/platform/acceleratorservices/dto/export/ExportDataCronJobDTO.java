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
package de.hybris.platform.acceleratorservices.dto.export;

import de.hybris.platform.acceleratorservices.dto.export.ExportDataHistoryEntryDTO;
import de.hybris.platform.acceleratorservices.model.export.ExportDataCronJobModel;
import de.hybris.platform.cms2.dto.site.CMSSiteDTO;
import de.hybris.platform.core.dto.c2l.CurrencyDTO;
import de.hybris.platform.core.dto.c2l.LanguageDTO;
import de.hybris.platform.core.dto.user.UserDTO;
import de.hybris.platform.cronjob.dto.CronJobDTO;
import de.hybris.platform.servicelayer.internal.dto.ServicelayerJobDTO;
import de.hybris.platform.store.BaseStoreDTO;
import de.hybris.platform.webservices.model.nodefactory.GenericNodeFactory;
import de.hybris.platform.webservices.util.objectgraphtransformer.GraphNode;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto class for type ExportDataCronJob first defined at extension acceleratorservices
 */
@SuppressWarnings("all")
@GraphNode(target = ExportDataCronJobModel.class, factory = GenericNodeFactory.class, uidProperties="code")
@XmlRootElement(name = "exportdatacronjob")
public class ExportDataCronJobDTO extends CronJobDTO
{
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.thirdPartyPassword</code> attribute defined at extension <code> */
	private java.lang.String _thirdPartyPassword;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.thirdPartyUsername</code> attribute defined at extension <code> */
	private java.lang.String _thirdPartyUsername;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.user</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.user.UserDTO _user;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.historyEntries</code> attribute defined at extension <code> */
	private java.util.List<de.hybris.platform.acceleratorservices.dto.export.ExportDataHistoryEntryDTO> _historyEntries;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.cmsSite</code> attribute defined at extension <code> */
	private de.hybris.platform.cms2.dto.site.CMSSiteDTO _cmsSite;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.dataGenerationPipeline</code> attribute defined at extension <code> */
	private java.lang.String _dataGenerationPipeline;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.currency</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.CurrencyDTO _currency;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.thirdPartyHost</code> attribute defined at extension <code> */
	private java.lang.String _thirdPartyHost;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.baseStore</code> attribute defined at extension <code> */
	private de.hybris.platform.store.BaseStoreDTO _baseStore;
	/** <i>Generated variable</i> - Variable of <code>ExportDataCronJob.language</code> attribute defined at extension <code> */
	private de.hybris.platform.core.dto.c2l.LanguageDTO _language;
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public ExportDataCronJobDTO()
	{
		super();
	}
	
	
	public BaseStoreDTO getBaseStore()
	{
		return this._baseStore;
	}
	
	public CMSSiteDTO getCmsSite()
	{
		return this._cmsSite;
	}
	
	public CurrencyDTO getCurrency()
	{
		return this._currency;
	}
	
	public String getDataGenerationPipeline()
	{
		return this._dataGenerationPipeline;
	}
	
	@XmlElementWrapper(name = "historyEntries")
	@XmlElement(name = "exportDataHistoryEntry")
	public List<ExportDataHistoryEntryDTO> getHistoryEntries()
	{
		return this._historyEntries;
	}
	
	@Override
	public ServicelayerJobDTO getJob()
	{
		return (de.hybris.platform.servicelayer.internal.dto.ServicelayerJobDTO) super.getJob();
	}
	
	public LanguageDTO getLanguage()
	{
		return this._language;
	}
	
	public String getThirdPartyHost()
	{
		return this._thirdPartyHost;
	}
	
	public String getThirdPartyPassword()
	{
		return this._thirdPartyPassword;
	}
	
	public String getThirdPartyUsername()
	{
		return this._thirdPartyUsername;
	}
	
	public UserDTO getUser()
	{
		return this._user;
	}
	
	public void setBaseStore(final BaseStoreDTO value)
	{
		this.modifiedPropsSet.add("baseStore");
		this._baseStore = value;
	}
	
	public void setCmsSite(final CMSSiteDTO value)
	{
		this.modifiedPropsSet.add("cmsSite");
		this._cmsSite = value;
	}
	
	public void setCurrency(final CurrencyDTO value)
	{
		this.modifiedPropsSet.add("currency");
		this._currency = value;
	}
	
	public void setDataGenerationPipeline(final String value)
	{
		this.modifiedPropsSet.add("dataGenerationPipeline");
		this._dataGenerationPipeline = value;
	}
	
	public void setHistoryEntries(final List<ExportDataHistoryEntryDTO> value)
	{
		this.modifiedPropsSet.add("historyEntries");
		this._historyEntries = value;
	}
	
	public void setLanguage(final LanguageDTO value)
	{
		this.modifiedPropsSet.add("language");
		this._language = value;
	}
	
	public void setThirdPartyHost(final String value)
	{
		this.modifiedPropsSet.add("thirdPartyHost");
		this._thirdPartyHost = value;
	}
	
	public void setThirdPartyPassword(final String value)
	{
		this.modifiedPropsSet.add("thirdPartyPassword");
		this._thirdPartyPassword = value;
	}
	
	public void setThirdPartyUsername(final String value)
	{
		this.modifiedPropsSet.add("thirdPartyUsername");
		this._thirdPartyUsername = value;
	}
	
	public void setUser(final UserDTO value)
	{
		this.modifiedPropsSet.add("user");
		this._user = value;
	}
	
}
