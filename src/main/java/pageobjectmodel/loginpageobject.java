package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {
	public WebDriver driver;
private By a=By.xpath("//input[@id=\"username\"]");
 private By b=By.xpath("//input[@id=\"password\"]");
private By c=By.xpath("//input[@id=\"Login\"]");
private By d=By.xpath("//a[@id=\"signup_link\"]");

public loginpageobject(WebDriver driver) {
	this.driver=driver;
}


	


public WebElement username() {
	
return
		driver.findElement(a);//username
}

public WebElement password() {
	
	return
			driver.findElement(b);
}

public WebElement Login() {
	return
			driver.findElement(c);
}


public WebElement tryforfree() {
	return
			driver.findElement(d);
}
}
