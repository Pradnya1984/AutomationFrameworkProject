package com.wbl.test;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;
import com.wbl.page.RegisterPage;


public class HomePageTest extends BaseTest{
    HomePage hm;

	@BeforeClass
	public void before(){
		  hm =new HomePage(driver);
	     // hm.navigateToHomePage();
		     
	}	     
	
     @Test
     public void testNavLink()  {
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  	 Assert.assertEquals(5, hm.headerNavLinks());
         }
     
     @Test
     public void testSearchbox(){
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       	 Assert.assertEquals("Amazon.com: Laptop - Traditional Laptops / Laptops: Electronics", hm.searchBox());
         }
     
     @Test
     public void testsigninClick(){
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 LoginPage lp = hm.signinClick();
       	 Assert.assertEquals("Amazon Sign In", lp.getTitle());
    	 }
     
     @Test
     public void testnewUser(){
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 RegisterPage rp = hm.newuserRegisterClick();
    	 Assert.assertEquals("Amazon Registration", rp.getTitle());
        }
}
