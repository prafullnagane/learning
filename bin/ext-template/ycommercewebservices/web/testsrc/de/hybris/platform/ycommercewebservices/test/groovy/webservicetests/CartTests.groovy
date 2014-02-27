package de.hybris.platform.ycommercewebservices.test.groovy.webservicetests

import static de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.TestUtil.*

import de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.markers.AvoidCollectingOutputFromTest
import de.hybris.platform.ycommercewebservices.test.groovy.webservicetests.markers.CollectOutputFromTest

import org.junit.Test
import org.junit.experimental.categories.Category


@Category(CollectOutputFromTest.class)
class CartTests extends BaseWSTest {

	final password = "test"

	@Test
	void testGetCartJSON() {
		def con = TestUtil.getConnection("/cart", 'GET', 'JSON', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedJSONSlurper(con)
		assert response.totalItems == 0
		assert response.totalUnitCount == 0
		assert response.net == false
		assert response.totalPrice.currencyIso == 'USD'
		assert response.totalPrice.value == '0'
		assert response.totalPrice.priceType == 'BUY'
		assert response.totalPrice.formattedValue == '$0.00'
		assert response.subTotal.currencyIso == 'USD'
		assert response.subTotal.value == '0'
		assert response.subTotal.priceType == 'BUY'
		assert response.subTotal.formattedValue == '$0.00'
	}

	@Test
	void testGetCartXML() {
		def con = TestUtil.getConnection("/cart", 'GET', 'XML', HttpURLConnection.HTTP_OK)

		def response = TestUtil.verifiedXMLSlurper(con)
		assert response.name() == 'cart'
		assert response.totalItems == 0
		assert response.totalUnitCount == 0
		assert response.net == 'false'
		assert response.totalPrice.currencyIso == 'USD'
		assert response.totalPrice.value == '0'
		assert response.totalPrice.priceType == 'BUY'
		assert response.totalPrice.formattedValue == '$0.00'
		assert response.subTotal.currencyIso == 'USD'
		assert response.subTotal.value == '0'
		assert response.subTotal.priceType == 'BUY'
		assert response.subTotal.formattedValue == '$0.00'
	}

	@Test
	//@Category(AvoidCollectingOutputFromTest.class)
	void testGetCartAfterCurrencyChangeXML() {
		//create customer and cart
		def  customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password)
		def aid = customerTests.createAddress(access_token)

		//add something to a cart
		def postBody = "code=3429337"
		def con = TestUtil.getConnection('/cart/entry', 'POST', 'XML', HttpURLConnection.HTTP_OK, postBody)

		def body = con.inputStream.text
		verifyXML(body)
		//println body
		def response = new XmlSlurper().parseText(body)
		assert response.statusCode == 'success'
		assert response.quantityAdded == 1
		assert response.entry.entryNumber == 0


		//check for cookie, extract it for next request
		def cookie = con.getHeaderField('Set-Cookie')
		println cookie
		assert cookie : 'No cookie present, cannot keep session'
		def cookieNoPath = cookie.split(';')[0]
		//println cookieNoPath

		con = TestUtil.getConnection('/cart', 'GET', 'XML', HttpURLConnection.HTTP_OK, null, cookieNoPath)

		body = con.inputStream.text
		println body
		verifyXML(body)
		response = new XmlSlurper().parseText(body)

		assert response.totalItems == 1
		assert response.totalUnitCount == 1
		assert response.totalPrice.value == "11.12"
		assert response.totalPrice.currencyIso == "USD"

		//=============================

		con = TestUtil.getConnection('/cart?curr=JPY', 'GET', 'XML', HttpURLConnection.HTTP_OK, null, cookieNoPath)

		body = con.inputStream.text
		println body
		verifyXML(body)
		response = new XmlSlurper().parseText(body)

		assert response.totalItems == 1
		assert response.totalUnitCount == 1
		assert response.totalPrice.value == "940.0"
		assert response.totalPrice.currencyIso == "JPY"

		con = TestUtil.getConnection('/cart?curr=USD', 'GET', 'XML', HttpURLConnection.HTTP_OK, null, cookieNoPath)

		body = con.inputStream.text
		println body
		verifyXML(body)
		response = new XmlSlurper().parseText(body)

		assert response.totalItems == 1
		assert response.totalUnitCount == 1
		assert response.totalPrice.value == "11.12"
		assert response.totalPrice.currencyIso == "USD"
	}

	//POSTING to /cart/paymentinfo without having a delivey mode/address set
	@Test
	@Category(AvoidCollectingOutputFromTest.class)
	void testCartCreatePaymentInfo()
	{

		def customerTests = new CustomerTests()
		def uid = customerTests.registerUser()
		def access_token = TestUtil.getAccessToken(uid, password)
		def aid = customerTests.createAddressJSON(access_token)


		//put something in a new cart

		def postBody = "code=1934795&qty=2"
		def con = TestUtil.getSecureConnection('/cart/entry', 'POST', 'JSON', HttpURLConnection.HTTP_OK, postBody, null, access_token)
		//get cookie
		def cookie = con.getHeaderField('Set-Cookie')
		println cookie
		assert cookie : 'No cookie present, cannot keep session'
		def cookieNoPath = cookie.split(';')[0]

		//set the delivery address
		//con = TestUtil.getSecureConnection('/cart/address/delivery/' + aid, 'PUT', 'JSON', HttpURLConnection.HTTP_OK, null, cookieNoPath, access_token)
		//set a delivery mode
		//con = TestUtil.getSecureConnection('/cart/deliverymodes/' + 'standard-gross', 'PUT', 'JSON', HttpURLConnection.HTTP_OK, null, cookieNoPath, access_token)


		//create a paymentinfo for this cart
		postBody = "accountHolderName=Sven+Haiges&cardNumber=4111111111111111&cardType=visa&expiryMonth=01&expiryYear=2013&saved=true&defaultPaymentInfo=true&billingAddress.titleCode=mr&billingAddress.firstName=sven&billingAddress.lastName=haiges&billingAddress.line1=test1&billingAddress.line2=test2&billingAddress.postcode=12345&billingAddress.town=somecity&billingAddress.countryIsoCode=DE"
		con = TestUtil.getSecureConnection("/cart/paymentinfo", 'POST', 'JSON', HttpURLConnection.HTTP_OK, postBody, cookieNoPath, access_token)
		/*
		 * HTTP 400
		 * {
		 "class": "IllegalArgumentException",
		 "message": "Parameter paymentInfoData can not be null"
		 }
		 *
		 *
		 */

	}
}