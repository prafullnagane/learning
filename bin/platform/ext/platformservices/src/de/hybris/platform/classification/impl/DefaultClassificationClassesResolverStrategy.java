/*
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
package de.hybris.platform.classification.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.classification.ClassAttributeAssignmentModel;
import de.hybris.platform.catalog.model.classification.ClassificationClassModel;
import de.hybris.platform.catalog.model.classification.ClassificationSystemVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.classification.ClassificationClassesResolverStrategy;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.variants.model.VariantProductModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;


/**
 * Implementation of of the {@link ClassificationClassesResolverStrategy}.
 */
public class DefaultClassificationClassesResolverStrategy implements ClassificationClassesResolverStrategy
{
	private CatalogVersionService catalogVersionService;

	private final SuperCategoriesResolver<ProductModel> productSuperCatResolver = new SuperCategoriesResolver<ProductModel>()
	{
		@Override
		public Set<CategoryModel> getSuperCategories(final ProductModel item)
		{
			if (item == null)
			{
				return Collections.EMPTY_SET;
			}

			LinkedHashSet<CategoryModel> superCategories = null;

			final Collection<CategoryModel> itemSuperCategories = item.getSupercategories();
			if (itemSuperCategories != null && !itemSuperCategories.isEmpty())
			{
				// Make sure that the superCategories are set to a modifiable collection
				superCategories = new LinkedHashSet<CategoryModel>(itemSuperCategories);
			}

			if (item instanceof VariantProductModel)
			{
				final Collection<CategoryModel> baseCategories = ((VariantProductModel) item).getBaseProduct().getSupercategories();
				if (baseCategories != null && !baseCategories.isEmpty())
				{
					if (superCategories == null || superCategories.isEmpty())
					{
						// Replace the null superCategories, sure that the superCategories are set to a modifiable collection
						superCategories = new LinkedHashSet<CategoryModel>(baseCategories);
					}
					else
					{
						// Add the base categories to the existing supercategories
						superCategories.addAll(baseCategories);
					}
				}
			}

			if (superCategories == null)
			{
				return Collections.EMPTY_SET;
			}
			else
			{
				return superCategories;
			}
		}
	};

	private final SuperCategoriesResolver<CategoryModel> catSuperCatResolver = new SuperCategoriesResolver<CategoryModel>()
	{

		@Override
		public Set<CategoryModel> getSuperCategories(final CategoryModel item)
		{
			if (item == null)
			{
				return Collections.EMPTY_SET;
			}
			else
			{
				final Collection<CategoryModel> superCategories = item.getSupercategories();
				if (superCategories == null)
				{
					return Collections.EMPTY_SET;
				}
				else
				{
					return new LinkedHashSet<CategoryModel>(superCategories);
				}
			}
		}
	};

	@Override
	public Set<ClassificationClassModel> resolve(final ProductModel item)
	{
		return resolve(item, productSuperCatResolver);
	}

	private Set<ClassificationClassModel> resolve(final ProductModel item, final SuperCategoriesResolver<ProductModel> scr)
	{
		return resolveClasses(item, scr, getAllClassificationSystemVersions());
	}

	private Collection<ClassificationSystemVersionModel> getAllClassificationSystemVersions()
	{
		return catalogVersionService.getAllCatalogVersionsOfType(ClassificationSystemVersionModel.class);
	}

	@Override
	public Set<ClassificationClassModel> resolve(final CategoryModel item)
	{
		return resolve(item, catSuperCatResolver);
	}

	private Set<ClassificationClassModel> resolve(final CategoryModel item, final SuperCategoriesResolver<CategoryModel> scr)
	{
		return resolveClasses(item, scr, getAllClassificationSystemVersions());
	}

	@Override
	public Set<ClassificationClassModel> resolve(final ProductModel item, final ClassificationSystemVersionModel systemVersion)
	{
		return resolve(item, productSuperCatResolver, systemVersion);
	}

	public Set<ClassificationClassModel> resolve(final ProductModel item, final SuperCategoriesResolver<ProductModel> scr,
			final ClassificationSystemVersionModel systemVersion)
	{
		return resolveClasses(item, scr, Collections.singleton(systemVersion));
	}

	@Override
	public Set<ClassificationClassModel> resolve(final CategoryModel item, final ClassificationSystemVersionModel systemVersion)
	{
		return resolve(item, catSuperCatResolver, systemVersion);
	}

	private Set<ClassificationClassModel> resolve(final CategoryModel item, final SuperCategoriesResolver<CategoryModel> scr,
			final ClassificationSystemVersionModel systemVersion)
	{
		return resolveClasses(item, scr, Collections.singleton(systemVersion));
	}

	@Override
	public Set<ClassificationClassModel> resolve(final ProductModel item,
			final Collection<ClassificationSystemVersionModel> systemVersions)
	{
		return resolve(item, productSuperCatResolver, systemVersions);
	}

	private Set<ClassificationClassModel> resolve(final ProductModel item, final SuperCategoriesResolver<ProductModel> scr,
			final Collection<ClassificationSystemVersionModel> systemVersions)
	{
		return resolveClasses(item, scr, systemVersions);
	}

	@Override
	public Set<ClassificationClassModel> resolve(final CategoryModel item,
			final Collection<ClassificationSystemVersionModel> systemVersions)
	{
		return resolve(item, catSuperCatResolver, systemVersions);
	}

	private Set<ClassificationClassModel> resolve(final CategoryModel item, final SuperCategoriesResolver<CategoryModel> scr,
			final Collection<ClassificationSystemVersionModel> systemVersions)
	{
		return resolveClasses(item, scr, systemVersions);
	}

	private <T extends ItemModel> Set<ClassificationClassModel> resolveClasses(final T item, final SuperCategoriesResolver<T> scr,
			final Collection<ClassificationSystemVersionModel> systemVersions)
	{
		validateParameterNotNull(item, "item must not be null!");
		validateParameterNotNull(scr, "scr must not be null!");
		validateParameterNotNull(systemVersions, "systemVersions must not be null!");

		if (item instanceof ClassificationClassModel)
		{
			return Collections.singleton((ClassificationClassModel) item);
		}
		else
		{
			Set<CategoryModel> touchedCategorieModels = null;
			Set<ClassificationClassModel> returnCCModels = null;
			final Map<ClassificationSystemVersionModel, Set<ClassificationClassModel>> requiredVersions = new HashMap<ClassificationSystemVersionModel, Set<ClassificationClassModel>>();
			for (final ClassificationSystemVersionModel clSysVer : systemVersions)
			{
				requiredVersions.put(clSysVer, null);
			}
			Set<CategoryModel> currentCategoriesLevel = scr.getSuperCategories(item);
			while (currentCategoriesLevel != null && !currentCategoriesLevel.isEmpty() && !requiredVersions.isEmpty())
			{
				Set<CategoryModel> nextCategoriesLevel = null;
				for (final CategoryModel category : currentCategoriesLevel)
				{
					// avoid endless turns due to cycles using a control set
					if (touchedCategorieModels == null)
					{
						touchedCategorieModels = new HashSet<CategoryModel>();
						touchedCategorieModels.add(category);
					}
					else if (!touchedCategorieModels.add(category))
					{
						continue; // skip this category since we've ran across it before
					}

					// filter by system if required
					if (category instanceof ClassificationClassModel)
					{
						final ClassificationClassModel cCcategory = (ClassificationClassModel) category;
						final ClassificationSystemVersionModel clVer = cCcategory.getCatalogVersion();
						if (requiredVersions.containsKey(clVer))
						{
							Set<ClassificationClassModel> matchSet = requiredVersions.get(clVer);
							if (matchSet == null)
							{
								requiredVersions.put(clVer, matchSet = new LinkedHashSet<ClassificationClassModel>());
							}
							matchSet.add(cCcategory);
						}
						continue; // never add a classification class super category to next level
					}
					// no need to go further if at least one class has been found on this level
					else
					{
						if (nextCategoriesLevel == null)
						{
							nextCategoriesLevel = new LinkedHashSet<CategoryModel>();
						}
						nextCategoriesLevel.addAll(category.getSupercategories());
					}
				}

				for (final Iterator<Map.Entry<ClassificationSystemVersionModel, Set<ClassificationClassModel>>> it = requiredVersions
						.entrySet().iterator(); it.hasNext();)
				{
					if (returnCCModels == null)
					{
						returnCCModels = new LinkedHashSet<ClassificationClassModel>();
					}
					final Map.Entry<ClassificationSystemVersionModel, Set<ClassificationClassModel>> mapentry = it.next();
					if (mapentry.getValue() != null && !mapentry.getValue().isEmpty())
					{
						returnCCModels.addAll(mapentry.getValue());
					}
				}
				currentCategoriesLevel = nextCategoriesLevel;
			}
			return returnCCModels == null ? Collections.EMPTY_SET : returnCCModels;
		}
	}

	@Deprecated
	@Override
	public List<ClassAttributeAssignmentModel> getClassAttributeAssignments(
			final Set<ClassificationClassModel> classificationClasses)
	{
		return getDeclaredClassAttributeAssignments(classificationClasses);
	}

	@Required
	public void setCatalogVersionService(final CatalogVersionService catalogVersionService)
	{
		this.catalogVersionService = catalogVersionService;
	}

	@Override
	public List<ClassAttributeAssignmentModel> getAllClassAttributeAssignments(
			final Set<ClassificationClassModel> classificationClasses)
	{
		if (classificationClasses != null && !classificationClasses.isEmpty())
		{
			final LinkedHashSet<ClassAttributeAssignmentModel> list = new LinkedHashSet<ClassAttributeAssignmentModel>();
			for (final ClassificationClassModel ccl : classificationClasses)
			{
				list.addAll(ccl.getAllClassificationAttributeAssignments());
			}
			return new ArrayList(list);
		}
		else
		{
			return Collections.EMPTY_LIST;
		}
	}

	@Override
	public List<ClassAttributeAssignmentModel> getDeclaredClassAttributeAssignments(
			final Set<ClassificationClassModel> classificationClasses)
	{
		if (classificationClasses != null && !classificationClasses.isEmpty())
		{
			final List<ClassAttributeAssignmentModel> list = new ArrayList<ClassAttributeAssignmentModel>();
			for (final ClassificationClassModel ccl : classificationClasses)
			{
				final List<ClassAttributeAssignmentModel> declaredClassificationAttributeAssignments = ccl
						.getDeclaredClassificationAttributeAssignments();
				if (declaredClassificationAttributeAssignments != null)
				{
					list.addAll(declaredClassificationAttributeAssignments);
				}
			}
			return list;
		}
		else
		{
			return Collections.EMPTY_LIST;
		}
	}
}
