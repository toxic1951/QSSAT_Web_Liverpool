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

WebUI.waitForElementVisible(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/button_send-opinion'), 3)

WebUI.clickOffset(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/icons_raiting'), 0, 0)

WebUI.setText(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/input_title-opinion'), '¡¡Excelente servicio!!')

WebUI.setText(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/input_write-opinion'), 'Cinco estrellas Aut_Test')

WebUI.click(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/button_add-photo'))

WebUI.waitForElementClickable(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/input_upload-photo'), 3)

WebUI.uploadFile(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/input_upload-photo'), 'C:\\Users\\QualtopGroup\\Katalon Studio\\QSSAT_Web_Liverpool\\Files\\img.png')

WebUI.click(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/button_accept-add-photo'))

WebUI.waitForElementNotVisible(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/icon_load-photo'), 10)

WebUI.click(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/button_accept-add-photo'))

WebUI.click(findTestObject('PRODUCTS/DetailProduct/ProductOpinion/button_send-opinion'))