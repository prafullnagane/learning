package de.hybris.platform.ycommercewebservices.test.groovy.webservicetests



import de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.markers.CollectOutputFromTest

import org.junit.Test
import org.junit.experimental.categories.Category

@Category(CollectOutputFromTest.class)
class StoresTests extends BaseWSTest  {

	@Test
	void testGetStoresInMunichJSON() {
		def con = TestUtil.getConnection("/stores?query=munich", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 0
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 0
		assert response.pagination.totalPages == 0
	}

	@Test
	void testGetStoresInTokioJSON() {
		def con = TestUtil.getConnection("/stores?query=tokio&radius=500", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 1
		assert response.stores[0].formattedDistance == '0 Km'
		assert response.stores[0].openingHours == null
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 1
		assert response.pagination.totalPages == 1
	}

	@Test
	void testGetStoresInTokioWithRadiusJSON() {
		def con = TestUtil.getConnection("/stores?query=tokio&radius=20000", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 10
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 15
		assert response.pagination.totalPages == 2
	}

	@Test
	void testGetStoresInTokioAndThenChangeAPageJSON() {

		def con = TestUtil.getConnection("/stores?query=tokio&radius=20000", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 10
		assert response.pagination.pageSize == 10
		assert response.pagination.currentPage == 0
		assert response.pagination.totalResults == 15
		assert response.pagination.totalPages == 2

		con = TestUtil.getConnection("/stores?query=tokio&radius=20000&currentPage=1", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
		response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 5
		assert response.pagination.currentPage == 1
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 15
		assert response.pagination.totalPages == 2
	}

	@Test
	void testGetStoresInTokioWithOptionsJSON() {
		def con = TestUtil.getConnection("/stores?query=tokio&options=HOURS&radius=500", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 1
		assert response.stores[0].formattedDistance == '0 Km'
		assert response.stores[0].openingHours != null
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 1
		assert response.pagination.totalPages == 1
	}

	@Test
	void testGetStoresByLatAndLongitudeJSON() {
		def con = TestUtil.getConnection("/stores?longitude=139.69&latitude=35.65&radius=4500", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 2
		assert response.stores[0].formattedDistance == '1.1 Km'
		assert response.stores[1].formattedDistance == '4.4 Km'
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 2
		assert response.pagination.totalPages == 1
	}

	@Test
	void testGetStoresByLatAndLongitudeWithAccuracyJSON() {
		def con = TestUtil.getConnection("/stores?longitude=139.69&latitude=35.65&radius=4000&accuracy=500", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 2
		assert response.stores[0].formattedDistance == '1.1 Km'
		assert response.stores[1].formattedDistance == '4.4 Km'
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 2
		assert response.pagination.totalPages == 1
	}

	@Test
	void testGetAllStoresJSON() {
		def con = TestUtil.getConnection("/stores", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.stores.size == 10
		assert response.pagination.pageSize == 10
		assert response.pagination.totalResults == 49
		assert response.pagination.totalPages == 5
	}
}