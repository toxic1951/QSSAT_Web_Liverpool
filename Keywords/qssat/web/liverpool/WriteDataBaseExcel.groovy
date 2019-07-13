package qssat.web.liverpool

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

public class SaveProdcutsDBExcel {

	@Keyword
	public void saveProducts(String[][] listProducts, int limit){
		FileInputStream file = new FileInputStream(new File('C:\\Users\\QualtopGroup\\Katalon Studio\\QSSAT_Web_Liverpool\\Files\\ShoppingList.xlsx'))

		XSSFWorkbook workbook = new XSSFWorkbook(file)

		XSSFSheet sheet = workbook.getSheetAt(0)


		int i = 0;

		'Crear Encabezados'
		sheet.createRow(0).createCell(0).setCellValue("NOMBRE")
		sheet.getRow(0).createCell(1).setCellValue("PRECIO")

		for(i=1; i<=limit-1; i++){
			sheet.createRow(i).createCell(0).setCellValue(listProducts[i][0].toString())
			sheet.getRow(i).createCell(1).setCellValue(listProducts[i][1].toString())
		}

		file.close()

		FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\QualtopGroup\\Katalon Studio\\QSSAT_Web_Liverpool\\Files\\ShoppingList.xlsx'))

		workbook.write(outFile)

		outFile.close()
	}
}
