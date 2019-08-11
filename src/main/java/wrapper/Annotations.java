package wrapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import utils.DataInputProvide;


public class Annotations {
	public static AppiumDriver<MobileElement> driver;
	public String excelFileName;
	
	@BeforeMethod
	public void launchApp() throws Exception
	
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia 5.1 Plus");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.UDID, "PDAID18092102584");
		caps.setCapability("appPackage", "com.doodle.umobile");
		caps.setCapability("appActivity", "com.doodle.umobile.SplashActivity");
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,caps);
		Thread.sleep(4000);
	}
	
	/*
	 * 
	 * {
	 * 
	 * }
	 */
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws InvalidFormatException, IOException{
		return DataInputProvide
				.readExcel(excelFileName);
	}
	
	
	
	
	
	
	
	
	
	

}
