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
package de.hybris.platform.catalog.resource;

import de.hybris.merchandise.core.resource.ApparelProductResource;
import de.hybris.merchandise.core.resource.ApparelSizeVariantProductResource;
import de.hybris.merchandise.core.resource.ApparelStyleVariantProductResource;
import de.hybris.platform.acceleratorcms.resource.components.CMSTabParagraphComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.CMSTabParagraphContainerResource;
import de.hybris.platform.acceleratorcms.resource.components.CategoryFeatureComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.DynamicBannerComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.FooterComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.ImageMapComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.MiniCartComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.NavigationBarComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.ProductFeatureComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.ProductReferencesComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.PurchasedProductReferencesComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.SimpleBannerComponentResource;
import de.hybris.platform.acceleratorcms.resource.components.SubCategoryListComponentResource;
import de.hybris.platform.acceleratorcms.resource.restrictions.CMSUiExperienceRestrictionResource;
import de.hybris.platform.acceleratorservices.resource.cms2.pages.EmailPageResource;
import de.hybris.platform.acceleratorservices.resource.cms2.pages.EmailPageTemplateResource;
import de.hybris.platform.acceleratorservices.resource.email.EmailAttachmentResource;
import de.hybris.platform.btg.resource.BTGAbstractCartOperandResource;
import de.hybris.platform.btg.resource.BTGAbstractCustomerOperandResource;
import de.hybris.platform.btg.resource.BTGAbstractLiteralOperandResource;
import de.hybris.platform.btg.resource.BTGAbstractOrderOperandResource;
import de.hybris.platform.btg.resource.BTGAbstractReferenceOperandResource;
import de.hybris.platform.btg.resource.BTGAbstractScriptOperandResource;
import de.hybris.platform.btg.resource.BTGAbstractWCMSOperandResource;
import de.hybris.platform.btg.resource.BTGAssignToGroupDefinitionResource;
import de.hybris.platform.btg.resource.BTGBooleanLiteralOperandResource;
import de.hybris.platform.btg.resource.BTGCartIsEmptyOperandResource;
import de.hybris.platform.btg.resource.BTGCartTotalSumOperandResource;
import de.hybris.platform.btg.resource.BTGCategoriesInCartOperandResource;
import de.hybris.platform.btg.resource.BTGCategoriesInOrdersOperandResource;
import de.hybris.platform.btg.resource.BTGConditionResource;
import de.hybris.platform.btg.resource.BTGDoubleLiteralOperandResource;
import de.hybris.platform.btg.resource.BTGEachOrderTotalSumOperandResource;
import de.hybris.platform.btg.resource.BTGExpressionResource;
import de.hybris.platform.btg.resource.BTGGenderEnumLiteralOperandResource;
import de.hybris.platform.btg.resource.BTGGenericOperandResource;
import de.hybris.platform.btg.resource.BTGIntegerLiteralOperandResource;
import de.hybris.platform.btg.resource.BTGItemResource;
import de.hybris.platform.btg.resource.BTGLastOrderDateOperandResource;
import de.hybris.platform.btg.resource.BTGLastOrdersOperandResource;
import de.hybris.platform.btg.resource.BTGLastOrdersPriceOperandResource;
import de.hybris.platform.btg.resource.BTGMediaScriptOperandResource;
import de.hybris.platform.btg.resource.BTGNumberOfOrdersOperandResource;
import de.hybris.platform.btg.resource.BTGNumberOfOrdersRelativeDateOperandResource;
import de.hybris.platform.btg.resource.BTGOperandResource;
import de.hybris.platform.btg.resource.BTGOperatorResource;
import de.hybris.platform.btg.resource.BTGOrderTotalSumOperandResource;
import de.hybris.platform.btg.resource.BTGOutputActionDefinitionResource;
import de.hybris.platform.btg.resource.BTGProductsInCartOperandResource;
import de.hybris.platform.btg.resource.BTGProductsInOrdersOperandResource;
import de.hybris.platform.btg.resource.BTGQuantityOfProductInCartOperandResource;
import de.hybris.platform.btg.resource.BTGReferalUrlOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceCategoriesOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceContentpagesOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceCountriesOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceDateOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceExactDateOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceKeyValuePairListOperandResource;
import de.hybris.platform.btg.resource.BTGReferencePriceOperandResource;
import de.hybris.platform.btg.resource.BTGReferencePrincipalGroupsOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceProductsOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceRegExpListOperandResource;
import de.hybris.platform.btg.resource.BTGReferenceStringListOperandResource;
import de.hybris.platform.btg.resource.BTGRuleResource;
import de.hybris.platform.btg.resource.BTGSegmentResource;
import de.hybris.platform.btg.resource.BTGStringLiteralOperandResource;
import de.hybris.platform.btg.resource.BTGStringScriptOperandResource;
import de.hybris.platform.btg.resource.BTGUrlParameterOperandResource;
import de.hybris.platform.btg.resource.BTGUserAddressPostalCodeOperandResource;
import de.hybris.platform.btg.resource.BTGUserCountryOperandResource;
import de.hybris.platform.btg.resource.BTGUserGenderOperandResource;
import de.hybris.platform.btg.resource.BTGUserMemberOfGroupsOperandResource;
import de.hybris.platform.btg.resource.BTGViewedCategoriesOperandResource;
import de.hybris.platform.btg.resource.BTGViewedProductsOperandResource;
import de.hybris.platform.btg.resource.BTGVisitedContentpagesOperandResource;
import de.hybris.platform.btg.resource.CmsRestrictionActionDefinitionResource;
import de.hybris.platform.btg.resource.ScriptMediaResource;
import de.hybris.platform.btg.resource.restrictions.BtgSegmentRestrictionResource;
import de.hybris.platform.catalog.dto.CatalogVersionDTO;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.resource.CatalogUnawareMediaResource;
import de.hybris.platform.catalog.resource.CatalogVersionDifferenceResource;
import de.hybris.platform.catalog.resource.CategoryCatalogVersionDifferenceResource;
import de.hybris.platform.catalog.resource.CompareCatalogVersionsCronJobResource;
import de.hybris.platform.catalog.resource.KeywordResource;
import de.hybris.platform.catalog.resource.ProductCatalogVersionDifferenceResource;
import de.hybris.platform.catalog.resource.classification.ClassificationClassResource;
import de.hybris.platform.catalog.resource.classification.ClassificationKeywordResource;
import de.hybris.platform.catalog.resource.synchronization.CatalogVersionSyncScheduleMediaResource;
import de.hybris.platform.category.resource.CategoryResource;
import de.hybris.platform.cms2.resource.contents.CMSItemResource;
import de.hybris.platform.cms2.resource.contents.components.AbstractCMSComponentResource;
import de.hybris.platform.cms2.resource.contents.components.CMSImageComponentResource;
import de.hybris.platform.cms2.resource.contents.components.CMSLinkComponentResource;
import de.hybris.platform.cms2.resource.contents.components.CMSParagraphComponentResource;
import de.hybris.platform.cms2.resource.contents.components.SimpleCMSComponentResource;
import de.hybris.platform.cms2.resource.contents.containers.ABTestCMSComponentContainerResource;
import de.hybris.platform.cms2.resource.contents.containers.AbstractCMSComponentContainerResource;
import de.hybris.platform.cms2.resource.contents.contentslot.ContentSlotResource;
import de.hybris.platform.cms2.resource.navigation.CMSNavigationEntryResource;
import de.hybris.platform.cms2.resource.navigation.CMSNavigationNodeResource;
import de.hybris.platform.cms2.resource.pages.AbstractPageResource;
import de.hybris.platform.cms2.resource.pages.CatalogPageResource;
import de.hybris.platform.cms2.resource.pages.CategoryPageResource;
import de.hybris.platform.cms2.resource.pages.ContentPageResource;
import de.hybris.platform.cms2.resource.pages.PageTemplateResource;
import de.hybris.platform.cms2.resource.pages.ProductPageResource;
import de.hybris.platform.cms2.resource.relations.CMSRelationResource;
import de.hybris.platform.cms2.resource.relations.ContentSlotForPageResource;
import de.hybris.platform.cms2.resource.relations.ContentSlotForTemplateResource;
import de.hybris.platform.cms2.resource.restrictions.AbstractRestrictionResource;
import de.hybris.platform.cms2.resource.restrictions.CMSCatalogRestrictionResource;
import de.hybris.platform.cms2.resource.restrictions.CMSCategoryRestrictionResource;
import de.hybris.platform.cms2.resource.restrictions.CMSInverseRestrictionResource;
import de.hybris.platform.cms2.resource.restrictions.CMSProductRestrictionResource;
import de.hybris.platform.cms2.resource.restrictions.CMSTimeRestrictionResource;
import de.hybris.platform.cms2.resource.restrictions.CMSUserGroupRestrictionResource;
import de.hybris.platform.cms2.resource.restrictions.CMSUserRestrictionResource;
import de.hybris.platform.cms2lib.resource.components.AbstractBannerComponentResource;
import de.hybris.platform.cms2lib.resource.components.BannerComponentResource;
import de.hybris.platform.cms2lib.resource.components.FlashComponentResource;
import de.hybris.platform.cms2lib.resource.components.ProductCarouselComponentResource;
import de.hybris.platform.cms2lib.resource.components.ProductDetailComponentResource;
import de.hybris.platform.cms2lib.resource.components.ProductListComponentResource;
import de.hybris.platform.cms2lib.resource.components.RotatingImagesComponentResource;
import de.hybris.platform.cockpit.reports.resource.CompiledJasperMediaResource;
import de.hybris.platform.cockpit.reports.resource.JasperMediaResource;
import de.hybris.platform.cockpit.resource.CockpitUIConfigurationMediaResource;
import de.hybris.platform.cockpit.resource.CockpitUIScriptConfigMediaResource;
import de.hybris.platform.commons.resource.CustomOrder2XMLResource;
import de.hybris.platform.commons.resource.DocumentResource;
import de.hybris.platform.commons.resource.FOPFormatterResource;
import de.hybris.platform.commons.resource.FormatterResource;
import de.hybris.platform.commons.resource.ItemFormatterResource;
import de.hybris.platform.commons.resource.MediaFormatterResource;
import de.hybris.platform.commons.resource.VelocityFormatterResource;
import de.hybris.platform.commons.resource.XMLTransformFormatterResource;
import de.hybris.platform.core.resource.link.LinkResource;
import de.hybris.platform.core.resource.media.MediaContainerResource;
import de.hybris.platform.core.resource.media.MediaResource;
import de.hybris.platform.core.resource.product.ProductResource;
import de.hybris.platform.cronjob.resource.JobMediaResource;
import de.hybris.platform.cronjob.resource.LogFileResource;
import de.hybris.platform.deeplink.resource.media.BarcodeMediaResource;
import de.hybris.platform.hmc.resource.HMCHistoryEntryResource;
import de.hybris.platform.impex.resource.ImpExMediaResource;
import de.hybris.platform.impex.resource.exp.HeaderLibraryResource;
import de.hybris.platform.impex.resource.exp.ImpExExportMediaResource;
import de.hybris.platform.ldap.resource.ConfigurationMediaResource;
import de.hybris.platform.ldap.resource.LDIFMediaResource;
import de.hybris.platform.variants.resource.VariantProductResource;
import de.hybris.platform.webservices.AbstractYResource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Generated resource class for type CatalogVersion first defined at extension catalog
 */
@SuppressWarnings("all")
public class CatalogVersionResource extends AbstractYResource<CatalogVersionModel>
{
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public CatalogVersionResource()
	{
		super("CatalogVersion");
	}
	
	
	/**
	 * Generated HTTP method for covering DELETE requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@DELETE
	public Response deleteCatalogVersion()
	{
		return createDeleteResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractBannerComponentResource} for current root resource 
	 */
	@Path("/abstractbannercomponents/{abstractbannercomponent}")
	public AbstractYResource getAbstractBannerComponentResource(@PathParam("abstractbannercomponent")  final String resourceKey)
	{
		final AbstractBannerComponentResource  resource  = resourceCtx.getResource(AbstractBannerComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractCMSComponentContainerResource} for current root resource 
	 */
	@Path("/abstractcmscomponentcontainers/{abstractcmscomponentcontainer}")
	public AbstractYResource getAbstractCMSComponentContainerResource(@PathParam("abstractcmscomponentcontainer")  final String resourceKey)
	{
		final AbstractCMSComponentContainerResource  resource  = resourceCtx.getResource(AbstractCMSComponentContainerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractCMSComponentResource} for current root resource 
	 */
	@Path("/abstractcmscomponents/{abstractcmscomponent}")
	public AbstractYResource getAbstractCMSComponentResource(@PathParam("abstractcmscomponent")  final String resourceKey)
	{
		final AbstractCMSComponentResource  resource  = resourceCtx.getResource(AbstractCMSComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractPageResource} for current root resource 
	 */
	@Path("/abstractpages/{abstractpage}")
	public AbstractYResource getAbstractPageResource(@PathParam("abstractpage")  final String resourceKey)
	{
		final AbstractPageResource  resource  = resourceCtx.getResource(AbstractPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link AbstractRestrictionResource} for current root resource 
	 */
	@Path("/abstractrestrictions/{abstractrestriction}")
	public AbstractYResource getAbstractRestrictionResource(@PathParam("abstractrestriction")  final String resourceKey)
	{
		final AbstractRestrictionResource  resource  = resourceCtx.getResource(AbstractRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ABTestCMSComponentContainerResource} for current root resource 
	 */
	@Path("/abtestcmscomponentcontainers/{abtestcmscomponentcontainer}")
	public AbstractYResource getABTestCMSComponentContainerResource(@PathParam("abtestcmscomponentcontainer")  final String resourceKey)
	{
		final ABTestCMSComponentContainerResource  resource  = resourceCtx.getResource(ABTestCMSComponentContainerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ApparelProductResource} for current root resource 
	 */
	@Path("/apparelproducts/{apparelproduct}")
	public AbstractYResource getApparelProductResource(@PathParam("apparelproduct")  final String resourceKey)
	{
		final ApparelProductResource  resource  = resourceCtx.getResource(ApparelProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ApparelSizeVariantProductResource} for current root resource 
	 */
	@Path("/apparelsizevariantproducts/{apparelsizevariantproduct}")
	public AbstractYResource getApparelSizeVariantProductResource(@PathParam("apparelsizevariantproduct")  final String resourceKey)
	{
		final ApparelSizeVariantProductResource  resource  = resourceCtx.getResource(ApparelSizeVariantProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ApparelStyleVariantProductResource} for current root resource 
	 */
	@Path("/apparelstylevariantproducts/{apparelstylevariantproduct}")
	public AbstractYResource getApparelStyleVariantProductResource(@PathParam("apparelstylevariantproduct")  final String resourceKey)
	{
		final ApparelStyleVariantProductResource  resource  = resourceCtx.getResource(ApparelStyleVariantProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BannerComponentResource} for current root resource 
	 */
	@Path("/bannercomponents/{bannercomponent}")
	public AbstractYResource getBannerComponentResource(@PathParam("bannercomponent")  final String resourceKey)
	{
		final BannerComponentResource  resource  = resourceCtx.getResource(BannerComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BarcodeMediaResource} for current root resource 
	 */
	@Path("/barcodemedias/{barcodemedia}")
	public AbstractYResource getBarcodeMediaResource(@PathParam("barcodemedia")  final String resourceKey)
	{
		final BarcodeMediaResource  resource  = resourceCtx.getResource(BarcodeMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAbstractCartOperandResource} for current root resource 
	 */
	@Path("/btgabstractcartoperands/{btgabstractcartoperand}")
	public AbstractYResource getBTGAbstractCartOperandResource(@PathParam("btgabstractcartoperand")  final String resourceKey)
	{
		final BTGAbstractCartOperandResource  resource  = resourceCtx.getResource(BTGAbstractCartOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAbstractCustomerOperandResource} for current root resource 
	 */
	@Path("/btgabstractcustomeroperands/{btgabstractcustomeroperand}")
	public AbstractYResource getBTGAbstractCustomerOperandResource(@PathParam("btgabstractcustomeroperand")  final String resourceKey)
	{
		final BTGAbstractCustomerOperandResource  resource  = resourceCtx.getResource(BTGAbstractCustomerOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAbstractLiteralOperandResource} for current root resource 
	 */
	@Path("/btgabstractliteraloperands/{btgabstractliteraloperand}")
	public AbstractYResource getBTGAbstractLiteralOperandResource(@PathParam("btgabstractliteraloperand")  final String resourceKey)
	{
		final BTGAbstractLiteralOperandResource  resource  = resourceCtx.getResource(BTGAbstractLiteralOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAbstractOrderOperandResource} for current root resource 
	 */
	@Path("/btgabstractorderoperands/{btgabstractorderoperand}")
	public AbstractYResource getBTGAbstractOrderOperandResource(@PathParam("btgabstractorderoperand")  final String resourceKey)
	{
		final BTGAbstractOrderOperandResource  resource  = resourceCtx.getResource(BTGAbstractOrderOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAbstractReferenceOperandResource} for current root resource 
	 */
	@Path("/btgabstractreferenceoperands/{btgabstractreferenceoperand}")
	public AbstractYResource getBTGAbstractReferenceOperandResource(@PathParam("btgabstractreferenceoperand")  final String resourceKey)
	{
		final BTGAbstractReferenceOperandResource  resource  = resourceCtx.getResource(BTGAbstractReferenceOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAbstractScriptOperandResource} for current root resource 
	 */
	@Path("/btgabstractscriptoperands/{btgabstractscriptoperand}")
	public AbstractYResource getBTGAbstractScriptOperandResource(@PathParam("btgabstractscriptoperand")  final String resourceKey)
	{
		final BTGAbstractScriptOperandResource  resource  = resourceCtx.getResource(BTGAbstractScriptOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAbstractWCMSOperandResource} for current root resource 
	 */
	@Path("/btgabstractwcmsoperands/{btgabstractwcmsoperand}")
	public AbstractYResource getBTGAbstractWCMSOperandResource(@PathParam("btgabstractwcmsoperand")  final String resourceKey)
	{
		final BTGAbstractWCMSOperandResource  resource  = resourceCtx.getResource(BTGAbstractWCMSOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGAssignToGroupDefinitionResource} for current root resource 
	 */
	@Path("/btgassigntogroupdefinitions/{btgassigntogroupdefinition}")
	public AbstractYResource getBTGAssignToGroupDefinitionResource(@PathParam("btgassigntogroupdefinition")  final String resourceKey)
	{
		final BTGAssignToGroupDefinitionResource  resource  = resourceCtx.getResource(BTGAssignToGroupDefinitionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGBooleanLiteralOperandResource} for current root resource 
	 */
	@Path("/btgbooleanliteraloperands/{btgbooleanliteraloperand}")
	public AbstractYResource getBTGBooleanLiteralOperandResource(@PathParam("btgbooleanliteraloperand")  final String resourceKey)
	{
		final BTGBooleanLiteralOperandResource  resource  = resourceCtx.getResource(BTGBooleanLiteralOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGCartIsEmptyOperandResource} for current root resource 
	 */
	@Path("/btgcartisemptyoperands/{btgcartisemptyoperand}")
	public AbstractYResource getBTGCartIsEmptyOperandResource(@PathParam("btgcartisemptyoperand")  final String resourceKey)
	{
		final BTGCartIsEmptyOperandResource  resource  = resourceCtx.getResource(BTGCartIsEmptyOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGCartTotalSumOperandResource} for current root resource 
	 */
	@Path("/btgcarttotalsumoperands/{btgcarttotalsumoperand}")
	public AbstractYResource getBTGCartTotalSumOperandResource(@PathParam("btgcarttotalsumoperand")  final String resourceKey)
	{
		final BTGCartTotalSumOperandResource  resource  = resourceCtx.getResource(BTGCartTotalSumOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGCategoriesInCartOperandResource} for current root resource 
	 */
	@Path("/btgcategoriesincartoperands/{btgcategoriesincartoperand}")
	public AbstractYResource getBTGCategoriesInCartOperandResource(@PathParam("btgcategoriesincartoperand")  final String resourceKey)
	{
		final BTGCategoriesInCartOperandResource  resource  = resourceCtx.getResource(BTGCategoriesInCartOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGCategoriesInOrdersOperandResource} for current root resource 
	 */
	@Path("/btgcategoriesinordersoperands/{btgcategoriesinordersoperand}")
	public AbstractYResource getBTGCategoriesInOrdersOperandResource(@PathParam("btgcategoriesinordersoperand")  final String resourceKey)
	{
		final BTGCategoriesInOrdersOperandResource  resource  = resourceCtx.getResource(BTGCategoriesInOrdersOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGConditionResource} for current root resource 
	 */
	@Path("/btgconditions/{btgcondition}")
	public AbstractYResource getBTGConditionResource(@PathParam("btgcondition")  final String resourceKey)
	{
		final BTGConditionResource  resource  = resourceCtx.getResource(BTGConditionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGDoubleLiteralOperandResource} for current root resource 
	 */
	@Path("/btgdoubleliteraloperands/{btgdoubleliteraloperand}")
	public AbstractYResource getBTGDoubleLiteralOperandResource(@PathParam("btgdoubleliteraloperand")  final String resourceKey)
	{
		final BTGDoubleLiteralOperandResource  resource  = resourceCtx.getResource(BTGDoubleLiteralOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGEachOrderTotalSumOperandResource} for current root resource 
	 */
	@Path("/btgeachordertotalsumoperands/{btgeachordertotalsumoperand}")
	public AbstractYResource getBTGEachOrderTotalSumOperandResource(@PathParam("btgeachordertotalsumoperand")  final String resourceKey)
	{
		final BTGEachOrderTotalSumOperandResource  resource  = resourceCtx.getResource(BTGEachOrderTotalSumOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGExpressionResource} for current root resource 
	 */
	@Path("/btgexpressions/{btgexpression}")
	public AbstractYResource getBTGExpressionResource(@PathParam("btgexpression")  final String resourceKey)
	{
		final BTGExpressionResource  resource  = resourceCtx.getResource(BTGExpressionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGGenderEnumLiteralOperandResource} for current root resource 
	 */
	@Path("/btggenderenumliteraloperands/{btggenderenumliteraloperand}")
	public AbstractYResource getBTGGenderEnumLiteralOperandResource(@PathParam("btggenderenumliteraloperand")  final String resourceKey)
	{
		final BTGGenderEnumLiteralOperandResource  resource  = resourceCtx.getResource(BTGGenderEnumLiteralOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGGenericOperandResource} for current root resource 
	 */
	@Path("/btggenericoperands/{btggenericoperand}")
	public AbstractYResource getBTGGenericOperandResource(@PathParam("btggenericoperand")  final String resourceKey)
	{
		final BTGGenericOperandResource  resource  = resourceCtx.getResource(BTGGenericOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGIntegerLiteralOperandResource} for current root resource 
	 */
	@Path("/btgintegerliteraloperands/{btgintegerliteraloperand}")
	public AbstractYResource getBTGIntegerLiteralOperandResource(@PathParam("btgintegerliteraloperand")  final String resourceKey)
	{
		final BTGIntegerLiteralOperandResource  resource  = resourceCtx.getResource(BTGIntegerLiteralOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGItemResource} for current root resource 
	 */
	@Path("/btgitems/{btgitem}")
	public AbstractYResource getBTGItemResource(@PathParam("btgitem")  final String resourceKey)
	{
		final BTGItemResource  resource  = resourceCtx.getResource(BTGItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGLastOrderDateOperandResource} for current root resource 
	 */
	@Path("/btglastorderdateoperands/{btglastorderdateoperand}")
	public AbstractYResource getBTGLastOrderDateOperandResource(@PathParam("btglastorderdateoperand")  final String resourceKey)
	{
		final BTGLastOrderDateOperandResource  resource  = resourceCtx.getResource(BTGLastOrderDateOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGLastOrdersOperandResource} for current root resource 
	 */
	@Path("/btglastordersoperands/{btglastordersoperand}")
	public AbstractYResource getBTGLastOrdersOperandResource(@PathParam("btglastordersoperand")  final String resourceKey)
	{
		final BTGLastOrdersOperandResource  resource  = resourceCtx.getResource(BTGLastOrdersOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGLastOrdersPriceOperandResource} for current root resource 
	 */
	@Path("/btglastorderspriceoperands/{btglastorderspriceoperand}")
	public AbstractYResource getBTGLastOrdersPriceOperandResource(@PathParam("btglastorderspriceoperand")  final String resourceKey)
	{
		final BTGLastOrdersPriceOperandResource  resource  = resourceCtx.getResource(BTGLastOrdersPriceOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGMediaScriptOperandResource} for current root resource 
	 */
	@Path("/btgmediascriptoperands/{btgmediascriptoperand}")
	public AbstractYResource getBTGMediaScriptOperandResource(@PathParam("btgmediascriptoperand")  final String resourceKey)
	{
		final BTGMediaScriptOperandResource  resource  = resourceCtx.getResource(BTGMediaScriptOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGNumberOfOrdersOperandResource} for current root resource 
	 */
	@Path("/btgnumberofordersoperands/{btgnumberofordersoperand}")
	public AbstractYResource getBTGNumberOfOrdersOperandResource(@PathParam("btgnumberofordersoperand")  final String resourceKey)
	{
		final BTGNumberOfOrdersOperandResource  resource  = resourceCtx.getResource(BTGNumberOfOrdersOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGNumberOfOrdersRelativeDateOperandResource} for current root resource 
	 */
	@Path("/btgnumberofordersrelativedateoperands/{btgnumberofordersrelativedateoperand}")
	public AbstractYResource getBTGNumberOfOrdersRelativeDateOperandResource(@PathParam("btgnumberofordersrelativedateoperand")  final String resourceKey)
	{
		final BTGNumberOfOrdersRelativeDateOperandResource  resource  = resourceCtx.getResource(BTGNumberOfOrdersRelativeDateOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGOperandResource} for current root resource 
	 */
	@Path("/btgoperands/{btgoperand}")
	public AbstractYResource getBTGOperandResource(@PathParam("btgoperand")  final String resourceKey)
	{
		final BTGOperandResource  resource  = resourceCtx.getResource(BTGOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGOperatorResource} for current root resource 
	 */
	@Path("/btgoperators/{btgoperator}")
	public AbstractYResource getBTGOperatorResource(@PathParam("btgoperator")  final String resourceKey)
	{
		final BTGOperatorResource  resource  = resourceCtx.getResource(BTGOperatorResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGOrderTotalSumOperandResource} for current root resource 
	 */
	@Path("/btgordertotalsumoperands/{btgordertotalsumoperand}")
	public AbstractYResource getBTGOrderTotalSumOperandResource(@PathParam("btgordertotalsumoperand")  final String resourceKey)
	{
		final BTGOrderTotalSumOperandResource  resource  = resourceCtx.getResource(BTGOrderTotalSumOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGOutputActionDefinitionResource} for current root resource 
	 */
	@Path("/btgoutputactiondefinitions/{btgoutputactiondefinition}")
	public AbstractYResource getBTGOutputActionDefinitionResource(@PathParam("btgoutputactiondefinition")  final String resourceKey)
	{
		final BTGOutputActionDefinitionResource  resource  = resourceCtx.getResource(BTGOutputActionDefinitionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGProductsInCartOperandResource} for current root resource 
	 */
	@Path("/btgproductsincartoperands/{btgproductsincartoperand}")
	public AbstractYResource getBTGProductsInCartOperandResource(@PathParam("btgproductsincartoperand")  final String resourceKey)
	{
		final BTGProductsInCartOperandResource  resource  = resourceCtx.getResource(BTGProductsInCartOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGProductsInOrdersOperandResource} for current root resource 
	 */
	@Path("/btgproductsinordersoperands/{btgproductsinordersoperand}")
	public AbstractYResource getBTGProductsInOrdersOperandResource(@PathParam("btgproductsinordersoperand")  final String resourceKey)
	{
		final BTGProductsInOrdersOperandResource  resource  = resourceCtx.getResource(BTGProductsInOrdersOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGQuantityOfProductInCartOperandResource} for current root resource 
	 */
	@Path("/btgquantityofproductincartoperands/{btgquantityofproductincartoperand}")
	public AbstractYResource getBTGQuantityOfProductInCartOperandResource(@PathParam("btgquantityofproductincartoperand")  final String resourceKey)
	{
		final BTGQuantityOfProductInCartOperandResource  resource  = resourceCtx.getResource(BTGQuantityOfProductInCartOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferalUrlOperandResource} for current root resource 
	 */
	@Path("/btgreferalurloperands/{btgreferalurloperand}")
	public AbstractYResource getBTGReferalUrlOperandResource(@PathParam("btgreferalurloperand")  final String resourceKey)
	{
		final BTGReferalUrlOperandResource  resource  = resourceCtx.getResource(BTGReferalUrlOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceCategoriesOperandResource} for current root resource 
	 */
	@Path("/btgreferencecategoriesoperands/{btgreferencecategoriesoperand}")
	public AbstractYResource getBTGReferenceCategoriesOperandResource(@PathParam("btgreferencecategoriesoperand")  final String resourceKey)
	{
		final BTGReferenceCategoriesOperandResource  resource  = resourceCtx.getResource(BTGReferenceCategoriesOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceContentpagesOperandResource} for current root resource 
	 */
	@Path("/btgreferencecontentpagesoperands/{btgreferencecontentpagesoperand}")
	public AbstractYResource getBTGReferenceContentpagesOperandResource(@PathParam("btgreferencecontentpagesoperand")  final String resourceKey)
	{
		final BTGReferenceContentpagesOperandResource  resource  = resourceCtx.getResource(BTGReferenceContentpagesOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceCountriesOperandResource} for current root resource 
	 */
	@Path("/btgreferencecountriesoperands/{btgreferencecountriesoperand}")
	public AbstractYResource getBTGReferenceCountriesOperandResource(@PathParam("btgreferencecountriesoperand")  final String resourceKey)
	{
		final BTGReferenceCountriesOperandResource  resource  = resourceCtx.getResource(BTGReferenceCountriesOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceDateOperandResource} for current root resource 
	 */
	@Path("/btgreferencedateoperands/{btgreferencedateoperand}")
	public AbstractYResource getBTGReferenceDateOperandResource(@PathParam("btgreferencedateoperand")  final String resourceKey)
	{
		final BTGReferenceDateOperandResource  resource  = resourceCtx.getResource(BTGReferenceDateOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceExactDateOperandResource} for current root resource 
	 */
	@Path("/btgreferenceexactdateoperands/{btgreferenceexactdateoperand}")
	public AbstractYResource getBTGReferenceExactDateOperandResource(@PathParam("btgreferenceexactdateoperand")  final String resourceKey)
	{
		final BTGReferenceExactDateOperandResource  resource  = resourceCtx.getResource(BTGReferenceExactDateOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceKeyValuePairListOperandResource} for current root resource 
	 */
	@Path("/btgreferencekeyvaluepairlistoperands/{btgreferencekeyvaluepairlistoperand}")
	public AbstractYResource getBTGReferenceKeyValuePairListOperandResource(@PathParam("btgreferencekeyvaluepairlistoperand")  final String resourceKey)
	{
		final BTGReferenceKeyValuePairListOperandResource  resource  = resourceCtx.getResource(BTGReferenceKeyValuePairListOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferencePriceOperandResource} for current root resource 
	 */
	@Path("/btgreferencepriceoperands/{btgreferencepriceoperand}")
	public AbstractYResource getBTGReferencePriceOperandResource(@PathParam("btgreferencepriceoperand")  final String resourceKey)
	{
		final BTGReferencePriceOperandResource  resource  = resourceCtx.getResource(BTGReferencePriceOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferencePrincipalGroupsOperandResource} for current root resource 
	 */
	@Path("/btgreferenceprincipalgroupsoperands/{btgreferenceprincipalgroupsoperand}")
	public AbstractYResource getBTGReferencePrincipalGroupsOperandResource(@PathParam("btgreferenceprincipalgroupsoperand")  final String resourceKey)
	{
		final BTGReferencePrincipalGroupsOperandResource  resource  = resourceCtx.getResource(BTGReferencePrincipalGroupsOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceProductsOperandResource} for current root resource 
	 */
	@Path("/btgreferenceproductsoperands/{btgreferenceproductsoperand}")
	public AbstractYResource getBTGReferenceProductsOperandResource(@PathParam("btgreferenceproductsoperand")  final String resourceKey)
	{
		final BTGReferenceProductsOperandResource  resource  = resourceCtx.getResource(BTGReferenceProductsOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceRegExpListOperandResource} for current root resource 
	 */
	@Path("/btgreferenceregexplistoperands/{btgreferenceregexplistoperand}")
	public AbstractYResource getBTGReferenceRegExpListOperandResource(@PathParam("btgreferenceregexplistoperand")  final String resourceKey)
	{
		final BTGReferenceRegExpListOperandResource  resource  = resourceCtx.getResource(BTGReferenceRegExpListOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGReferenceStringListOperandResource} for current root resource 
	 */
	@Path("/btgreferencestringlistoperands/{btgreferencestringlistoperand}")
	public AbstractYResource getBTGReferenceStringListOperandResource(@PathParam("btgreferencestringlistoperand")  final String resourceKey)
	{
		final BTGReferenceStringListOperandResource  resource  = resourceCtx.getResource(BTGReferenceStringListOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGRuleResource} for current root resource 
	 */
	@Path("/btgrules/{btgrule}")
	public AbstractYResource getBTGRuleResource(@PathParam("btgrule")  final String resourceKey)
	{
		final BTGRuleResource  resource  = resourceCtx.getResource(BTGRuleResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGSegmentResource} for current root resource 
	 */
	@Path("/btgsegments/{btgsegment}")
	public AbstractYResource getBTGSegmentResource(@PathParam("btgsegment")  final String resourceKey)
	{
		final BTGSegmentResource  resource  = resourceCtx.getResource(BTGSegmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BtgSegmentRestrictionResource} for current root resource 
	 */
	@Path("/btgsegmentrestrictions/{btgsegmentrestriction}")
	public AbstractYResource getBtgSegmentRestrictionResource(@PathParam("btgsegmentrestriction")  final String resourceKey)
	{
		final BtgSegmentRestrictionResource  resource  = resourceCtx.getResource(BtgSegmentRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGStringLiteralOperandResource} for current root resource 
	 */
	@Path("/btgstringliteraloperands/{btgstringliteraloperand}")
	public AbstractYResource getBTGStringLiteralOperandResource(@PathParam("btgstringliteraloperand")  final String resourceKey)
	{
		final BTGStringLiteralOperandResource  resource  = resourceCtx.getResource(BTGStringLiteralOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGStringScriptOperandResource} for current root resource 
	 */
	@Path("/btgstringscriptoperands/{btgstringscriptoperand}")
	public AbstractYResource getBTGStringScriptOperandResource(@PathParam("btgstringscriptoperand")  final String resourceKey)
	{
		final BTGStringScriptOperandResource  resource  = resourceCtx.getResource(BTGStringScriptOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGUrlParameterOperandResource} for current root resource 
	 */
	@Path("/btgurlparameteroperands/{btgurlparameteroperand}")
	public AbstractYResource getBTGUrlParameterOperandResource(@PathParam("btgurlparameteroperand")  final String resourceKey)
	{
		final BTGUrlParameterOperandResource  resource  = resourceCtx.getResource(BTGUrlParameterOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGUserAddressPostalCodeOperandResource} for current root resource 
	 */
	@Path("/btguseraddresspostalcodeoperands/{btguseraddresspostalcodeoperand}")
	public AbstractYResource getBTGUserAddressPostalCodeOperandResource(@PathParam("btguseraddresspostalcodeoperand")  final String resourceKey)
	{
		final BTGUserAddressPostalCodeOperandResource  resource  = resourceCtx.getResource(BTGUserAddressPostalCodeOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGUserCountryOperandResource} for current root resource 
	 */
	@Path("/btgusercountryoperands/{btgusercountryoperand}")
	public AbstractYResource getBTGUserCountryOperandResource(@PathParam("btgusercountryoperand")  final String resourceKey)
	{
		final BTGUserCountryOperandResource  resource  = resourceCtx.getResource(BTGUserCountryOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGUserGenderOperandResource} for current root resource 
	 */
	@Path("/btgusergenderoperands/{btgusergenderoperand}")
	public AbstractYResource getBTGUserGenderOperandResource(@PathParam("btgusergenderoperand")  final String resourceKey)
	{
		final BTGUserGenderOperandResource  resource  = resourceCtx.getResource(BTGUserGenderOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGUserMemberOfGroupsOperandResource} for current root resource 
	 */
	@Path("/btgusermemberofgroupsoperands/{btgusermemberofgroupsoperand}")
	public AbstractYResource getBTGUserMemberOfGroupsOperandResource(@PathParam("btgusermemberofgroupsoperand")  final String resourceKey)
	{
		final BTGUserMemberOfGroupsOperandResource  resource  = resourceCtx.getResource(BTGUserMemberOfGroupsOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGViewedCategoriesOperandResource} for current root resource 
	 */
	@Path("/btgviewedcategoriesoperands/{btgviewedcategoriesoperand}")
	public AbstractYResource getBTGViewedCategoriesOperandResource(@PathParam("btgviewedcategoriesoperand")  final String resourceKey)
	{
		final BTGViewedCategoriesOperandResource  resource  = resourceCtx.getResource(BTGViewedCategoriesOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGViewedProductsOperandResource} for current root resource 
	 */
	@Path("/btgviewedproductsoperands/{btgviewedproductsoperand}")
	public AbstractYResource getBTGViewedProductsOperandResource(@PathParam("btgviewedproductsoperand")  final String resourceKey)
	{
		final BTGViewedProductsOperandResource  resource  = resourceCtx.getResource(BTGViewedProductsOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link BTGVisitedContentpagesOperandResource} for current root resource 
	 */
	@Path("/btgvisitedcontentpagesoperands/{btgvisitedcontentpagesoperand}")
	public AbstractYResource getBTGVisitedContentpagesOperandResource(@PathParam("btgvisitedcontentpagesoperand")  final String resourceKey)
	{
		final BTGVisitedContentpagesOperandResource  resource  = resourceCtx.getResource(BTGVisitedContentpagesOperandResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogPageResource} for current root resource 
	 */
	@Path("/catalogpages/{catalogpage}")
	public AbstractYResource getCatalogPageResource(@PathParam("catalogpage")  final String resourceKey)
	{
		final CatalogPageResource  resource  = resourceCtx.getResource(CatalogPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogUnawareMediaResource} for current root resource 
	 */
	@Path("/catalogunawaremedias/{catalogunawaremedia}")
	public AbstractYResource getCatalogUnawareMediaResource(@PathParam("catalogunawaremedia")  final String resourceKey)
	{
		final CatalogUnawareMediaResource  resource  = resourceCtx.getResource(CatalogUnawareMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering GET requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@GET
	public Response getCatalogVersion()
	{
		return createGetResponse().build();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogVersionDifferenceResource} for current root resource 
	 */
	@Path("/catalogversiondifferences/{catalogversiondifference}")
	public AbstractYResource getCatalogVersionDifferenceResource(@PathParam("catalogversiondifference")  final String resourceKey)
	{
		final CatalogVersionDifferenceResource  resource  = resourceCtx.getResource(CatalogVersionDifferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Convenience method which just delegates to {@link #getResourceValue()}
	 */
	public CatalogVersionModel getCatalogVersionModel()
	{
		return super.getResourceValue();
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CatalogVersionSyncScheduleMediaResource} for current root resource 
	 */
	@Path("/catalogversionsyncschedulemedias/{catalogversionsyncschedulemedia}")
	public AbstractYResource getCatalogVersionSyncScheduleMediaResource(@PathParam("catalogversionsyncschedulemedia")  final String resourceKey)
	{
		final CatalogVersionSyncScheduleMediaResource  resource  = resourceCtx.getResource(CatalogVersionSyncScheduleMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CategoryCatalogVersionDifferenceResource} for current root resource 
	 */
	@Path("/categorycatalogversiondifferences/{categorycatalogversiondifference}")
	public AbstractYResource getCategoryCatalogVersionDifferenceResource(@PathParam("categorycatalogversiondifference")  final String resourceKey)
	{
		final CategoryCatalogVersionDifferenceResource  resource  = resourceCtx.getResource(CategoryCatalogVersionDifferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CategoryFeatureComponentResource} for current root resource 
	 */
	@Path("/categoryfeaturecomponents/{categoryfeaturecomponent}")
	public AbstractYResource getCategoryFeatureComponentResource(@PathParam("categoryfeaturecomponent")  final String resourceKey)
	{
		final CategoryFeatureComponentResource  resource  = resourceCtx.getResource(CategoryFeatureComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CategoryPageResource} for current root resource 
	 */
	@Path("/categorypages/{categorypage}")
	public AbstractYResource getCategoryPageResource(@PathParam("categorypage")  final String resourceKey)
	{
		final CategoryPageResource  resource  = resourceCtx.getResource(CategoryPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CategoryResource} for current root resource 
	 */
	@Path("/categories/{category}")
	public AbstractYResource getCategoryResource(@PathParam("category")  final String resourceKey)
	{
		final CategoryResource  resource  = resourceCtx.getResource(CategoryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationClassResource} for current root resource 
	 */
	@Path("/classificationclasses/{classificationclass}")
	public AbstractYResource getClassificationClassResource(@PathParam("classificationclass")  final String resourceKey)
	{
		final ClassificationClassResource  resource  = resourceCtx.getResource(ClassificationClassResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ClassificationKeywordResource} for current root resource 
	 */
	@Path("/classificationkeywords/{classificationkeyword}")
	public AbstractYResource getClassificationKeywordResource(@PathParam("classificationkeyword")  final String resourceKey)
	{
		final ClassificationKeywordResource  resource  = resourceCtx.getResource(ClassificationKeywordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSCatalogRestrictionResource} for current root resource 
	 */
	@Path("/cmscatalogrestrictions/{cmscatalogrestriction}")
	public AbstractYResource getCMSCatalogRestrictionResource(@PathParam("cmscatalogrestriction")  final String resourceKey)
	{
		final CMSCatalogRestrictionResource  resource  = resourceCtx.getResource(CMSCatalogRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSCategoryRestrictionResource} for current root resource 
	 */
	@Path("/cmscategoryrestrictions/{cmscategoryrestriction}")
	public AbstractYResource getCMSCategoryRestrictionResource(@PathParam("cmscategoryrestriction")  final String resourceKey)
	{
		final CMSCategoryRestrictionResource  resource  = resourceCtx.getResource(CMSCategoryRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSImageComponentResource} for current root resource 
	 */
	@Path("/cmsimagecomponents/{cmsimagecomponent}")
	public AbstractYResource getCMSImageComponentResource(@PathParam("cmsimagecomponent")  final String resourceKey)
	{
		final CMSImageComponentResource  resource  = resourceCtx.getResource(CMSImageComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSInverseRestrictionResource} for current root resource 
	 */
	@Path("/cmsinverserestrictions/{cmsinverserestriction}")
	public AbstractYResource getCMSInverseRestrictionResource(@PathParam("cmsinverserestriction")  final String resourceKey)
	{
		final CMSInverseRestrictionResource  resource  = resourceCtx.getResource(CMSInverseRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSItemResource} for current root resource 
	 */
	@Path("/cmsitems/{cmsitem}")
	public AbstractYResource getCMSItemResource(@PathParam("cmsitem")  final String resourceKey)
	{
		final CMSItemResource  resource  = resourceCtx.getResource(CMSItemResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSLinkComponentResource} for current root resource 
	 */
	@Path("/cmslinkcomponents/{cmslinkcomponent}")
	public AbstractYResource getCMSLinkComponentResource(@PathParam("cmslinkcomponent")  final String resourceKey)
	{
		final CMSLinkComponentResource  resource  = resourceCtx.getResource(CMSLinkComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSNavigationEntryResource} for current root resource 
	 */
	@Path("/cmsnavigationentries/{cmsnavigationentry}")
	public AbstractYResource getCMSNavigationEntryResource(@PathParam("cmsnavigationentry")  final String resourceKey)
	{
		final CMSNavigationEntryResource  resource  = resourceCtx.getResource(CMSNavigationEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSNavigationNodeResource} for current root resource 
	 */
	@Path("/cmsnavigationnodes/{cmsnavigationnode}")
	public AbstractYResource getCMSNavigationNodeResource(@PathParam("cmsnavigationnode")  final String resourceKey)
	{
		final CMSNavigationNodeResource  resource  = resourceCtx.getResource(CMSNavigationNodeResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSParagraphComponentResource} for current root resource 
	 */
	@Path("/cmsparagraphcomponents/{cmsparagraphcomponent}")
	public AbstractYResource getCMSParagraphComponentResource(@PathParam("cmsparagraphcomponent")  final String resourceKey)
	{
		final CMSParagraphComponentResource  resource  = resourceCtx.getResource(CMSParagraphComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSProductRestrictionResource} for current root resource 
	 */
	@Path("/cmsproductrestrictions/{cmsproductrestriction}")
	public AbstractYResource getCMSProductRestrictionResource(@PathParam("cmsproductrestriction")  final String resourceKey)
	{
		final CMSProductRestrictionResource  resource  = resourceCtx.getResource(CMSProductRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSRelationResource} for current root resource 
	 */
	@Path("/cmsrelations/{cmsrelation}")
	public AbstractYResource getCMSRelationResource(@PathParam("cmsrelation")  final String resourceKey)
	{
		final CMSRelationResource  resource  = resourceCtx.getResource(CMSRelationResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CmsRestrictionActionDefinitionResource} for current root resource 
	 */
	@Path("/cmsrestrictionactiondefinitions/{cmsrestrictionactiondefinition}")
	public AbstractYResource getCmsRestrictionActionDefinitionResource(@PathParam("cmsrestrictionactiondefinition")  final String resourceKey)
	{
		final CmsRestrictionActionDefinitionResource  resource  = resourceCtx.getResource(CmsRestrictionActionDefinitionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSTabParagraphComponentResource} for current root resource 
	 */
	@Path("/cmstabparagraphcomponents/{cmstabparagraphcomponent}")
	public AbstractYResource getCMSTabParagraphComponentResource(@PathParam("cmstabparagraphcomponent")  final String resourceKey)
	{
		final CMSTabParagraphComponentResource  resource  = resourceCtx.getResource(CMSTabParagraphComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSTabParagraphContainerResource} for current root resource 
	 */
	@Path("/cmstabparagraphcontainers/{cmstabparagraphcontainer}")
	public AbstractYResource getCMSTabParagraphContainerResource(@PathParam("cmstabparagraphcontainer")  final String resourceKey)
	{
		final CMSTabParagraphContainerResource  resource  = resourceCtx.getResource(CMSTabParagraphContainerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSTimeRestrictionResource} for current root resource 
	 */
	@Path("/cmstimerestrictions/{cmstimerestriction}")
	public AbstractYResource getCMSTimeRestrictionResource(@PathParam("cmstimerestriction")  final String resourceKey)
	{
		final CMSTimeRestrictionResource  resource  = resourceCtx.getResource(CMSTimeRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSUiExperienceRestrictionResource} for current root resource 
	 */
	@Path("/cmsuiexperiencerestrictions/{cmsuiexperiencerestriction}")
	public AbstractYResource getCMSUiExperienceRestrictionResource(@PathParam("cmsuiexperiencerestriction")  final String resourceKey)
	{
		final CMSUiExperienceRestrictionResource  resource  = resourceCtx.getResource(CMSUiExperienceRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSUserGroupRestrictionResource} for current root resource 
	 */
	@Path("/cmsusergrouprestrictions/{cmsusergrouprestriction}")
	public AbstractYResource getCMSUserGroupRestrictionResource(@PathParam("cmsusergrouprestriction")  final String resourceKey)
	{
		final CMSUserGroupRestrictionResource  resource  = resourceCtx.getResource(CMSUserGroupRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CMSUserRestrictionResource} for current root resource 
	 */
	@Path("/cmsuserrestrictions/{cmsuserrestriction}")
	public AbstractYResource getCMSUserRestrictionResource(@PathParam("cmsuserrestriction")  final String resourceKey)
	{
		final CMSUserRestrictionResource  resource  = resourceCtx.getResource(CMSUserRestrictionResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitUIConfigurationMediaResource} for current root resource 
	 */
	@Path("/cockpituiconfigurationmedias/{cockpituiconfigurationmedia}")
	public AbstractYResource getCockpitUIConfigurationMediaResource(@PathParam("cockpituiconfigurationmedia")  final String resourceKey)
	{
		final CockpitUIConfigurationMediaResource  resource  = resourceCtx.getResource(CockpitUIConfigurationMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CockpitUIScriptConfigMediaResource} for current root resource 
	 */
	@Path("/cockpituiscriptconfigmedias/{cockpituiscriptconfigmedia}")
	public AbstractYResource getCockpitUIScriptConfigMediaResource(@PathParam("cockpituiscriptconfigmedia")  final String resourceKey)
	{
		final CockpitUIScriptConfigMediaResource  resource  = resourceCtx.getResource(CockpitUIScriptConfigMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CompareCatalogVersionsCronJobResource} for current root resource 
	 */
	@Path("/comparecatalogversionscronjobs/{comparecatalogversionscronjob}")
	public AbstractYResource getCompareCatalogVersionsCronJobResource(@PathParam("comparecatalogversionscronjob")  final String resourceKey)
	{
		final CompareCatalogVersionsCronJobResource  resource  = resourceCtx.getResource(CompareCatalogVersionsCronJobResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CompiledJasperMediaResource} for current root resource 
	 */
	@Path("/compiledjaspermedias/{compiledjaspermedia}")
	public AbstractYResource getCompiledJasperMediaResource(@PathParam("compiledjaspermedia")  final String resourceKey)
	{
		final CompiledJasperMediaResource  resource  = resourceCtx.getResource(CompiledJasperMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ConfigurationMediaResource} for current root resource 
	 */
	@Path("/configurationmedias/{configurationmedia}")
	public AbstractYResource getConfigurationMediaResource(@PathParam("configurationmedia")  final String resourceKey)
	{
		final ConfigurationMediaResource  resource  = resourceCtx.getResource(ConfigurationMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ContentPageResource} for current root resource 
	 */
	@Path("/contentpages/{contentpage}")
	public AbstractYResource getContentPageResource(@PathParam("contentpage")  final String resourceKey)
	{
		final ContentPageResource  resource  = resourceCtx.getResource(ContentPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ContentSlotForPageResource} for current root resource 
	 */
	@Path("/contentslotforpages/{contentslotforpage}")
	public AbstractYResource getContentSlotForPageResource(@PathParam("contentslotforpage")  final String resourceKey)
	{
		final ContentSlotForPageResource  resource  = resourceCtx.getResource(ContentSlotForPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ContentSlotForTemplateResource} for current root resource 
	 */
	@Path("/contentslotfortemplates/{contentslotfortemplate}")
	public AbstractYResource getContentSlotForTemplateResource(@PathParam("contentslotfortemplate")  final String resourceKey)
	{
		final ContentSlotForTemplateResource  resource  = resourceCtx.getResource(ContentSlotForTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ContentSlotResource} for current root resource 
	 */
	@Path("/contentslots/{contentslot}")
	public AbstractYResource getContentSlotResource(@PathParam("contentslot")  final String resourceKey)
	{
		final ContentSlotResource  resource  = resourceCtx.getResource(ContentSlotResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link CustomOrder2XMLResource} for current root resource 
	 */
	@Path("/customorder2xmls/{customorder2xml}")
	public AbstractYResource getCustomOrder2XMLResource(@PathParam("customorder2xml")  final String resourceKey)
	{
		final CustomOrder2XMLResource  resource  = resourceCtx.getResource(CustomOrder2XMLResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DocumentResource} for current root resource 
	 */
	@Path("/documents/{document}")
	public AbstractYResource getDocumentResource(@PathParam("document")  final String resourceKey)
	{
		final DocumentResource  resource  = resourceCtx.getResource(DocumentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link DynamicBannerComponentResource} for current root resource 
	 */
	@Path("/dynamicbannercomponents/{dynamicbannercomponent}")
	public AbstractYResource getDynamicBannerComponentResource(@PathParam("dynamicbannercomponent")  final String resourceKey)
	{
		final DynamicBannerComponentResource  resource  = resourceCtx.getResource(DynamicBannerComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EmailAttachmentResource} for current root resource 
	 */
	@Path("/emailattachments/{emailattachment}")
	public AbstractYResource getEmailAttachmentResource(@PathParam("emailattachment")  final String resourceKey)
	{
		final EmailAttachmentResource  resource  = resourceCtx.getResource(EmailAttachmentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EmailPageResource} for current root resource 
	 */
	@Path("/emailpages/{emailpage}")
	public AbstractYResource getEmailPageResource(@PathParam("emailpage")  final String resourceKey)
	{
		final EmailPageResource  resource  = resourceCtx.getResource(EmailPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link EmailPageTemplateResource} for current root resource 
	 */
	@Path("/emailpagetemplates/{emailpagetemplate}")
	public AbstractYResource getEmailPageTemplateResource(@PathParam("emailpagetemplate")  final String resourceKey)
	{
		final EmailPageTemplateResource  resource  = resourceCtx.getResource(EmailPageTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FlashComponentResource} for current root resource 
	 */
	@Path("/flashcomponents/{flashcomponent}")
	public AbstractYResource getFlashComponentResource(@PathParam("flashcomponent")  final String resourceKey)
	{
		final FlashComponentResource  resource  = resourceCtx.getResource(FlashComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FooterComponentResource} for current root resource 
	 */
	@Path("/footercomponents/{footercomponent}")
	public AbstractYResource getFooterComponentResource(@PathParam("footercomponent")  final String resourceKey)
	{
		final FooterComponentResource  resource  = resourceCtx.getResource(FooterComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FOPFormatterResource} for current root resource 
	 */
	@Path("/fopformatters/{fopformatter}")
	public AbstractYResource getFOPFormatterResource(@PathParam("fopformatter")  final String resourceKey)
	{
		final FOPFormatterResource  resource  = resourceCtx.getResource(FOPFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link FormatterResource} for current root resource 
	 */
	@Path("/formatters/{formatter}")
	public AbstractYResource getFormatterResource(@PathParam("formatter")  final String resourceKey)
	{
		final FormatterResource  resource  = resourceCtx.getResource(FormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HeaderLibraryResource} for current root resource 
	 */
	@Path("/headerlibraries/{headerlibrary}")
	public AbstractYResource getHeaderLibraryResource(@PathParam("headerlibrary")  final String resourceKey)
	{
		final HeaderLibraryResource  resource  = resourceCtx.getResource(HeaderLibraryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link HMCHistoryEntryResource} for current root resource 
	 */
	@Path("/hmchistoryentries/{hmchistoryentry}")
	public AbstractYResource getHMCHistoryEntryResource(@PathParam("hmchistoryentry")  final String resourceKey)
	{
		final HMCHistoryEntryResource  resource  = resourceCtx.getResource(HMCHistoryEntryResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImageMapComponentResource} for current root resource 
	 */
	@Path("/imagemapcomponents/{imagemapcomponent}")
	public AbstractYResource getImageMapComponentResource(@PathParam("imagemapcomponent")  final String resourceKey)
	{
		final ImageMapComponentResource  resource  = resourceCtx.getResource(ImageMapComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImpExExportMediaResource} for current root resource 
	 */
	@Path("/impexexportmedias/{impexexportmedia}")
	public AbstractYResource getImpExExportMediaResource(@PathParam("impexexportmedia")  final String resourceKey)
	{
		final ImpExExportMediaResource  resource  = resourceCtx.getResource(ImpExExportMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ImpExMediaResource} for current root resource 
	 */
	@Path("/impexmedias/{impexmedia}")
	public AbstractYResource getImpExMediaResource(@PathParam("impexmedia")  final String resourceKey)
	{
		final ImpExMediaResource  resource  = resourceCtx.getResource(ImpExMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ItemFormatterResource} for current root resource 
	 */
	@Path("/itemformatters/{itemformatter}")
	public AbstractYResource getItemFormatterResource(@PathParam("itemformatter")  final String resourceKey)
	{
		final ItemFormatterResource  resource  = resourceCtx.getResource(ItemFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link JasperMediaResource} for current root resource 
	 */
	@Path("/jaspermedias/{jaspermedia}")
	public AbstractYResource getJasperMediaResource(@PathParam("jaspermedia")  final String resourceKey)
	{
		final JasperMediaResource  resource  = resourceCtx.getResource(JasperMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link JobMediaResource} for current root resource 
	 */
	@Path("/jobmedias/{jobmedia}")
	public AbstractYResource getJobMediaResource(@PathParam("jobmedia")  final String resourceKey)
	{
		final JobMediaResource  resource  = resourceCtx.getResource(JobMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link KeywordResource} for current root resource 
	 */
	@Path("/keywords/{keyword}")
	public AbstractYResource getKeywordResource(@PathParam("keyword")  final String resourceKey)
	{
		final KeywordResource  resource  = resourceCtx.getResource(KeywordResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LDIFMediaResource} for current root resource 
	 */
	@Path("/ldifmedias/{ldifmedia}")
	public AbstractYResource getLDIFMediaResource(@PathParam("ldifmedia")  final String resourceKey)
	{
		final LDIFMediaResource  resource  = resourceCtx.getResource(LDIFMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LinkResource} for current root resource 
	 */
	@Path("/links/{link}")
	public AbstractYResource getLinkResource(@PathParam("link")  final String resourceKey)
	{
		final LinkResource  resource  = resourceCtx.getResource(LinkResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link LogFileResource} for current root resource 
	 */
	@Path("/logfiles/{logfile}")
	public AbstractYResource getLogFileResource(@PathParam("logfile")  final String resourceKey)
	{
		final LogFileResource  resource  = resourceCtx.getResource(LogFileResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaContainerResource} for current root resource 
	 */
	@Path("/mediacontainers/{mediacontainer}")
	public AbstractYResource getMediaContainerResource(@PathParam("mediacontainer")  final String resourceKey)
	{
		final MediaContainerResource  resource  = resourceCtx.getResource(MediaContainerResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaFormatterResource} for current root resource 
	 */
	@Path("/mediaformatters/{mediaformatter}")
	public AbstractYResource getMediaFormatterResource(@PathParam("mediaformatter")  final String resourceKey)
	{
		final MediaFormatterResource  resource  = resourceCtx.getResource(MediaFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MediaResource} for current root resource 
	 */
	@Path("/medias/{media}")
	public AbstractYResource getMediaResource(@PathParam("media")  final String resourceKey)
	{
		final MediaResource  resource  = resourceCtx.getResource(MediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link MiniCartComponentResource} for current root resource 
	 */
	@Path("/minicartcomponents/{minicartcomponent}")
	public AbstractYResource getMiniCartComponentResource(@PathParam("minicartcomponent")  final String resourceKey)
	{
		final MiniCartComponentResource  resource  = resourceCtx.getResource(MiniCartComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link NavigationBarComponentResource} for current root resource 
	 */
	@Path("/navigationbarcomponents/{navigationbarcomponent}")
	public AbstractYResource getNavigationBarComponentResource(@PathParam("navigationbarcomponent")  final String resourceKey)
	{
		final NavigationBarComponentResource  resource  = resourceCtx.getResource(NavigationBarComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PageTemplateResource} for current root resource 
	 */
	@Path("/pagetemplates/{pagetemplate}")
	public AbstractYResource getPageTemplateResource(@PathParam("pagetemplate")  final String resourceKey)
	{
		final PageTemplateResource  resource  = resourceCtx.getResource(PageTemplateResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductCarouselComponentResource} for current root resource 
	 */
	@Path("/productcarouselcomponents/{productcarouselcomponent}")
	public AbstractYResource getProductCarouselComponentResource(@PathParam("productcarouselcomponent")  final String resourceKey)
	{
		final ProductCarouselComponentResource  resource  = resourceCtx.getResource(ProductCarouselComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductCatalogVersionDifferenceResource} for current root resource 
	 */
	@Path("/productcatalogversiondifferences/{productcatalogversiondifference}")
	public AbstractYResource getProductCatalogVersionDifferenceResource(@PathParam("productcatalogversiondifference")  final String resourceKey)
	{
		final ProductCatalogVersionDifferenceResource  resource  = resourceCtx.getResource(ProductCatalogVersionDifferenceResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductDetailComponentResource} for current root resource 
	 */
	@Path("/productdetailcomponents/{productdetailcomponent}")
	public AbstractYResource getProductDetailComponentResource(@PathParam("productdetailcomponent")  final String resourceKey)
	{
		final ProductDetailComponentResource  resource  = resourceCtx.getResource(ProductDetailComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductFeatureComponentResource} for current root resource 
	 */
	@Path("/productfeaturecomponents/{productfeaturecomponent}")
	public AbstractYResource getProductFeatureComponentResource(@PathParam("productfeaturecomponent")  final String resourceKey)
	{
		final ProductFeatureComponentResource  resource  = resourceCtx.getResource(ProductFeatureComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductListComponentResource} for current root resource 
	 */
	@Path("/productlistcomponents/{productlistcomponent}")
	public AbstractYResource getProductListComponentResource(@PathParam("productlistcomponent")  final String resourceKey)
	{
		final ProductListComponentResource  resource  = resourceCtx.getResource(ProductListComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductPageResource} for current root resource 
	 */
	@Path("/productpages/{productpage}")
	public AbstractYResource getProductPageResource(@PathParam("productpage")  final String resourceKey)
	{
		final ProductPageResource  resource  = resourceCtx.getResource(ProductPageResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductReferencesComponentResource} for current root resource 
	 */
	@Path("/productreferencescomponents/{productreferencescomponent}")
	public AbstractYResource getProductReferencesComponentResource(@PathParam("productreferencescomponent")  final String resourceKey)
	{
		final ProductReferencesComponentResource  resource  = resourceCtx.getResource(ProductReferencesComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ProductResource} for current root resource 
	 */
	@Path("/products/{product}")
	public AbstractYResource getProductResource(@PathParam("product")  final String resourceKey)
	{
		final ProductResource  resource  = resourceCtx.getResource(ProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link PurchasedProductReferencesComponentResource} for current root resource 
	 */
	@Path("/purchasedproductreferencescomponents/{purchasedproductreferencescomponent}")
	public AbstractYResource getPurchasedProductReferencesComponentResource(@PathParam("purchasedproductreferencescomponent")  final String resourceKey)
	{
		final PurchasedProductReferencesComponentResource  resource  = resourceCtx.getResource(PurchasedProductReferencesComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link RotatingImagesComponentResource} for current root resource 
	 */
	@Path("/rotatingimagescomponents/{rotatingimagescomponent}")
	public AbstractYResource getRotatingImagesComponentResource(@PathParam("rotatingimagescomponent")  final String resourceKey)
	{
		final RotatingImagesComponentResource  resource  = resourceCtx.getResource(RotatingImagesComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link ScriptMediaResource} for current root resource 
	 */
	@Path("/scriptmedias/{scriptmedia}")
	public AbstractYResource getScriptMediaResource(@PathParam("scriptmedia")  final String resourceKey)
	{
		final ScriptMediaResource  resource  = resourceCtx.getResource(ScriptMediaResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SimpleBannerComponentResource} for current root resource 
	 */
	@Path("/simplebannercomponents/{simplebannercomponent}")
	public AbstractYResource getSimpleBannerComponentResource(@PathParam("simplebannercomponent")  final String resourceKey)
	{
		final SimpleBannerComponentResource  resource  = resourceCtx.getResource(SimpleBannerComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SimpleCMSComponentResource} for current root resource 
	 */
	@Path("/simplecmscomponents/{simplecmscomponent}")
	public AbstractYResource getSimpleCMSComponentResource(@PathParam("simplecmscomponent")  final String resourceKey)
	{
		final SimpleCMSComponentResource  resource  = resourceCtx.getResource(SimpleCMSComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link SubCategoryListComponentResource} for current root resource 
	 */
	@Path("/subcategorylistcomponents/{subcategorylistcomponent}")
	public AbstractYResource getSubCategoryListComponentResource(@PathParam("subcategorylistcomponent")  final String resourceKey)
	{
		final SubCategoryListComponentResource  resource  = resourceCtx.getResource(SubCategoryListComponentResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VariantProductResource} for current root resource 
	 */
	@Path("/variantproducts/{variantproduct}")
	public AbstractYResource getVariantProductResource(@PathParam("variantproduct")  final String resourceKey)
	{
		final VariantProductResource  resource  = resourceCtx.getResource(VariantProductResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link VelocityFormatterResource} for current root resource 
	 */
	@Path("/velocityformatters/{velocityformatter}")
	public AbstractYResource getVelocityFormatterResource(@PathParam("velocityformatter")  final String resourceKey)
	{
		final VelocityFormatterResource  resource  = resourceCtx.getResource(VelocityFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 *  Generated getter for sub resource of type {@link XMLTransformFormatterResource} for current root resource 
	 */
	@Path("/xmltransformformatters/{xmltransformformatter}")
	public AbstractYResource getXMLTransformFormatterResource(@PathParam("xmltransformformatter")  final String resourceKey)
	{
		final XMLTransformFormatterResource  resource  = resourceCtx.getResource(XMLTransformFormatterResource.class);
		resource.setResourceId(resourceKey );
		resource.setParentResource(this);
		passUniqueMember(resource);
		return resource;
	}
	
	/**
	 * Generated HTTP method for covering PUT requests.
	 * @return {@link javax.ws.rs.core.Response}
	 */
	@PUT
	public Response putCatalogVersion(final CatalogVersionDTO dto)
	{
		return createPutResponse(dto).build();
	}
	
	/**
	 * Gets the {@link CatalogVersionModel} resource which is addressed by current resource request.
	 * @see de.hybris.platform.webservices.AbstractYResource#readResource(String)
	 */
	@Override
	protected CatalogVersionModel readResource(final String resourceId) throws Exception
	{
		CatalogVersionModel model = new CatalogVersionModel();
		model.setVersion(resourceId);
		return (CatalogVersionModel) readResourceInternal(model);
	}
	
	/**
	 * Convenience method which just delegates to {@link #setResourceValue(CatalogVersionModel)}
	 */
	public void setCatalogVersionModel(final CatalogVersionModel value)
	{
		super.setResourceValue(value);
	}
	
}
