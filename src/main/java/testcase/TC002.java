package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.HomePage;
import pages.MenuOptions;
import wrapper.Annotations;

public class TC002 extends Annotations
{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void Edit_MyProfile(String  Number, String Pin) throws Exception {
		new HomePage()
		.clickLoginButton()
		.enterMobileNUmber(Number)
		.enterPin(Pin);
		new DashboardPage()
		.HomePage_Menu()
		.MyAccount()
		.editProfile();
		
		
	}
}
