package pages;

import org.openqa.selenium.By;

import wrapper.Annotations;

public class DashboardPage extends Annotations

{
	
	public MenuOptions HomePage_Menu() throws Exception {
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		System.out.println("menu is clicked");
		return new MenuOptions();
	}
}
