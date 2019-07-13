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

WebUI.waitForElementVisible(findTestObject('HOME_PAGE/NavBar/ul-menu', [('nameMenu') : 'Departamentos']), 3)

WebUI.mouseOver(findTestObject('HOME_PAGE/NavBar/ul-menu', [('nameMenu') : 'Departamentos' ]))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('HOME_PAGE/NavBar/li_sub-menu', [('nameOption') : 'Celulares']))

WebUI.delay(1)

WebUI.click(findTestObject('HOME_PAGE/NavBar/a_section', [('nameTitleSection') : 'Equipos', ('nameSection') : 'Ver Todos los Modelos']))

WebUI.waitForElementVisible(findTestObject('PRODUCTS/CatalogProducts/span_total-products'), 3)