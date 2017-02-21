package com.wbl.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.helper.ByClass;

public class LoginPage {
	WebDriver driver;
/*	String css-email = "#ap_email";
	String id-pwd = "ap_password";
	String id-submit = "signInSubmit";*/

	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String logIn(String uname, String password){
		WebElement element = driver.findElement(ByClass.getByobject("css-email"));
		element.sendKeys("uname");
		element = driver.findElement(ByClass.getByobject("id-pwd"));
		element.sendKeys("password");
		element = driver.findElement(ByClass.getByobject("css-submit"));
		element.click();
		return driver.getTitle();
	}

}
