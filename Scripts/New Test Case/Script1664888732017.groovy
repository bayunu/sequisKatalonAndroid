import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
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

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent

Mobile.startExistingApplication('com.sequis.neu.polisku')

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.Button - DAFTAR'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.TextView - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Sequis/android.widget.EditText - Alamat email'), 'mailina4@mailinator.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.TextView - LANJUT'), 0)

//
Mobile.startExistingApplication('com.talpa.hibrowser')

Mobile.tap(findTestObject('Object Repository/HiBrowser/android.widget.FrameLayout - Trigger Search URL'), 2)
Mobile.setText(findTestObject('Object Repository/HiBrowser/android.widget.EditText - Search or type URL'), 'https://www.mailinator.com/v4/public/inboxes.jsp', 0)
Mobile.tap(findTestObject('Object Repository/HiBrowser/android.widget.TextView - Enter'), 0)
Mobile.setText(findTestObject('Object Repository/HiBrowser/android.widget.EditText - Input Username Mailinator'), 'mailina4', 0)
Mobile.tap(findTestObject('Object Repository/HiBrowser/android.widget.Button - GO'), 0)


		// Get Data
if (Mobile.verifyElementNotVisible(findTestObject('Object Repository/HiBrowser/android.view.View - Sequis App noreplysequislife.com'), 10,FailureHandling.OPTIONAL)) {
	
	Mobile.tap(findTestObject('Object Repository/HiBrowser/android.webkit.WebView - PreapreRefersh'), 0)
	Mobile.tap(findTestObject('Object Repository/HiBrowser/android.widget.ImageButton - Refresh'), 0)
}

Mobile.tap(findTestObject('Object Repository/HiBrowser/android.view.View - Sequis App noreplysequislife.com'), 10,FailureHandling.CONTINUE_ON_FAILURE)
String sGet = Mobile.getText(findTestObject('Object Repository/HiBrowser/android.widget.TextView - Please use the following security code'), 0)

GlobalVariable.otp = sGet
Mobile.comment(sGet)

String sGet1 = sGet[-4..-1]
GlobalVariable.otp = sGet1
Mobile.comment(sGet1)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/HiBrowser/android.widget.TextView - TabBrowser'), 0)
Mobile.tap(findTestObject('Object Repository/HiBrowser/android.widget.ImageView - TriggerCloseTab'), 0)
Mobile.tap(findTestObject('Object Repository/HiBrowser/android.widget.TextView - CloseAllTab'), 0)

Mobile.closeApplication()
Mobile.startExistingApplication('com.sequis.neu.polisku')

//

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.EditText - Input Pertama'), 0)
AndroidDriver<?> driver = MobileDriverFactory.getDriver()
String[] s = sGet1
for (int i = 0; i < s.length; i++) {

	switch(s[i]) {
		case (s[i] = '0') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0))
			break
		case (s[i] = '1') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1))
			break
		case (s[i] = '2') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2))
			break
		case (s[i] = '3') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3))
			break
		case (s[i] = '4') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4))
			break
		case (s[i] = '5') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5))
			break
		case (s[i] = '6') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_6))
			break
		case (s[i] = '7') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7))
			break
		case (s[i] = '8') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8))
			break
		case (s[i] = '9') :
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9))
			break
	}		
}

Mobile.setText(findTestObject('Object Repository/Sequis/android.widget.EditText - Nama depan'), 'Bachtiar', 0)

Mobile.setText(findTestObject('Object Repository/Sequis/android.widget.EditText - Nama belakang'), 'Yusuf', 0)

Mobile.setText(findTestObject('Object Repository/Sequis/android.widget.EditText - Password'), 'P@ssw0rd', 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/Sequis/android.widget.EditText - Ulangi Password'), 'P@ssw0rd', 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.TextView - DAFTAR'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.Button - MASUK KE BERANDA'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.Button - LIHAT AKUN'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.Button - SIGN OUT'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.Button - SIGN OUT (1)'), 0)

//
Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.TextView - Sudah mendaftar Silahkan Masuk'), 0)

Mobile.tapAtPosition(860,1930)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.TextView - email (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Sequis/android.widget.EditText - Alamat email (1)'), 'mailina4@mailinator.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Sequis/android.widget.EditText - Password (1)'), 'P@ssw0rd', 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.TextView - LANJUT (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Sequis/android.widget.Button - LIHAT AKUN'), 0)