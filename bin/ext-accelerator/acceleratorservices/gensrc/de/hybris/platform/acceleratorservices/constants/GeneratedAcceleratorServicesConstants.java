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
package de.hybris.platform.acceleratorservices.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedAcceleratorServicesConstants
{
	public static final String EXTENSIONNAME = "acceleratorservices";
	public static class TC
	{
		public static final String ACCELERATORPRODUCTBOGOFPROMOTION = "AcceleratorProductBOGOFPromotion".intern();
		public static final String ACCELERATORPRODUCTMULTIBUYPROMOTION = "AcceleratorProductMultiBuyPromotion".intern();
		public static final String CARTREMOVALCRONJOB = "CartRemovalCronJob".intern();
		public static final String CCPAYSUBVALIDATION = "CCPaySubValidation".intern();
		public static final String EMAILADDRESS = "EmailAddress".intern();
		public static final String EMAILATTACHMENT = "EmailAttachment".intern();
		public static final String EMAILMESSAGE = "EmailMessage".intern();
		public static final String EMAILPAGE = "EmailPage".intern();
		public static final String EMAILPAGETEMPLATE = "EmailPageTemplate".intern();
		public static final String EXPORTDATACRONJOB = "ExportDataCronJob".intern();
		public static final String EXPORTDATAHISTORYENTRY = "ExportDataHistoryEntry".intern();
		public static final String EXPORTDATASTATUS = "ExportDataStatus".intern();
		public static final String SOLRPAGEREDIRECT = "SolrPageRedirect".intern();
		public static final String UIEXPERIENCELEVEL = "UiExperienceLevel".intern();
	}
	public static class Attributes
	{
		public static class AbstractPromotion
		{
			public static final String NAME = "name".intern();
		}
		public static class BaseSite
		{
			public static final String ANONYMOUSCARTREMOVALAGE = "anonymousCartRemovalAge".intern();
			public static final String CARTREMOVALAGE = "cartRemovalAge".intern();
			public static final String CARTREMOVALCRONJOB = "cartRemovalCronJob".intern();
		}
		public static class BusinessProcess
		{
			public static final String EMAILS = "emails".intern();
		}
		public static class Consignment
		{
			public static final String STATUSDISPLAY = "statusDisplay".intern();
		}
		public static class CreditCardPaymentInfo
		{
			public static final String SUBSCRIPTIONVALIDATED = "subscriptionValidated".intern();
		}
		public static class PriceRow
		{
			public static final String SEQUENCEID = "sequenceId".intern();
		}
		public static class Product
		{
			public static final String SEQUENCEID = "sequenceId".intern();
		}
	}
	public static class Enumerations
	{
		public static class ExportDataStatus
		{
			public static final String COMPLETE = "COMPLETE".intern();
			public static final String RUNNING = "RUNNING".intern();
			public static final String FAILED = "FAILED".intern();
		}
		public static class UiExperienceLevel
		{
			public static final String MOBILE = "Mobile".intern();
			public static final String DESKTOP = "Desktop".intern();
		}
	}
	public static class Relations
	{
		public static final String BASESITE2CARTREMOVALCRONJOB = "BaseSite2CartRemovalCronJob".intern();
		public static final String BUSINESSPROCESS2EMAILMESSAGEREL = "BusinessProcess2EmailMessageRel".intern();
		public static final String EMAILMESSAGE2BCCADDRESSESREL = "EmailMessage2BccAddressesRel".intern();
		public static final String EMAILMESSAGE2CCADDRESSESREL = "EmailMessage2CcAddressesRel".intern();
		public static final String EMAILMESSAGE2EMAILATTACHMENTSREL = "EmailMessage2EmailAttachmentsRel".intern();
		public static final String EMAILMESSAGE2FROMADDRESSREL = "EmailMessage2FromAddressRel".intern();
		public static final String EMAILMESSAGE2TOADDRESSESREL = "EmailMessage2ToAddressesRel".intern();
		public static final String EXPORTDATACRONJOB2EXPORTDATAHISTORYREL = "ExportDataCronJob2ExportDataHistoryRel".intern();
	}
	
	protected GeneratedAcceleratorServicesConstants()
	{
		// private constructor
	}
	
	
}
