package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.MobileElement;
import wrapper.Annotations;

public class EnterNumberPage extends Annotations

{
public EnterNumberPage()

{
		
	}

public EnterNumberPage enterMobileNUmber(String Number)

{
	MobileElement A1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
	A1.setValue(Number);
	
	System.out.println("Mobile number entered");
	return this;
}

public DashboardPage enterPin(String Pin) throws Exception

{
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")).sendKeys(Pin);
	System.out.println("Pin entered");
	Thread.sleep(3000);
	return new DashboardPage();
}

}
