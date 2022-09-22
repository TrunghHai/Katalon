import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

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

