package testcasepackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resource.Baseclass;
import pageobjectmodel.loginpageobject;
import pageobjectmodel.signuppageobject;

public class signuptestcases extends Baseclass {
@Test
	public void verifysignup() throws IOException, InterruptedException {
	
	initilizeDriver();
	driver.get("https://login.salesforce.com");
	loginpageobject lpo=new loginpageobject(driver);
	lpo.tryforfree().click();
	
    signuppageobject spo=new signuppageobject(driver);
	Thread.sleep(5000);
	spo.userfirstname().sendKeys("user1");
	spo.userlastname().sendKeys("user");
	spo.usertitle().sendKeys("hi");
	spo.clickonnextbutton().click();
	
	
	
	//select tagname=dropdownhandle
	WebElement a=spo.companyemployee();
	Select s=new Select(a);
	s.selectByIndex(3);
	spo.companyname().sendKeys("abcd");
	
	WebElement b=spo.companycountry();
	Select s1=new Select(b);
	s1.selectByIndex(3);
	
	
}
	
	
	
	
}
