import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://qainterview.pythonanywhere.com/')

WebUI.setText(findTestObject('Object Repository/Test Home/input_The greatest factorial calculator_number'), '432')

WebUI.click(findTestObject('Object Repository/Test Home/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Test Home/input_The greatest factorial calculator_number'), '4')

WebUI.click(findTestObject('Object Repository/Test Home/button_Calculate'))

WebUI.click(findTestObject('Object Repository/Test Home/p_Terms and ConditionsPrivacy'))

WebUI.click(findTestObject('Object Repository/Test Home/a_Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Test Home/a_Privacy'))

WebUI.setText(findTestObject('Object Repository/Test Home/input_The greatest factorial calculator_number'), '4231.12')

WebUI.click(findTestObject('Object Repository/Test Home/button_Calculate'))

WebUI.closeBrowser()

