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
package de.hybris.platform.acceleratorservices.jalo;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.acceleratorservices.jalo.CartRemovalCronJob;
import de.hybris.platform.acceleratorservices.jalo.cms2.pages.EmailPage;
import de.hybris.platform.acceleratorservices.jalo.cms2.pages.EmailPageTemplate;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAddress;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAttachment;
import de.hybris.platform.acceleratorservices.jalo.email.EmailMessage;
import de.hybris.platform.acceleratorservices.jalo.export.ExportDataCronJob;
import de.hybris.platform.acceleratorservices.jalo.export.ExportDataHistoryEntry;
import de.hybris.platform.acceleratorservices.jalo.payment.CCPaySubValidation;
import de.hybris.platform.acceleratorservices.jalo.promotions.AcceleratorProductBOGOFPromotion;
import de.hybris.platform.acceleratorservices.jalo.promotions.AcceleratorProductMultiBuyPromotion;
import de.hybris.platform.acceleratorservices.jalo.redirect.SolrPageRedirect;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.europe1.jalo.PDTRow;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.promotions.jalo.AbstractPromotion;
import de.hybris.platform.util.OneToManyHandler;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>AcceleratorServicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAcceleratorServicesManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n EMAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmailMessage> BUSINESSPROCESS2EMAILMESSAGERELEMAILSHANDLER = new OneToManyHandler<EmailMessage>(
	AcceleratorServicesConstants.TC.EMAILMESSAGE,
	false,
	"process",
	null,
	false,
	true,
	CollectionType.LIST
	);
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute.
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public Integer getAnonymousCartRemovalAge(final SessionContext ctx, final BaseSite item)
	{
		return (Integer)item.getProperty( ctx, AcceleratorServicesConstants.Attributes.BaseSite.ANONYMOUSCARTREMOVALAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute.
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public Integer getAnonymousCartRemovalAge(final BaseSite item)
	{
		return getAnonymousCartRemovalAge( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute. 
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public int getAnonymousCartRemovalAgeAsPrimitive(final SessionContext ctx, final BaseSite item)
	{
		Integer value = getAnonymousCartRemovalAge( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute. 
	 * @return the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public int getAnonymousCartRemovalAgeAsPrimitive(final BaseSite item)
	{
		return getAnonymousCartRemovalAgeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final SessionContext ctx, final BaseSite item, final Integer value)
	{
		item.setProperty(ctx, AcceleratorServicesConstants.Attributes.BaseSite.ANONYMOUSCARTREMOVALAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final BaseSite item, final Integer value)
	{
		setAnonymousCartRemovalAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final SessionContext ctx, final BaseSite item, final int value)
	{
		setAnonymousCartRemovalAge( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.anonymousCartRemovalAge</code> attribute. 
	 * @param value the anonymousCartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 14 days.
	 */
	public void setAnonymousCartRemovalAge(final BaseSite item, final int value)
	{
		setAnonymousCartRemovalAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalAge</code> attribute.
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public Integer getCartRemovalAge(final SessionContext ctx, final BaseSite item)
	{
		return (Integer)item.getProperty( ctx, AcceleratorServicesConstants.Attributes.BaseSite.CARTREMOVALAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalAge</code> attribute.
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public Integer getCartRemovalAge(final BaseSite item)
	{
		return getCartRemovalAge( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalAge</code> attribute. 
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public int getCartRemovalAgeAsPrimitive(final SessionContext ctx, final BaseSite item)
	{
		Integer value = getCartRemovalAge( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalAge</code> attribute. 
	 * @return the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public int getCartRemovalAgeAsPrimitive(final BaseSite item)
	{
		return getCartRemovalAgeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final SessionContext ctx, final BaseSite item, final Integer value)
	{
		item.setProperty(ctx, AcceleratorServicesConstants.Attributes.BaseSite.CARTREMOVALAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final BaseSite item, final Integer value)
	{
		setCartRemovalAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final SessionContext ctx, final BaseSite item, final int value)
	{
		setCartRemovalAge( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.cartRemovalAge</code> attribute. 
	 * @param value the cartRemovalAge - After specified number of seconds carts will be cleaned up. Default is 28 days.
	 */
	public void setCartRemovalAge(final BaseSite item, final int value)
	{
		setCartRemovalAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalCronJob</code> attribute.
	 * @return the cartRemovalCronJob
	 */
	public CartRemovalCronJob getCartRemovalCronJob(final SessionContext ctx, final BaseSite item)
	{
		return (CartRemovalCronJob)item.getProperty( ctx, AcceleratorServicesConstants.Attributes.BaseSite.CARTREMOVALCRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.cartRemovalCronJob</code> attribute.
	 * @return the cartRemovalCronJob
	 */
	public CartRemovalCronJob getCartRemovalCronJob(final BaseSite item)
	{
		return getCartRemovalCronJob( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.cartRemovalCronJob</code> attribute. 
	 * @param value the cartRemovalCronJob
	 */
	public void setCartRemovalCronJob(final SessionContext ctx, final BaseSite item, final CartRemovalCronJob value)
	{
		item.setProperty(ctx, AcceleratorServicesConstants.Attributes.BaseSite.CARTREMOVALCRONJOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.cartRemovalCronJob</code> attribute. 
	 * @param value the cartRemovalCronJob
	 */
	public void setCartRemovalCronJob(final BaseSite item, final CartRemovalCronJob value)
	{
		setCartRemovalCronJob( getSession().getSessionContext(), item, value );
	}
	
	public AcceleratorProductBOGOFPromotion createAcceleratorProductBOGOFPromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.ACCELERATORPRODUCTBOGOFPROMOTION );
			return (AcceleratorProductBOGOFPromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AcceleratorProductBOGOFPromotion : "+e.getMessage(), 0 );
		}
	}
	
	public AcceleratorProductBOGOFPromotion createAcceleratorProductBOGOFPromotion(final Map attributeValues)
	{
		return createAcceleratorProductBOGOFPromotion( getSession().getSessionContext(), attributeValues );
	}
	
	public AcceleratorProductMultiBuyPromotion createAcceleratorProductMultiBuyPromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.ACCELERATORPRODUCTMULTIBUYPROMOTION );
			return (AcceleratorProductMultiBuyPromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AcceleratorProductMultiBuyPromotion : "+e.getMessage(), 0 );
		}
	}
	
	public AcceleratorProductMultiBuyPromotion createAcceleratorProductMultiBuyPromotion(final Map attributeValues)
	{
		return createAcceleratorProductMultiBuyPromotion( getSession().getSessionContext(), attributeValues );
	}
	
	public CartRemovalCronJob createCartRemovalCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.CARTREMOVALCRONJOB );
			return (CartRemovalCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CartRemovalCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CartRemovalCronJob createCartRemovalCronJob(final Map attributeValues)
	{
		return createCartRemovalCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CCPaySubValidation createCCPaySubValidation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.CCPAYSUBVALIDATION );
			return (CCPaySubValidation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CCPaySubValidation : "+e.getMessage(), 0 );
		}
	}
	
	public CCPaySubValidation createCCPaySubValidation(final Map attributeValues)
	{
		return createCCPaySubValidation( getSession().getSessionContext(), attributeValues );
	}
	
	public EmailAddress createEmailAddress(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.EMAILADDRESS );
			return (EmailAddress)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating EmailAddress : "+e.getMessage(), 0 );
		}
	}
	
	public EmailAddress createEmailAddress(final Map attributeValues)
	{
		return createEmailAddress( getSession().getSessionContext(), attributeValues );
	}
	
	public EmailAttachment createEmailAttachment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.EMAILATTACHMENT );
			return (EmailAttachment)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating EmailAttachment : "+e.getMessage(), 0 );
		}
	}
	
	public EmailAttachment createEmailAttachment(final Map attributeValues)
	{
		return createEmailAttachment( getSession().getSessionContext(), attributeValues );
	}
	
	public EmailMessage createEmailMessage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.EMAILMESSAGE );
			return (EmailMessage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating EmailMessage : "+e.getMessage(), 0 );
		}
	}
	
	public EmailMessage createEmailMessage(final Map attributeValues)
	{
		return createEmailMessage( getSession().getSessionContext(), attributeValues );
	}
	
	public EmailPage createEmailPage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.EMAILPAGE );
			return (EmailPage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating EmailPage : "+e.getMessage(), 0 );
		}
	}
	
	public EmailPage createEmailPage(final Map attributeValues)
	{
		return createEmailPage( getSession().getSessionContext(), attributeValues );
	}
	
	public EmailPageTemplate createEmailPageTemplate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.EMAILPAGETEMPLATE );
			return (EmailPageTemplate)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating EmailPageTemplate : "+e.getMessage(), 0 );
		}
	}
	
	public EmailPageTemplate createEmailPageTemplate(final Map attributeValues)
	{
		return createEmailPageTemplate( getSession().getSessionContext(), attributeValues );
	}
	
	public ExportDataCronJob createExportDataCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.EXPORTDATACRONJOB );
			return (ExportDataCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ExportDataCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public ExportDataCronJob createExportDataCronJob(final Map attributeValues)
	{
		return createExportDataCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ExportDataHistoryEntry createExportDataHistoryEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.EXPORTDATAHISTORYENTRY );
			return (ExportDataHistoryEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ExportDataHistoryEntry : "+e.getMessage(), 0 );
		}
	}
	
	public ExportDataHistoryEntry createExportDataHistoryEntry(final Map attributeValues)
	{
		return createExportDataHistoryEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public SolrPageRedirect createSolrPageRedirect(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorServicesConstants.TC.SOLRPAGEREDIRECT );
			return (SolrPageRedirect)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SolrPageRedirect : "+e.getMessage(), 0 );
		}
	}
	
	public SolrPageRedirect createSolrPageRedirect(final Map attributeValues)
	{
		return createSolrPageRedirect( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcess.emails</code> attribute.
	 * @return the emails
	 */
	public List<EmailMessage> getEmails(final SessionContext ctx, final BusinessProcess item)
	{
		return (List<EmailMessage>)BUSINESSPROCESS2EMAILMESSAGERELEMAILSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcess.emails</code> attribute.
	 * @return the emails
	 */
	public List<EmailMessage> getEmails(final BusinessProcess item)
	{
		return getEmails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcess.emails</code> attribute. 
	 * @param value the emails
	 */
	public void setEmails(final SessionContext ctx, final BusinessProcess item, final List<EmailMessage> value)
	{
		BUSINESSPROCESS2EMAILMESSAGERELEMAILSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcess.emails</code> attribute. 
	 * @param value the emails
	 */
	public void setEmails(final BusinessProcess item, final List<EmailMessage> value)
	{
		setEmails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emails. 
	 * @param value the item to add to emails
	 */
	public void addToEmails(final SessionContext ctx, final BusinessProcess item, final EmailMessage value)
	{
		BUSINESSPROCESS2EMAILMESSAGERELEMAILSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emails. 
	 * @param value the item to add to emails
	 */
	public void addToEmails(final BusinessProcess item, final EmailMessage value)
	{
		addToEmails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emails. 
	 * @param value the item to remove from emails
	 */
	public void removeFromEmails(final SessionContext ctx, final BusinessProcess item, final EmailMessage value)
	{
		BUSINESSPROCESS2EMAILMESSAGERELEMAILSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emails. 
	 * @param value the item to remove from emails
	 */
	public void removeFromEmails(final BusinessProcess item, final EmailMessage value)
	{
		removeFromEmails( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AcceleratorServicesConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.name</code> attribute.
	 * @return the name - Displayable name for this promotion
	 */
	public String getName(final SessionContext ctx, final AbstractPromotion item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractPromotion.getName requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, AcceleratorServicesConstants.Attributes.AbstractPromotion.NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.name</code> attribute.
	 * @return the name - Displayable name for this promotion
	 */
	public String getName(final AbstractPromotion item)
	{
		return getName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.name</code> attribute. 
	 * @return the localized name - Displayable name for this promotion
	 */
	public Map<Language,String> getAllName(final SessionContext ctx, final AbstractPromotion item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,AcceleratorServicesConstants.Attributes.AbstractPromotion.NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPromotion.name</code> attribute. 
	 * @return the localized name - Displayable name for this promotion
	 */
	public Map<Language,String> getAllName(final AbstractPromotion item)
	{
		return getAllName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPromotion.name</code> attribute. 
	 * @param value the name - Displayable name for this promotion
	 */
	public void setName(final SessionContext ctx, final AbstractPromotion item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractPromotion.setName requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, AcceleratorServicesConstants.Attributes.AbstractPromotion.NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPromotion.name</code> attribute. 
	 * @param value the name - Displayable name for this promotion
	 */
	public void setName(final AbstractPromotion item, final String value)
	{
		setName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPromotion.name</code> attribute. 
	 * @param value the name - Displayable name for this promotion
	 */
	public void setAllName(final SessionContext ctx, final AbstractPromotion item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,AcceleratorServicesConstants.Attributes.AbstractPromotion.NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPromotion.name</code> attribute. 
	 * @param value the name - Displayable name for this promotion
	 */
	public void setAllName(final AbstractPromotion item, final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sequenceId</code> attribute.
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public Long getSequenceId(final SessionContext ctx, final Product item)
	{
		return (Long)item.getProperty( ctx, AcceleratorServicesConstants.Attributes.Product.SEQUENCEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sequenceId</code> attribute.
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public Long getSequenceId(final Product item)
	{
		return getSequenceId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sequenceId</code> attribute. 
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public long getSequenceIdAsPrimitive(final SessionContext ctx, final Product item)
	{
		Long value = getSequenceId( ctx,item );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sequenceId</code> attribute. 
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public long getSequenceIdAsPrimitive(final Product item)
	{
		return getSequenceIdAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final SessionContext ctx, final Product item, final Long value)
	{
		item.setProperty(ctx, AcceleratorServicesConstants.Attributes.Product.SEQUENCEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final Product item, final Long value)
	{
		setSequenceId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final SessionContext ctx, final Product item, final long value)
	{
		setSequenceId( ctx, item, Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final Product item, final long value)
	{
		setSequenceId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.sequenceId</code> attribute.
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public Long getSequenceId(final SessionContext ctx, final PriceRow item)
	{
		return (Long)item.getProperty( ctx, AcceleratorServicesConstants.Attributes.PriceRow.SEQUENCEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.sequenceId</code> attribute.
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public Long getSequenceId(final PriceRow item)
	{
		return getSequenceId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.sequenceId</code> attribute. 
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public long getSequenceIdAsPrimitive(final SessionContext ctx, final PriceRow item)
	{
		Long value = getSequenceId( ctx,item );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.sequenceId</code> attribute. 
	 * @return the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public long getSequenceIdAsPrimitive(final PriceRow item)
	{
		return getSequenceIdAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final SessionContext ctx, final PriceRow item, final Long value)
	{
		item.setProperty(ctx, AcceleratorServicesConstants.Attributes.PriceRow.SEQUENCEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final PriceRow item, final Long value)
	{
		setSequenceId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final SessionContext ctx, final PriceRow item, final long value)
	{
		setSequenceId( ctx, item, Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.sequenceId</code> attribute. 
	 * @param value the sequenceId - Attribute is used in batch import process for avoiding multiple imports.
	 */
	public void setSequenceId(final PriceRow item, final long value)
	{
		setSequenceId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute.
	 * @return the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public Boolean isSubscriptionValidated(final SessionContext ctx, final PaymentInfo item)
	{
		return (Boolean)item.getProperty( ctx, AcceleratorServicesConstants.Attributes.CreditCardPaymentInfo.SUBSCRIPTIONVALIDATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute.
	 * @return the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public Boolean isSubscriptionValidated(final PaymentInfo item)
	{
		return isSubscriptionValidated( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute. 
	 * @return the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public boolean isSubscriptionValidatedAsPrimitive(final SessionContext ctx, final PaymentInfo item)
	{
		Boolean value = isSubscriptionValidated( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute. 
	 * @return the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public boolean isSubscriptionValidatedAsPrimitive(final PaymentInfo item)
	{
		return isSubscriptionValidatedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute. 
	 * @param value the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public void setSubscriptionValidated(final SessionContext ctx, final PaymentInfo item, final Boolean value)
	{
		item.setProperty(ctx, AcceleratorServicesConstants.Attributes.CreditCardPaymentInfo.SUBSCRIPTIONVALIDATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute. 
	 * @param value the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public void setSubscriptionValidated(final PaymentInfo item, final Boolean value)
	{
		setSubscriptionValidated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute. 
	 * @param value the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public void setSubscriptionValidated(final SessionContext ctx, final PaymentInfo item, final boolean value)
	{
		setSubscriptionValidated( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.subscriptionValidated</code> attribute. 
	 * @param value the subscriptionValidated - Determines whether the subscription ID has been validated.
	 */
	public void setSubscriptionValidated(final PaymentInfo item, final boolean value)
	{
		setSubscriptionValidated( getSession().getSessionContext(), item, value );
	}
	
}
