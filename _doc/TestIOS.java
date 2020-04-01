package mou;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestIOS {
	private static AppiumDriver driver;

	public void test_ios() {
//		connect_ios();
//		driver.quit();
	}

	public static void connect_ios() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.9.1");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "13.4");
		capabilities.setCapability("deviceName", "iPhone 8");
		capabilities.setCapability("app", "/Users/k/Library/Developer/Xcode/DerivedData/demo-mobile-chflzpvpilzlgmgdratpqvmqgapf/Build/Products/Debug-iphonesimulator/demo-mobile.app");		
		
//		{
//		  "appium-version": "1.15.1",
//		  "platformName": "iOS",
//		  "platformVersion": "13.4",
//		  "deviceName": "iPhone 8",
//		  "app": "/Users/k/Documents/_projects/demo-mobile.swift/build/Release-iphonesimulator/demo-mobile.app",
//		  "automationName": "XCUITest",
//		  "noReset": true,
//		  "updatedWDABundleId": "k.demo-mobile",
//		  "xcodeOrgId": "W6Y328Q7PH",
//		  "xcodeSigningId": "iPhone Developer"
//		}
		try {
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (Exception e) {
		}

		System.out.println("TestAppium");
		System.out.println("txt_0.before:" + driver.findElementByAccessibilityId("lbl_0_aid").getText());
		driver.findElementByAccessibilityId("btn_0_aid").click();
		System.out.println("txt_0.after:" + driver.findElementByAccessibilityId("lbl_0_aid").getText());
		assert (driver.findElementByAccessibilityId("lbl_0_aid").getText().equalsIgnoreCase("abc"));
	}

}
