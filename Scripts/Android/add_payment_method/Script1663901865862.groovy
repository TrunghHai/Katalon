import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Start the application'

'Mobile.startExistingApplication(\'vn.vidiva.walletdev\')'
Mobile.tap(findTestObject('payment_method_list/btn_add_payment_method'), 0)

Mobile.tap(findTestObject('choose_payment_method/btn_vietbank'), 0)

Mobile.tap(findTestObject('verify_phone/verify_phone_btn_next'), 0)

Mobile.tap(findTestObject('bank_account/edt_account_number'), 0)

Mobile.sendKeys(findTestObject('bank_account/edt_account_number'), '000000', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('bank_account/btn_submit'), 0)

Mobile.tap(findTestObject('vietbank_confirm_screen/edt_confirm_opt'), 0)

Mobile.setText(findTestObject('vietbank_confirm_screen/edt_confirm_opt'), '000000', 0)

Mobile.tap(findTestObject('vietbank_confirm_screen/btn_submit'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('vietbank_success/btn_done'), 0)

