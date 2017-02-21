package com.wbl.test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;
import com.wbl.page.RegisterPage;
public class RegisterPageTest extends BaseTest{
   RegisterPage rp;
   HomePage hm;
   
   @BeforeClass
	public void before() {
	      hm =new HomePage(driver);
	      rp= hm.newuserRegisterClick();
	      //rp =new RegisterPage(driver);
	      //hm.navigateToHomePage();
	 }
          
	@Test
	public void testnewuserregister(){
		Assert.assertNotNull(rp.register("xyz","xyz@gmail.com", "1234"));
		
		}

}
 	
