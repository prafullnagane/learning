package de.hybris.platform.ycommercewebservices.test.groovy.webservicetests



import de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.markers.AvoidCollectingOutputFromTest
import de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.markers.CollectOutputFromTest

import org.junit.Test
import org.junit.experimental.categories.Category

@Category(CollectOutputFromTest.class)
class ProductTests extends BaseWSTest  {

	def PRODUCT_ID_FLEXI_TRIPOD = "3429337"

	@Test
	void testSearchProductsBasicJSON() {
		def con = TestUtil.getConnection("/products", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.products.size() > 0
		assert response.sorts.size() > 0
		assert response.pagination
		assert response.currentQuery
		assert response.facets.size() > 0
	}


	@Test
	void testSearchProductsBasicXML() {
		def con = TestUtil.getConnection("/products", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.name() == 'searchResult'
		assert response.products.product.size() > 0
		assert response.sorts.sort.size() > 0
		assert response.pagination
		assert response.currentQuery
		assert response.facets.facet.size() > 0
	}

	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testSearchProductsSpellingJSON() {
		def con = TestUtil.getConnection("/products?query=somy", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.spellingSuggestion
		assert response.spellingSuggestion.suggestion == 'sony'
		assert (response.spellingSuggestion.query == 'sony:topRated') || (response.spellingSuggestion.query == 'sony:relevance')
	}

	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testSearchProductsSpellingXML() {
		def con = TestUtil.getConnection("/products?query=somy", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.spellingSuggestion
		assert response.spellingSuggestion.suggestion == 'sony'
		assert (response.spellingSuggestion.query == 'sony:topRated') || (response.spellingSuggestion.query == 'sony:relevance')
	}

	@Test
	void testSearchProductsAutoSuggestXML() {
		def con = TestUtil.getConnection("/products/suggest?term=t", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.name() == 'suggestions'
		assert response.suggestion
		assert response.suggestion.size() == 5
		assert response.suggestion[0] == 'tripod'
		assert response.suggestion[1] == 'tape'
		assert response.suggestion[2] == 'toshiba'
		assert response.suggestion[3] == 'tdk'
		assert response.suggestion[4] == 'targus'
	}

	@Test
	void testSearchProductsAutoSuggestWithLimitXML() {
		def con = TestUtil.getConnection("/products/suggest?term=t&max=2", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con, false, false)

		assert response.suggestion.size() == 2
		assert response.suggestion[0] == 'tripod'
		assert response.suggestion[1] == 'tape'
	}

	@Test
	void testSearchProductsAutoSuggestJSON() {
		def con = TestUtil.getConnection("/products/suggest?term=t", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response
		assert response.suggestions.size() == 5
		assert response.suggestions[0].value == 'tripod'
		assert response.suggestions[1].value == 'tape'
		assert response.suggestions[2].value == 'toshiba'
		assert response.suggestions[3].value == 'tdk'
		assert response.suggestions[4].value == 'targus'
	}

	@Test
	void testSearchProductsAutoSuggestWithLmitJSON() {

		def con = TestUtil.getConnection("/products/suggest?term=t&max=2", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)

		assert response
		assert response.suggestions.size() == 2
		assert response.suggestions[0].value == 'tripod'
		assert response.suggestions[1].value == 'tape'
	}

	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testSearchProductsPaginationXML() {
		def con = TestUtil.getConnection("/products", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.pagination
		assert response.pagination.pageSize == 20
		assert response.pagination.currentPage == 0
		assert response.pagination.sort == 'topRated'
		assert response.pagination.totalResults == 176
		assert response.pagination.totalPages == 9


		assert Math.ceil(response.pagination.totalResults.toBigInteger() / response.pagination.pageSize.toBigInteger()) == response.pagination.totalPages.toBigInteger()

		(0..(response.pagination.totalPages.toInteger())).each {  pageNumber ->
			//step through each page
			con = TestUtil.getConnection("/products?currentPage=${pageNumber}", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
			response = TestUtil.verifiedJSONSlurper(con, false, false)
			assert response.pagination.currentPage == pageNumber
		}
	}


	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testSearchProductsPaginationJSON() {
		def con = TestUtil.getConnection("/products", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.pagination
		assert response.pagination.pageSize == 20
		assert response.pagination.currentPage == 0
		assert response.pagination.sort == 'topRated'
		assert response.pagination.totalResults == 176
		assert response.pagination.totalPages == 9


		assert Math.ceil(response.pagination.totalResults / response.pagination.pageSize) == response.pagination.totalPages

		(0..(response.pagination.totalPages)).each {  pageNumber ->
			//step through each page
			con = TestUtil.getConnection("/products?currentPage=${pageNumber}", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
			response = TestUtil.verifiedJSONSlurper(con, false, false)
			assert response.pagination.currentPage == pageNumber
		}
	}

	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testSearchProductsSortXML() {
		def con = TestUtil.getConnection("/products?query=camera&sort=topRated", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.sorts
		assert response.sorts.sort.find { it.code == 'topRated'}.selected == true : 'topRated is not default selected'

		response.sorts.sort.each { sort ->
			con = TestUtil.getConnection("/products?query=camera:${sort.code}", 'GET', 'XML', HttpURLConnection.HTTP_OK)
			response = TestUtil.verifiedXMLSlurper(con, false, false)
			assert response.sorts.sort.find{ it.code == sort.code}.selected == true : "Expected ${sort.code} to be selected"
		}
	}

	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testSearchProductsSortJSON() {
		def con = TestUtil.getConnection("/products?query=camera&sort=topRated", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.sorts
		assert response.sorts.find { it.code == 'topRated'}.selected == true : 'topRated is not default selected'

		response.sorts.each { sort ->
			con = TestUtil.getConnection("/products?query=camera:${sort.code}", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
			response = TestUtil.verifiedJSONSlurper(con, false, false)
			assert response.sorts.find{ it.code == sort.code}.selected == true : "Expected ${sort.code} to be selected"
		}
	}

	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testProductDetailsXML() {
		def con = TestUtil.getConnection("/products?query=camera", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.products.product.size() == 20
		response.products.product.each { product ->
			//details request for each
			con = TestUtil.getConnection("/products/${product.code}", 'GET', 'XML', HttpURLConnection.HTTP_OK)
			response = TestUtil.verifiedXMLSlurper(con, false, false)
			assert response.name() == 'product'
			assert response.code == product.code
			assert response.name
			assert response.url
			assert response.averageRating
		}
	}

	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testProductDetailsJSON() {
		def con = TestUtil.getConnection("/products?query=camera", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.products.size() == 20
		response.products.each { product ->
			//details request for each
			con = TestUtil.getConnection("/products/${product.code}", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
			response = TestUtil.verifiedJSONSlurper(con, false, false)
			assert response.code == product.code
			assert response.name
			assert response.url
		}
	}

	@Test
	void testProductDetailsSpecificXML() {
		def con = TestUtil.getConnection("/products/872912", 'GET', 'XML', HttpURLConnection.HTTP_OK) //some SD CARD
		def response = TestUtil.verifiedXMLSlurper(con, false, false)

		assert response.name() == 'product'
		assert response.code == '872912'
		assert response.name == 'Secure Digital Card 2GB'
		assert response.purchasable
		//	assert response.averageRating == 3.25
		assert response.manufacturer == 'ICIDU'
		assert response.images.image.size() == 4
	}

	@Test
	void testProductDetailsSpecificSJON() {
		def con = TestUtil.getConnection("/products/872912", 'GET', 'JSON', HttpURLConnection.HTTP_OK) //some SD CARD
		def response = TestUtil.verifiedJSONSlurper(con, false, false)

		assert response.code == '872912'
		assert response.name == 'Secure Digital Card 2GB'
		assert response.purchasable
		//	assert response.averageRating == 3.25
		assert response.manufacturer == 'ICIDU'
		assert response.images.size() == 4

	}

	@Test
	void testExportProductsFullXML() {
		def con = TestUtil.getConnection("/products/export/full", 'GET', 'XML', HttpURLConnection.HTTP_OK)
		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.name() == 'export'
		assert response.products.product.size() == 176
		assert response.totalProductCount == 176
		assert response.totalPageCount == 1
		assert response.currentPage == 0

		//change pageSize to 20
		con = TestUtil.getConnection("/products/export/full?pageSize=20", 'GET', 'XML', HttpURLConnection.HTTP_OK)
		response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.name() == 'export'
		assert response.products.product.size() == 20
		assert response.totalProductCount == 176
		assert response.totalPageCount == 9
		assert response.currentPage == 0
	}

	@Test
	void testExportProductsFullJSON() {
		def con = TestUtil.getConnection("/products/export/full", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
		def response = TestUtil.verifiedJSONSlurper(con, false, false)

		assert response.products.size() == 176
		assert response.totalProductCount == 176
		assert response.totalPageCount == 1
		assert response.currentPage == 0

		//change pageSize to 20
		con = TestUtil.getConnection("/products/export/full?pageSize=20", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
		response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.products.size() == 20
		assert response.totalProductCount == 176
		assert response.totalPageCount == 9
		assert response.currentPage == 0
	}

	@Test
	void testExportProductsIncrementalXML() {
		def con = TestUtil.getConnection("/products/export/incremental", 'GET', 'XML', HttpURLConnection.HTTP_BAD_REQUEST)
		//2007-08-31T16:47+00:00
		con = TestUtil.getConnection("/products/export/incremental?timestamp=2012-03-28T07:50:49%2B00:00", 'GET', 'XML', HttpURLConnection.HTTP_OK)
		def response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.name() == 'export'
		assert response.products.product.size() == 176
		assert response.totalProductCount == 176
		assert response.totalPageCount == 1
		assert response.currentPage == 0

		con = TestUtil.getConnection("/products/export/incremental?timestamp=2013-06-28T07:50:49%2B00:00", 'GET', 'XML', HttpURLConnection.HTTP_OK)
		response = TestUtil.verifiedXMLSlurper(con, false, false)
		assert response.name() == 'export'
		assert response.products.product.size() == 0
		assert response.totalProductCount == 0
		assert response.totalPageCount == 0
		assert response.currentPage == 0
	}

	@Test
	void testExportProductsIncrementalJSON() {
		def con = TestUtil.getConnection("/products/export/incremental", 'GET', 'JSON', HttpURLConnection.HTTP_BAD_REQUEST)
		//2007-08-31T16:47+00:00
		con = TestUtil.getConnection("/products/export/incremental?timestamp=2012-03-28T07:50:49%2B00:00", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
		def response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.products.size() == 176
		assert response.totalProductCount == 176
		assert response.totalPageCount == 1
		assert response.currentPage == 0

		con = TestUtil.getConnection("/products/export/incremental?timestamp=2013-06-28T07:50:49%2B00:00", 'GET', 'JSON', HttpURLConnection.HTTP_OK)
		response = TestUtil.verifiedJSONSlurper(con, false, false)
		assert response.products.size() == 0
		assert response.totalProductCount == 0
		assert response.totalPageCount == 0
		assert response.currentPage == 0
	}

	@Test
	void testProductsExportReferencesJSON() {
		def code = '2053226';  // acceleratorsampledata extension, products-relations.impex, INSERT_UPDATE ProductReference
		def con = TestUtil.getConnection("/products/export/references/${code}?referenceType=SIMILAR","GET","JSON", HttpURLConnection.HTTP_OK);
		def response = TestUtil.verifiedJSONSlurper(con)
		assert response != null
	}

	@Test
	void testProductsExportReferencesXML() {
		def code = '2053226'; // acceleratorsampledata extension, products-relations.impex, INSERT_UPDATE ProductReference
		def con = TestUtil.getConnection("/products/export/references/${code}?referenceType=SIMILAR","GET","XML", HttpURLConnection.HTTP_OK);
		def response = TestUtil.verifiedXMLSlurper(con)
		assert response != null
	}

	@Test
	void testGetProductByCodeWithReferencesXML() {
		def code = '2053226'; // acceleratorsampledata extension, products-relations.impex, INSERT_UPDATE ProductReference
		def con = TestUtil.getConnection("/products/${code}?options=REFERENCES","GET","XML", HttpURLConnection.HTTP_OK);
		def response = TestUtil.verifiedXMLSlurper(con)
		assert response != null
		assert response.productReferences != null
		assert response.productReferences.reference.size() > 0
	}

	@Test
	void testCreateReview() {
		def postBody = "alias=krzys&rating=4&comment=perfect&headline=samplereview"
		def code = '816780';
		def con = TestUtil.getConnection("/products/${code}/reviews","POST","JSON", HttpURLConnection.HTTP_OK, postBody);
		def response = TestUtil.verifiedJSONSlurper(con)
		assert response != null
		assert response.alias == "krzys"
		assert response.rating.toString() == "4.0"
		assert response.comment == "perfect"
		assert response.headline == "samplereview"
		assert response.principal.uid == "anonymous"
	}

	@Test
	void testCreateReviewXML() {
		def postBody = "alias=krzys&rating=4&comment=perfect&headline=samplereview"
		def code = '816780';
		def con = TestUtil.getConnection("/products/${code}/reviews","POST","XML", HttpURLConnection.HTTP_OK, postBody);
		def response = TestUtil.verifiedXMLSlurper(con)
		assert response != null
		assert response.alias == "krzys"
		assert response.rating == "4.0"
		assert response.comment == "perfect"
		assert response.headline == "samplereview"
		assert response.principal.uid == "anonymous"
	}

	@Test
	void testCreateReviewWithoutMandatoryFields() {
		def postBody = ""
		def code = '816780';
		def con = TestUtil.getSecureConnection("/products/${code}/reviews", "POST", "XML", HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, null);
		def response = new XmlSlurper().parseText(con.errorStream.text)
		assert response.'class' == 'CustomValidationException'
		assert response.message == "Review validation error"
		assert response.validationErrors.children().size() == 3
		assert response.validationErrors.children()[0] == "headline: This field is required."
		assert response.validationErrors.children()[1] == "comment: This field is required."
		assert response.validationErrors.children()[2] == "rating: This field is required."
	}

	@Test
	void testCreateReviewWithRatingOverMaxValue() {
		def postBody = "alias=krzys&rating=5.1&comment=perfect&headline=samplereview"
		def code = '816780';
		def con = TestUtil.getSecureConnection("/products/${code}/reviews", "POST", "XML", HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, null);
		def response = new XmlSlurper().parseText(con.errorStream.text)
		assert response.'class' == 'CustomValidationException'
		assert response.message == "Review validation error"
		assert response.validationErrors.children().size() == 1
		assert response.validationErrors.children()[0] == "rating: Value should be between 1 and 5"
	}

	@Test
	void testCreateReviewWithRatingUnderMinValue() {
		def postBody = "alias=krzys&rating=0.9&comment=perfect&headline=samplereview"
		def code = '816780';
		def con = TestUtil.getSecureConnection("/products/${code}/reviews", "POST", "XML", HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, null);
		def response = new XmlSlurper().parseText(con.errorStream.text)
		assert response.'class' == 'CustomValidationException'
		assert response.message == "Review validation error"
		assert response.validationErrors.children().size() == 1
		assert response.validationErrors.children()[0] == "rating: Value should be between 1 and 5"
	}

	@Test
	void testCreateReviewWithoutMandatoryFieldsForGermanLang() {
		def postBody = "lang=de"
		def code = '816780';
		def con = TestUtil.getSecureConnection("/products/${code}/reviews", "POST", "XML", HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, null);
		def response = new XmlSlurper().parseText(con.errorStream.text)
		assert response.'class' == 'CustomValidationException'
		assert response.message == "Review validation error"
		assert response.validationErrors.children().size() == 3
		assert response.validationErrors.children()[0] == "headline: Dieses Feld ist erforderlich."
		assert response.validationErrors.children()[1] == "comment: Dieses Feld ist erforderlich."
		assert response.validationErrors.children()[2] == "rating: Dieses Feld ist erforderlich."
	}
}