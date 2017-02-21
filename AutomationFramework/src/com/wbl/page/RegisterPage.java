package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.helper.ByClass;

public class RegisterPage {
	WebDriver driver;
	/*String id-regname="ap_customer_name";
	String id-regemail="ap_email";
	String id-regpwd="ap_password";
	String id-regpwdcheck="ap_password_check";
	String id-regsubmit="continue";*/

	public RegisterPage(WebDriver driver){
		this.driver=driver;
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String register(String name, String email, String password){
		WebElement ele = driver.findElement(ByClass.getByobject("id-regname"));
		ele.sendKeys(name);
	    ele = driver.findElement(ByClass.getByobject("id-regemail"));
		ele.sendKeys(email);
		ele = driver.findElement(ByClass.getByobject("id-regpwd"));
		ele.sendKeys("password");
		ele = driver.findElement(ByClass.getByobject("id-regpwdcheck"));
		ele.sendKeys(password);
		ele=driver.findElement(ByClass.getByobject("id-regsubmit"));
		ele.click();
		return driver.getTitle();
	}
}
