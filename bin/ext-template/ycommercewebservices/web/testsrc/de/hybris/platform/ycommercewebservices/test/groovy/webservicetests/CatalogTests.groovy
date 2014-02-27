package de.hybris.platform.ycommercewebservices.test.groovy.webservicetests
import static de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.TestUtil.*

import de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.markers.CollectOutputFromTest

import org.junit.Test
import org.junit.experimental.categories.Category

import groovy.json.*


@Category(CollectOutputFromTest.class)
class CatalogTests extends BaseWSTest {

	@Test
	void testGetCatalogsXML() {
		def con = getConnection('/catalogs', 'GET', 'XML')
		assert con.responseCode == HttpURLConnection.HTTP_OK : TestUtil.messageResponseCode(con.responseCode, HttpURLConnection.HTTP_OK)


		def response = verifiedXMLSlurper(con)
		assert response.name() == 'catalogs'
		assert response.catalog.size() == 1
		assert response.catalog[0].id == 'electronicsProductCatalog'
		assert response.catalog[0].name == 'Electronics Product Catalog'
		assert response.catalog[0].url == '/electronicsProductCatalog'
		//TODO change to catalogversion - https://jira.hybris.com/browse/COMWS-34
		assert response.catalog[0].catalogVersions.catalogVersion.size() == 2
		assert response.catalog[0].catalogVersions.catalogVersion[0].id == 'Staged'
		assert response.catalog[0].catalogVersions.catalogVersion[1].id == 'Online'

		//OPTIONS CATEGORIES
		response = verifiedXMLSlurper(getConnection('/catalogs?options=CATEGORIES', 'GET', 'XML'))
		//TODO catalogVVVersion
		assert response.catalog[0].catalogVersions.catalogVersion[1].id == 'Online'
		//TODO cateogories
		assert response.catalog[0].catalogVersions.catalogVersion[1].categories.category.size() == 2

		//OPTIONS PRODUCTS (requires categories)
		response = verifiedXMLSlurper(getConnection('/catalogs?options=PRODUCTS,CATEGORIES', 'GET', 'XML'))
		assert response.catalog[0].catalogVersions.catalogVersion[1].categories.category[0].products.product.size() > 0

		//OPTIONS SUBCATEGORIES (requires categories)
		response = verifiedXMLSlurper(getConnection('/catalogs?options=CATEGORIES,SUBCATEGORIES', 'GET', 'XML'))
		assert response.catalog[0].catalogVersions.catalogVersion[1].categories.category[0].subcategories.category.size() > 0
	}

	@Test
	void testGetCatalogXML() {
		def con = getConnection('/catalogs/electronicsProductCatalog')

		def response = verifiedXMLSlurper(con)
		assert response.name() == 'catalog'
		assert response.id == 'electronicsProductCatalog'
		assert response.name == 'Electronics Product Catalog'
		assert response.url == '/electronicsProductCatalog'
		//TODO change to catalogVVVersion - https://jira.hybris.com/browse/COMWS-34

		assert response.catalogVersions.catalogVersion.size() == 2
		assert response.catalogVersions.catalogVersion[0].id == 'Staged'
		assert response.catalogVersions.catalogVersion[1].id == 'Online'
	}

	@Test
	void testGetCatalogVersionXML() {
		def con = getConnection('/catalogs/electronicsProductCatalog/Online')


		def response = verifiedXMLSlurper(con)
		//TODO catalogVersion //TODO change to catalogVVVersion - https://jira.hybris.com/browse/COMWS-34
		assert response.name() == 'catalogVersion'
		assert response.id == 'Online'
		//TODO needs to have '/' first  - https://jira.hybris.com/browse/COMWS-35
		assert response.url == '/electronicsProductCatalog/Online'
	}

	@Test
	void testGetCategoriesXML() {
		def con = getConnection('/catalogs/electronicsProductCatalog/Online/categories/brands')

		def response = verifiedXMLSlurper(con)
		assert response.name() == 'category'
		assert response.id == 'brands'
		assert response.name == 'Brands'
	}

	//JSON JSON JSON
	@Test
	void testGetCatalogsJSON() {
		def con = getConnection('/catalogs', 'GET', 'JSON')


		def response = verifiedJSONSlurper(con)
		assert response.catalogs.size() == 1
		assert response.catalogs[0].id == 'electronicsProductCatalog'
		assert response.catalogs[0].name == 'Electronics Product Catalog'
		assert response.catalogs[0].url == '/electronicsProductCatalog'
		//TODO change to catalogversion - https://jira.hybris.com/browse/COMWS-34
		assert response.catalogs[0].catalogVersions.size() == 2
		assert response.catalogs[0].catalogVersions[0].id == 'Staged'
		assert response.catalogs[0].catalogVersions[1].id == 'Online'

		//OPTIONS CATEGORIES
		response = verifiedJSONSlurper(getConnection('/catalogs?options=CATEGORIES', 'GET', 'JSON'))
		//TODO catalogVVVersion
		assert response.catalogs[0].catalogVersions[1].id == 'Online'
		//TODO cateogories
		assert response.catalogs[0].catalogVersions[1].categories.category.size() == 2

		//OPTIONS PRODUCTS (requires categories)
		response = verifiedJSONSlurper(getConnection('/catalogs?options=PRODUCTS,CATEGORIES', 'GET', 'JSON'))
		assert response.catalogs[0].catalogVersions[1].categories[0].products.size() > 0

		//OPTIONS SUBCATEGORIES (requires categories)
		response = verifiedJSONSlurper(getConnection('/catalogs?options=CATEGORIES,SUBCATEGORIES', 'GET', 'JSON'))
		assert response.catalogs[0].catalogVersions[1].categories[0].subcategories.size() > 0
	}

	@Test
	void testGetCatalogJSON() {
		def con = getConnection('/catalogs/electronicsProductCatalog', 'GET', 'JSON')

		def response = verifiedJSONSlurper(con)
		assert response.id == 'electronicsProductCatalog'
		assert response.name == 'Electronics Product Catalog'
		assert response.url == '/electronicsProductCatalog'
		//TODO change to catalogVVVersion - https://jira.hybris.com/browse/COMWS-34
		assert response.catalogVersions.size() == 2
		assert response.catalogVersions[0].id == 'Staged'
		assert response.catalogVersions[1].id == 'Online'
	}

	@Test
	void testGetCatalogVersionJSON() {
		def con = getConnection('/catalogs/electronicsProductCatalog/Online', 'GET', 'JSON')

		def response = verifiedJSONSlurper(con)
		//TODO catalogVersion //TODO change to catalogVVVersion - https://jira.hybris.com/browse/COMWS-34
		assert response.id == 'Online'
		//TODO needs to have '/' first  - https://jira.hybris.com/browse/COMWS-35
		assert response.url == '/electronicsProductCatalog/Online'
	}

	@Test
	void testGetCategoriesJSON() {
		def con = getConnection('/catalogs/electronicsProductCatalog/Online/categories/brands', 'GET', 'JSON')

		def response = verifiedJSONSlurper(con)
		assert response.id == 'brands'
		assert response.name == 'Brands'
		assert response.subcategories.size() == 0
		assert response.products.size() == 0
	}



	/*
	 void testGetCatalogsJSON() {	 //basic
	 def con = "${TestUtil.BASE}/catalogs".toURL().openConnection()
	 TestUtil.acceptJSON(con)
	 def response = new JsonSlurper().parseText(con.inputStream.text)
	 def catalogs = ['electronicsProductCatalog']
	 assert response.size() == catalogs.size()
	 assert response.findAll { catalog -> catalog.id in catalogs }.size() == catalogs.size()
	 assert response[0].catalogVersions.size() == 2
	 }
	 void testGetCatalogsCategoriesJSON() {
	 def con = "${TestUtil.BASE}/catalogs?options=CATEGORIES".toURL().openConnection()
	 TestUtil.acceptJSON(con)
	 def response = new JsonSlurper().parseText(con.inputStream.text)
	 assert response.size() == 1
	 assert response[0].catalogVersions.size() == 2
	 assert response[0].catalogVersions[1].categories.size() == 2
	 }
	 void testGetSpecificCatalogJSON() {
	 def con = "${TestUtil.BASE}/catalogs/electronicsProductCatalog".toURL().openConnection()
	 TestUtil.acceptJSON(con)
	 def response = new JsonSlurper().parseText(con.inputStream.text)
	 assert response.id == 'electronicsProductCatalog'
	 assert response.catalogVersions.size() == 2
	 assert response.name == 'Electronics Product Catalog'
	 }
	 */

}