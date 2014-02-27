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
package de.hybris.platform.solrfacetsearch.dto;

import de.hybris.platform.solrfacetsearch.dto.SolrIndexOperationRecordDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexOperationRecord first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexoperationrecords")
public class SolrIndexOperationRecordsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexOperationRecordDTO*/
	private List<SolrIndexOperationRecordDTO>  solrindexoperationrecordsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexOperationRecordsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexOperationRecordsDTO(final List<SolrIndexOperationRecordDTO> solrindexoperationrecordsList)
	{
		super();
		this.solrindexoperationrecordsList=solrindexoperationrecordsList;
	}
	
	
	/**
	 * @return the solrindexoperationrecords
	 */
	@XmlElement(name = "solrindexoperationrecord")
	public List<SolrIndexOperationRecordDTO> getSolrIndexOperationRecords()
	{
		return	solrindexoperationrecordsList;
	}
	
	/**
	 * @param solrindexoperationrecordsList 
	 *  the solrindexoperationrecordsList to set   
	 */
	public void setSolrIndexOperationRecords(final List<SolrIndexOperationRecordDTO> solrindexoperationrecordsList)
	{
		this.solrindexoperationrecordsList=solrindexoperationrecordsList;
	}
	
}
