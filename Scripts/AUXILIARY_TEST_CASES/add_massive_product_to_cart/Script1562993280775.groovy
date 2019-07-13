import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('HOME_PAGE/search_product'), [('nameProduct') : nameProduct], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementVisible(findTestObject('PRODUCTS/CatalogProducts/span_total-products'), 3)) {
	WebUI.callTestCase(findTestCase('PRODUCTS/CatalogProducts/GridProducts/select_product_catalog'), [('nameProduct') : nameProduct],
		FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('PRODUCTS/DetailProduct/GeneralView/add_product_to_cart'), [('x') : 1, ('cantProducts') : 1], 
    FailureHandling.STOP_ON_FAILURE)
