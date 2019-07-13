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

Random random = new Random()

rand = random.nextInt(100)

WebUI.callTestCase(findTestCase('SIGN_UP/prepare_form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject("SIGN_UP/button_accept"))

WebUI.setText(findTestObject('SIGN_UP/input_email'), 'iart' + rand + '@yopmail.com')

WebUI.setEncryptedText(findTestObject('SIGN_UP/input_password'), 'cNkTP62zox2sjTkN4QiJDw==')

WebUI.setText(findTestObject('SIGN_UP/input_name'), 'IAN')

WebUI.setText(findTestObject('SIGN_UP/input_last-name'), 'ROMERO')

WebUI.setText(findTestObject('SIGN_UP/input_second-last-name'), 'TORRES')

WebUI.selectOptionByLabel(findTestObject('SIGN_UP/select_day'), '27', false)

WebUI.selectOptionByValue(findTestObject('SIGN_UP/select_month'), '6', false)

WebUI.selectOptionByLabel(findTestObject('SIGN_UP/select_year'), '1998', false)

WebUI.click(findTestObject('SIGN_UP/radio_male'))

WebUI.click(findTestObject('SIGN_UP/button_accept'))

WebUI.verifyElementText(findTestObject('LOG_IN/select_profile'), 'IAN')
