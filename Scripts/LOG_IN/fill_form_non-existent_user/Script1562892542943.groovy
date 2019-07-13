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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By

WebUI.verifyElementClickable(findTestObject('LOG_IN/button_sign-in'))

WebUI.setText(findTestObject('LOG_IN/input_email'), 'iart@yopmail.com')

WebUI.setEncryptedText(findTestObject('LOG_IN/input_password'), 'pvWt8Onr8p8JrmFePASEjg==')

WebUI.click(findTestObject('LOG_IN/button_sign-in'))

actualText = WebUI.getText(findTestObject("LOG_IN/txt_alert-error"))

WebUI.verifyEqual(actualText.contains("Tu Correo Electrónico y/o Contraseña son incorrectos. Por favor intenta nuevamente."), true)

