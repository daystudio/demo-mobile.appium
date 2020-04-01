package mou;

import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestAndroid {
	private static AppiumDriver driver;

	@Test
	public void test_android() {
		connect_android();
		check_list_count();
		check_add_function();
		driver.quit();
	}

	public void connect_android() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.15.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("app", "/Users/k/Documents/_projects/demo-mobile.appium/_doc/app-debug.apk");

		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void check_list_count() {
		System.out.println("--> TestAppium Running: Android");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> elements = driver.findElements(By.xpath("//*[@resource-id='mou.demo_kotlin:id/tv_u']"));
		System.out.println("--> Check list count: " + elements.size());
		for (int i = 0; i < elements.size(); i++) {
			WebElement we = elements.get(i).findElement(By.className("android.widget.TextView"));
			System.out.println("  [" + i + "]:" + we.getText());
		}

		assert (elements.size() > 0);
	}

	private void check_add_function() {
		driver.findElement(By.id("mou.demo_kotlin:id/action_settings")).click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--> has add function: " + (driver.findElement(By.id("mou.demo_kotlin:id/et_a")).getLocation() != null));
		assert (driver.findElement(By.id("mou.demo_kotlin:id/et_a")).getLocation() != null);
	}
}
