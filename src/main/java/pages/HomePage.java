package pages;

import org.openqa.selenium.By;

import wrapper.Annotations;

public class HomePage extends Annotations

{
	public HomePage() {
		
	}
	
	public EnterNumberPage clickLoginButton()
	{
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.View")).click();
		System.out.println("Login button is clicked");
		return new EnterNumberPage();
	}
}
