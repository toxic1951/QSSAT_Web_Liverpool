import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

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

WebUI.waitForElementClickable(findTestObject('PRODUCTS/DetailProduct/GeneralView/input_qty'), 3)

for(x = 1; x < cantProducts; x++){
	
	WebUI.sendKeys(findTestObject('PRODUCTS/DetailProduct/GeneralView/input_qty'), Keys.chord(Keys.ARROW_UP))
	
	WebUI.delay(1)
}

WebUI.click(findTestObject("PRODUCTS/DetailProduct/GeneralView/button_add-shopping-cart"))

WebUI.waitForElementVisible(findTestObject("PRODUCTS/DetailProduct/GeneralView/div_modal-product-added"), 3)

WebUI.click(findTestObject("PRODUCTS/DetailProduct/GeneralView/button_close-modal-product-added"))