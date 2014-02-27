/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Dec 13, 2013 6:34:50 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercefacades.product.data;

import de.hybris.platform.commercefacades.product.data.ImageData;
import java.util.Date;
import java.util.List;

public class PromotionData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>PromotionData.firedMessages</code> property defined at extension <code>commercefacades</code>. */
	private List<String> firedMessages;
	/** <i>Generated property</i> for <code>PromotionData.promotionType</code> property defined at extension <code>commercefacades</code>. */
	private String promotionType;
	/** <i>Generated property</i> for <code>PromotionData.description</code> property defined at extension <code>commercefacades</code>. */
	private String description;
	/** <i>Generated property</i> for <code>PromotionData.endDate</code> property defined at extension <code>commercefacades</code>. */
	private Date endDate;
	/** <i>Generated property</i> for <code>PromotionData.code</code> property defined at extension <code>commercefacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>PromotionData.productBanner</code> property defined at extension <code>commercefacades</code>. */
	private ImageData productBanner;
	/** <i>Generated property</i> for <code>PromotionData.couldFireMessages</code> property defined at extension <code>commercefacades</code>. */
	private List<String> couldFireMessages;
		
	public PromotionData()
	{
		// default constructor
	}
	
		
	public void setFiredMessages(final List<String> firedMessages)
	{
		this.firedMessages = firedMessages;
	}
	
		
	public List<String> getFiredMessages() 
	{
		return firedMessages;
	}
		
		
	public void setPromotionType(final String promotionType)
	{
		this.promotionType = promotionType;
	}
	
		
	public String getPromotionType() 
	{
		return promotionType;
	}
		
		
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
		
	public String getDescription() 
	{
		return description;
	}
		
		
	public void setEndDate(final Date endDate)
	{
		this.endDate = endDate;
	}
	
		
	public Date getEndDate() 
	{
		return endDate;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setProductBanner(final ImageData productBanner)
	{
		this.productBanner = productBanner;
	}
	
		
	public ImageData getProductBanner() 
	{
		return productBanner;
	}
		
		
	public void setCouldFireMessages(final List<String> couldFireMessages)
	{
		this.couldFireMessages = couldFireMessages;
	}
	
		
	public List<String> getCouldFireMessages() 
	{
		return couldFireMessages;
	}
		
	
}