/**
 *
 */
package de.hybris.platform.ycommercewebservices.test.groovy.webservicetests

import org.junit.Test


class AddressTest extends BaseWSTest {


	final firstName = "John"
	final lastName = "Doe"
	final titleCode = "dr"
	final title = "dr"
	final password = "test"
	final line1 = "Zygmunta Starego 11"
	final line2 = "2nd floor"
	final town = "Gliwice"
	final postcode = "44-100"
	final plIsoCode = "PL"
	final jpIsoCode = "JP"
	final cnIsoCode = "CN"

	final japanRegonCode = "JP-23" //Aiti [Aichi]
	final chinaRegonCode = "CN-34" //Anhui


	@Test
	void shouldReturnBadRequestDueToMissingCountryCode() {
		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password);

		def postBody = "titleCode=${title}&firstName=${firstName}&lastName=${lastName}&line1=${line1}&town=${town}&postcode=${postcode}"
		def con = TestUtil.getSecureConnection("/customers/current/addresses", 'POST', 'XML', HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, access_token)

		def response = new XmlSlurper().parseText(con.errorStream.text)
		assert response.'class' == 'CustomValidationException'
		assert response.message == "Address validation error"
		assert response.validationErrors.children().size() == 1
		assert response.validationErrors.children()[0] == "country.isocode: This field is required and must to be between 1 and 2 characters long."
	}

	@Test
	void shouldReturnValidationErrorsDueToMissingFields() {
		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password);

		def postBody = "countryIsoCode=${plIsoCode}"
		def con = TestUtil.getSecureConnection("/customers/current/addresses", 'POST', 'XML', HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, access_token)

		def response = new XmlSlurper().parseText(con.errorStream.text)
		assert response.'class' == 'CustomValidationException'
		assert response.message == "Address validation error"
		assert response.validationErrors.children().size() == 6
		assert response.validationErrors.children()[0] == "titleCode: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[1] == "firstName: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[2] == "lastName: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[3] == "line1: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[4] == "town: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[5] == "postalCode: This field is required and must to be between 1 and 10 characters long."
	}

	@Test
	void shouldReturnValidationErrorsDueToMissingFields_JAPAN() {
		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password);

		def postBody = "countryIsoCode=${jpIsoCode}"
		def con = TestUtil.getSecureConnection("/customers/current/addresses", 'POST', 'XML', HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, access_token)
		def response = new XmlSlurper().parseText(con.errorStream.text)

		assert response.'class' == 'CustomValidationException'
		assert response.message == "Address validation error"
		assert response.validationErrors.children().size() == 7
		assert response.validationErrors.children()[0] == "firstName: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[1] == "lastName: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[2] == "line1: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[3] == "line2: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[4] == "town: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[5] == "region.isocode: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[6] == "postalCode: This field is required and must to be between 1 and 10 characters long."
	}

	@Test
	void shouldReturnValidationErrorsDueToMissingFields_CHINA() {
		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password);

		def postBody = "countryIsoCode=${cnIsoCode}"
		def con = TestUtil.getSecureConnection("/customers/current/addresses", 'POST', 'XML', HttpURLConnection.HTTP_BAD_REQUEST, postBody, null, access_token)

		def response = new XmlSlurper().parseText(con.errorStream.text)
		assert response.'class' == 'CustomValidationException'
		assert response.message == "Address validation error"
		assert response.validationErrors.children().size() == 7
		assert response.validationErrors.children()[0] == "titleCode: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[1] == "firstName: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[2] == "lastName: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[3] == "line1: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[4] == "town: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[5] == "region.isocode: This field is required and must to be between 1 and 255 characters long."
		assert response.validationErrors.children()[6] == "postalCode: This field is required and must to be between 1 and 10 characters long."
	}

	@Test
	void shouldSaveNewAddress() {
		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password);

		def postBody = "titleCode=${title}&firstName=${firstName}&lastName=${lastName}&line1=${line1}&town=${town}&countryIsoCode=${plIsoCode}&postcode=${postcode}"
		def con = TestUtil.getSecureConnection("/customers/current/addresses", 'POST', 'XML', HttpURLConnection.HTTP_OK, postBody, null, access_token)

		def response = TestUtil.verifiedXMLSlurper(con,true)

		assert response.firstName == "${firstName}"
		assert response.lastName == "${lastName}"
		assert response.titleCode == "${titleCode}"
		assert response.line1 == "${line1}"
		assert response.town == "${town}"
		assert response.postalCode == "${postcode}"
		assert response.country.isocode == "${plIsoCode}"
	}

	@Test
	void shouldSaveJapaneseAddress() {
		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password);

		def postBody = "firstName=${firstName}&lastName=${lastName}&line1=${line1}&line2=${line2}&town=${town}&countryIsoCode=${jpIsoCode}&postcode=${postcode}&regionIsoCode=${japanRegonCode}"
		def con = TestUtil.getSecureConnection("/customers/current/addresses", 'POST', 'XML', HttpURLConnection.HTTP_OK, postBody, null, access_token)

		def response = TestUtil.verifiedXMLSlurper(con)

		assert response.firstName == "${firstName}"
		assert response.lastName == "${lastName}"
		assert response.line1 == "${line1}"
		assert response.line2 == "${line2}"
		assert response.town == "${town}"
		assert response.postalCode == "${postcode}"
		assert response.country.isocode == "${jpIsoCode}"
		assert response.region.isocode == "${japanRegonCode}"
	}

	@Test
	void shouldSaveChineseAddress() {
		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password);

		def postBody = "titleCode=${title}&firstName=${firstName}&lastName=${lastName}&line1=${line1}&town=${town}&countryIsoCode=${cnIsoCode}&postcode=${postcode}&regionIsoCode=${chinaRegonCode}"
		def con = TestUtil.getSecureConnection("/customers/current/addresses", 'POST', 'XML', HttpURLConnection.HTTP_OK, postBody, null, access_token)

		def response = TestUtil.verifiedXMLSlurper(con)

		assert response.titleCode == "${titleCode}"
		assert response.firstName == "${firstName}"
		assert response.lastName == "${lastName}"
		assert response.line1 == "${line1}"
		assert response.town == "${town}"
		assert response.postalCode == "${postcode}"
		assert response.country.isocode == "${cnIsoCode}"
		assert response.region.isocode == "${chinaRegonCode}"
	}



}
