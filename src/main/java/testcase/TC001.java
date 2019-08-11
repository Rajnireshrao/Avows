package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wrapper.Annotations;

public class TC001 extends Annotations {
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String Number, String Pin) throws Exception {
		new HomePage()
		.clickLoginButton()
		.enterMobileNUmber(Number)
		.enterPin(Pin);
		
	}
	
	
	
	
	
	
	
	
	
	

}
