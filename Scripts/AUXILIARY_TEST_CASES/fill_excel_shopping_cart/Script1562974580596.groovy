import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebDriver driver = DriverFactory.getWebDriver()

String[][] listProducts = new String[10][2]

for (i = 1; i <= (listProducts.size() - 1); i++) {
    nameProduct = driver.findElement(By.xpath(('//li[@class="product-cell"][' + i) + ']/a[@class="product-name"]/span')).getText()

    priceProduct = driver.findElement(By.xpath(('//li[@class="product-cell"][' + i) + ']//span[not(contains(@class , "price-state price-strike-special"))]/span[@class = "price-amount"]')).getText()

    formatedPriceProd = new StringBuffer(priceProduct).insert(priceProduct.length() - 2, '.').toString()

    ((listProducts[i])[0]) = nameProduct

    ((listProducts[i])[1]) = formatedPriceProd
}

CustomKeywords.'qssat.web.liverpool.SaveProdcutsDBExcel.saveProducts'(listProducts, limit)

