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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By

WebUI.callTestCase(findTestCase('SIGN_UP/prepare_form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('SIGN_UP/button_accept'))

WebUI.click(findTestObject('SIGN_UP/button_accept'))


for (def e : DriverFactory.getWebDriver().findElements(By.xpath('//label[@class="error"]'))) {
	actualReqFields.add(e.getText())
}


for (int x = 0; x <= (requiredFields.size() - 1); x++) {

	if (actualReqFields.contains(requiredFields.get(x))) {
		KeywordUtil.logInfo('\n\n ¡¡ Si se encontro: ' + requiredFields.get(x).toString() + " !! \n\n")
		
	} else {
		KeywordUtil.logInfo('\n\n ¡¡ NO se encontro: ' + requiredFields.get(x).toString() + " !! \n\n")
		
		flagFail = true
	}
}

WebUI.verifyEqual(flagFail, false)