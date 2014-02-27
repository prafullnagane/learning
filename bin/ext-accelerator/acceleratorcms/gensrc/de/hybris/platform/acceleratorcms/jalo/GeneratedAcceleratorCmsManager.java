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
package de.hybris.platform.acceleratorcms.jalo;

import de.hybris.platform.acceleratorcms.constants.AcceleratorCmsConstants;
import de.hybris.platform.acceleratorcms.jalo.components.CMSTabParagraphComponent;
import de.hybris.platform.acceleratorcms.jalo.components.CMSTabParagraphContainer;
import de.hybris.platform.acceleratorcms.jalo.components.CategoryFeatureComponent;
import de.hybris.platform.acceleratorcms.jalo.components.DynamicBannerComponent;
import de.hybris.platform.acceleratorcms.jalo.components.FooterComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ImageMapComponent;
import de.hybris.platform.acceleratorcms.jalo.components.MiniCartComponent;
import de.hybris.platform.acceleratorcms.jalo.components.NavigationBarComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductFeatureComponent;
import de.hybris.platform.acceleratorcms.jalo.components.ProductReferencesComponent;
import de.hybris.platform.acceleratorcms.jalo.components.PurchasedProductReferencesComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.acceleratorcms.jalo.components.SubCategoryListComponent;
import de.hybris.platform.acceleratorcms.jalo.restrictions.CMSUiExperienceRestriction;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.cms2.jalo.pages.AbstractPage;
import de.hybris.platform.cms2.jalo.pages.ContentPage;
import de.hybris.platform.cms2.jalo.preview.PreviewData;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.cms2lib.components.ProductCarouselComponent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>AcceleratorCmsManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAcceleratorCmsManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTFEATURECOMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductFeatureComponent> PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER = new OneToManyHandler<ProductFeatureComponent>(
	AcceleratorCmsConstants.TC.PRODUCTFEATURECOMPONENT,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CATEGORYFEATURECOMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CategoryFeatureComponent> CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER = new OneToManyHandler<CategoryFeatureComponent>(
	AcceleratorCmsConstants.TC.CATEGORYFEATURECOMPONENT,
	false,
	"category",
	null,
	false,
	true,
	CollectionType.LIST
	);
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.categoryCode</code> attribute.
	 * @return the categoryCode - A code for a category for a solr search
	 */
	public String getCategoryCode(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (String)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.CATEGORYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.categoryCode</code> attribute.
	 * @return the categoryCode - A code for a category for a solr search
	 */
	public String getCategoryCode(final ProductCarouselComponent item)
	{
		return getCategoryCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.categoryCode</code> attribute. 
	 * @param value the categoryCode - A code for a category for a solr search
	 */
	public void setCategoryCode(final SessionContext ctx, final ProductCarouselComponent item, final String value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.CATEGORYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.categoryCode</code> attribute. 
	 * @param value the categoryCode - A code for a category for a solr search
	 */
	public void setCategoryCode(final ProductCarouselComponent item, final String value)
	{
		setCategoryCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.categoryFeatureComponents</code> attribute.
	 * @return the categoryFeatureComponents
	 */
	public List<CategoryFeatureComponent> getCategoryFeatureComponents(final SessionContext ctx, final Category item)
	{
		return (List<CategoryFeatureComponent>)CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.categoryFeatureComponents</code> attribute.
	 * @return the categoryFeatureComponents
	 */
	public List<CategoryFeatureComponent> getCategoryFeatureComponents(final Category item)
	{
		return getCategoryFeatureComponents( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.categoryFeatureComponents</code> attribute. 
	 * @param value the categoryFeatureComponents
	 */
	public void setCategoryFeatureComponents(final SessionContext ctx, final Category item, final List<CategoryFeatureComponent> value)
	{
		CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.categoryFeatureComponents</code> attribute. 
	 * @param value the categoryFeatureComponents
	 */
	public void setCategoryFeatureComponents(final Category item, final List<CategoryFeatureComponent> value)
	{
		setCategoryFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categoryFeatureComponents. 
	 * @param value the item to add to categoryFeatureComponents
	 */
	public void addToCategoryFeatureComponents(final SessionContext ctx, final Category item, final CategoryFeatureComponent value)
	{
		CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categoryFeatureComponents. 
	 * @param value the item to add to categoryFeatureComponents
	 */
	public void addToCategoryFeatureComponents(final Category item, final CategoryFeatureComponent value)
	{
		addToCategoryFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categoryFeatureComponents. 
	 * @param value the item to remove from categoryFeatureComponents
	 */
	public void removeFromCategoryFeatureComponents(final SessionContext ctx, final Category item, final CategoryFeatureComponent value)
	{
		CATEGORYFEATURECOMPONENTS2CATEGORYRELCATEGORYFEATURECOMPONENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categoryFeatureComponents. 
	 * @param value the item to remove from categoryFeatureComponents
	 */
	public void removeFromCategoryFeatureComponents(final Category item, final CategoryFeatureComponent value)
	{
		removeFromCategoryFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	public CategoryFeatureComponent createCategoryFeatureComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CATEGORYFEATURECOMPONENT );
			return (CategoryFeatureComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CategoryFeatureComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CategoryFeatureComponent createCategoryFeatureComponent(final Map attributeValues)
	{
		return createCategoryFeatureComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSTabParagraphComponent createCMSTabParagraphComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSTABPARAGRAPHCOMPONENT );
			return (CMSTabParagraphComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CMSTabParagraphComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CMSTabParagraphComponent createCMSTabParagraphComponent(final Map attributeValues)
	{
		return createCMSTabParagraphComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSTabParagraphContainer createCMSTabParagraphContainer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSTABPARAGRAPHCONTAINER );
			return (CMSTabParagraphContainer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CMSTabParagraphContainer : "+e.getMessage(), 0 );
		}
	}
	
	public CMSTabParagraphContainer createCMSTabParagraphContainer(final Map attributeValues)
	{
		return createCMSTabParagraphContainer( getSession().getSessionContext(), attributeValues );
	}
	
	public CMSUiExperienceRestriction createCMSUiExperienceRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.CMSUIEXPERIENCERESTRICTION );
			return (CMSUiExperienceRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CMSUiExperienceRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CMSUiExperienceRestriction createCMSUiExperienceRestriction(final Map attributeValues)
	{
		return createCMSUiExperienceRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public DynamicBannerComponent createDynamicBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.DYNAMICBANNERCOMPONENT );
			return (DynamicBannerComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DynamicBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public DynamicBannerComponent createDynamicBannerComponent(final Map attributeValues)
	{
		return createDynamicBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public FooterComponent createFooterComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.FOOTERCOMPONENT );
			return (FooterComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FooterComponent : "+e.getMessage(), 0 );
		}
	}
	
	public FooterComponent createFooterComponent(final Map attributeValues)
	{
		return createFooterComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ImageMapComponent createImageMapComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.IMAGEMAPCOMPONENT );
			return (ImageMapComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ImageMapComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ImageMapComponent createImageMapComponent(final Map attributeValues)
	{
		return createImageMapComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public MiniCartComponent createMiniCartComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.MINICARTCOMPONENT );
			return (MiniCartComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MiniCartComponent : "+e.getMessage(), 0 );
		}
	}
	
	public MiniCartComponent createMiniCartComponent(final Map attributeValues)
	{
		return createMiniCartComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public NavigationBarComponent createNavigationBarComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.NAVIGATIONBARCOMPONENT );
			return (NavigationBarComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NavigationBarComponent : "+e.getMessage(), 0 );
		}
	}
	
	public NavigationBarComponent createNavigationBarComponent(final Map attributeValues)
	{
		return createNavigationBarComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductFeatureComponent createProductFeatureComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTFEATURECOMPONENT );
			return (ProductFeatureComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ProductFeatureComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductFeatureComponent createProductFeatureComponent(final Map attributeValues)
	{
		return createProductFeatureComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductReferencesComponent createProductReferencesComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PRODUCTREFERENCESCOMPONENT );
			return (ProductReferencesComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ProductReferencesComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductReferencesComponent createProductReferencesComponent(final Map attributeValues)
	{
		return createProductReferencesComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public PurchasedProductReferencesComponent createPurchasedProductReferencesComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.PURCHASEDPRODUCTREFERENCESCOMPONENT );
			return (PurchasedProductReferencesComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PurchasedProductReferencesComponent : "+e.getMessage(), 0 );
		}
	}
	
	public PurchasedProductReferencesComponent createPurchasedProductReferencesComponent(final Map attributeValues)
	{
		return createPurchasedProductReferencesComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SimpleBannerComponent createSimpleBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SIMPLEBANNERCOMPONENT );
			return (SimpleBannerComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SimpleBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SimpleBannerComponent createSimpleBannerComponent(final Map attributeValues)
	{
		return createSimpleBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public SubCategoryListComponent createSubCategoryListComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AcceleratorCmsConstants.TC.SUBCATEGORYLISTCOMPONENT );
			return (SubCategoryListComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SubCategoryListComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SubCategoryListComponent createSubCategoryListComponent(final Map attributeValues)
	{
		return createSubCategoryListComponent( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute.
	 * @return the description - Localized content page description.
	 */
	public String getDescription(final SessionContext ctx, final ContentPage item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.getDescription requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute.
	 * @return the description - Localized content page description.
	 */
	public String getDescription(final ContentPage item)
	{
		return getDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute. 
	 * @return the localized description - Localized content page description.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx, final ContentPage item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.description</code> attribute. 
	 * @return the localized description - Localized content page description.
	 */
	public Map<Language,String> getAllDescription(final ContentPage item)
	{
		return getAllDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setDescription(final SessionContext ctx, final ContentPage item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.setDescription requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setDescription(final ContentPage item, final String value)
	{
		setDescription( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setAllDescription(final SessionContext ctx, final ContentPage item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.description</code> attribute. 
	 * @param value the description - Localized content page description.
	 */
	public void setAllDescription(final ContentPage item, final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AcceleratorCmsConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute.
	 * @return the keywords - Localized content page keywords.
	 */
	public String getKeywords(final SessionContext ctx, final ContentPage item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.getKeywords requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute.
	 * @return the keywords - Localized content page keywords.
	 */
	public String getKeywords(final ContentPage item)
	{
		return getKeywords( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute. 
	 * @return the localized keywords - Localized content page keywords.
	 */
	public Map<Language,String> getAllKeywords(final SessionContext ctx, final ContentPage item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContentPage.keywords</code> attribute. 
	 * @return the localized keywords - Localized content page keywords.
	 */
	public Map<Language,String> getAllKeywords(final ContentPage item)
	{
		return getAllKeywords( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setKeywords(final SessionContext ctx, final ContentPage item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedContentPage.setKeywords requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setKeywords(final ContentPage item, final String value)
	{
		setKeywords( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setAllKeywords(final SessionContext ctx, final ContentPage item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ContentPage.KEYWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContentPage.keywords</code> attribute. 
	 * @param value the keywords - Localized content page keywords.
	 */
	public void setAllKeywords(final ContentPage item, final Map<Language,String> value)
	{
		setAllKeywords( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute.
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public Boolean isPopup(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (Boolean)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.POPUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute.
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public Boolean isPopup(final ProductCarouselComponent item)
	{
		return isPopup( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public boolean isPopupAsPrimitive(final SessionContext ctx, final ProductCarouselComponent item)
	{
		Boolean value = isPopup( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @return the popup - If true shows a popup else redirects to products page
	 */
	public boolean isPopupAsPrimitive(final ProductCarouselComponent item)
	{
		return isPopupAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final SessionContext ctx, final ProductCarouselComponent item, final Boolean value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.POPUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final ProductCarouselComponent item, final Boolean value)
	{
		setPopup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final SessionContext ctx, final ProductCarouselComponent item, final boolean value)
	{
		setPopup( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.popup</code> attribute. 
	 * @param value the popup - If true shows a popup else redirects to products page
	 */
	public void setPopup(final ProductCarouselComponent item, final boolean value)
	{
		setPopup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productFeatureComponents</code> attribute.
	 * @return the productFeatureComponents
	 */
	public List<ProductFeatureComponent> getProductFeatureComponents(final SessionContext ctx, final Product item)
	{
		return (List<ProductFeatureComponent>)PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productFeatureComponents</code> attribute.
	 * @return the productFeatureComponents
	 */
	public List<ProductFeatureComponent> getProductFeatureComponents(final Product item)
	{
		return getProductFeatureComponents( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productFeatureComponents</code> attribute. 
	 * @param value the productFeatureComponents
	 */
	public void setProductFeatureComponents(final SessionContext ctx, final Product item, final List<ProductFeatureComponent> value)
	{
		PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productFeatureComponents</code> attribute. 
	 * @param value the productFeatureComponents
	 */
	public void setProductFeatureComponents(final Product item, final List<ProductFeatureComponent> value)
	{
		setProductFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productFeatureComponents. 
	 * @param value the item to add to productFeatureComponents
	 */
	public void addToProductFeatureComponents(final SessionContext ctx, final Product item, final ProductFeatureComponent value)
	{
		PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productFeatureComponents. 
	 * @param value the item to add to productFeatureComponents
	 */
	public void addToProductFeatureComponents(final Product item, final ProductFeatureComponent value)
	{
		addToProductFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productFeatureComponents. 
	 * @param value the item to remove from productFeatureComponents
	 */
	public void removeFromProductFeatureComponents(final SessionContext ctx, final Product item, final ProductFeatureComponent value)
	{
		PRODUCTFEATURECOMPONENTS2PRODUCTRELPRODUCTFEATURECOMPONENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productFeatureComponents. 
	 * @param value the item to remove from productFeatureComponents
	 */
	public void removeFromProductFeatureComponents(final Product item, final ProductFeatureComponent value)
	{
		removeFromProductFeatureComponents( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.searchQuery</code> attribute.
	 * @return the searchQuery - A solr query string
	 */
	public String getSearchQuery(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (String)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.SEARCHQUERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.searchQuery</code> attribute.
	 * @return the searchQuery - A solr query string
	 */
	public String getSearchQuery(final ProductCarouselComponent item)
	{
		return getSearchQuery( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.searchQuery</code> attribute. 
	 * @param value the searchQuery - A solr query string
	 */
	public void setSearchQuery(final SessionContext ctx, final ProductCarouselComponent item, final String value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.SEARCHQUERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.searchQuery</code> attribute. 
	 * @param value the searchQuery - A solr query string
	 */
	public void setSearchQuery(final ProductCarouselComponent item, final String value)
	{
		setSearchQuery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.styleAttributes</code> attribute.
	 * @return the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public String getStyleAttributes(final SessionContext ctx, final CMSLinkComponent item)
	{
		return (String)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.CMSLinkComponent.STYLEATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSLinkComponent.styleAttributes</code> attribute.
	 * @return the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public String getStyleAttributes(final CMSLinkComponent item)
	{
		return getStyleAttributes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSLinkComponent.styleAttributes</code> attribute. 
	 * @param value the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public void setStyleAttributes(final SessionContext ctx, final CMSLinkComponent item, final String value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.CMSLinkComponent.STYLEATTRIBUTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSLinkComponent.styleAttributes</code> attribute. 
	 * @param value the styleAttributes - Can store custom styling attributes for additional styling
	 */
	public void setStyleAttributes(final CMSLinkComponent item, final String value)
	{
		setStyleAttributes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle(final SessionContext ctx, final ProductCarouselComponent item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductCarouselComponent.getTitle requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute.
	 * @return the title - Localized title of the component.
	 */
	public String getTitle(final ProductCarouselComponent item)
	{
		return getTitle( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx, final ProductCarouselComponent item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @return the localized title - Localized title of the component.
	 */
	public Map<Language,String> getAllTitle(final ProductCarouselComponent item)
	{
		return getAllTitle( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final SessionContext ctx, final ProductCarouselComponent item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductCarouselComponent.setTitle requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setTitle(final ProductCarouselComponent item, final String value)
	{
		setTitle( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final SessionContext ctx, final ProductCarouselComponent item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,AcceleratorCmsConstants.Attributes.ProductCarouselComponent.TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCarouselComponent.title</code> attribute. 
	 * @param value the title - Localized title of the component.
	 */
	public void setAllTitle(final ProductCarouselComponent item, final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.uiExperience</code> attribute.
	 * @return the uiExperience
	 */
	public EnumerationValue getUiExperience(final SessionContext ctx, final PreviewData item)
	{
		return (EnumerationValue)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.PreviewData.UIEXPERIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreviewData.uiExperience</code> attribute.
	 * @return the uiExperience
	 */
	public EnumerationValue getUiExperience(final PreviewData item)
	{
		return getUiExperience( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreviewData.uiExperience</code> attribute. 
	 * @param value the uiExperience
	 */
	public void setUiExperience(final SessionContext ctx, final PreviewData item, final EnumerationValue value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.PreviewData.UIEXPERIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreviewData.uiExperience</code> attribute. 
	 * @param value the uiExperience
	 */
	public void setUiExperience(final PreviewData item, final EnumerationValue value)
	{
		setUiExperience( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.urlEncodingAttributes</code> attribute.
	 * @return the urlEncodingAttributes
	 */
	public Collection<String> getUrlEncodingAttributes(final SessionContext ctx, final CMSSite item)
	{
		Collection<String> coll = (Collection<String>)item.getProperty( ctx, AcceleratorCmsConstants.Attributes.CMSSite.URLENCODINGATTRIBUTES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.urlEncodingAttributes</code> attribute.
	 * @return the urlEncodingAttributes
	 */
	public Collection<String> getUrlEncodingAttributes(final CMSSite item)
	{
		return getUrlEncodingAttributes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.urlEncodingAttributes</code> attribute. 
	 * @param value the urlEncodingAttributes
	 */
	public void setUrlEncodingAttributes(final SessionContext ctx, final CMSSite item, final Collection<String> value)
	{
		item.setProperty(ctx, AcceleratorCmsConstants.Attributes.CMSSite.URLENCODINGATTRIBUTES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.urlEncodingAttributes</code> attribute. 
	 * @param value the urlEncodingAttributes
	 */
	public void setUrlEncodingAttributes(final CMSSite item, final Collection<String> value)
	{
		setUrlEncodingAttributes( getSession().getSessionContext(), item, value );
	}
	
}
