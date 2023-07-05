package testcasepackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Resource.Baseclass;
import Resource.constant;
import pageobjectmodel.loginpageobject;

public class logintestcases extends Baseclass {
	@Test
	
public void verifylogin() throws IOException {
	initilizeDriver();
	driver.get("https://login.salesforce.com/");
	
	loginpageobject lpo=new loginpageobject(driver);

	lpo.username().sendKeys(constant.Username1);
	lpo.password().sendKeys(constant.password);
	lpo.Login().click();
	lpo.tryforfree().click();
}
}
