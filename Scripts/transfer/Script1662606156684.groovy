import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

'Path of the Apk File Store in path variable'
def path = RunConfiguration.getProjectDir() + '/Data Files/ting_app.apk'

'Start the application'
Mobile.startApplication(path, true)

Mobile.tap(findTestObject('intro/btn_skip'), 0)

Mobile.tap(findTestObject('un-authen/btn_login'), 0)

Mobile.setText(findTestObject('login/edt_email'), 'kien.vo@vidiva.vn', 0)

Mobile.tap(findTestObject('login/btn_next'), 0)

Mobile.setText(findTestObject('login/edt_password'), '111111', 0)

Mobile.setText(findTestObject('login/edt_otp'), '111111', 0)

'Verify if item\'s label is equal to 48.569.779đ'
Mobile.verifyEqual('48.569.779đ', '48.569.779đ')

Mobile.tap(findTestObject('home/img_transfer'), 0)

Mobile.tap(findTestObject('select-receiver/img_first_receiver'), 0)

Mobile.tap(findTestObject('enter-money-amount/btn_one_keyboard'), 0)

Mobile.tap(findTestObject('enter-money-amount/btn_one_keyboard'), 0)

Mobile.tap(findTestObject('enter-money-amount/btn_zero_keyboard'), 0)

Mobile.tap(findTestObject('enter-money-amount/btn_three_zero_keyboard'), 0)

Mobile.tap(findTestObject('enter-money-amount/btn_next'), 0)

Mobile.tap(findTestObject('transfer-note/view_note_area'), 0)

Mobile.setText(findTestObject('transfer-note/edt_note_on_dialog'), 'test chuyen tien', 0)

Mobile.tap(findTestObject('transfer-note/btn_update_on_dialog'), 0)

Mobile.tap(findTestObject('transfer-note/btn_next'), 0)

Mobile.tap(findTestObject('transfer-note/btn_confirm'), 0)

Mobile.setText(findTestObject('login/edt_password'), '111111', 0)

Mobile.tap(findTestObject('transfer-success/btn_complete'), 0, FailureHandling.STOP_ON_FAILURE)

