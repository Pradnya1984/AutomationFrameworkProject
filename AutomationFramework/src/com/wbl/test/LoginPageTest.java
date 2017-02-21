package com.wbl.test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;

public class LoginPageTest extends BaseTest {
	LoginPage lp;
	HomePage hm;
	
	@BeforeClass
	public void before(){
		  hm =new HomePage(driver);
	     // hm.navigateToHomePage();
		 //lp = new LoginPage(driver);
		  lp=hm.signinClick();
	}	  
	
	@Test
	public void testlogin(){
		Assert.assertNotNull(lp.logIn("abc@gmail.com", "123"));
		}

}
