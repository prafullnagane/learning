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
package de.hybris.platform.solrfacetsearch.dto.indexer;

import de.hybris.platform.solrfacetsearch.dto.indexer.SolrIndexedCoresRecordDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type SolrIndexedCoresRecord first defined at extension solrfacetsearch
 */
@SuppressWarnings("all")
@XmlRootElement(name = "solrindexedcoresrecords")
public class SolrIndexedCoresRecordsDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>SolrIndexedCoresRecordDTO*/
	private List<SolrIndexedCoresRecordDTO>  solrindexedcoresrecordsList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedCoresRecordsDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public SolrIndexedCoresRecordsDTO(final List<SolrIndexedCoresRecordDTO> solrindexedcoresrecordsList)
	{
		super();
		this.solrindexedcoresrecordsList=solrindexedcoresrecordsList;
	}
	
	
	/**
	 * @return the solrindexedcoresrecords
	 */
	@XmlElement(name = "solrindexedcoresrecord")
	public List<SolrIndexedCoresRecordDTO> getSolrIndexedCoresRecords()
	{
		return	solrindexedcoresrecordsList;
	}
	
	/**
	 * @param solrindexedcoresrecordsList 
	 *  the solrindexedcoresrecordsList to set   
	 */
	public void setSolrIndexedCoresRecords(final List<SolrIndexedCoresRecordDTO> solrindexedcoresrecordsList)
	{
		this.solrindexedcoresrecordsList=solrindexedcoresrecordsList;
	}
	
}
